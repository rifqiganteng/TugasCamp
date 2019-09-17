package com.enigma.camp;

public class Block extends Ractangle {

    private Double height;

    public Double getVolume(){
        return this.length * this.width * this.height;
    }

    public Block( Double lenght, Double width, Double height){
        super(lenght, width);
        this.height=height;

    }

    public Double getSurface(){
        return 2*(this.length*this.width) +
        2*(this.length*this.height) +
        2*(this.width*this.height);
    }

    public String print() {
        return "Block{" +"PANJANG : "+ this.length
                + "LEBAR : "+this.width
                +  "TINGGI : "+this.height
                + "VOLUME : "+getVolume()+
                "KELILING : "+getSurface()+
                "}";
    }

}
