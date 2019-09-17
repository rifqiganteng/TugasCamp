package com.enigma.model;

public class Skill {
    private String skillName;
    private Integer manaCost;
    private Integer skillDamaged;
    private Integer skillHeal;

    public Skill(String skillName,Integer manaCost, Integer skillDamaged, Integer skillHeal) {
        //super(hp, mana, baseDamege);
        this.skillName = skillName;
        this.manaCost = manaCost;
        this.skillDamaged = skillDamaged;
        this.skillHeal = skillHeal;

    }

    public void castSkill(Heroes heroes){
        heroes.getHit(this.skillDamaged);
        ///ngwlurinn skill
        //ngeluarin skill = ngurangin XP lawan + (mana cost) ngurangin mana hero itu sendiri
    }

    public void decreaseMana(Heroes heroes){
        heroes.decriseMana(this.manaCost);
    }

    public void healing(Heroes heroes){
        heroes.decriseMana(this.manaCost);
        heroes.increaseHp(this.skillHeal);

    }
    //public Integer
}
