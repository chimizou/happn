package org.example;

public enum Sign implements Winner {
    ROCK {
        @Override
        public Sign getWinner(Sign sign) {
            return sign.equals(SCISSORS) ? this : sign;
        }
    },
    PAPER {
        @Override
        public Sign getWinner(Sign sign) {
            return sign.equals(ROCK) ? this : sign;
        }
    },
    SCISSORS {
        @Override
        public Sign getWinner(Sign sign) {
            return sign.equals(PAPER) ? this : sign;
        }
    }

}
