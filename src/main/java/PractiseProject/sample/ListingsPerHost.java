package PractiseProject.sample;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

import com.google.gson.Gson;

public class ListingsPerHost {

	public static void generateListingsPerHost(keyComparator key, Iterable<Text> value,
			MultipleOutputs<Text, Text> multipleOutputs) {
		// TODO Auto-generated method stub
		System.out.println("Inside ListingsPerHost");
		int count = 0;
		int multipleListings = 0;
		int singleListings = 0;
		int recCount = 0;
		double perMultipleListings = 0;
		double perSingleListings = 0;
		for (Text rec : value) {
			Gson gson = new Gson();
			Data obje = gson.fromJson(rec.toString(), Data.class);
			String hostId = obje.getListing().getHostId();
			count = 0;
			for (Text record : value) {
				Gson obj = new Gson();
				String list = record.toString();
				Data object = obj.fromJson(list, Data.class);
				if (hostId.equals(object.getListing().getHostId()))
					count++;
			}
			if (count > 1)
				multipleListings++;
			else
				singleListings++;

			recCount++;

		}
		if (recCount != 0) {
			perMultipleListings = (multipleListings / recCount) * 100;
			perSingleListings = (singleListings / recCount) * 100;
		}
		String finalValue = singleListings + "|" + perSingleListings + "|" + multipleListings + "|"
				+ perMultipleListings;
		String keyValue = key.getState() + "|" + key.getCity() + "|" + key.getNeighbourhood();
		try {
			multipleOutputs.write(new Text(keyValue), new Text(finalValue), AnalyticClass.output + "/ListingsPerHost");
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
