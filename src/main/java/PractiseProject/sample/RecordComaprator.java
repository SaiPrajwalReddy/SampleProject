package PractiseProject.sample;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class RecordComaprator implements WritableComparable<RecordComaprator> {

	String id;
	String recName;
	
	public RecordComaprator() {
		
	}

	public RecordComaprator(String id, String recName) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.recName = recName;
	}

	public String getId() {
		return id;
	}

	public String getRecName() {
		return recName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(id);
		out.writeUTF(recName);
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		id = in.readUTF();
		recName = in.readUTF();
	}

	@Override
	public int compareTo(RecordComaprator o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);

	}
}
