package org.example;

public class Game {
    Sign firstSign;
    Sign secondSign;

    public Game(Sign firstSign, Sign secondSign) {
        this.firstSign = firstSign;
        this.secondSign = secondSign;
    }

    public Sign getVictoriousSign() {
        return firstSign.getWinner(secondSign);
    }

}
