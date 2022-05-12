package qa.com.main;

import qa.com.inheritance.Bats;

public class VampireBat extends Bats {
	
	private int animalsBitten;
	
	public String diet() {
		return "Sucks blood";
	}

	public VampireBat(String breed, float wingSpanCM, String furColour, int animalsBitten) {
		super(breed, wingSpanCM, furColour);
		this.animalsBitten = animalsBitten;
	}

	public int getanimalsBitten() {
		return animalsBitten;
	}

	public void setanimalsBitten(int animalsBitten) {
		this.animalsBitten = animalsBitten;
	}

	
	

}
