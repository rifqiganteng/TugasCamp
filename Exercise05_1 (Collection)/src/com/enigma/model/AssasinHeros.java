package com.enigma.model;

public class AssasinHeros extends Heroes {
    public AssasinHeros(Integer hp, Integer nama, Integer damage, Skill skill1, Skill skill2, Integer healhp){ // inheritence
        super(hp, nama, damage, skill1, skill2, healhp);

    }

    public String Print() {
        return "AssasinHeros{}";
    }
}
