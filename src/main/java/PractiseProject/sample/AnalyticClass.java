package PractiseProject.sample;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobStatus;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.JobStatus.State;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.KeyValueTextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class AnalyticClass {
	
	static boolean success;
	public static String output;
	private static JobStatus j = new JobStatus();
	
	
	public static void main(String args[]) throws IOException {
		output = "/datalake/optum/optuminsight/analytics_capability/temp/mredd110/output/tes";
		if(args.length != 2)
		{
			System.out.println("Minimun 2 arguments are needed to process the job");
			System.exit(1);
		}
		
		String input = "/datalake/optum/optuminsight/analytics_capability/temp/mredd110/input-1";
    	output = "/datalake/optum/optuminsight/analytics_capability/temp/mredd110/output/tes";
    	Configuration jobConfig = new Configuration();
    	jobConfig.set("mapreduce.job.queuename", "anlytcd_q1.anlytcd_sq1");
    
    	
        Job weatherAnalysis = Job.getInstance(jobConfig, "JOB_1");
        weatherAnalysis.setJarByClass(AnalyticClass.class);
        weatherAnalysis.setJobName("symmetry");
        weatherAnalysis.setMapperClass(ReviewReader.class);
        weatherAnalysis.setReducerClass(ReviewReducer.class);        
        weatherAnalysis.setNumReduceTasks(2);
        weatherAnalysis.setMapOutputKeyClass(RecordComaprator.class);
        weatherAnalysis.setMapOutputValueClass(Text.class);   
        weatherAnalysis.setPartitionerClass(AnalyticPartitioner.class);
        try {
			State st = weatherAnalysis.getJobState();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			FileInputFormat.addInputPath(weatherAnalysis, new Path(input));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        FileOutputFormat.setOutputPath(weatherAnalysis, new Path(output));
        
        try {
			success = weatherAnalysis.waitForCompletion(true);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if (success) {
        	Configuration jobConf = new Configuration();
        	jobConf.set("mapreduce.job.queuename", "anlytcd_q1.anlytcd_sq1");
        	jobConf.set("mapreduce.input.keyvaluelinerecordreader.key.value.separator", "	");
            Job job2 = Job.getInstance(jobConf, "JOB_2");
            job2.setJobName("symmetry");
            job2.setJarByClass(AnalyticClass.class);
            job2.setMapperClass(AnalyticMapper.class);            
            job2.setReducerClass(AnalyticReducer.class);
            job2.setInputFormatClass(KeyValueTextInputFormat.class);
           // job2.setOutputFormatClass(TextOutputFormat.class);
            job2.setSortComparatorClass(SortComparator.class);
            job2.setGroupingComparatorClass(SortComparator.class);
            job2.setPartitionerClass(CustomPartitioner.class);
            FileInputFormat.addInputPath(job2, new Path(output));
            FileOutputFormat.setOutputPath(job2, new Path(output+"/final"));
            job2.setMapOutputKeyClass(keyComparator.class);
            job2.setMapOutputValueClass(Text.class);
            try {
				success = job2.waitForCompletion(true);
			} catch (ClassNotFoundException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        if(success)
        {
        	FileSystem fs = null;
			try {
				fs = FileSystem.get(new URI(output), jobConfig);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	fs.delete(new Path(output), true);
        }
	}

}
