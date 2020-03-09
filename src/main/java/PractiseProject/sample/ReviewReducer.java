package PractiseProject.sample;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ReviewReducer extends Reducer<RecordComaprator, Text, Text, Text> {

	InputParser inp = new InputParser();

	@Override
	public void reduce(RecordComaprator key, Iterable<Text> values, Context context) {
		Gson gson = new GsonBuilder().serializeNulls().create();
		String dataJson = "";
		Data dataObj = null;
		int count = 0;
		for (Text val : values) {

			dataObj = new Data();
			Listing list = null;
			if ("REV".equalsIgnoreCase(key.getRecName())) {
				Reviews rev = (Reviews) inp.unMarshall("ReviewsFile", val.toString());
				dataObj.setReviews(rev);
			} else if ("LIS".equalsIgnoreCase(key.getRecName())) {
				list = (Listing) inp.unMarshall("ListingsFileDeserlialize", val.toString());
				dataObj.setListing(list);
			}
			dataObj.setId(key.getId().toString());
			dataJson = gson.toJson(dataObj);
			count++;

		}

		try {
			context.write(new Text(dataObj.getId()), new Text(dataJson));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
