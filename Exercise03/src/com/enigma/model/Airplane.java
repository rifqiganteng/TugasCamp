package com.enigma.model;

import com.sun.org.apache.bcel.internal.generic.F2D;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Fault1_1Impl;

public class Airplane {

    //fariabel konstanta(Tidak dapat dirubah) harus Huruf besar
    private final String doubleEngine="TWEEN";
    private final String singleEngine="SINGLE";


    //Atribut
    //private Double speed = 0.0;
    protected Double F2; //tekanan atas udara
    protected Double F1;//tekann bawah udara
    //protected Boolean case1 = F1 >= F2;
    //protected Boolean case2 = F2 >= F1;
    protected Integer pushTween;
    protected Integer pushSingle;
    protected Integer nilai;

    //konstruktor
    public Airplane(Double F1, Double F2, Integer speedTween, Integer speedSingle){
        this.F1 = F1;
        this.F2 = F2;
        this.pushTween = speedTween;
        this.pushSingle = speedSingle;

    }

    public Integer chooseEngine (String speed) {

        if (speed.equals(doubleEngine)) {
            return this.pushTween = + 4000;
        } else if (speed.equals(singleEngine)) {
            return this.pushSingle = + 2000;
        } else {
            return 0 ;
        }
    }
    public void angkatPesawat(){

        switch (nilai = 0){
            case case1:
                if (this.F1 >= this.F2) {
                    System.out.println("peswat tidak dapat terangkat" +
                            " F1 Tekanan udara di bagian bawah pesawt" +
                            "lebih besar daripada F2 tekanan udara di atas peswat");
                    break;
                }
                case case2:
                        if (this.F2 >= this.F1){
                    System.out.println("pesawat memenuhi syarat untuk terbang");
                }
        }
        if (this.F1 >= this.F2 ) {
            System.out.println("peswat tidak dapat terangkat" +
                    " F1 Tekanan udara di bagian bawah pesawt" +
                    "lebih besar daripada F2 tekanan udara di atas peswat");
        } else {
            System.out.println("Pesawat memenuhi syarat untuk terbang");
        }
    }

    public String Print() {
        return "Airplane{" +
                "doubleEngine='" + doubleEngine + '\'' +
                ", singleEngine='" + singleEngine + '\'' +
               // ", speed=" + speed +
                ", F2=" + F2 +
                ", F1=" + F1 +
                ", pushTween=" + pushTween +
                ", pushSingle=" + pushSingle +
                '}';
    }
}
