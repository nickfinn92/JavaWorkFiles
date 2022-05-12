package qa.com.main;

import qa.com.inheritance.Bats;

public class FruitBat extends Bats {
	
	private int numOfFruitEaten;
	
	public String crawl() {
		return "Can crawl with the best of them!";
		
		
	}

	public FruitBat(String breed, float wingSpanCM, String furColour, int numOfFruitEaten) {
		super(breed, wingSpanCM, furColour);
		this.numOfFruitEaten = numOfFruitEaten;
	}

	public int getNumOfFruitEaten() {
		return numOfFruitEaten;
	}

	public void setNumOfFruitEaten(int numOfFruitEaten) {
		this.numOfFruitEaten = numOfFruitEaten;
	}
	
	

}
