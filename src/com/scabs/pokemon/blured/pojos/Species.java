package com.scabs.pokemon.blured.pojos;

public enum Species {

	BULBASAURE	(  1, new Type[]{Type.GRASS, Type.POISON}, 	 45,  49,  49,  45,  65, 16), // Bulbizarre
	IVYSAUR		(  2, new Type[]{Type.GRASS, Type.POISON}, 	 60,  62,  63,  60,  80, 32), // Herbizarre
	VENUSAURE	(  3, new Type[]{Type.GRASS, Type.POISON}, 	 80,  82,  83,  80, 100,  0), // Florizarre
	CHARMANDER	(  4, new Type[]{Type.FIRE}, 				 39,  52,  43,  65,  60, 16), // Salamèche
	CHARMELEON	(  5, new Type[]{Type.FIRE}, 				 58,  64,  58,  80,  80, 32), // Reptincelle
	CHARIZARD	(  6, new Type[]{Type.FIRE, Type.FLYING}, 	 78,  84,  78, 100, 109,  0), // Dracaufeu
	SQUIRTLE	(  7, new Type[]{Type.WATER}, 				 44,  48,  65,  43,  50, 16), // Carapuce
	WARTORLE	(  8, new Type[]{Type.WATER}, 				 59,  63,  80,  58,  65, 32), // Carabaffe
	BLASTOISE	(  9, new Type[]{Type.WATER}, 				 79,  83, 100,  78,  85,  0), // Tortank
	CATERPIE	( 10, new Type[]{Type.BUG}, 				 45,  30,  35,  45,  20,  7), // Chenipan
	METAPOD		( 11, new Type[]{Type.BUG}, 				 50,  20,  55,  30,  25, 10), // Chrysacier
	BUTTERFREE	( 12, new Type[]{Type.BUG, Type.FLYING}, 	 60,  45,  50,  70,  90,  0), // Papillusion
	WEEDLE		( 13, new Type[]{Type.BUG, Type.POISON}, 	 40,  35,  30,  50,  20,  7), // Aspicot
	KAKUNA		( 14, new Type[]{Type.BUG, Type.POISON}, 	 45,  25,  50,  35,  25, 10), // Conconfort
	BEEDRILL	( 15, new Type[]{Type.BUG, Type.POISON}, 	 65,  90,  40,  75,  45,  0); // Dardargnan

	private int pokedexNumber;
	private Type[] types;
	private int baseHP;
	private int baseAttack;
	private int baseDefense;
	private int baseSpeed;
	private int baseSpecial;
	private int evolutionLevel;

	Species(int pokedexNumberVal, Type[] typesVal, int baseHPVal, int baseAttackVal, int baseDefenseVal, 
			int baseSpeedVal, int baseSpecialVal, int evolutionLevelVal) {
		this.pokedexNumber = pokedexNumberVal;
		this.types = typesVal;
		this.baseHP = baseHPVal;
		this.baseAttack = baseAttackVal;
		this.baseDefense = baseDefenseVal;
		this.baseSpeed = baseSpeedVal;
		this.baseSpecial = baseSpecialVal;
		this.evolutionLevel = evolutionLevelVal;
	}
	
	public int getPokedexNumber() {
		return this.pokedexNumber;
	}
	
	public Type[] getTypes() {
		return this.types;
	}

	public int getBaseHP() {
		return this.baseHP;
	}

	public int getBaseAttack() {
		return this.baseAttack;
	}

	public int getBaseDefense() {
		return this.baseDefense;
	}

	public int getBaseSpeed() {
		return this.baseSpeed;
	}

	public int getBaseSpecial() {
		return this.baseSpecial;
	}

	public int getEvolutionLevel() {
		return this.evolutionLevel;
	}
}
