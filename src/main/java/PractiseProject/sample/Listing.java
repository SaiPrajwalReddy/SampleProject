package PractiseProject.sample;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class Listing implements WritableComparable<Listing> {

	private String id;
	private String listingUrl;
	private String scrapId;
	private String lastScraped;
	private String name;
	private String experiencesOffered;
	private String thumbnailUrl;
	private String mediumUrl;
	private String pictureUrl;
	private String xlPictureUrl;
	private String hostId;
	private String hostUrl;
	private String hostName;
	private String hostSince;
	private String hostLocation;
	private String hostResponceTime;
	private String hostResponceRate;
	private String hostAcceptanceRate;
	private String hostIsSuperHost;
	private String hostThumbNamilUrl;
	private String hostPictureUrl;
	private String hostNeighbourhood;
	private int hostListingCount;
	private int hostTotalListingCount;
	private String hostVerification;
	private String hostHasProfilePic;
	private String hostIdentityVerified;
	private String street;
	private String neighbourhood;
	private String neighbourhoodCleansed;
	private String neighbourhoodGroupCleansed;
	private String city;
	private String state;
	private String zipcode;
	private String market;
	private String smartLocation;
	private String countryCode;
	private String country;
	private String latitude;
	private String longitude;
	private String isLocationExact;
	private String propertyType;
	private String roomType;
	private int accommodates;
	private double bathrooms;
	private int bedrooms;
	private int bed;
	private String bedType;
	private int squareFeet;
	private double price;
	private double weeklyPrice;
	private double monthlyPrice;
	private double securityDeposit;
	private double cleaningFee;
	private int guestsIncluded;
	private double extraPeople;
	private int minimumNights;
	private int maximumNights;
	private int minimumMinimumNights;
	private int maximumMinimumNights;
	private int minimumMaximumNights;
	private int maximumMaximumNights;
	private double minimumNightsAvgNtm;
	private double maximumNightsAvgNtm;
	private String calendarUpdated;
	private String hasAvailability;
	private int avaialble30;
	private int avaialble60;
	private int avaialble90;
	private int avaialble365;
	private String caladerLastScraped;
	private int noOfReviews;
	private int noOfReviewsLtm;
	private String firstReview;
	private String lastReview;
	private int reviewScoresRating;
	private int reviewScoresAccuracy;
	private int reviewScoresCleanliness;
	private int reviewScoresCheckin;
	private int reviewScoresCommunication;
	private int reviewScoresLocation;
	private int reviewScoresValue;
	private String requiresLicense;
	private String license;
	private String juridictionNames;
	private String instantBookable;
	private String isBusinessTravelReady;
	private String cancellationPolicy;
	private String requireGuestProfilePicture;
	private String requireGuestPhoneVerification;
	private int calculatedHostListingsCount;
	private int calculatedHostListingsCountEntireHomes;
	private int calculatedHostListingsCountprivateRooms;
	private int calculatedHostListingsCountSharedRooms;
	private double reviewsPerMonth;

	public String getId() {

		return id;
	}

	public String getListingUrl() {

		return listingUrl;
	}

	public String getScrapId() {

		return scrapId;
	}

	public String getLastScraped() {

		return lastScraped;
	}

	public String getName() {

		return name;
	}

	public String getExperiencesOffered() {

		return experiencesOffered;
	}

	public String getThumbnailUrl() {

		return thumbnailUrl;
	}

	public String getMediumUrl() {

		return mediumUrl;
	}

	public String getPictureUrl() {

		return pictureUrl;
	}

	public String getXlPictureUrl() {

		return xlPictureUrl;
	}

	public String getHostId() {

		return hostId;
	}

	public String getHostUrl() {

		return hostUrl;
	}

	public String getHostName() {

		return hostName;
	}

	public String getHostSince() {

		return hostSince;
	}

	public String getHostLocation() {

		return hostLocation;
	}

	public String getHostResponceTime() {

		return hostResponceTime;
	}

	public String getHostResponceRate() {

		return hostResponceRate;
	}

	public String getHostAcceptanceRate() {

		return hostAcceptanceRate;
	}

	public String getHostIsSuperHost() {

		return hostIsSuperHost;
	}

	public String getHostThumbNamilUrl() {

		return hostThumbNamilUrl;
	}

	public String getHostPictureUrl() {

		return hostPictureUrl;
	}

	public String getHostNeighbourhood() {

		return hostNeighbourhood;
	}

	public int gethostListingCount() {

		return hostListingCount;
	}

	public int getHostTotalListingCount() {

		return hostTotalListingCount;
	}

	public String getHostVerification() {

		return hostVerification;
	}

	public String getHostHasProfilePic() {

		return hostHasProfilePic;
	}

	public String getHostIdentityVerified() {

		return hostIdentityVerified;
	}

	public String getStreet() {

		return street;
	}

	public String getNeighbourhood() {

		return neighbourhood;
	}

	public String getNeighbourhoodCleansed() {

		return neighbourhoodCleansed;
	}

	public String getNeighbourhoodGroupCleansed() {

		return neighbourhoodGroupCleansed;
	}

	public String getCity() {

		return city;
	}

	public String getState() {

		return state;
	}

	public String getZipcode() {

		return zipcode;
	}

	public String getMarket() {

		return market;
	}

	public String getsmartLocation() {

		return smartLocation;
	}

	public String getcountryCode() {

		return countryCode;
	}

	public String getCountry() {

		return country;
	}

	public String getLatitude() {

		return latitude;
	}

	public String getLongitude() {

		return longitude;
	}

	public String getIsLocationExact() {

		return isLocationExact;
	}

	public String getPropertyType() {

		return propertyType;
	}

	public String getRoomType() {

		return roomType;
	}

	public int getAccommodates() {

		return accommodates;
	}

	public double getBathrooms() {

		return bathrooms;
	}

	public int getBedrooms() {

		return bedrooms;
	}

	public int getBed() {

		return bed;
	}

	public String getBedType() {

		return bedType;
	}

	public int getSquareFeet() {

		return squareFeet;
	}

	public double getPrice() {

		return price;
	}

	public double getWeeklyPrice() {

		return weeklyPrice;
	}

	public double getMonthlyPrice() {

		return monthlyPrice;
	}

	public double getSecurityDeposit() {

		return securityDeposit;
	}

	public double getCleaningFee() {

		return cleaningFee;
	}

	public int getGuestsIncluded() {

		return guestsIncluded;
	}

	public double getExtraPeople() {

		return extraPeople;
	}

	public int getMinimumNights() {

		return minimumNights;
	}

	public int getMaximumNights() {

		return maximumNights;
	}

	public int getMinimumMinimumNights() {

		return minimumMinimumNights;
	}

	public int getMaximumMinimumNights() {

		return maximumMinimumNights;
	}

	public int getMinimumMaximumNights() {

		return minimumMaximumNights;
	}

	public int getMaximumMaximumNights() {

		return maximumMaximumNights;
	}

	public double getMinimumNightsAvgNtm() {

		return minimumNightsAvgNtm;
	}

	public double getMaximumNightsAvgNtm() {

		return maximumNightsAvgNtm;
	}

	public String getCalendarUpdated() {

		return calendarUpdated;
	}

	public String getHasAvailability() {

		return hasAvailability;
	}

	public int getAvaialble30() {

		return avaialble30;
	}

	public int getAvaialble60() {

		return avaialble60;
	}

	public int getAvaialble90() {

		return avaialble90;
	}

	public int getAvaialble365() {

		return avaialble365;
	}

	public String getCaladerLastScraped() {

		return caladerLastScraped;
	}

	public int getNoOfReviews() {

		return noOfReviews;
	}

	public int getNoOfReviewsLtm() {

		return noOfReviewsLtm;
	}

	public String getFirstReview() {

		return firstReview;
	}

	public String getlastReview() {

		return lastReview;
	}

	public int getReviewScoresRating() {

		return reviewScoresRating;
	}

	public int getReviewScoresAccuracy() {

		return reviewScoresAccuracy;
	}

	public int getReviewScoresCleanliness() {

		return reviewScoresCleanliness;
	}

	public int getReviewScoresCheckin() {

		return reviewScoresCheckin;
	}

	public int getReviewScoresCommunication() {

		return reviewScoresCommunication;
	}

	public int getReviewScoresLocation() {

		return reviewScoresLocation;
	}

	public int getReviewScoresValue() {

		return reviewScoresValue;
	}

	public String getRequiresLicense() {
		return requiresLicense;
	}

	public String getLicense() {
		return license;
	}

	public String getJuridictionNames() {
		return juridictionNames;
	}

	public String getInstantBookable() {
		return instantBookable;
	}

	public String getIsBusinessTravelReady() {
		return isBusinessTravelReady;
	}

	public String getCancellationPolicy() {
		return cancellationPolicy;
	}

	public String getRequireGuestProfilePicture() {
		return requireGuestProfilePicture;
	}

	public String getRequireGuestPhoneVerification() {
		return requireGuestPhoneVerification;
	}

	public int getCalculatedHostListingsCount() {

		return calculatedHostListingsCount;
	}

	public int getCalculatedHostListingsCountEntireHomes() {

		return calculatedHostListingsCountEntireHomes;
	}

	public int getCalculatedHostListingsCountprivateRooms() {

		return calculatedHostListingsCountprivateRooms;
	}

	public int getCalculatedHostListingsCountSharedRooms() {

		return calculatedHostListingsCountSharedRooms;
	}

	public double getReviewsPerMonth() {

		return reviewsPerMonth;
	}

	public void setId(String id) {

		this.id = id;
	}

	public void setListingUrl(String listingUrl) {

		this.listingUrl = listingUrl;
	}

	public void setScrapId(String scrapId) {

		this.scrapId = scrapId;
	}

	public void setLastScraped(String lastScraped) {

		this.lastScraped = lastScraped;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setExperiencesOffered(String experiencesOffered) {

		this.experiencesOffered = experiencesOffered;
	}

	public void setThumbnailUrl(String thumbnailUrl) {

		this.thumbnailUrl = thumbnailUrl;
	}

	public void setMediumUrl(String mediumUrl) {

		this.mediumUrl = mediumUrl;
	}

	public void setPictureUrl(String pictureUrl) {

		this.pictureUrl = pictureUrl;
	}

	public void setXlPictureUrl(String xlPictureUrl) {

		this.xlPictureUrl = xlPictureUrl;
	}

	public void setHostId(String hostId) {

		this.hostId = hostId;
	}

	public void setHostUrl(String hostUrl) {

		this.hostUrl = hostUrl;
	}

	public void setHostName(String hostName) {

		this.hostName = hostName;
	}

	public void setHostSince(String hostSince) {

		this.hostSince = hostSince;
	}

	public void setHostLocation(String hostLocation) {

		this.hostLocation = hostLocation;
	}

	public void setHostResponceTime(String hostResponceTime) {

		this.hostResponceTime = hostResponceTime;
	}

	public void setHostResponceRate(String hostResponceRate) {

		this.hostResponceRate = hostResponceRate;
	}

	public void setHostAcceptanceRate(String hostAcceptanceRate) {

		this.hostAcceptanceRate = hostAcceptanceRate;
	}

	public void setHostIsSuperHost(String hostIsSuperHost) {

		this.hostIsSuperHost = hostIsSuperHost;
	}

	public void setHostThumbNamilUrl(String hostThumbNamilUrl) {

		this.hostThumbNamilUrl = hostThumbNamilUrl;
	}

	public void setHostPictureUrl(String hostPictureUrl) {

		this.hostPictureUrl = hostPictureUrl;
	}

	public void setHostNeighbourhood(String hostNeighbourhood) {

		this.hostNeighbourhood = hostNeighbourhood;
	}

	public void sethostListingCount(int hostListingCount) {

		this.hostListingCount = hostListingCount;
	}

	public void setHostTotalListingCount(int hostTotalListingCount) {

		this.hostTotalListingCount = hostTotalListingCount;
	}

	public void setHostVerification(String hostVerification) {

		this.hostVerification = hostVerification;
	}

	public void setHostHasProfilePic(String hostHasProfilePic) {

		this.hostHasProfilePic = hostHasProfilePic;
	}

	public void setHostIdentityVerified(String hostIdentityVerified) {

		this.hostIdentityVerified = hostIdentityVerified;
	}

	public void setStreet(String street) {

		this.street = street;
	}

	public void setNeighbourhood(String neighbourhood) {

		this.neighbourhood = neighbourhood;
	}

	public void setNeighbourhoodCleansed(String neighbourhoodCleansed) {

		this.neighbourhoodCleansed = neighbourhoodCleansed;
	}

	public void setNeighbourhoodGroupCleansed(String neighbourhoodGroupCleansed) {

		this.neighbourhoodGroupCleansed = neighbourhoodGroupCleansed;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public void setState(String state) {

		this.state = state;
	}

	public void setZipcode(String zipcode) {

		this.zipcode = zipcode;
	}

	public void setMarket(String market) {

		this.market = market;
	}

	public void setsmartLocation(String smartLocation) {

		this.smartLocation = smartLocation;
	}

	public void setcountryCode(String countryCode) {

		this.countryCode = countryCode;
	}

	public void setCountry(String country) {

		this.country = country;
	}

	public void setLatitude(String latitude) {

		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {

		this.longitude = longitude;
	}

	public void setIsLocationExact(String isLocationExact) {

		this.isLocationExact = isLocationExact;
	}

	public void setPropertyType(String propertyType) {

		this.propertyType = propertyType;
	}

	public void setRoomType(String roomType) {

		this.roomType = roomType;
	}

	public void setAccommodates(int accommodates) {

		this.accommodates = accommodates;
	}

	public void setBathrooms(int bathrooms) {

		this.bathrooms = bathrooms;
	}

	public void setBedrooms(int bedrooms) {

		this.bedrooms = bedrooms;
	}

	public void setBed(int bed) {

		this.bed = bed;
	}

	public void setBedType(String bedType) {

		this.bedType = bedType;
	}

	public void setSquareFeet(int squareFeet) {

		this.squareFeet = squareFeet;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	public void setWeeklyPrice(double weeklyPrice) {

		this.weeklyPrice = weeklyPrice;
	}

	public void setMonthlyPrice(double monthlyPrice) {

		this.monthlyPrice = monthlyPrice;
	}

	public void setSecurityDeposit(double securityDeposit) {

		this.securityDeposit = securityDeposit;
	}

	public void setCleaningFee(double cleaningFee) {

		this.cleaningFee = cleaningFee;
	}

	public void setGuestsIncluded(int guestsIncluded) {

		this.guestsIncluded = guestsIncluded;
	}

	public void setExtraPeople(double extraPeople) {

		this.extraPeople = extraPeople;
	}

	public void setMinimumNights(int minimumNights) {

		this.minimumNights = minimumNights;
	}

	public void setMaximumNights(int maximumNights) {

		this.maximumNights = maximumNights;
	}

	public void setMinimumMinimumNights(int minimumMinimumNights) {

		this.minimumMinimumNights = minimumMinimumNights;
	}

	public void setMaximumMinimumNights(int maximumMinimumNights) {

		this.maximumMinimumNights = maximumMinimumNights;
	}

	public void setMinimumMaximumNights(int minimumMaximumNights) {

		this.minimumMaximumNights = minimumMaximumNights;
	}

	public void setMaximumMaximumNights(int maximumMaximumNights) {

		this.maximumMaximumNights = maximumMaximumNights;
	}

	public void setMinimumNightsAvgNtm(double minimumNightsAvgNtm) {

		this.minimumNightsAvgNtm = minimumNightsAvgNtm;
	}

	public void setMaximumNightsAvgNtm(double maximumNightsAvgNtm) {

		this.maximumNightsAvgNtm = maximumNightsAvgNtm;
	}

	public void setCalendarUpdated(String calendarUpdated) {

		this.calendarUpdated = calendarUpdated;
	}

	public void setHasAvailability(String hasAvailability) {

		this.hasAvailability = hasAvailability;
	}

	public void setAvaialble30(int avaialble30) {

		this.avaialble30 = avaialble30;
	}

	public void setAvaialble60(int avaialble60) {

		this.avaialble60 = avaialble60;
	}

	public void setAvaialble90(int avaialble90) {

		this.avaialble90 = avaialble90;
	}

	public void setAvaialble365(int avaialble365) {

		this.avaialble365 = avaialble365;
	}

	public void setCaladerLastScraped(String caladerLastScraped) {

		this.caladerLastScraped = caladerLastScraped;
	}

	public void setNoOfReviews(int noOfReviews) {

		this.noOfReviews = noOfReviews;
	}

	public void setNoOfReviewsLtm(int noOfReviewsLtm) {

		this.noOfReviewsLtm = noOfReviewsLtm;
	}

	public void setFirstReview(String firstReview) {

		this.firstReview = firstReview;
	}

	public void setlastReview(String lastReview) {

		this.lastReview = lastReview;
	}

	public void setReviewScoresRating(int reviewScoresRating) {

		this.reviewScoresRating = reviewScoresRating;
	}

	public void setReviewScoresAccuracy(int reviewScoresAccuracy) {

		this.reviewScoresAccuracy = reviewScoresAccuracy;
	}

	public void setReviewScoresCleanliness(int reviewScoresCleanliness) {

		this.reviewScoresCleanliness = reviewScoresCleanliness;
	}

	public void setReviewScoresCheckin(int reviewScoresCheckin) {

		this.reviewScoresCheckin = reviewScoresCheckin;
	}

	public void setReviewScoresCommunication(int reviewScoresCommunication) {

		this.reviewScoresCommunication = reviewScoresCommunication;
	}

	public void setReviewScoresLocation(int reviewScoresLocation) {

		this.reviewScoresLocation = reviewScoresLocation;
	}

	public void setReviewScoresValue(int reviewScoresValue) {

		this.reviewScoresValue = reviewScoresValue;
	}

	public void setRequiresLicense(String requiresLicense) {
		this.requiresLicense = requiresLicense;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public void setJuridictionNames(String juridictionNames) {
		this.juridictionNames = juridictionNames;
	}

	public void setInstantBookable(String instantBookable) {
		this.instantBookable = instantBookable;
	}

	public void setIsBusinessTravelReady(String isBusinessTravelReady) {
		this.isBusinessTravelReady = isBusinessTravelReady;
	}

	public void setCancellationPolicy(String cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}

	public void setRequireGuestProfilePicture(String requireGuestProfilePicture) {
		this.requireGuestProfilePicture = requireGuestProfilePicture;
	}

	public void setRequireGuestPhoneVerification(String requireGuestPhoneVerification) {
		this.requireGuestPhoneVerification = requireGuestPhoneVerification;
	}

	public void setCalculatedHostListingsCount(int calculatedHostListingsCount) {

		this.calculatedHostListingsCount = calculatedHostListingsCount;
	}

	public void setCalculatedHostListingsCountEntireHomes(int calculatedHostListingsCountEntireHomes) {

		this.calculatedHostListingsCountEntireHomes = calculatedHostListingsCountEntireHomes;
	}

	public void setCalculatedHostListingsCountprivateRooms(int calculatedHostListingsCountprivateRooms) {

		this.calculatedHostListingsCountprivateRooms = calculatedHostListingsCountprivateRooms;
	}

	public void setCalculatedHostListingsCountSharedRooms(int calculatedHostListingsCountSharedRooms) {

		this.calculatedHostListingsCountSharedRooms = calculatedHostListingsCountSharedRooms;
	}

	public void setReviewsPerMonth(double reviewsPerMonth) {

		this.reviewsPerMonth = reviewsPerMonth;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(id);
		out.writeUTF(listingUrl);
		out.writeUTF(scrapId);
		out.writeUTF(lastScraped);
		out.writeUTF(name);
		out.writeUTF(experiencesOffered);
		out.writeUTF(thumbnailUrl);
		out.writeUTF(mediumUrl);
		out.writeUTF(pictureUrl);
		out.writeUTF(xlPictureUrl);
		out.writeUTF(hostId);
		out.writeUTF(hostUrl);
		out.writeUTF(hostName);
		out.writeUTF(hostSince);
		out.writeUTF(hostLocation);
		out.writeUTF(hostResponceTime);
		out.writeUTF(hostResponceRate);
		out.writeUTF(hostAcceptanceRate);
		out.writeUTF(hostIsSuperHost);
		out.writeUTF(hostThumbNamilUrl);
		out.writeUTF(hostPictureUrl);
		out.writeUTF(hostNeighbourhood);
		out.writeInt(hostListingCount);
		out.writeInt(hostTotalListingCount);
		out.writeUTF(hostVerification);
		out.writeUTF(hostHasProfilePic);
		out.writeUTF(hostIdentityVerified);
		out.writeUTF(street);
		out.writeUTF(neighbourhood);
		out.writeUTF(neighbourhoodCleansed);
		out.writeUTF(neighbourhoodGroupCleansed);
		out.writeUTF(city);
		out.writeUTF(state);
		out.writeUTF(zipcode);
		out.writeUTF(market);
		out.writeUTF(smartLocation);
		out.writeUTF(countryCode);
		out.writeUTF(country);
		out.writeUTF(latitude);
		out.writeUTF(longitude);
		out.writeUTF(isLocationExact);
		out.writeUTF(propertyType);
		out.writeUTF(roomType);
		out.writeInt(accommodates);
		out.writeDouble(bathrooms);
		out.writeInt(bedrooms);
		out.writeInt(bed);
		out.writeUTF(bedType);
		out.writeInt(squareFeet);
		out.writeDouble(price);
		out.writeDouble(weeklyPrice);
		out.writeDouble(monthlyPrice);
		out.writeDouble(securityDeposit);
		out.writeDouble(cleaningFee);
		out.writeInt(guestsIncluded);
		out.writeDouble(extraPeople);
		out.writeInt(minimumNights);
		out.writeInt(maximumNights);
		out.writeInt(minimumMinimumNights);
		out.writeInt(maximumMinimumNights);
		out.writeInt(minimumMaximumNights);
		out.writeInt(maximumMaximumNights);
		out.writeDouble(minimumNightsAvgNtm);
		out.writeDouble(maximumNightsAvgNtm);
		out.writeUTF(calendarUpdated);
		out.writeUTF(hasAvailability);
		out.writeInt(avaialble30);
		out.writeInt(avaialble60);
		out.writeInt(avaialble90);
		out.writeInt(avaialble365);
		out.writeUTF(caladerLastScraped);
		out.writeInt(noOfReviews);
		out.writeInt(noOfReviewsLtm);
		out.writeUTF(firstReview);
		out.writeUTF(lastReview);
		out.writeInt(reviewScoresRating);
		out.writeInt(reviewScoresAccuracy);
		out.writeInt(reviewScoresCleanliness);
		out.writeInt(reviewScoresCheckin);
		out.writeInt(reviewScoresCommunication);
		out.writeInt(reviewScoresLocation);
		out.writeInt(reviewScoresValue);
		out.writeUTF(requiresLicense);
		out.writeUTF(license);
		out.writeUTF(juridictionNames);
		out.writeUTF(instantBookable);
		out.writeUTF(isBusinessTravelReady);
		out.writeUTF(cancellationPolicy);
		out.writeUTF(requireGuestProfilePicture);
		out.writeUTF(requireGuestPhoneVerification);
		out.writeInt(calculatedHostListingsCount);
		out.writeInt(calculatedHostListingsCountEntireHomes);
		out.writeInt(calculatedHostListingsCountprivateRooms);
		out.writeInt(calculatedHostListingsCountSharedRooms);
		out.writeDouble(reviewsPerMonth);

	}

	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		id = in.readUTF();
		listingUrl = in.readUTF();
		scrapId = in.readUTF();
		lastScraped = in.readUTF();
		name = in.readUTF();
		experiencesOffered = in.readUTF();
		thumbnailUrl = in.readUTF();
		mediumUrl = in.readUTF();
		pictureUrl = in.readUTF();
		xlPictureUrl = in.readUTF();
		hostId = in.readUTF();
		hostUrl = in.readUTF();
		hostName = in.readUTF();
		hostSince = in.readUTF();
		hostLocation = in.readUTF();
		hostResponceTime = in.readUTF();
		hostResponceRate = in.readUTF();
		hostAcceptanceRate = in.readUTF();
		hostIsSuperHost = in.readUTF();
		hostThumbNamilUrl = in.readUTF();
		hostPictureUrl = in.readUTF();
		hostNeighbourhood = in.readUTF();
		hostListingCount = in.readInt();
		hostTotalListingCount = in.readInt();
		hostVerification = in.readUTF();
		hostHasProfilePic = in.readUTF();
		hostIdentityVerified = in.readUTF();
		street = in.readUTF();
		neighbourhood = in.readUTF();
		neighbourhoodCleansed = in.readUTF();
		neighbourhoodGroupCleansed = in.readUTF();
		city = in.readUTF();
		state = in.readUTF();
		zipcode = in.readUTF();
		market = in.readUTF();
		smartLocation = in.readUTF();
		countryCode = in.readUTF();
		country = in.readUTF();
		latitude = in.readUTF();
		longitude = in.readUTF();
		isLocationExact = in.readUTF();
		propertyType = in.readUTF();
		roomType = in.readUTF();
		accommodates = in.readInt();
		bathrooms = in.readDouble();
		bedrooms = in.readInt();
		bed = in.readInt();
		bedType = in.readUTF();
		squareFeet = in.readInt();
		price = in.readDouble();
		weeklyPrice = in.readDouble();
		monthlyPrice = in.readDouble();
		securityDeposit = in.readDouble();
		cleaningFee = in.readDouble();
		guestsIncluded = in.readInt();
		extraPeople = in.readDouble();
		minimumNights = in.readInt();
		maximumNights = in.readInt();
		minimumMinimumNights = in.readInt();
		maximumMinimumNights = in.readInt();
		minimumMaximumNights = in.readInt();
		maximumMaximumNights = in.readInt();
		minimumNightsAvgNtm = in.readDouble();
		maximumNightsAvgNtm = in.readDouble();
		calendarUpdated = in.readUTF();
		hasAvailability = in.readUTF();
		avaialble30 = in.readInt();
		avaialble60 = in.readInt();
		avaialble90 = in.readInt();
		avaialble365 = in.readInt();
		caladerLastScraped = in.readUTF();
		noOfReviews = in.readInt();
		noOfReviewsLtm = in.readInt();
		firstReview = in.readUTF();
		lastReview = in.readUTF();
		reviewScoresRating = in.readInt();
		reviewScoresAccuracy = in.readInt();
		reviewScoresCleanliness = in.readInt();
		reviewScoresCheckin = in.readInt();
		reviewScoresCommunication = in.readInt();
		reviewScoresLocation = in.readInt();
		reviewScoresValue = in.readInt();
		requiresLicense = in.readUTF();
		license = in.readUTF();
		juridictionNames = in.readUTF();
		instantBookable = in.readUTF();
		isBusinessTravelReady = in.readUTF();
		cancellationPolicy = in.readUTF();
		requireGuestProfilePicture = in.readUTF();
		requireGuestPhoneVerification = in.readUTF();
		calculatedHostListingsCount = in.readInt();
		calculatedHostListingsCountEntireHomes = in.readInt();
		calculatedHostListingsCountprivateRooms = in.readInt();
		calculatedHostListingsCountSharedRooms = in.readInt();
		reviewsPerMonth = in.readDouble();

	}

	@Override
	public String toString() {
		return id + "~" + listingUrl + "~" + scrapId + "~" + lastScraped + "~" + name + "~" + experiencesOffered + "~"
				+ thumbnailUrl + "~" + mediumUrl + "~" + pictureUrl + "~" + xlPictureUrl + "~" + hostId + "~" + hostUrl
				+ "~" + hostName + "~" + hostSince + "~" + hostLocation + "~" + hostResponceTime + "~"
				+ hostResponceRate + "~" + hostAcceptanceRate + "~" + hostIsSuperHost + "~" + hostThumbNamilUrl + "~"
				+ hostPictureUrl + "~" + hostNeighbourhood + "~" + hostListingCount + "~" + hostTotalListingCount + "~"
				+ hostVerification + "~" + hostHasProfilePic + "~" + hostIdentityVerified + "~" + street + "~"
				+ neighbourhood + "~" + neighbourhoodCleansed + "~" + neighbourhoodGroupCleansed + "~" + city + "~"
				+ state + "~" + zipcode + "~" + market + "~" + smartLocation + "~" + countryCode + "~" + country + "~"
				+ latitude + "~" + longitude + "~" + isLocationExact + "~" + propertyType + "~" + roomType + "~"
				+ accommodates + "~" + bathrooms + "~" + bedrooms + "~" + bed + "~" + bedType + "~" + squareFeet + "~"
				+ price + "~" + weeklyPrice + "~" + monthlyPrice + "~" + securityDeposit + "~" + cleaningFee + "~"
				+ guestsIncluded + "~" + extraPeople + "~" + minimumNights + "~" + maximumNights + "~"
				+ minimumMinimumNights + "~" + maximumMinimumNights + "~" + minimumMaximumNights + "~"
				+ maximumMaximumNights + "~" + minimumNightsAvgNtm + "~" + maximumNightsAvgNtm + "~" + calendarUpdated
				+ "~" + hasAvailability + "~" + avaialble30 + "~" + avaialble60 + "~" + avaialble90 + "~" + avaialble365
				+ "~" + caladerLastScraped + "~" + noOfReviews + "~" + noOfReviewsLtm + "~" + firstReview + "~"
				+ lastReview + "~" + reviewScoresRating + "~" + reviewScoresAccuracy + "~" + reviewScoresCleanliness
				+ "~" + reviewScoresCheckin + "~" + reviewScoresCommunication + "~" + reviewScoresLocation + "~"
				+ reviewScoresValue + "~" + requiresLicense + "~" + license + "~" + juridictionNames + "~"
				+ instantBookable + "~" + isBusinessTravelReady + "~" + cancellationPolicy + "~"
				+ requireGuestProfilePicture + "~" + requireGuestPhoneVerification + "~" + calculatedHostListingsCount
				+ "~" + calculatedHostListingsCountEntireHomes + "~" + calculatedHostListingsCountprivateRooms + "~"
				+ calculatedHostListingsCountSharedRooms + "~" + reviewsPerMonth;
	}

	@Override
	public int compareTo(Listing o) {
		// TODO Auto-generated method stub

		return this.compareTo(o);
	}

}
