package com.metacube;

/**
 * this class contains the attributes of candidates that are
 * participating in the counseling.
 * @author Prateek Chaplot
 *
 */
public class Candidate implements Comparable<Candidate> {
	String name;	//name of candidate
	int rank;	//rank of candidate
	String college;	//alloted college of candidate
	
	/**
	 * constructor to set details
	 * @param {String}name - name of candidate
	 * @param {int}rank - rank of candidate
	 */
	public Candidate(String name, int rank) {
		this.name = name;
		this.rank = rank;
		this.college = null;
	}
	
	/**
	 * method to add college to the candidate
	 * @param {String}clgName
	 */
	public void setCollege(String clgName) {
		this.college = clgName;
	}
	
	/**
	 * method to get the name of candidate
	 * @return Name of candidate
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * method to get the name of college allotted
	 * @return Name of college
	 */
	public String getCollege() {
		return college;
	}
   
	/**
	 * method to sort the queue using comparable interface
	 */
	public int compareTo(Candidate obj) {
		return (this.rank > obj.rank) ? 1 : -1;
	}
}
