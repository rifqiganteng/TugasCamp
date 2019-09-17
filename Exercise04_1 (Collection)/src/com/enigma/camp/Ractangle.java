package com.enigma.camp;

public class Ractangle extends Shape {
    protected Double length;
    protected Double width;


    //konstruktor
    public Ractangle(Double length, Double width) {
        this.length = length; //panjang
        this.width = width; //lebar
    }

    //luas
    Double getSurface(){
        return length+width;
    }

    //keliling
    double getRound() {
        return 2 * (length + width);
        }


    public String print() {
        return "Ractangle{" +
                "length=" + length +
                ", width=" + width +
                + getRound()
                + getSurface()+
                '}';
    }

    @Override
    Double getRoud() {
        return 2 * (length + width);
    }

    @Override
    Double getsurface() {
        return length+width;
    }
}
