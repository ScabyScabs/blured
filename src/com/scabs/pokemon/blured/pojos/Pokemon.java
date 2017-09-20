package com.scabs.pokemon.blured.pojos;

import java.util.ArrayList;

public class Pokemon {

	// Levels at which the pokemon learn new skills ?

	public Species species;

	private int level;
	private String name;
	private Skill[] skills;
	private ArrayList<Status> status;

	private int attackIv;
	private int defenseIv;
	private int speedIv;
	private int specialIv;

	private int hpEv;
	private int attackEv;
	private int defenseEv;
	private int speedEv;
	private int specialEv;
	
	private int currentHp;

	private int accuracy;
	private int avoidance;
	private int attackModifierLevel;
	private int defenseModifierLevel;
	private int speedModifierLevel;
	private int specialModifierLevel;

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Skill[] getSkills() {
		return skills;
	}

	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}

	public ArrayList<Status> getStatus() {
		return status;
	}

	public void setStatus(ArrayList<Status> status) {
		this.status = status;
	}

	public int getHpIv() {
		return 8 * (this.getAttackIv() % 2) + 4 * (this.getDefenseIv() % 2) + 2 * (this.getSpeedIv() % 2)
				+ this.getSpecialIv() % 2;
	}

	public int getAttackIv() {
		return attackIv;
	}

	public void setAttackIv(int attackIv) {
		this.attackIv = attackIv;
	}

	public int getDefenseIv() {
		return defenseIv;
	}

	public void setDefenseIv(int defIv) {
		this.defenseIv = defIv;
	}

	public int getSpeedIv() {
		return speedIv;
	}

	public void setSpeedIv(int speedIv) {
		this.speedIv = speedIv;
	}

	public int getSpecialIv() {
		return specialIv;
	}

	public void setSpecialIv(int specialIv) {
		this.specialIv = specialIv;
	}

	public int getHpEv() {
		return hpEv;
	}

	public void setHpEv(int hpEv) {
		this.hpEv = hpEv;
	}

	public int getAttackEv() {
		return attackEv;
	}

	public void setAttackEv(int attackEv) {
		this.attackEv = attackEv;
	}

	public int getDefenseEv() {
		return defenseEv;
	}

	public void setDefenseEv(int defvEv) {
		this.defenseEv = defvEv;
	}

	public int getSpeedEv() {
		return speedEv;
	}

	public void setSpeedEv(int speedEv) {
		this.speedEv = speedEv;
	}

	public int getSpecialEv() {
		return specialEv;
	}

	public void setSpecialEv(int speEv) {
		this.specialEv = speEv;
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getAvoidance() {
		return avoidance;
	}

	public void setAvoidance(int avoidance) {
		this.avoidance = avoidance;
	}

	public int getAttackModifierLevel() {
		return attackModifierLevel;
	}

	public void setAttackModifierLevel(int attackModifierLevel) {
		this.attackModifierLevel = attackModifierLevel;
	}

	public int getDefenseModifierLevel() {
		return defenseModifierLevel;
	}

	public void setDefenseModifierLevel(int defenseModifierLevel) {
		this.defenseModifierLevel = defenseModifierLevel;
	}

	public int getSpeedModifierLevel() {
		return speedModifierLevel;
	}

	public void setSpeedModifierLevel(int speedModifierLevel) {
		this.speedModifierLevel = speedModifierLevel;
	}

	public int getSpecialModifierLevel() {
		return specialModifierLevel;
	}

	public void setSpecialModifierLevel(int specialModifierLevel) {
		this.specialModifierLevel = specialModifierLevel;
	}

	public int getMaxHp() {
		return 10 + ((this.getHpIv() + this.species.getBaseHP() + (int) Math.round(Math.sqrt(this.getHpEv())) / 8) 
				* this.getLevel()) / 50;
	}

	public int getAttack() {
		return 5 + ((this.getAttackIv() + this.species.getBaseAttack() + (int) Math.round(Math.sqrt(this.getAttackEv())) / 8)
				* this.getLevel()) / 50;
	}

	public int getDefense() {
		return 5 + ((this.getDefenseIv() + this.species.getBaseDefense() + (int) Math.round(Math.sqrt(this.getDefenseEv())) / 8)
				* this.getLevel()) / 50;
	}

	public int getSpeed() {
		return 5 + ((this.getSpeedIv() + this.species.getBaseSpeed() + (int) Math.round(Math.sqrt(this.getSpeedEv())) / 8)
				* this.getLevel()) / 50;
	}

	public int getSpecial() {
		return 5 + ((this.getSpecialIv() + this.species.getBaseSpecial() + (int) Math.round(Math.sqrt(this.getSpecialEv())) / 8)
				* this.getLevel()) / 50;
	}

	public void generateIv() {
		this.setAttackIv((int) Math.floor(Math.random() * 16));
		this.setDefenseIv((int) Math.floor(Math.random() * 16));
		this.setSpeedIv((int) Math.floor(Math.random() * 16));
		this.setSpecialIv((int) Math.floor(Math.random() * 16));
	}

	public Pokemon() {
		this.generateIv();
	}

	public Pokemon(Species speciesVal, int levelVal) {
		this.generateIv();
		this.species = speciesVal;
		this.name = this.species.getName();
		this.level = levelVal;
		this.hpEv = 0;
		this.attackEv = 0;
		this.defenseEv = 0;
		this.speedEv = 0;
		this.specialEv = 0;

		this.setCurrentHp(this.getMaxHp());

		this.accuracy = 100;
		this.avoidance = 0;
		this.attackModifierLevel = 0;
		this.defenseModifierLevel = 0;
		this.speedModifierLevel = 0;
		this.specialModifierLevel = 0;
	}

	public Pokemon(Species speciesVal, int levelVal, int attackIvVal, int defenseIvVal, int speedIvVal, int specialIvVal) {
		this.setAttackIv(attackIvVal);
		this.setDefenseIv(attackIvVal);
		this.setSpeedIv(attackIvVal);
		this.setSpecialIv(attackIvVal);

		this.species = speciesVal;
		this.name = this.species.getName();
		this.level = levelVal;
		this.hpEv = 0;
		this.attackEv = 0;
		this.defenseEv = 0;
		this.speedEv = 0;
		this.specialEv = 0;

		this.setCurrentHp(this.getMaxHp());

		this.accuracy = 100;
		this.avoidance = 0;
		this.attackModifierLevel = 0;
		this.defenseModifierLevel = 0;
		this.speedModifierLevel = 0;
		this.specialModifierLevel = 0;
	}
	
	public void endFight() {
		this.accuracy = 100;
		this.avoidance = 0;
		this.attackModifierLevel = 0;
		this.defenseModifierLevel = 0;
		this.speedModifierLevel = 0;
		this.specialModifierLevel = 0;
		
		this.status.remove(Status.MADNESS);
	}
}
