package com.scabs.pokemon.blured.pokemons;

public enum PokemonType {

	NORMAL("NOR",false),
	FIRE("FIR", true),
	WATER("WAT", true),
	ELECTRIC("ELE", true),
	GRASS("GRA", true),
	ICE("ICE", true),
	FIGHTING("FGT", false),
	POISON("PSN", false),
	GROUND("GRD", false),
	FLYING("FLY", false),
	PSYCHIC("PSY", true),
	BUG("BUG", false),
	ROCK("ROK", false),
	GHOST("GHS", false),
	DRAGON("DRA", true);
	
	private String shortLabel;
	private boolean special;
	
	PokemonType(String shortLabelVal, boolean isSpecial) {
		shortLabel = shortLabelVal;
		special = isSpecial;
	}
	
	public String getShortLabel() {
		return this.shortLabel;
	}
	
	public Boolean isSpecial() {
		return this.special;
	}
}