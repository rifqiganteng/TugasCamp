package com.enigma.camp;

public enum Direction {
    NORTH,
    WEST,
    EAST,
    SOUTH;
    public Direction right(){
        return Direction.values()[(ordinal()+1)%4];
        // kalau kanan
        // left +3 ) % 4
    }
    public Direction left() {
        return Direction.values()[(ordinal()+3)%4];
    }
}
