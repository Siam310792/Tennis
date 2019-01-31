public class Main {
    public static void main (String[] args) {
        Player player1 = new Player("Paul");
        Player player2 = new Player("Entrecôte");

        TennisMatch leMatch = new TennisMatch(player1, player2, MatchType.BEST_OF_FIVE, false);
        TennisMatch matchTieBreak = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);

        /*//player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println("Le joueurs 1 a " + matchTieBreak.gamesInCurrentSetForPlayer(player1) + " jeu(x) dans le set actuel");
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());
        System.out.println("Le joueurs1 a " + matchTieBreak.gamesInCurrentSetForPlayer(player1) + " jeu(x) dans le set actuel");
        System.out.println("Le joueurs2 a " + matchTieBreak.gamesInCurrentSetForPlayer(player2) + " jeu(x) dans le set actuel");

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu (6-6)
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        // 6 - 6, il faut 2 points d'écart dans le tie break
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);

        // Le joueur 2 gagne le tie break et donc le set
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);

        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu (6-6)
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        // 6 - 6, il faut 2 points d'écart dans le tie break
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        // Le joueur 1 gagne le tie break et donc le set (1-1)
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player2 gagne 1 jeu
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        matchTieBreak.updateWithPointWonBy(player2);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu (6-5)
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        //player1 gagne 1 jeu (7-5) et remporte le set et le match
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        matchTieBreak.updateWithPointWonBy(player1);
        System.out.println(matchTieBreak.toString());

        System.out.println("\nNombre de jeux gagnés dans le set 1 par " +  player1.getName() + " : "
                + matchTieBreak.gamesInSetForPlayer(1, player1));
        System.out.println("Nombre de jeux gagnés dans le set 1 par " +  player2.getName() + " : "
                + matchTieBreak.gamesInSetForPlayer(1, player2));

        System.out.println("\nNombre de jeux gagnés dans le set 2 par " +  player1.getName() + " : "
                + matchTieBreak.gamesInSetForPlayer(2, player1));
        System.out.println("Nombre de jeux gagnés dans le set 2 par " +  player2.getName() + " : "
                + matchTieBreak.gamesInSetForPlayer(2, player2));

        System.out.println("\nNombre de jeux gagnés dans le set 3 par " +  player1.getName() + " : "
                + matchTieBreak.gamesInSetForPlayer(3, player1));
        System.out.println("Nombre de jeux gagnés dans le set 3 par " +  player2.getName() + " : "
                + matchTieBreak.gamesInSetForPlayer(3, player2));*/

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

        //Joueur 1 gagne (6ème jeu)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player1);

        System.out.println("\nIci le joueur1 a gagné 6 jeux et a donc gagné un deuxième set : \n" + leMatch.toString() + "\n");


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

        //Le joueur 2 gagne, cela fait donc 5 jeux à 1 ici en faveur du joueur 1
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println("\nIci le joueur1 a gagné 5 jeux et le joueur 2 vient d'en gagner 1 : \n" + leMatch.toString() + "\n");

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

        //Joueur 2 gagne (5 à 6, le joueur 2 a l'avantage)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne (6 à 6)
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

        //Joueur 1 gagne (7-6)
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

        //Joueur 2 gagne (7-7)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne (8-7)
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

        //Joueur 2 gagne (8-8)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne (9-8)
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

        //Joueur 2 gagne (9-9)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne (10-9)
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

        //Joueur 2 gagne (10-10)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 1 gagne (11-10)
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

        //Joueur 2 gagne (11-11)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne (11-12)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne (11-13)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println("\n Le joueur 2 a gagné 13 jeu à 11 ! \n");

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
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
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne (6ème jeu)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println("\nIci le joueur2 a gagné 6 jeux et a donc gagné un deuxième set : \n" + leMatch.toString() + "\n");

        //Joueur 2 gagne
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
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
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println(leMatch.toString());

        //Joueur 2 gagne (6ème jeu)
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player1);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);
        leMatch.updateWithPointWonBy(player2);

        System.out.println("\nIci le joueur2 a gagné 6 jeux et a donc gagné le match : \n" + leMatch.toString() + "\n");

        System.out.println("\nNombre de jeux gagnés dans le set 1 par " +  player1.getName() + " : "
                + leMatch.gamesInSetForPlayer(1, player1));
        System.out.println("Nombre de jeux gagnés dans le set 1 par " +  player2.getName() + " : "
                + leMatch.gamesInSetForPlayer(1, player2));

                System.out.println("\nNombre de jeux gagnés dans le set 2 par " +  player1.getName() + " : "
                + leMatch.gamesInSetForPlayer(2, player1));
        System.out.println("Nombre de jeux gagnés dans le set 2 par " +  player2.getName() + " : "
                + leMatch.gamesInSetForPlayer(2, player2));

        System.out.println("\nNombre de jeux gagnés dans le set 3 par " +  player1.getName() + " : "
                + leMatch.gamesInSetForPlayer(3, player1));
        System.out.println("Nombre de jeux gagnés dans le set 3 par " +  player2.getName() + " : "
                + leMatch.gamesInSetForPlayer(3, player2));

                System.out.println("\nNombre de jeux gagnés dans le set 4 par " +  player1.getName() + " : "
                + leMatch.gamesInSetForPlayer(4, player1));
        System.out.println("Nombre de jeux gagnés dans le set 4 par " +  player2.getName() + " : "
                + leMatch.gamesInSetForPlayer(4, player2));

                System.out.println("\nNombre de jeux gagnés dans le set 5 par " +  player1.getName() + " : "
                + leMatch.gamesInSetForPlayer(5, player1));
        System.out.println("Nombre de jeux gagnés dans le set 5 par " +  player2.getName() + " : "
                + leMatch.gamesInSetForPlayer(5, player2));


    }

}
