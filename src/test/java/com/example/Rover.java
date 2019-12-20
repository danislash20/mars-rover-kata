package com.example;

import java.util.Objects;
import java.util.stream.Stream;

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
    public Rover accept(String rawCommandsRepresentation) {

        String[] commands = rawCommandsRepresentation.split("");

        //Stream.of(commands).re

        for (String command : commands) {
            if (command.equals("r")) {
                return new Rover(0, 0, this.position.turnRight());
            } else if (command.equals("l")) {
                return new Rover(0, 0, this.position.turnLeft());
            } else if (command.equals("b")) {
                return new Rover(x, y - 1, position);
            } else
                return new Rover(x, y + 1, position);
        }
    }

}
