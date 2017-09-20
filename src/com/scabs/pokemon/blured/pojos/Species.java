package com.scabs.pokemon.blured.pojos;

public enum Species {

	BULBASAURE	(  1,  "Bulbizarre", new Type[]{Type.GRASS, Type.POISON}, 	 45,  49,  49,  45,  65, 16), 
	IVYSAUR		(  2,  "Herbizarre", new Type[]{Type.GRASS, Type.POISON}, 	 60,  62,  63,  60,  80, 32), 
	VENUSAURE	(  3,  "Florizarre", new Type[]{Type.GRASS, Type.POISON}, 	 80,  82,  83,  80, 100,  0), 
	CHARMANDER	(  4,   "Salamèche", new Type[]{Type.FIRE}, 				 39,  52,  43,  65,  60, 16),
	CHARMELEON	(  5, "Reptincelle", new Type[]{Type.FIRE}, 				 58,  64,  58,  80,  80, 32), 
	CHARIZARD	(  6,   "Dracaufeu", new Type[]{Type.FIRE, Type.FLYING}, 	 78,  84,  78, 100, 109,  0), 
	SQUIRTLE	(  7,    "Carapuce", new Type[]{Type.WATER}, 				 44,  48,  65,  43,  50, 16), 
	WARTORLE	(  8,   "Carabaffe", new Type[]{Type.WATER}, 				 59,  63,  80,  58,  65, 32), 
	BLASTOISE	(  9,     "Tortank", new Type[]{Type.WATER}, 				 79,  83, 100,  78,  85,  0), 
	CATERPIE	( 10,    "Chenipan", new Type[]{Type.BUG}, 				 45,  30,  35,  45,  20,  7), 
	METAPOD		( 11,  "Chrysacier", new Type[]{Type.BUG}, 				 50,  20,  55,  30,  25, 10), 
	BUTTERFREE	( 12, "Papillusion", new Type[]{Type.BUG, Type.FLYING}, 	 60,  45,  50,  70,  90,  0), 
	WEEDLE		( 13,     "Aspicot", new Type[]{Type.BUG, Type.POISON}, 	 40,  35,  30,  50,  20,  7), 
	KAKUNA		( 14,  "Conconfort", new Type[]{Type.BUG, Type.POISON}, 	 45,  25,  50,  35,  25, 10), 
	BEEDRILL	( 15,  "Dardargnan", new Type[]{Type.BUG, Type.POISON}, 	 65,  90,  40,  75,  45,  0); 

	private int pokedexNumber;
	private String name;
	private Type[] types;
	private int baseHP;
	private int baseAttack;
	private int baseDefense;
	private int baseSpeed;
	private int baseSpecial;
	private int evolutionLevel;

	Species(int pokedexNumberVal, String nameVal, Type[] typesVal, int baseHPVal, int baseAttackVal, 
			int baseDefenseVal, int baseSpeedVal, int baseSpecialVal, int evolutionLevelVal) {
		this.pokedexNumber = pokedexNumberVal;
		this.name = nameVal;
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
	
	public String getName() {
		return this.name;
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
