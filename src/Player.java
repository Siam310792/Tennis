import java.util.HashMap;

public class Player {

    private String name;
    private String pointPlayer;
    private int pointPlayerTieBreak;
    private int gameWon;
    private int nbSetWon;
    private HashMap<Integer, Integer> tableauMatch;

    public Player(String name) {
        this.name = name;
        this.pointPlayer = "0";
        this.pointPlayerTieBreak = 0;
        this.gameWon = 0;
        this.nbSetWon = 0;
        this.tableauMatch = new HashMap<>();
    }

    public String getPointPlayer() {
        return pointPlayer;
    }

    public void setPointPlayer(String pointPlayer) {
        this.pointPlayer = pointPlayer;
    }

    public void setPointPlayerTieBreak(int nb) {
        this.pointPlayerTieBreak = nb;
    }

    public String getName() {
        return name;
    }

    public void upPointPlayer() {
        if(pointPlayer.equals("0")) {
            this.setPointPlayer("15");
        } else if (pointPlayer.equals("15")) {
            this.setPointPlayer("30");
        } else if (pointPlayer.equals("30")) {
            this.setPointPlayer("40");
        }
    }

    public void updateTableau(int set) {
        this.tableauMatch.put(set, this.gameWon);
    }

    public HashMap<Integer, Integer> getHashMap() {
        return this.tableauMatch;
    }

    public void upPointPlayerTieBreak() {
        pointPlayerTieBreak++;
    }

    public void downPointPlayer() {
        this.setPointPlayer("40");
    }

    public void upGameWon() {
        this.gameWon++;
    }

    public int getGameWon() {
        return gameWon;
    }

    public int getPointPlayerTieBreak() {
        return pointPlayerTieBreak;
    }

    public void upSetWon() {
        this.nbSetWon++;
    }

    public int getSetWon() {
        return nbSetWon;
    }

    public void setGameWon(int nb) {
        this.gameWon = nb;
    }

}
