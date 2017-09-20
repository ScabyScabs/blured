package com.scabs.pokemon.blured.pojos;

public enum Technique {
	
	//FISSURE("", 5, Type.GROUND, 0, 30, Status.KO, 100, 0), // Abime
	//ACIDARMOR("", 40, Type.POISON, 0, 100, Status.DEFENSE, 100, 2), // Acidarmure
	
	GROWL("Rugissement", "",40, Type.NORMAL, 0, 100, Status.ATTACK, 100, -1, null, 0, 0, 0), 
	TAIL_WHIP("Mimi-queue", "", 30, Type.NORMAL, 0, 100, Status.DEFENSE, 100, -1, null, 0, 0, 0), 
	TACKLE("Charge", "", 35, Type.NORMAL, 35, 95, null, 0, 0, null, 0, 0, 0), 
	SCRATCH("Griffe", "", 35, Type.NORMAL, 40, 100, null, 0, 0, null, 0, 0, 0); 

	private String name;
	private String code;
	private int powerPoints;
	private Type type;
	private int power;
	private int accuracy;
	private Status status;
	private int statusChance;
	private int statusPower;
	private Status selfStatus;
	private int selfStatusPower;
	private int healFromDamageRate;
	private int healFromHPRate;
	
	Technique(String nameVal, String codeVal, int powerPointsVal, Type typeVal, int powerVal, int accuracyVal, 
			Status statusVal, int statusChanceVal, int statusPowerVal, Status selfStatusVal,
			int selfStatusPowerVal, int healFromDamageRateVal, int healFromHPRateVal) {
		this.name = nameVal;
		this.code = codeVal;
		this.powerPoints = powerPointsVal;
		this.type = typeVal;
		this.power = powerVal;
		this.accuracy = accuracyVal;
		this.status = statusVal;
		this.statusChance = statusChanceVal;
		this.statusPower = statusPowerVal;
		this.selfStatus = selfStatusVal;
		this.selfStatusPower = selfStatusPowerVal;
		this.healFromDamageRate = healFromDamageRateVal;
		this.healFromHPRate = healFromHPRateVal;
	}
	
	public String getName() {
		return this.name;	
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

	public Status getSelfStatus() {
		return selfStatus;
	}

	public int getSelfStatusPower() {
		return selfStatusPower;
	}

	public int getHealFromDamageRate() {
		return healFromDamageRate;
	}

	public int getHealFromHPRate() {
		return healFromHPRate;
	}
}
