package PractiseProject.sample;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

public class ReviewReader extends Mapper<LongWritable, Text, RecordComaprator, Text> {
	InputParser inp = new InputParser();
	String fileName;

	private static final Log LOG = LogFactory.getLog(ReviewReader.class);

	@Override
	protected void setup(Context context) {

		InputSplit split = context.getInputSplit();
		fileName = ((FileSplit) split).getPath().getName();
		System.out.println("FileName is " + fileName);
		LOG.info("FileName is " + fileName);

	}

	@Override
	public void map(LongWritable key, Text Value, Context context) {

		String record = Value.toString();
		try {
			if ("reviews.csv".equalsIgnoreCase(fileName)) {
				Object rev = inp.unMarshall("ReviewsFile", record);
				Reviews temp = (Reviews) rev;
				//context.write(new Text(temp.getListingId()), rev);
				context.write(new RecordComaprator(temp.getListingId(),"REV"),new Text(temp.toString()));

			} else if ("listings.csv".equalsIgnoreCase(fileName)) {
				Object list = inp.unMarshall("ListingsFile", record);
				Listing temp = (Listing) list;
				context.write(new RecordComaprator(temp.getId(),"LIS"),new Text(temp.toString()));
				//context.write(new Text(temp.getId()), list);

			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
