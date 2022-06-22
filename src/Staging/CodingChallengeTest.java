package Staging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingChallengeTest {

	@Test
	 public void testSquareSmall() {
		int answer = CodingChallenge.findNumberOfSquare(3, 9);
		assertEquals(2, answer);
	}
	
	@Test
	 public void testSquareZerp() {
		int answer = CodingChallenge.findNumberOfSquare(17, 24);
		assertEquals(0, answer);
	}
	
	@Test
	 public void testSquareLarge() {
		int answer = CodingChallenge.findNumberOfSquare(1, 1000000000);
		assertEquals(31622, answer);
	}
}
