package com.metacube;

import java.util.ArrayList;
import java.util.List;

/**
 * this class performs the counseling process
 * @author Prateek Chaplot
 *
 */
public class Counselling {
	
	/**
	 * this method is assigning the college as per the candidate's choice
	 * @param {List<College>}collegeList - list of colleges
	 * @param {QueueImplementation}candidateQueue - queue having candidates based on their ranking
	 * @param {int}inputChoice - array having choices of candidate
	 * @return
	 */
	public List<String> startCounselling(List<College> collegeList, QueueImplementation candidateQueue, int[] inputChoice) {
		//list of candidates after college is allotted
		List<String> outputListofCandidates = new ArrayList<>();

		//loop to iterate over the queue of candidates
		for(int i = 0; i < candidateQueue.getQueue().length; i++) {
			//to manage the total available seats
			int seatCount = 0;
			
			//for each loop to get the total seats
			for(College college : collegeList) {
				seatCount += college.getSeats();
			}
			
			//if all seats are blocked
			if(seatCount == 0) {
				/*iterating for not allotted candidates*/
				for(int j = i; j < candidateQueue.getQueue().length; j++) {
					outputListofCandidates.add(((Candidate) candidateQueue.dequeue()).getName() +' '+ null);
				}
				
				break;
			}
			
			//if seat for particular college is 0
			if(collegeList.get(inputChoice[i] - 1).getSeats() == 0) {	
				//getting back to same candidate to get another choice
				i--;
				
				continue;
			} else {
				//updating seats and college name for college and candidate
				Candidate currentCandidate = (Candidate) candidateQueue.dequeue();
				currentCandidate.setCollege(collegeList.get(inputChoice[i] - 1).getName());
				outputListofCandidates.add(currentCandidate.getName() +' '+ currentCandidate.getCollege());
				collegeList.get(inputChoice[i] - 1).decrementSeats();
			}
		}
		
		return outputListofCandidates;
	}
}