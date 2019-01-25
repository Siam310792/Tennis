public class Player {

    private String name;
    private String pointPlayer;
    private int pointTieBreakPlayer;
    private int gameWon;
    private int setWon;

    public Player(String name) {
        this.name = name;
        this.pointPlayer = "0";
        this.pointTieBreakPlayer = 0;
        this.gameWon = 0;
        this.setWon = 0;
    }

    public void setName(String name) {
        this.name = name;
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
        this.gameWon++;
    }

    public int getSetWon() {
        return gameWon;
    }

}
