public class Player {

    private String name;
    private String pointPlayer;
    private int pointTieBreakPlayer;
    private int gameWon;
    private int nbSetWon;

    public Player(String name) {
        this.name = name;
        this.pointPlayer = "0";
        this.pointTieBreakPlayer = 0;
        this.gameWon = 0;
        this.nbSetWon = 0;
    }

    public String getPointPlayer() {
        return pointPlayer;
    }

    public void setPointPlayer(String pointPlayer) {
        this.pointPlayer = pointPlayer;
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
        } else {
            pointTieBreakPlayer++;
        }
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

    public int getPointTieBreakPlayer() {
        return pointTieBreakPlayer;
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
