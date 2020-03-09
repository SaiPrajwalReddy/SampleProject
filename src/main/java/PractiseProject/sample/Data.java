package PractiseProject.sample;

public class Data {

	private String id;
	private Reviews rev;
	private Listing lis;

	public String getId() {
		return id;
	}

	public Reviews getReviews() {
		return rev;
	}

	public Listing getListing() {
		return lis;
	}

	public void setReviews(Reviews rev) {
		this.rev = rev;
	}

	public void setListing(Listing lis) {
		this.lis = lis;
	}

	public void setId(String id) {
		this.id = id;
	}

}
