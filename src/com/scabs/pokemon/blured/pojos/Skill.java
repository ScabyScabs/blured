package com.scabs.pokemon.blured.pojos;

public class Skill {

	private int maxPowerPoints;
	private int currentPowerPoints;
	private Technique technique;

	public Skill(Technique techniqueVal) {
		this.technique = techniqueVal;
		this.maxPowerPoints = techniqueVal.getPowerPoints();
		this.currentPowerPoints = techniqueVal.getPowerPoints();
	}

	public int getMaxPowerPoints() {
		return maxPowerPoints;
	}

	public void setMaxPowerPoints(int maxPowerPoints) {
		this.maxPowerPoints = maxPowerPoints;
	}

	public int getCurrentPowerPoints() {
		return currentPowerPoints;
	}

	public void setCurrentPowerPoints(int currentPowerPoints) {
		this.currentPowerPoints = currentPowerPoints;
	}

	public Technique getTechnique() {
		return technique;
	}
}
