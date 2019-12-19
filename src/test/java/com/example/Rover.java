package com.example;

import java.util.Objects;

public class Rover {
    private final int x;
    private final int y;
    private Position position;

    public Rover(int x, int y, Position position) {
        this.x = x;
        this.y = y;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return x == rover.x &&
                y == rover.y &&
                position == rover.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, position);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", position=" + position +
                '}';
    }


    //regla de los 3 strikes
    public Rover accept(String commands) {
        if (commands.equals("l")) {
            return new Rover(0,0,Position.WEST);
        }else
        if(commands.equals("b")){
            return new Rover(x,y-1,position);

        }
        return new Rover(x,y+1,position);
    }
}
