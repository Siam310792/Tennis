public class TennisSet {

    private Player player1;
    private Player player2;
    private TennisGame tennisGame;
    private boolean gameIsWon = false;

    public TennisSet(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.tennisGame = new TennisGame(player1, player2);
    }

    public boolean addPointToSet(Player player, int set) {
        if (player.equals(player1)) {
            gameIsWon = tennisGame.upPoint(player);
            if (gameIsWon) {
                if (player1.getGameWon() == 6 && player2.getGameWon() <= 4) {
                    updateAll(player1, set);
                    return true;
                } else if (player1.getGameWon() > 6 && player1.getGameWon() - player2.getGameWon() == 2){
                    updateAll(player1, set);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            gameIsWon = tennisGame.upPoint(player);
            if (gameIsWon) {
                if (player2.getGameWon() == 6 && player1.getGameWon() <= 4) {
                    updateAll(player2, set);
                    return true;
                } else if (player2.getGameWon() > 6 && player2.getGameWon() - player1.getGameWon() == 2) {
                    updateAll(player2, set);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public boolean addPointToSetTieBreak(Player player, int set) {
        if (player.equals(player1)) {
            if (player1.getGameWon() == 6 && player2.getGameWon() == 6) {
                System.out.println("Tie Break !!!");
                gameIsWon = tennisGame.upPointTieBreak(player);
                System.out.println(player1.getGameWon());
                if (gameIsWon) {
                    System.out.println("Le joueur " + player.getName() + " a gagné le tie break !" );
                    updateAll(player1, set);
                    return true;
                } else {
                    return false;
                }
            } else {
                return addPointToSet(player1, set);
            }
        } else {
            if (player2.getGameWon() == 6 && player1.getGameWon() == 6) {
                System.out.println("Tie Break !!!");
                gameIsWon = tennisGame.upPointTieBreak(player);
                if (gameIsWon) {
                    System.out.println("Le joueur " + player.getName() + " a gagné le tie break !" );
                    updateAll(player2, set);
                    return true;
                } else {
                    return false;
                }
            } else {
                return addPointToSet(player2, set);
            }
        }
    }

    public void updateAll(Player player, int set) {
        if(player.equals(player1)) {
            player1.upSetWon();
        } else {
            player2.upSetWon();
        }
        player1.updateTableau(set);
        player2.updateTableau(set);
        player1.setGameWon(0);
        player2.setGameWon(0);
    }
}