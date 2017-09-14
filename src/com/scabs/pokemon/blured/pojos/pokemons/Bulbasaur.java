package com.scabs.pokemon.blured.pojos.pokemons;

import java.util.ArrayList;

import com.scabs.pokemon.blured.pojos.Pokemon;
import com.scabs.pokemon.blured.pojos.PokemonType;

/**
 * Bulbizarre
 * @author DQU
 *
 */
public class Bulbasaur extends Pokemon {
	
	public static ArrayList<PokemonType> TYPES = new ArrayList<PokemonType>() {{
	    add(PokemonType.GRASS);
	    add(PokemonType.POISON);
	}};

	public static String SPECIES = "Bulbasaur";
	public static int EVOLUTION_LEVEL;
	
	public static int BASE_HP;
	public static int BASE_ATTACK;
	public static int BASE_DEFENSE;
	public static int BASE_SPEED;
	public static int BASE_SPECIAL;
}
