package PractiseProject.sample;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AnalyticPartitioner extends Partitioner<RecordComaprator, Text> {

	@Override
	public int getPartition(RecordComaprator key, Text value, int numPartitions) {
		// TODO Auto-generated method stub
		String id = key.getId();

		return Math.abs(id.hashCode()) % numPartitions;
	}

}
