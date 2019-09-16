package com.enigma.camp;
import java.util.Arrays;

public class Robot {

    //ATRIBUT
    Direction direction;
    private Integer postX;
    private Integer postY;
    private Integer daya = 0;
    private char[] commands;
    //private Integer lMove=0;

    //fariabel konstanta (tidakdapat dirubah) harus menggunakan huruf besar
    private final String FRONT = "F";
    private final String RIGHT = "R";
    private final String LEFT = "L";
    private final String BACK = "B";
    private final String EROR = "your input is not recognise by our system";

    //konstruktor
    public Robot(Integer x, Integer y, Direction direction) {
        this.postX = x;
        this.postY = y;
        this.direction = direction;
    }

    //method untuk mengatur daya robot atom
    public void fullDaya(int daya) {
        this.daya = this.daya + daya;
    }

    //untuk menentukan perintah atau instruksi robot atom dan akan berpengaaruh ke koordinat
    public void instruction(String movement, Direction direction) {
        switch (movement){
            case RIGHT:
                turnRight();
                break;
            case LEFT:
                turnLeft();
                break;
            case FRONT:
                forward();
                break;
            case BACK:
                back();
                break;
            default:
                System.out.println(" your input is not recognise by our system");
                System.out.println(" please check your onstruction");
                break;
        }
    }

    public void turnRight(){
        this.direction = this.direction.right();
    }
    public void turnLeft(){
        this.direction = this.direction.left();
    }

    public void forward(){
        if (direction.equals(Direction.NORTH)){
            this.postY ++;
            this.direction = Direction.NORTH;
        }else if(direction.equals(Direction.EAST)){
            this.postX ++;
            this.direction = Direction.EAST;
        }else if (direction.equals(Direction.SOUTH)){
            this.postY --;
            this.direction = Direction.SOUTH;
        }else if(direction.equals(Direction.WEST)){
            this.postX --;
            this.direction = Direction.SOUTH;
        }else{
            System.out.println("Your instruction is not recognice by system ");
        }
    }

    public void back(){
        if (direction.equals(Direction.NORTH)){
            this.postY --;
            this.direction = Direction.NORTH;
        }else if(direction.equals(Direction.EAST)){
            this.postX --;
            this.direction = Direction.EAST;
        }else if (direction.equals(Direction.SOUTH)){
            this.postY ++;
            this.direction = Direction.SOUTH;
        }else if(direction.equals(Direction.WEST)){
            this.postX ++;
            this.direction = Direction.SOUTH;
        }else {
            System.out.println("Your instruction is not recognice by system ");
        }
    }

    public char[] setCommands(String commands) {
        return this.commands = commands.toCharArray();
    }

    public void run() {
        for (int i = 0; i < commands.length; i++) {
            if (daya == 0) {
                System.out.println(" Batrey Anda Sudah Habis ");
                System.out.println("apakah anda mengisi batrey lagi");

            } else {
                instruction(String.valueOf(commands[i]),this.direction);
                System.out.println(this.commands[i] + getPosition() + " " + this.direction);
                if ((i + 1) % 3 == 0) {
                    daya = daya - 1;

                }
            }
        }

    }

    public String print() {
        return "Robot{" +
                "postX = " + postX +
                ", postY = " + postY +
                ", daya = " + daya +
                ", commands = " + Arrays.toString(commands) +
                ", Arah = " + direction +
                '}';
    }

    public String getPosition() {
        return (" " + "(" + "X" + this.postX + " " + "Y" + this.postY + ")");
    }
}
