package com.flipkart.bean;

import java.util.ArrayList;
import java.util.List;

public class GymCentre {
	private static int idCounter = 1;
	private int gymID;
	private String gymName;
	private String location;
	private int noOfSeats;
	private String gymOwnerID;

	private static List<GymCentre> gymList = new ArrayList<>();

	static {
		GymCentre gym1 = new GymCentre();
		gym1.setGymName("Be Fit");
		gym1.setLocation("HSR Layout");
		gym1.setNoOfSeats(30);
		gym1.setGymOwnerID("1");
		gymList.add(gym1);

		GymCentre gym2 = new GymCentre();
		gym2.setGymName("Cult Fit");
		gym2.setLocation("Begur");
		gym2.setNoOfSeats(45);
		gym2.setGymOwnerID("2");
		gymList.add(gym2);

		GymCentre gym3 = new GymCentre();
		gym3.setGymName("ABC GymCentre");
		gym3.setLocation("HSR Layout");
		gym3.setNoOfSeats(50);
		gym3.setGymOwnerID("3");
		gymList.add(gym3);
	}

	public GymCentre() {
		this.gymID = idCounter++;
	}

	public static List<GymCentre> getGymList() {
		return gymList;
	}

	public static void addGym(GymCentre gymCentre) {
		gymList.add(gymCentre);
	}

	public int getGymID() {
		return gymID;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getGymOwnerID() {
		return gymOwnerID;
	}

	public void setGymOwnerID(String gymOwnerID) {
		this.gymOwnerID = gymOwnerID;
	}
}
