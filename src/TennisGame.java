import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TennisGame {

    private List<TennisPoint> pointList;
    private Player player1;
    private Player player2;

    public TennisGame(Player player1, Player player2) {
        this.pointList = new ArrayList<>();
        pointList.add(TennisPoint.ZERO);
        pointList.add(TennisPoint.FIFTEEN);
        pointList.add(TennisPoint.THIRTY);
        pointList.add(TennisPoint.FORTY);
        pointList.add(TennisPoint.ADVANTAGE);

        this.player1 = player1;
        player1.setIndexPointPlayer(0);
        this.player2 = player2;
        player2.setIndexPointPlayer(0);
    }

    public boolean upIndex(Player player) {
        if (player.getName() == player1.getName()) {
            if (pointList.get(player1.getIndexPointPlayer()) == TennisPoint.FORTY) {
                if (pointList.get(player2.getIndexPointPlayer()) == TennisPoint.ADVANTAGE) {
                    player2.downIndexPlayer();
                } else {
                    player1.upIndexPlayer();
                }
                return false;
            } else if (pointList.get(player1.getIndexPointPlayer()) == TennisPoint.ADVANTAGE)
                return true;
            else {
                player1.upIndexPlayer();
                return false;
            }
        } else {
            if (pointList.get(player2.getIndexPointPlayer()) == TennisPoint.FORTY) {
                if (pointList.get(player1.getIndexPointPlayer()) == TennisPoint.ADVANTAGE) {
                    player1.downIndexPlayer();
                } else {
                    player2.upIndexPlayer();
                }
                return false;
            } else if (pointList.get(player2.getIndexPointPlayer()) == TennisPoint.ADVANTAGE)
                return true;
            else {
                player2.upIndexPlayer();
                return false;
            }
        }
    }

    public String displayPoint() {
        return "Point joueur 1 : " + pointList.get(player1.getIndexPointPlayer()).toString() + " et Point joueur 2 : " + pointList.get(player2.getIndexPointPlayer()).toString();

    }

    public void downIndex(Player player) {
        if (player.getName() == player1.getName()) {
            player1.downIndexPlayer();
        } else {
            player2.downIndexPlayer();
        }
    }


}
