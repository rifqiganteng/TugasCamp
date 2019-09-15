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
        switch (movement) {
            case RIGHT:
                if (movement.equals(RIGHT)) {
                    if (String.valueOf(direction).equals("NORTH")) {
                        this.direction = Direction.EAST;
                    } else if (String.valueOf(direction).equals("EAST")) {
                        this.direction = Direction.SOUTH;
                    } else if (String.valueOf(direction).equals("SOUTH")) {
                        this.direction = Direction.WEST;
                    } else if (String.valueOf(direction).equals("WEST")) {
                        this.direction = Direction.NORTH;
                    }
                }
                break;
            case LEFT:
                if (String.valueOf(direction).equals("NORTH")) {
                    this.direction = Direction.WEST;
                } else if (String.valueOf(direction).equals("WEST")) {
                    this.direction = Direction.SOUTH;
                } else if (String.valueOf(direction).equals("SOUTH")) {
                    this.direction = Direction.EAST;
                } else if (String.valueOf(direction).equals("EAST")) {
                    this.direction = Direction.NORTH;
                }
                break;
            case FRONT:
                if (String.valueOf(direction).equals("NORTH")) {
                    this.direction = Direction.NORTH;
                    this.postY++;
                } else if (String.valueOf(direction).equals("WEST")) {
                    this.direction = Direction.WEST;
                    this.postY--;
                } else if (String.valueOf(direction).equals("SOUTH")) {
                    this.direction = Direction.SOUTH;
                    this.postY--;
                } else if (String.valueOf(direction).equals("EAST")) {
                    this.direction = Direction.EAST;
                    this.postY++;
                }
                break;
            case BACK:
                if (String.valueOf(direction).equals("NORTH")) {
                    this.postY = this.postY - 1;
                    this.direction = Direction.NORTH;
                } else if (String.valueOf(direction).equals("WEST")) {
                    this.postX++;
                    this.direction = Direction.WEST;
                } else if (String.valueOf(direction).equals("SOUTH")) {
                    this.postY++;
                    this.direction = Direction.SOUTH;
                } else if (String.valueOf(direction).equals("EAST")) {
                    this.postX--;
                    this.direction = Direction.EAST;
                }
                break;
        }
    }

    public char[] setCommands(String commands) {
        return this.commands = commands.toCharArray();
    }

    public void run() {
        for (int i = 0; i < commands.length; i++) {
            if (daya == 0) {
                System.out.println(" Bensin Anda Sudah Habis ");
                System.out.println("apakah anda mau beli bensin lagi");

            } else {
                instruction(String.valueOf(commands[i]),this.direction);
               // System.out.println(commands[i] + getPosition());
                System.out.println(this.commands[i] + getPosition() + " " + this.direction);
                if ((i + 1) % 3 == 0) {
                    daya = daya - 1;

                }
            }
        }

    }

    public String print() {
        return "Robot{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", daya=" + daya +
                ", commands=" + Arrays.toString(commands) +
                '}';
    }

    public String getPosition() {
        return (" " + "(" + "X" + this.postX + " " + "Y" + this.postY + ")");
    }
}
