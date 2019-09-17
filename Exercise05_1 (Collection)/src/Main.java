import com.enigma.model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        TankerHero balmond = new TankerHero("Balmon", 100, 50, 30, 40, 20, 30);



        //Heroes saitama = new Heroes(1000, 500, 50);
        //Heroes gundala = new Heroes(100, 100, 15);
        //Heroes ninja = new AssasinHeros(10,50,20);
        //Tower tower = new Tower(10000);

        Skill jump = new Skill("jump",30,40, 30);
        Skill heal = new Skill("heal", 20, 10, 20);
        Heroes gatotkaca = new Heroes("aing",1000, 500,20, jump, heal,20);
        Heroes saitama = new Heroes("uang",100,100, 5, jump, heal, 20);

        System.out.println("nyerang");
        gatotkaca.attack(saitama);
        //gatotkaca.castskill(saitama);

        System.out.println(" Gatotkaca " +gatotkaca.print());
        System.out.println(" Saitama" +saitama.print());

        System.out.println("nyekil");
        gatotkaca.castskill(saitama);
        System.out.println(" Gatotkaca " +gatotkaca.print());
        System.out.println(" Saitama" +saitama.print());


//        gundala.attack(saitama);
//        System.out.println("gundala"+gundala.print());
//        System.out.println("saitama"+saitama.print());
//
//        System.out.println("");
//
//        saitama.attack(gundala);
//        System.out.println("gundala"+gundala.print());
//        System.out.println("saitama"+saitama.print());
//        saitama.attack(tower);
//        System.out.println("============================");
//        System.out.println(gundala.print());
//        System.out.println(saitama.print());
//        System.out.println(ninja.print());
//        System.out.println(tower.print());

    }
}
