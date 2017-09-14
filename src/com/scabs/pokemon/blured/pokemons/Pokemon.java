package com.scabs.pokemon.blured.pokemons;

import java.util.ArrayList;

public class Pokemon {
	
	public static ArrayList<POKEMON_TYPES> TYPES;
	public static String SPECIES;
	public static int EVOLUTION_LEVEL;
	
	public static int BASE_HP;
	public static int BASE_ATTACK;
	public static int BASE_DEFENSE;
	public static int BASE_SPEED;
	public static int BASE_SPECIAL;
	
	private int level;
	private String name;
	private List<Skill> skills;

	private int attackIv;
	private int defenseIv;
	private int speedIv;
	private int specialIv;

	private int hpEv;
	private int attackEv;
	private int defenseEv;
	private int speedEv;
	private int specialEv;
	
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

	public int getHpIv() {
		return 8*(this.getAttackIv()%2)+4*(this.getDefenseIv()%2)+2*(this.getSpeedIv()%2)+this.getSpecialIv()%2;
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
	
	public int getHp() {
		return 10 + ((this.getHpIv() + BASE_HP + (int)Math.round(Math.sqrt(this.getHpEv()))/8)*this.getLevel())/50;
	}
	
	public int getAttack() {
		return 5 + ((this.getAttackIv() + BASE_ATTACK + (int)Math.round(Math.sqrt(this.getAttackEv()))/8)*this.getLevel())/50;
	}
	
	public int getDefense() {
		return 5 + ((this.getDefenseIv() + BASE_DEFENSE + (int)Math.round(Math.sqrt(this.getDefenseEv()))/8)*this.getLevel())/50;
	}
	
	public int getSpeed() {
		return 5 + ((this.getSpeedIv() + BASE_SPEED + (int)Math.round(Math.sqrt(this.getSpeedEv()))/8)*this.getLevel())/50;
	}
	
	public int getSpecial() {
		return 5 + ((this.getSpecialIv() + BASE_SPECIAL + (int)Math.round(Math.sqrt(this.getSpecialEv()))/8)*this.getLevel())/50;
	}	
}