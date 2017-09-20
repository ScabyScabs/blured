package com.scabs.pokemon.mechanics;

import java.util.Random;

import com.scabs.pokemon.blured.pojos.Pokemon;
import com.scabs.pokemon.blured.pojos.Skill;
import com.scabs.pokemon.blured.pojos.Species;
import com.scabs.pokemon.blured.pojos.Technique;

public class Fight {

	public static void main(String[] args) {
		boolean attackerPriority;
		Pokemon defender = new Pokemon(Species.CHARMELEON, 18);
		Skill[] defSkills = {new Skill(Technique.SCRATCH), new Skill(Technique.GROWL)};	
		defender.setSkills(defSkills);
		Pokemon attacker = new Pokemon(Species.WARTORLE, 18);
		Skill[] attSkills = {new Skill(Technique.TACKLE), new Skill(Technique.TAIL_WHIP)};
		attacker.setSkills(attSkills);
		
		while (defender.getCurrentHp() > 0 && attacker.getCurrentHp() > 0) {
			// choose both attacks
			Skill defenderSkill = defender.getSkills()[0];
			Skill attackerSkill = attacker.getSkills()[0];
			
			// determine priority (speed / quick-attack)
			attackerPriority = attacker.getSpeed() > defender.getSpeed();
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
			System.out.println(attacker.getName() + " still has " + attacker.getCurrentHp() + " HP.");
			System.out.println(defender.getName() + " still has " + defender.getCurrentHp() + " HP.");
		}
		System.out.println("Fight is over");
	}
	
	public static void doAttack(Pokemon attacker, Skill skill, Pokemon defender) {
		System.out.println(attacker.getName() + " uses " + skill.getTechnique().getName());
		Random rdm = new Random();
		if (rdm.nextInt(100) <= skill.getTechnique().getAccuracy()) {
			float baseDamage = ((2 * attacker.getLevel() / 5 + 2) * skill.getTechnique().getPower() 
					* (skill.getTechnique().getType().isSpecial() ? (attacker.getSpecial() / defender.getSpecial()) : (attacker.getAttack() / defender.getDefense()))
					/ 50 ) + 2;
			float modifier = (rdm.nextInt(38) + 217) / 255F;
			modifier =  (modifier * (attacker.getSpecies().getTypes().equals(skill.getTechnique().getType()) ? 1.5F : 1F));
			int damage = (int) Math.floor(baseDamage * modifier);
			System.out.println(attacker.getName() + " does " + damage + " damage to " + defender.getName());
			defender.setCurrentHp(defender.getCurrentHp() - damage);
		} else {
			System.out.println(attacker.getName() + "'s attack misses the target");
		}
	}
}
