package com.enigma.model;

public class FighterJet extends Airplane {

    private String kh_35U = "KH-35U = 320 tj";
    private String amg_65 = "AGM-65 Maverick = 220 tj";
    private String vympel = "Vympel R-27 = 100 tj";
    private String aim_9 = "AIM-9 P4 = 300 tj";
    private String vagm_142 = "vAGM-142 Raptor = 150 tj = 200tj";
    private String reduga = "Raduga KS-1 Komet";
    private String weapon;

//
//    public FighterJet(Double F1, Double F2, Integer speedTween, Integer speedSingle, Integer pushengine){
//        super(F1,F2, speedTween, speedSingle, pushengine);
        public FighterJet(Double F1, Double F2, Integer pushengine){
            super(F1,F2, pushengine);
        this.weapon = weapon;

    }
    private Integer getDamege(String misile){
        if (misile.equals(kh_35U)) {
            return this.pushTween = + 320 ;
        } else if (misile.equals(amg_65)) {
            return this.pushSingle = + 220 ;
        }else if (misile.equals(vympel)) {
            return this.pushSingle = + 100;
        }else if (misile.equals(aim_9)) {
            return this.pushSingle = + 300;
        }else if (misile.equals(vagm_142)) {
            return this.pushSingle = + 150;
        }else if (misile.equals(reduga)) {
            return this.pushSingle = + 200 ;
        } else {
            return 0 ;
        }
    }



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
