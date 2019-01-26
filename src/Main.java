public class Main {
    public static void main (String[] args) {
        Player player1 = new Player("Paul");
        Player player2 = new Player("Entrecôte");

        TennisMatch leMatch = new TennisMatch(player1, player2, MatchType.BEST_OF_FIVE, false);

        //Le joueur 1 gagne un premier jeu J-40
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());


        System.out.println(player1.getGameWon());
        System.out.println(leMatch.gamesInCurrentSetForPlayer(player1));

        //Le joueur 1 gagne un deuxième jeu J-30
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);

        //Le joueur 1 gagne un troisième jeu J-40
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());

        //Le joueur 1 gagne un quatrième jeu J-40
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());

        //Le joueur 1 gagne un cinquième jeu J-40
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());

        //Le joueur 1 gagne un sixième jeu J-40
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println("\nIci le joueur a gagné 6 jeux et a donc gagné un set : \n" + leMatch.toString() + "\n");

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println("\nIci le joueur a gagné 6 jeux et a donc gagné un deuxième set : \n" + leMatch.toString() + "\n");


        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);

        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Le joueur 2 gagne, cela fait donc 5 jeux à 2 ici en faveur du joueur 1
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println("\nIci le joueur 1 a gagné 5 jeux et le joueur 2 vient d'en gagner 1 : \n" + leMatch.toString() + "\n");

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);

        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);

        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);

        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);

        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);

        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);

        leMatch.updateWithPointWonBy(player1);


        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());
        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println("\n Le joueur 2 a gagné 13 jeu à 11 ! \n");

    }

}
