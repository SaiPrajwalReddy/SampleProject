package PractiseProject.sample;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

import com.google.gson.Gson;

public class RoomType {

	public static void generateRoomTypeStats(keyComparator key, Iterable<Text> value,
			MultipleOutputs<Text, Text> multipleOutputs) {
		// TODO Auto-generated method stub
		System.out.println("Inside RootTypes");
		int noOfHotelRooms = 0;
		int noOfSharedRooms = 0;
		int noOfPrivateRooms = 0;
		int noOfHomes = 0;
		int recCount = 0;
		double perOfHotelRooms = 0;
		double perOfSharedRooms = 0;
		double perOfPrivateRooms = 0;
		double perOfHomes = 0;
		double avgPricePerNight = 0;
		double pricePerNight = 0;

		for (Text record : value) {

			Gson obj = new Gson();
			Data rec = obj.fromJson(record.toString(), Data.class);
			if ("Entire home".equals(rec.getListing().getRoomType())) {
				noOfHomes++;
			} else if ("Hotel room".equals(rec.getListing().getRoomType())) {
				noOfHotelRooms++;
			} else if ("Private room".equals(rec.getListing().getRoomType())) {
				noOfPrivateRooms++;
			} else if ("Shared room".equals(rec.getListing().getRoomType())) {
				noOfSharedRooms++;
			}
			recCount++;

			pricePerNight += rec.getListing().getPrice();

		}
		if (recCount != 0) {
			perOfHotelRooms = (noOfHotelRooms / recCount) * 100;
			perOfSharedRooms = (noOfSharedRooms / recCount) * 100;
			perOfPrivateRooms = (noOfPrivateRooms / recCount) * 100;
			perOfHomes = (noOfHomes / recCount) * 100;
		}
		avgPricePerNight = pricePerNight / recCount;

		String finalRec = noOfHomes + "|" + perOfHomes + "|" + noOfHotelRooms + "|" + perOfHotelRooms + "|"
				+ noOfPrivateRooms + "|" + perOfPrivateRooms + "|" + noOfSharedRooms + "|" + perOfSharedRooms + "|"
				+ avgPricePerNight + "|" + recCount;

		String keyValue = key.getState() + "|" + key.getCity() + "|" + key.getNeighbourhood();

		try {
			multipleOutputs.write(new Text(keyValue), new Text(finalRec), AnalyticClass.output + "/RoomType");

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
