package com.metacube;

/**
 * this class contains the attributes of colleges that are
 * participating in the counseling.
 * @author Prateek Chaplot
 *
 */
public class College {
	String name;	//name of college
	int seats;	//no of seats in college
	
	/**
	 * constructor to set details
	 * @param {String}name - The name of the college
	 * @param {int}seats - number of seats in the college
	 */
	public College(String name, int seats) {
		this.name = name;
		this.seats = seats;
	}

	/**
	 * method to update the seats for particular college
	 */
	public void decrementSeats() {
		seats--;
	}

	/**
	 * method to get the name of college
	 * @return Name of college
	 */
	public String getName() {
		return name;
	}

	/**
	 * method to get the seats of college
	 * @return seats
	 */
	public int getSeats() {
		return seats;
	}
	
	/**
	 * method to display the college name and seats available
	 * @return String
	 */
	public String displayCollegeDetails() {
		return this.name + "  " + this.seats;
	}
}