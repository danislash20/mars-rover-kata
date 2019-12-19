package com.example;

public enum Position {
    WEST {
        @Override
        public Position turnLeft() {
            return SOUTH;
        }

        @Override
        public Position turnRight() {
            return NORTH;
        }
    }, SOUTH {
        @Override
        public Position turnLeft() {
            return EAST;
        }

        @Override
        public Position turnRight() {
            return WEST;
        }
    }, EAST {
        @Override
        public Position turnLeft() {
            return NORTH;
        }

        @Override
        public Position turnRight() {
            return SOUTH;
        }
    }, NORTH {
        @Override
        public Position turnLeft() {
            return WEST;
        }

        @Override
        public Position turnRight() {
            return EAST;
        }
    };

    public abstract Position turnLeft();

    public abstract Position turnRight();
}
