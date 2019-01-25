public class TennisSet {

    private Player player1;
    private Player player2;
    private TennisGame tennisGame;
    private boolean gameIsWon;
    private int setWon;
    private boolean tieBreakIsWon;

    public TennisSet(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean addPointToSet(Player player) {
        gameIsWon = tennisGame.upPoint(player);
        if(gameIsWon) {
            player.upGameWon();
            if (player.equals(player1)) {
                if (player.getGameWon() == 6 && player2.getGameWon() <= 4) {
                    return true;
                } else if (player.getGameWon() > 6 && player.getGameWon() - player2.getGameWon() >= 2) {
                    return true;
                } else {
                    return false;
                }
            } else if ((player.equals(player2))) {
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
