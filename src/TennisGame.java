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
        if(player.getName() == player1.getName()) {
            if(player1.getPointTieBreakPlayer() == 6) {
                if(player2.getPointTieBreakPlayer() <= 5 ) {
                    player1.upGameWon();
                    player1.setPointPlayer("0");
                    player2.setPointPlayer("0");
                    return true;
                } else {
                    player1.upPointPlayer();
                    return false;
                }
            } else if (player1.getPointTieBreakPlayer() < 6) {
                player1.upPointPlayer();
                return false;
            } else {
                if (player1.getPointTieBreakPlayer() - player2.getPointTieBreakPlayer() >= 2) {
                    player1.upGameWon();
                    player1.setPointPlayer("0");
                    player2.setPointPlayer("0");
                    return true;
                }
            }
        } else {
            if(player2.getPointTieBreakPlayer() == 6) {
                if(player1.getPointTieBreakPlayer() <= 5 ) {
                    player2.upGameWon();
                    player1.setPointPlayer("0");
                    player2.setPointPlayer("0");                    return true;
                } else {
                    player2.upPointPlayer();
                    return false;
                }
            } else if (player2.getPointTieBreakPlayer() < 6) {
                player2.upPointPlayer();
                return false;
            } else {
                if (player2.getPointTieBreakPlayer() - player1.getPointTieBreakPlayer() >= 2) {
                    player2.upGameWon();
                    player1.setPointPlayer("0");
                    player2.setPointPlayer("0");
                    return true;
                }
            }
        }
        return false;
    }

    public String displayPoint() {
        return "Point joueur 1 : " + player1.getPointPlayer() + " et Point joueur 2 : " + player2.getPointPlayer();

    }


        /*this.pointList = new ArrayList<>();
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
    }*/


}
