package PractiseProject.sample;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class Reviews implements WritableComparable<Reviews> {

	private String listingId;
	private String id;
	private String date;
	private String reviewId;
	private String reviewName;

	public Reviews() {

	}

	public void setListingId(String listingId) {
		this.listingId = listingId;
	}

	public String getListingId() {
		return listingId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public String getReviewName() {
		return reviewName;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(listingId);
		out.writeUTF(id);
		out.writeUTF(date);
		out.writeUTF(reviewId);
		out.writeUTF(reviewName);
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		listingId = in.readUTF();
		id = in.readUTF();
		date = in.readUTF();
		reviewId = in.readUTF();
		reviewName = in.readUTF();
	}
	@Override
	public String toString() {
		
		return listingId + "," + id +","+ date +","+ reviewId +","+ reviewName;
	}
	@Override
	public int compareTo(Reviews o) {
		// TODO Auto-generated method stub
		return this.compareTo(o);
	}

}
