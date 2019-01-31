import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean upPoint(Player player) {
        if(player.equals(player1)) {
            if(player1.getPointPlayer() == TennisPoint.FORTY.toString()) {
                if(player2.getPointPlayer() == TennisPoint.ADVANTAGE.toString()) {
                    player2.downPointPlayer();
                    return false;
                } else if (player2.getPointPlayer() == TennisPoint.FORTY.toString()) {
                    player1.setPointPlayer(TennisPoint.ADVANTAGE.toString());
                    return false;
                } else {
                    player1.upGameWon();
                    player1.setPointPlayer("0");
                    player2.setPointPlayer("0");
                    return true;
                }
            } else if (player1.getPointPlayer() == TennisPoint.ADVANTAGE.toString()) {
                player1.upGameWon();
                player1.setPointPlayer("0");
                player2.setPointPlayer("0");
                return true;
            } else {
                player1.upPointPlayer();
                return false;
            }
        } else {
            if(player2.getPointPlayer() == TennisPoint.FORTY.toString()) {
                if (player1.getPointPlayer() == TennisPoint.ADVANTAGE.toString()) {
                    player1.downPointPlayer();
                    return false;
                } else if (player1.getPointPlayer() == TennisPoint.FORTY.toString()) {
                    player2.setPointPlayer(TennisPoint.ADVANTAGE.toString());
                    return false;
                } else {
                    player2.upGameWon();
                    player1.setPointPlayer("0");
                    player2.setPointPlayer("0");
                    return true;
                }
            } else if (player2.getPointPlayer() == TennisPoint.ADVANTAGE.toString()) {
                player2.upGameWon();
                player1.setPointPlayer("0");
                player2.setPointPlayer("0");
                return true;
            } else {
                player2.upPointPlayer();
                return false;
            }
        }
    }

    public boolean upPointTieBreak(Player player) {
        if(player.equals(player1)) {
            player1.upPointPlayerTieBreak();
            if(player1.getPointPlayerTieBreak() == 7) {
                if(player2.getPointPlayerTieBreak() <= 5 ) {
                    player1.upGameWon();
                    player1.setPointPlayerTieBreak(0);
                    player2.setPointPlayerTieBreak(0);
                    return true;
                } else {
                    return false;
                }
            } else if (player1.getPointPlayerTieBreak() < 7) {
                return false;
            } else if (player1.getPointPlayerTieBreak() - player2.getPointPlayerTieBreak() >= 2) {
                player1.upGameWon();
                player1.setPointPlayerTieBreak(0);
                player2.setPointPlayerTieBreak(0);
                return true;
            } else {
                return false;
            }
        } else {
            player2.upPointPlayerTieBreak();
            if(player2.getPointPlayerTieBreak() == 7) {
                if(player1.getPointPlayerTieBreak() <= 5 ) {
                    player2.upGameWon();
                    player1.setPointPlayerTieBreak(0);
                    player2.setPointPlayerTieBreak(0);
                    return true;
                } else {
                    return false;
                }
            } else if (player2.getPointPlayerTieBreak() < 7) {
                return false;
            } else if (player2.getPointPlayerTieBreak() - player1.getPointPlayerTieBreak() >= 2) {
                player2.upGameWon();
                player1.setPointPlayerTieBreak(0);
                player2.setPointPlayerTieBreak(0);
                return true;
            } else {
                return false;
            }
        }
    }

    public String displayPoint() {
        return "Point joueur 1 : " + player1.getPointPlayer() + " et Point joueur 2 : " + player2.getPointPlayer();

    }
}
