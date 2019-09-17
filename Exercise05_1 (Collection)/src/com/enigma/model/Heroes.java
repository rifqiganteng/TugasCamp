package com.enigma.model;

public class Heroes implements HitAble, Offensive {
    private Heroes name;
    private Integer hp;
    private Integer mana;
    private Integer baseDamege;//dikirim ke methid "getHit" dimasukin ke (Integer Damage)
    private Skill skill1;
    private Skill skill2;
    private Integer healhp;


    public Heroes(String name, Integer hp, Integer mana, Integer baseDamege, Skill skill1, Skill skill2, Integer healhp) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.baseDamege = baseDamege;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.healhp = healhp;
    }

    public String print() {
        return "Heroes{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", baseDamege=" + baseDamege +
                '}';
    }
    public void attack(HitAble hitAble){//nyerang = ngurangin hp lawan == hp lawan - damage dia sendiri
        hitAble.getHit(this.baseDamege);
    }

    public void castskill(Heroes heroes){//nyekil =  ngurangin mana dia, guranguin hp lawn,
        skill1.castSkill(heroes); //ngurangin darah lawan
        skill1.decreaseMana(this);// untuk ngurangin mana yang nyerang
        skill2.healing(this);
    }
    public void getHit(Integer damage) {//dia terkena pukulan = hp dia sendiri - damage lawan
        this.hp = this.hp - damage;
    }

    public void decriseMana(Integer mana){//ngurangin mana = nyekil
         this.mana = this.mana - mana;
    }

    public void increaseHp(Integer healhp){
        this.hp = this.hp + healhp;

    }
}





//    @Override
//    public void getSkill(Integer damage){//terkena skill =  ngurangin hp dia
//        this.hp = this.hp - damage;
//    }



//serangan hero
//    public void attack(Heroes heroes){ //ini dikirim dari kelas utama tergantng siapa yang diserang
//        heroes.getHit(this.baseDamege);//this.basedamage = ini milik siapa yang nyerang
//public void attack(HitAble hitAble){ //ini dikirim dari kelas utama tergantng siapa yang diserang
//hitAble.getHit(this.baseDamege);//this.basedamage = ini milik siapa yang nyerang

//}

//    public void castskill(HitAble hitAble) {
//
//
//    }

//hero mendpatkan serangan
// public void getHit(Integer damage){
//    this.hp = this.hp - damage;

//}


