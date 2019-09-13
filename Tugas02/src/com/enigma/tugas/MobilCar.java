package com.enigma.tugas;


import java.util.Arrays;

public class MobilCar {

    //ATRIBUT
    private Integer postX;
    private Integer postY;
    private Integer fuel = 0;
    public Integer kaliBensin = 3;
    private char [] commands;

    //fariabel konstanta(Tidak dapat dirubah) harus Huruf besar
    private final String RULEF="F";
    private final String RULER="R";
    private final String RULEL="L";
    private final String RULEB="B";
    private final String YES="Y";
    //private final String NO="N";

    //konstruktor
    public MobilCar(Integer x, Integer y){
        this.postX = x;
        this.postY = y;
    }

    public void fillfuel(int fuel) {
        this.fuel = this.fuel + fuel;
    }

    public void move (String movement) {
        if (movement.equals(RULEB)) {
            this.postY--;
        } else if (movement.equals(RULEF)) {
            this.postY++;
        } else if (movement.equals(RULEL)) {
            this.postX--;
        } else if (movement.equals(RULER)) {
            this.postX++;
        }
    }

    public void setCommend(String commands){
        this.commands = commands.toCharArray();
    }

    public void run(){
        //boolean jawab;
        for (int i=0; i<commands.length; i++){
            if (fuel==0){
                System.out.println(" Bensin Anda Sudah Habis ");
                //jawab = false;
                System.out.println("apakah anda mau beli bensin lagi");

            }else {
                move(String.valueOf(commands[i]));
                System.out.println(commands[i]+getPosition());

                if((i+1)%3==0){
                    fuel = fuel - 1;

                }
            }
        }
    }

    public String print() {
        return "MobilCar{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel +
                ", commands=" + Arrays.toString(commands) +
                '}';
    }

    public String getPosition(){
        //System.out.println("X"+ postX +"Y" + postY+);
        return (" " + "(" + "X" +this.postX +" "+"Y" + this.postY + ")");
    }


        }

}
