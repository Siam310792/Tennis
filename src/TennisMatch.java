import java.util.HashMap;

public class TennisMatch {

    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean tieBreakInLastSet;
    private TennisSet tennisSet;
    private boolean setIsWon;
    private boolean matchIsEnded = false;
    private int nbSet = 1;

    //Création du match
    public TennisMatch(Player player1, Player player2, MatchType matchType, boolean tieBreakInLastSet) {
        this.player1 = player1;
        this.player2 = player2;
        this.matchType = matchType;
        this.tieBreakInLastSet = tieBreakInLastSet;
        this.tennisSet = new TennisSet(player1, player2);
    }

    // Augmente le score (gain d'un point dans le jeu)
    public void updateWithPointWonBy(Player player) {
        if(!tieBreakInLastSet) {
            setIsWon = tennisSet.addPointToSet(player, this.nbSet);
            if(setIsWon) {
                if (nbSet <= matchType.maxNumberOfSets()) {
                    if (player.equals(player1)) {
                        if (player1.getSetWon() == matchType.numberOfSetsToWin()) {
                            isFinished(player);
                        } else {
                            nbSet++;
                        }
                    } else {
                        if (player2.getSetWon() == matchType.numberOfSetsToWin()) {
                            isFinished(player);
                        } else {
                            nbSet++;
                        }
                    }
                }
            }
        } else {
            setIsWon = tennisSet.addPointToSetTieBreak(player, this.nbSet);
            if(setIsWon) {
                if (nbSet <= matchType.maxNumberOfSets()) {
                    if (player.equals(player1)) {
                        if (player1.getSetWon() == matchType.numberOfSetsToWin()) {
                            isFinished(player);
                        } else {
                            nbSet++;
                        }
                    } else {
                        if (player2.getSetWon() == matchType.numberOfSetsToWin()) {
                            isFinished(player);
                        } else {
                            nbSet++;
                        }
                    }
                    System.out.println(pointsForPlayer(player));
                }
            }
        }
    }

    // Récupère sous chaîne de caractère le score dans le jeu en cours
    public String pointsForPlayer(Player player) {
        String pointPlayer = "";
        if (!tieBreakInLastSet) {
            pointPlayer = player.getPointPlayer();
        } else {
            if (player.equals(player1)) {
                if(player1.getGameWon() == 6 && player2.getGameWon() == 6) {
                    pointPlayer = String.valueOf(player1.getPointPlayerTieBreak());
                } else {
                    pointPlayer = player.getPointPlayer();
                }
            } else {
                if(player2.getGameWon() == 6 && player1.getGameWon() == 6) {
                    pointPlayer = String.valueOf(player2.getPointPlayerTieBreak());
                } else {
                    pointPlayer = player.getPointPlayer();
                }
            }
        }
        return pointPlayer;
    }

    // Numéro du set (max 3 ou 5)
    public int currentSetNumber() {
        return this.nbSet;
    }

    // Nombre de jeu gagné dans le set en cours par le joueur passé en paramètre
    public int gamesInCurrentSetForPlayer(Player player) {
        return player.getGameWon();
    }

    // Nombre de jeu gagné dans le set demandé
    public int gamesInSetForPlayer(int setNumber, Player player) {
        HashMap<Integer, Integer> map = player.getHashMap();
        int jeuxgagnes = map.get(setNumber);
        return jeuxgagnes;
    }

    public boolean isFinished(Player player) {
        System.out.println("\n****************************************************\n" +
                "Le joueur " + player.getName() + " a gagné la partie !!!\n" +
                "****************************************************");
        return true;
    }

    public void playerWinAGame(Player player) {
        this.updateWithPointWonBy(player);
        this.updateWithPointWonBy(player);
        this.updateWithPointWonBy(player);
        this.updateWithPointWonBy(player);
    }

    public String toString() {
        if (tieBreakInLastSet && (player1.getGameWon() == 6 && player2.getGameWon() == 6)){
            return "Le joueur '" + player1.getName() + "' a  " + player1.getPointPlayerTieBreak() + " points dans le tiebreak du set actuel (" + this.currentSetNumber() + "). Il a au total gagné " + player1.getSetWon() + " sets. \n" +
                    "Le joueur '" + player2.getName() + "' a  " + player2.getPointPlayerTieBreak() + " points dans le tiebreak du set actuel (" + this.currentSetNumber() + "). Il a au total gagné " + player2.getSetWon() + " sets.";
        } else {
            return "Le joueur '" + player1.getName() + "' a  " + player1.getPointPlayer() + " points, et a gagné " + player1.getGameWon() + " jeu dans le set actuel. Il a au total gagné " + player1.getSetWon() + " sets. \n" +
                    "Le joueur '" + player2.getName() + "' a  " + player2.getPointPlayer() + " points, et a gagné " + player2.getGameWon() + " jeu dans le set actuel. Il a au total gagné " + player2.getSetWon() + " sets.";
        }
    }
}
