package PractiseProject.sample;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class CustomPartitioner extends Partitioner<keyComparator, Text> {

	@Override
	public int getPartition(keyComparator key, Text value, int numPartitions) {
		// TODO Auto-generated method stub
		String state = key.getState();

		return Math.abs(state.hashCode()) % numPartitions;
	}

}
