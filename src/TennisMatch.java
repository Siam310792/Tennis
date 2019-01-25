public class TennisMatch {

    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean tieBreakInLastSet;
    private TennisSet tennisSet;
    private boolean setIsWon;
    private boolean gameIsEnd = false;

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
        while (!gameIsEnd) {
            setIsWon = tennisSet.addPointToSet(player);
            player.upSetWon();

            if (player.equals(player1)) {
                if (player.getSetWon() == 6 && player2.getSetWon() < 4) {
                    gameIsEnd = true;
                } else if (player.getSetWon() == 6 && player2.getSetWon() == 6) {
                    if (tieBreakInLastSet) {
                        setIsWon = tennisSet.addPointToSetTieBreak(player);
                        gameIsEnd = true;
                    } else {
                        
                    }
                }
            }
        }

    }

    // Récupère sous chaîne de caractère le score dans le jeu en cours
    public String pointsForPlayer(Player player) {
        return "";
    }

    // Numéro du set (max 3 ou 5)
    public int currentSetNumber() {
        return 0;
    }

    // Nombre de jeu gagné dans le set en cours par le joueur passé en paramètre
    public int gamesInCurrentSetForPlayer(Player player) {
        return gamesInSetForPlayer(currentSetNumber(), player);
    }

    // Nombre de jeu gagné dans le set demandé
    public int gamesInSetForPlayer(int setNumber, Player player) {
        return 0;
    }

    public boolean isFinished() {
        return true;
    }
}
