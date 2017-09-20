package com.scabs.pokemon.mechanics;

import java.util.Random;

import com.scabs.pokemon.blured.pojos.Pokemon;
import com.scabs.pokemon.blured.pojos.Skill;
import com.scabs.pokemon.blured.pojos.Species;
import com.scabs.pokemon.blured.pojos.Status;
import com.scabs.pokemon.blured.pojos.Technique;

public class Fight {

	public static void main(String[] args) {
		boolean attackerPriority;
		Pokemon defender = new Pokemon(Species.CHARMELEON, 18);
		Skill[] defSkills = {new Skill(Technique.SCRATCH), new Skill(Technique.GROWL)};	
		//Skill[] defSkills = {new Skill(Technique.SCRATCH)};	
		defender.setSkills(defSkills);
		Pokemon attacker = new Pokemon(Species.WARTORLE, 18);
		Skill[] attSkills = {new Skill(Technique.TACKLE), new Skill(Technique.TAIL_WHIP)};
		//Skill[] attSkills = {new Skill(Technique.TACKLE)};
		attacker.setSkills(attSkills);
		
		while (defender.getCurrentHp() > 0 && attacker.getCurrentHp() > 0) {
			// choose both attacks
			Random rdm = new Random();
			Skill defenderSkill = defender.getSkills()[rdm.nextInt(defSkills.length)];
			Skill attackerSkill = attacker.getSkills()[rdm.nextInt(attSkills.length)];
			
			// determine priority (speed / quick-attack)
			attackerPriority = attacker.getSpeed(true) > defender.getSpeed(true);
			if (attackerPriority) {
				doAttack(attacker, attackerSkill, defender);
				if (defender.getCurrentHp() > 0) {
					doAttack(defender, defenderSkill, attacker);
				} else {
					System.out.println(defender.getName() + " is KO!");
				}
				if (attacker.getCurrentHp() <= 0) {
					System.out.println(attacker.getName() + " is KO!");
				}
			} else {
				doAttack(defender, defenderSkill, attacker);
				if (attacker.getCurrentHp() > 0) {
					doAttack(attacker, attackerSkill, defender);
				} else {
					System.out.println(attacker.getName() + " is KO!");
				}
				if (defender.getCurrentHp() <= 0) {
					System.out.println(defender.getName() + " is KO!");
				}
			}
			System.out.println();
			System.out.println(attacker.getName() + " still has " + attacker.getCurrentHp() + " HP.");
			System.out.println(defender.getName() + " still has " + defender.getCurrentHp() + " HP.");
			System.out.println();
			System.out.println();
		}
		System.out.println("Fight is over");
	}
	
	public static void doAttack(Pokemon attacker, Skill skill, Pokemon defender) {
		System.out.println(attacker.getName() + " uses " + skill.getTechnique().getName());
		Random rdm = new Random();
		if (rdm.nextInt(100) <= skill.getTechnique().getAccuracy()) {
			if (skill.getTechnique().getPower() > 0) {
				float baseDamage = ((2 * attacker.getLevel() / 5F + 2) * skill.getTechnique().getPower() 
						* (skill.getTechnique().getType().isSpecial() ? ((float)attacker.getSpecial(true) / (float)defender.getSpecial(true)) 
								: ((float)attacker.getAttack(true) / (float)defender.getDefense(true)))
						/ 50F ) + 2F;
				float modifier = (rdm.nextInt(39) + 217) / 255F;
				modifier =  (modifier * (attacker.getSpecies().getTypes().equals(skill.getTechnique().getType()) ? 1.5F : 1F));
				int damage = (int) Math.floor(baseDamage * modifier);
				System.out.println(attacker.getName() + " does " + damage + " damage to " + defender.getName());
				defender.setCurrentHp(defender.getCurrentHp() - damage);
			}
			if (skill.getTechnique().getStatus() != null && rdm.nextInt(100) <= skill.getTechnique().getStatusChance()) {
				updateStatus(defender, skill.getTechnique().getStatus(), skill.getTechnique().getStatusPower());
			}
			if (skill.getTechnique().getSelfStatus() != null) {
				updateStatus(attacker, skill.getTechnique().getSelfStatus(), skill.getTechnique().getSelfStatusPower());
			}
		} else {
			System.out.println(attacker.getName() + "'s attack misses the target");
		}
	}
	
	public static boolean updateStatus(Pokemon pokemon, Status status, int statusPower) {
		boolean applied = false;
		if (status.isStatModifier()) {
			// TODO : gérer les cas -6 ou +6 modifier.
			if (status.equals(Status.ATTACK)) {
				pokemon.setAttackModifierLevel(pokemon.getAttackModifierLevel() + statusPower); 
			} else if (status.equals(Status.DEFENSE)) {
				pokemon.setDefenseModifierLevel(pokemon.getDefenseModifierLevel() + statusPower);
			} else if (status.equals(Status.SPEED)) {
				pokemon.setSpeedModifierLevel(pokemon.getSpeedModifierLevel() + statusPower);
			} else if (status.equals(Status.SPECIAL)) {
				pokemon.setSpecialModifierLevel(pokemon.getSpecialModifierLevel() + statusPower);
			} else if (status.equals(Status.ACCURACY)) {
				pokemon.setAccuracyModifierLevel(pokemon.getAccuracyModifierLevel() + statusPower);
			} else if (status.equals(Status.AVOIDANCE)) {
				pokemon.setAvoidanceModifierLevel(pokemon.getAvoidanceModifierLevel() + statusPower);
			}
		} else {
			// TODO : gérer les status particulier (PAR BRU POI...) 
		}
		return applied;
	}
}
