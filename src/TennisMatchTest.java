import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TennisMatchTest {

    Player player1;
    Player player2;
    TennisMatch matchWithTieBreak;
    TennisMatch matchWithoutTieBreak;

    @Before
    public void executeBeforeEach() {
        player1 = new Player("Pierre");
        player2 = new Player("Paul");
        matchWithTieBreak = new TennisMatch(player1, player2, MatchType.BEST_OF_FIVE, true);
        matchWithoutTieBreak = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, false);
    }

    @Test
    public void addPointToPlayer() {
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithoutTieBreak.updateWithPointWonBy(player2);
        matchWithoutTieBreak.updateWithPointWonBy(player2);

        assertEquals(player1.getPointPlayer(), "15");
        assertEquals(player2.getPointPlayer(), "30");
        assertEquals(player1.getGameWon(), 0);
        assertEquals(player2.getGameWon(), 0);
    }

    @Test
    public void addPointToPlayerFrom40ToA() {
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player1);

        assertEquals(player1.getPointPlayer(), "A");
        assertEquals(player2.getPointPlayer(), "40");
        assertEquals(player1.getGameWon(), 0);
        assertEquals(player2.getGameWon(), 0);
    }

    @Test
    public void addPointToPlayerFromATo40() {
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);


        assertEquals(player1.getPointPlayer(), "40");
        assertEquals(player2.getPointPlayer(), "40");
        assertEquals(player1.getGameWon(), 0);
        assertEquals(player2.getGameWon(), 0);
    }

    @Test
    public void addPointToPlayerWinGame() {
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);


        assertEquals(player1.getPointPlayer(), "0");
        assertEquals(player2.getPointPlayer(), "0");
        assertEquals(player1.getGameWon(), 1);
        assertEquals(player2.getGameWon(), 0);
    }

    /* Game with Tie Break */
    @Test
    public void addPointToPlayerTieBreakWinSet() {
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);


        assertEquals(player1.getPointPlayer(), "0");
        assertEquals(player2.getPointPlayer(), "0");
        assertEquals(player1.getGameWon(), 0);
        assertEquals(player2.getGameWon(), 0);
        assertEquals(player1.getSetWon(), 1);
        assertEquals(player2.getSetWon(), 0);
    }

    @Test
    public void addPointToPlayerInTieBreakPlayer1Won7GamesTo6() {
        //Player1 won 5 games
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        //Player2 won 5 games
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        //Player1 won 6 games
        matchWithTieBreak.playerWinAGame(player1);
        //Player2 won 6 games
        matchWithTieBreak.playerWinAGame(player2);
        //Player1 won 7 games (tie break)
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);

        assertEquals(player1.getPointPlayer(), "0");
        assertEquals(player2.getPointPlayer(), "0");
        assertEquals(player1.getGameWon(), 0);
        assertEquals(player2.getGameWon(), 0);
        assertEquals(player1.getSetWon(), 1);
        assertEquals(player2.getSetWon(), 0);
    }

    @Test
    public void addPointToPlayerInTieBreakScore8PointsTo7() {
        //Player1 won 5 games
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        //Player2 won 5 games
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        //Player1 won 6 games
        matchWithTieBreak.playerWinAGame(player1);
        //Player2 won 6 games
        matchWithTieBreak.playerWinAGame(player2);
        //Game Tie Break score 8 to 7, game not won
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player1);

        assertEquals(player1.getPointPlayerTieBreak(), 8);
        assertEquals(player2.getPointPlayerTieBreak(), 7);
        assertEquals(player1.getGameWon(), 6);
        assertEquals(player2.getGameWon(), 6);
        assertEquals(player1.getSetWon(), 0);
        assertEquals(player2.getSetWon(), 0);
    }

    @Test
    public void addPointToPlayerInTieBreakScore9PointsTo7() {
        //Player1 won 5 games
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        //Player2 won 5 games
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        //Player1 won 6 games
        matchWithTieBreak.playerWinAGame(player1);
        //Player2 won 6 games
        matchWithTieBreak.playerWinAGame(player2);
        //Game Tie Break score 8 to 7, game not won
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);

        //Game won, point reset
        assertEquals(player1.getPointPlayerTieBreak(), 0);
        assertEquals(player2.getPointPlayerTieBreak(), 0);
        assertEquals(player1.getGameWon(), 0);
        assertEquals(player2.getGameWon(), 0);
        assertEquals(player1.getSetWon(), 1);
        assertEquals(player2.getSetWon(), 0);
    }

    /* Game without Tie break */

    @Test
    public void addPointToPlayerPlayer1Won6GamesTo4() {
        //Player1 won 5 games
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        //Player2 won 4 games
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        //Player1 won 6 games
        matchWithoutTieBreak.playerWinAGame(player1);

        assertEquals(player1.getPointPlayer(), "0");
        assertEquals(player2.getPointPlayer(), "0");
        assertEquals(player1.getGameWon(), 0);
        assertEquals(player2.getGameWon(), 0);
        assertEquals(player1.getSetWon(), 1);
        assertEquals(player2.getSetWon(), 0);
    }

    @Test
    public void addPointToPlayerScore8gamesTo7() {
        //Player1 won 5 games
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        //Player2 won 5 games
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        //Player1 won 6 games
        matchWithoutTieBreak.playerWinAGame(player1);
        //Player2 won 6 games
        matchWithoutTieBreak.playerWinAGame(player2);
        //Game Tie Break score 8 to 7, game not won
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player1);


        assertEquals(player1.getPointPlayer(), "0");
        assertEquals(player2.getPointPlayer(), "0");
        assertEquals(player1.getGameWon(), 8);
        assertEquals(player2.getGameWon(), 7);
        assertEquals(player1.getSetWon(), 0);
        assertEquals(player2.getSetWon(), 0);
    }

    @Test
    public void addPointToPlayerScore9GamesTo7() {
        //Player1 won 5 games
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        //Player2 won 5 games
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        //Player1 won 6 games
        matchWithoutTieBreak.playerWinAGame(player1);
        //Player2 won 6 games
        matchWithoutTieBreak.playerWinAGame(player2);
        //Game Tie Break score 8 to 7, game not won
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);

        // Game won, points reset
        assertEquals(player1.getPointPlayer(), "0");
        assertEquals(player2.getPointPlayer(), "0");
        assertEquals(player1.getGameWon(), 0);
        assertEquals(player2.getGameWon(), 0);
        assertEquals(player1.getSetWon(), 1);
        assertEquals(player2.getSetWon(), 0);
    }

    /* common */

    @Test
    public void addPointToPlayerBO5MakeGameWonByPlayer2() {
        //Player2 won 1 set
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        //Player2 won 2 sets
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        //Player2 won 3 sets
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);

        assertEquals(player1.getSetWon(), 0);
        assertEquals(player2.getSetWon(), 3);
        assertTrue(matchWithoutTieBreak.isFinished(player2));
    }

    @Test
    public void addPointToPlayerBO3MakeGameWonByPlayer1() {
        //Player2 won 1 set
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        //Player2 won 2 sets
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);
        matchWithoutTieBreak.playerWinAGame(player1);

        assertEquals(player1.getSetWon(), 2);
        assertEquals(player2.getSetWon(), 0);
        assertTrue(matchWithoutTieBreak.isFinished(player1));
    }

    @org.junit.Test
    public void pointsForPlayer() {
        matchWithoutTieBreak.updateWithPointWonBy(player1);
        matchWithoutTieBreak.updateWithPointWonBy(player2);
        matchWithoutTieBreak.updateWithPointWonBy(player1);
        matchWithoutTieBreak.updateWithPointWonBy(player1);

        assertEquals(matchWithoutTieBreak.pointsForPlayer(player1), "40");
        assertEquals(matchWithoutTieBreak.pointsForPlayer(player2), "15");
    }

    @org.junit.Test
    public void pointsForPlayerInTieBreak() {//Player1 won 5 games
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        //Player2 won 5 games
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        //Player1 won 6 games
        matchWithTieBreak.playerWinAGame(player1);
        //Player2 won 6 games
        matchWithTieBreak.playerWinAGame(player2);
        //Player1 won 7 games (tie break)
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player1);
        matchWithTieBreak.updateWithPointWonBy(player2);
        matchWithTieBreak.updateWithPointWonBy(player2);


        assertEquals(matchWithTieBreak.pointsForPlayer(player1), "5");
        assertEquals(matchWithTieBreak.pointsForPlayer(player2), "2");
    }

    @org.junit.Test
    public void currentSetNumber() {
        //Set 1
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        //Set 2
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        //Set 3
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);

        assertEquals(matchWithTieBreak.currentSetNumber(), 3);
    }

    @org.junit.Test
    public void gamesInCurrentSetForPlayer() {
        //Set 1
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        //Set 2
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        //Set 3
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);

        assertEquals(matchWithTieBreak.gamesInCurrentSetForPlayer(player2), 2);
        assertEquals(matchWithTieBreak.gamesInCurrentSetForPlayer(player1), 0);
    }

    @org.junit.Test
    public void gamesInSetForPlayer() {
        //Set 1 (6 - 2)
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        //Set 2 (3 - 6)
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player2);
        //Set 3 (4 - 6)
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player1);
        matchWithTieBreak.playerWinAGame(player2);
        matchWithTieBreak.playerWinAGame(player2);

        assertEquals(matchWithTieBreak.gamesInSetForPlayer(1, player1), 6);
        assertEquals(matchWithTieBreak.gamesInSetForPlayer(1, player2), 2);

        assertEquals(matchWithTieBreak.gamesInSetForPlayer(2, player1), 3);
        assertEquals(matchWithTieBreak.gamesInSetForPlayer(2, player2), 6);

        assertEquals(matchWithTieBreak.gamesInSetForPlayer(3, player1), 4);
        assertEquals(matchWithTieBreak.gamesInSetForPlayer(3, player2), 6);
    }

    @org.junit.Test
    public void isFinished() {
        //Player2 won 1 set
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        //Player2 won 2 sets
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        //Player2 won 3 sets
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);
        matchWithoutTieBreak.playerWinAGame(player2);

        assertTrue(matchWithoutTieBreak.isFinished(player2));
    }
}