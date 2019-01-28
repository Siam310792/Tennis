import static sun.misc.Version.println;

public class TennisMatch {

    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean tieBreakInLastSet;
    private TennisSet tennisSet;
    private boolean setIsWon;
    private boolean matchIsEnded = false;
    private int nbSet = 0;

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
            setIsWon = tennisSet.addPointToSet(player);
            if(setIsWon) {
                if (nbSet <= matchType.maxNumberOfSets()) {
                    if (player.equals(player1)) {
                        if (player1.getSetWon() == matchType.numberOfSetsToWin()) {
                            nbSet++;
                            isFinished(player);
                        } else {
                            nbSet++;
                        }
                    } else {
                        if (player2.getSetWon() == matchType.numberOfSetsToWin()) {
                            nbSet++;
                            isFinished(player);
                        } else {
                            nbSet++;
                        }
                    }
                    pointsForPlayer(player);
                }
            }
        } else {
            setIsWon = tennisSet.addPointToSetTieBreak(player);
            if(setIsWon) {
                if (nbSet <= matchType.maxNumberOfSets()) {
                    if (player.equals(player1)) {
                        if (player1.getSetWon() == matchType.numberOfSetsToWin()) {
                            nbSet++;
                            isFinished(player);
                        } else {
                            nbSet++;
                        }
                    } else {
                        if (player2.getSetWon() == matchType.numberOfSetsToWin()) {
                            nbSet++;
                            isFinished(player);
                        } else {
                            nbSet++;
                        }
                    }
                    pointsForPlayer(player);
                }
            }
        }


    }

    // Récupère sous chaîne de caractère le score dans le jeu en cours
    public String pointsForPlayer(Player player) {
        return player.getPointPlayer();
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
        return 0;
    }

    public boolean isFinished(Player player) {
        System.out.println("Le joueur " + player.getName() + " a gagné !!!");
        return true;
    }

    public String toString() {
        return "Le joueur '" + player1.getName() + "' a  " + player1.getPointPlayer() + " points, et a gagné " + player1.getGameWon() + " jeu dans le set actuel. Il a au total gagné " + player1.getSetWon() + " sets. \n" +
                "Le joueur '" + player2.getName() + "' a  " + player2.getPointPlayer() + " points, et a gagné " + player2.getGameWon() + " jeu dans le set actuel. Il a au total gagné " + player2.getSetWon() + " sets.";
    }
}
