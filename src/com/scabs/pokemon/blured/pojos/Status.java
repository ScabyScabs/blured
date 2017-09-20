package com.scabs.pokemon.blured.pojos;

public enum Status {
	ATTACK(true, false),
	DEFENSE(true, false),
	SPEED(true, false),
	SPECIAL(true, false),
	ACCURACY(true, false),
	AVOIDANCE(true, false),
	POISON(false, true),
	BAD_POISON(false, true),
	PARALYZED(false, true),
	ASLEEP(false, true),
	BURNED(false, true),
	MADNESS(false, false);

	boolean statModifier;
	boolean persistentStatus;
	
	Status(boolean statModifierVal, boolean persistentStatusVal) {
		this.statModifier = statModifierVal; 
		this.persistentStatus = persistentStatusVal;
	}

	public boolean isStatModifier() {
		return statModifier;
	}

	public boolean isPersistentStatus() {
		return persistentStatus;
	}
}
