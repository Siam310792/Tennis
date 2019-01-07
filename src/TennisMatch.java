public class TennisMatch {

    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean tieBreakInLastSet;
    private TennisGame tennisGame;

    //Création du match
    public TennisMatch(Player player1, Player player2, MatchType matchType, boolean tieBreakInLastSet) {
        this.player1 = player1;
        this.player2 = player2;
        this.matchType = matchType;
        this.tieBreakInLastSet = tieBreakInLastSet;
    }

    public void updateWithPointWonBy(Player player) {

    }

    public String pointsForPlayer(Player player) {
        return "";
    }

    public int currentSetNumber() {
        return 0;
    }

    public int gamesInCurrentSetForPlayer(Player player) {
        return 0;
    }

    public int gamesInSetForPlayer(int setNumber, Player player) {
        return 0;
    }

    public boolean isFinished() {
        return true;
    }
}
