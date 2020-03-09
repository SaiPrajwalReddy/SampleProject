package PractiseProject.sample;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.google.gson.Gson;

public class AnalyticMapper extends Mapper<Text, Text, keyComparator, Text> {

	public void map(Text key, Text value, Context context) {
		Gson obj = new Gson();
		String rec = value.toString();		
		Data object = obj.fromJson(rec, Data.class);
		if (object.getListing() != null) {			
			String state = object.getListing().getState();
			String city = object.getListing().getCity();
			String neighbourhood = object.getListing().getNeighbourhoodCleansed();
			try {
				context.write(new keyComparator(state, city, neighbourhood), new Text(value));
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
