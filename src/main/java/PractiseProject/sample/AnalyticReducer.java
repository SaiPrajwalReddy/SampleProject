package PractiseProject.sample;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class AnalyticReducer extends Reducer<keyComparator,Text , Text, Text> {
	
	 MultipleOutputs<Text,Text> multipleOutputs = null;
	
	protected void setup(Context context) throws IOException, InterruptedException {
		 multipleOutputs = new MultipleOutputs<Text, Text>(context);
	}

	public void reduce(keyComparator key, Iterable<Text> value, Context context) {

		System.out.println("Inside Reducer");
		RoomType.generateRoomTypeStats(key, value, multipleOutputs);
		Activity.generateActivityStats(key, value, multipleOutputs);
		Availability.generateAvailabilityStats(key, value, multipleOutputs);
		ListingsPerHost.generateListingsPerHost(key, value, multipleOutputs);
	}
}
