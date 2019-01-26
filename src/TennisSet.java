public class TennisSet {

    private Player player1;
    private Player player2;
    private TennisGame tennisGame;
    private boolean gameIsWon = false;
    private int setWon;
    private boolean tieBreakIsWon;

    public TennisSet(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.tennisGame = new TennisGame(player1, player2);
    }

    public boolean addPointToSet(Player player) {
        gameIsWon = tennisGame.upPoint(player);
        if(gameIsWon) {
            if (player.equals(player1)) {
                if (player1.getGameWon() == 6 && player2.getGameWon() <= 4) {
                    player1.upSetWon();
                    player1.setGameWon(0);
                    player2.setGameWon(0);
                    return true;
                } else if (player1.getGameWon() > 6 && player1.getGameWon() - player2.getGameWon() >= 2) {
                    player1.upSetWon();
                    player1.setGameWon(0);
                    player2.setGameWon(0);
                    return true;
                } else {
                    return false;
                }
            } else if ((player.equals(player2))) {
                if (player2.getGameWon() == 6 && player1.getGameWon() <= 4) {
                    player2.upSetWon();
                    player1.setGameWon(0);
                    player2.setGameWon(0);
                    return true;
                } else if (player2.getGameWon() > 6 && player2.getGameWon() - player1.getGameWon() >= 2) {
                    player2.upSetWon();
                    player1.setGameWon(0);
                    player2.setGameWon(0);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean addPointToSetTieBreak(Player player) {
        gameIsWon = tennisGame.upPoint(player);
        if(gameIsWon) {
            player.upGameWon();
            if (player.equals(player1)) {
                if (player.getGameWon() == 6 && player2.getGameWon() <= 4) {
                    return true;
                } else if (player.getGameWon() == 6 && player2.getGameWon() == 6) {
                    gameIsWon = tennisGame.upPointTieBreak(player);
                    return true;
                } else {
                    return false;
                }
            } else if (player.equals(player2)) {
                if (player.getGameWon() == 6 && player1.getGameWon() <= 4) {
                    return true;
                } else if (player.getGameWon() > 6 && player.getGameWon() - player1.getGameWon() >= 2) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
