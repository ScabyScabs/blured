package com.scabs.pokemon.blured.pojos;

public enum Technique {
	
	//FISSURE("", 5, Type.GROUND, 0, 30, Status.KO, 100, 0), // Abime
	//ACIDARMOR("", 40, Type.POISON, 0, 100, Status.DEFENSE, 100, 2), // Acidarmure
	
	TACKLE("", 35, Type.NORMAL, 35, 95, null, 0, 0);
	
	private String code;
	private int powerPoints;
	private Type type;
	private int power;
	private int accuracy;
	private Status status;
	private int statusChance;
	private int statusPower;
	
	Technique(String codeVal, int powerPointsVal, Type typeVal, int powerVal, int accuracyVal, 
			Status statusVal, int statusChanceVal, int statusPowerVal) {
		this.code = codeVal;
		this.powerPoints = powerPointsVal;
		this.type = typeVal;
		this.power = powerVal;
		this.accuracy = accuracyVal;
		this.status = statusVal;
		this.statusChance = statusChanceVal;
		this.statusPower = statusPowerVal;
	}
	
	public String getCode() {
		return this.code;	
	}
	
	public int getPowerPoints() {
		return this.powerPoints;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getAccuracy() {
		return this.accuracy;
	}
	
	public Status getStatus() {
		return this.status;
	}
	
	public int getStatusChance() {
		return this.statusChance;
	}
	
	public int getStatusPower() {
		return this.statusPower;
	}
}
