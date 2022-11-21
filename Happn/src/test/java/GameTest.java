import org.example.Game;
import org.example.Sign;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GameTest {

    @Test
    public void testRockWinsAgainstScissors(){
        Sign scissors = Sign.SCISSORS;
        Sign rock = Sign.ROCK;
        Game game = new Game(scissors, rock);
        Sign expected = game.getVictoriousSign();
        assertEquals(expected, rock);
    }

    @Test
    public void testPaperWinsAgainstRock(){
        Sign paper = Sign.PAPER;
        Sign rock = Sign.ROCK;
        Game game = new Game(paper, rock);
        Sign expected = game.getVictoriousSign();
        assertEquals(expected, paper);
    }

    @Test
    public void testScissorsWinsAgainstPaper(){
        Sign scissors = Sign.SCISSORS;
        Sign paper = Sign.PAPER;
        Game game = new Game(scissors, paper);
        Sign expected = game.getVictoriousSign();
        assertEquals(expected, scissors);
    }
}
