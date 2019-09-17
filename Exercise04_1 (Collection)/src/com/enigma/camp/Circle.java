package com.enigma.camp;

import java.util.Objects;

public class Circle {
    private Integer r;
    final private Double pi=3.14;

    public Circle(Integer r) {
        this.r = r;
    }

    public Double getSurface(){
        //System.out.println(pi);
        double source = pi*r*r;
        return source;
    }

    public Double getRound(){
        double round = pi*r*2;
        return round;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(r, circle.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    public Double getHalfSur(){
        return getSurface()/2;
    }

    public Double getHalfRound(){
        return getRound()/2;
    }

    public String print() {
        return "LUAS : " + getSurface()
                + " \n KELILING : " +getRound()
                + " \n SETENGAH LUAS : " + getHalfSur()
                + " \n SETENGAH KELILING : " + getHalfRound();
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }
}
