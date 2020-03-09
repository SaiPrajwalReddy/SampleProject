package PractiseProject.sample;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class Activity {

	public static void generateActivityStats(keyComparator key, Iterable<Text> value,
			MultipleOutputs<Text,Text> multipleOutputs) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Activity");
	}
	
}
