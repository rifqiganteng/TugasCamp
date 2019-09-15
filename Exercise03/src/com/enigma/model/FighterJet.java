package com.enigma.model;

public class FighterJet extends Airplane {

    private String weapon;

    public FighterJet(Double F1, Double F2, Integer speedTween, Integer speedSingle){
        super(F1,F2, speedTween, speedSingle);
        this.weapon = weapon;

    }
//    public Double getDamage() {
//       retur this.weapon;
//    }


//    public String print() {
//        return "FighterJet{" +
//                "weapon='" + weapon + '\'' +
//                ", F2=" + F2 +
//                ", F1=" + F1 +
//                ", pushTween=" + pushTween +
//                ", pushSingle=" + pushSingle +
//                + angkatPesawat()+
//                + chooseEngine()+
//                '}';
//    }
}
