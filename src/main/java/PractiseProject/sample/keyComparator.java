package PractiseProject.sample;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class keyComparator implements WritableComparable<keyComparator> {

	private String state;
	private String city;
	private String neighbourhood;

	public keyComparator() {

	}

	public keyComparator(String state, String city, String neighbourhood) {
		// TODO Auto-generated constructor stub
		this.state = state;
		this.city = city;
		this.neighbourhood = neighbourhood;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public void setState(String state) {

		this.state = state;
	}

	public void setNeighbourhood(String neighbourhood) {

		this.neighbourhood = neighbourhood;
	}

	public String getCity() {

		return city;
	}

	public String getState() {

		return state;
	}

	public String getNeighbourhood() {

		return neighbourhood;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(state);
		out.writeUTF(city);
		out.writeUTF(neighbourhood);
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		state = in.readUTF();
		city = in.readUTF();
		neighbourhood = in.readUTF();
	}

	@Override
	public int compareTo(keyComparator o) {
		// TODO Auto-generated method stub
		keyComparator thisValue = this;
		keyComparator thatValue = o;

		if (thisValue.state.compareTo(thatValue.state) == 0)
			if (thisValue.city.compareTo(thatValue.state) == 0)
				if (thisValue.neighbourhood.compareTo(thatValue.neighbourhood) == 0)
					return 0;
				else
					return thisValue.neighbourhood.compareTo(thatValue.neighbourhood);
			else
				return thisValue.city.compareTo(thatValue.state);
		else
			return thisValue.state.compareTo(thatValue.state);

	}

	@Override
	public String toString() {
		return this.state + "|" + this.city + "|" + this.neighbourhood;

	}

}
