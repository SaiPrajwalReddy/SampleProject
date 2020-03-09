package PractiseProject.sample;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

import com.google.gson.Gson;

public class Availability {

	public static void generateAvailabilityStats(keyComparator key, Iterable<Text> value,
			MultipleOutputs<Text, Text> multipleOutputs) {
		// TODO Auto-generated method stub
		System.out.println("Inside Availability");
		int highAvailability = 0;
		int lowAvailability = 0;
		int totalAvailability = 0;
		double perOfTotalAvailability = 0;
		double perOfHighAvailability = 0;
		double perOfLowAvailability = 0;
		int recCount = 0;
		for (Text record : value) {
			Gson obj = new Gson();
			Data rec = obj.fromJson(record.toString(), Data.class);
			if (rec.getListing().getAvaialble365() > 365)
				highAvailability++;
			else
				lowAvailability++;

			totalAvailability += rec.getListing().getAvaialble365();
			recCount++;
		}
		if (recCount != 0) {
			perOfHighAvailability = (highAvailability / recCount) * 100;
			perOfLowAvailability = (lowAvailability / recCount) * 100;
			perOfTotalAvailability = (totalAvailability / recCount) * 100;
		}

		String finalValue = highAvailability + "|" + perOfHighAvailability + "|" + lowAvailability + "|"
				+ perOfLowAvailability + "|" + totalAvailability + "|" + perOfTotalAvailability;
		String keyValue = key.getState() + "|" + key.getCity() + "|" + key.getNeighbourhood();

		try {
			multipleOutputs.write(new Text(keyValue), new Text(finalValue), AnalyticClass.output + "/Availability");
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
