package Staging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingChallengeTest {
	int[][] test = {{0,0},{1,0},{2,0}};
	@Test
	 public void testCase1() {
		int answer = CodingChallenge.findDistance(test,2);
		assertEquals(5, answer);
	}
	
	@Test
	 public void testCase2() {
		int answer = CodingChallenge.findDistance(test,1);
		assertEquals(2, answer);
	}
	
	int[][] test2 = {{0,0},{1,0},{2,0},{3,0},{4,0}};
	@Test
	 public void testCase3() {
		int answer = CodingChallenge.findDistance(test2,4);
		assertEquals(14, answer);
	}
	
	
	//2nd Problem
	@Test
	 public void testName() {
		boolean answer = CodingChallenge.yourNameIsMyName("john", "johanna");
		assertEquals(true, answer);
	}
	
	@Test
	 public void testName2() {
		boolean answer = CodingChallenge.yourNameIsMyName("ira", "ira");
		assertEquals(true, answer);
	}
	
	
	@Test
	 public void testName3() {
		boolean answer = CodingChallenge.yourNameIsMyName("kayla", "Jayla");
		assertEquals(false, answer);
	}
	
	

}
