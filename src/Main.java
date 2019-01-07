public class Main {
    public static void main (String[] args){
        Player player1 = new Player("Paul");
        Player player2 = new Player("Entrecôte");

        TennisGame game = new TennisGame(player1, player2);

        System.out.println(game.displayPoint());

        game.upIndex(player1);
        game.upIndex(player1);
        game.upIndex(player1);

        System.out.println(game.displayPoint());
    }

}
