public class Player {

    private String name;
    private int indexPointPlayer;

    public Player(String name) {
        this.name = name;
        this.indexPointPlayer = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndexPointPlayer() {
        return indexPointPlayer;
    }

    public void setIndexPointPlayer(int indexPointPlayer) {
        this.indexPointPlayer = indexPointPlayer;
    }


    public String getName() {
        return name;
    }

    public void upIndexPlayer() {
        this.indexPointPlayer++;
    }

    public void downIndexPlayer() {
        this.indexPointPlayer++;
    }
}
