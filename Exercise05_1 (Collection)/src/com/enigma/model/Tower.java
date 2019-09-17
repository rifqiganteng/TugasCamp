package com.enigma.model;

public class Tower implements HitAble, Offensive{
    protected Integer hp;
    protected String namaTower;
    protected Integer damaged;

    public Tower(String namaTower, Integer hp, Integer damaged){
        this.hp = hp;
        this.namaTower = namaTower;
        this.damaged = damaged;
    }

    @Override
    public void getHit(Integer damage) {
        this.hp = this.hp - damaged;
    }

    @Override
    public void attack(HitAble hitAble) {
        this.hp = this.damaged;

    }

    public String print() {
        return "Tower{" +
                "hp = "  + hp +
                "Nama Tower = " + namaTower +
                "damage = " + damaged +
                '}';
    }
}
