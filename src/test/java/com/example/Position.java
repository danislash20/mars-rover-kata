package com.example;

public enum Position {
    WEST {
        @Override
        public Position turnLeft() {
            return SOUTH;
        }
    }, SOUTH {
        @Override
        public Position turnLeft() {
            return EAST;
        }
    }, EAST {
        @Override
        public Position turnLeft() {
            return NORTH;
        }
    }, NORTH {
        @Override
        public Position turnLeft() {
            return WEST;
        }
    };

    public abstract Position turnLeft();
}
