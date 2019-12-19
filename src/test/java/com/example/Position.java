package com.example;

public enum Position {
    WEST, SOUTH, EAST, NORTH;

    public Position turnLeft() {
        Position direction = null;
        if (this == Position.WEST) {
            direction = (Position.SOUTH);
        } else if (this == Position.SOUTH) {
            direction = (Position.EAST);
        } else if (this == Position.EAST) {
            direction = (Position.NORTH);
        } else if (this == Position.NORTH) {
            direction = (Position.WEST);
        }
        return direction;
    }
}
