package fr.nassim;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        int objectif = 20;
        int score = 0;
        int caseActuelle = 0;
        int nbCasesRestantes = 20;

        Random deAleatoire = new Random();
        int lancer = deAleatoire.nextInt(6) + 1;

        System.out.println("Bienvenue dans le jeu de l'Oie !");

        for (int i = 1; i <= 5; i++) {
            lancer = deAleatoire.nextInt(6) + 1;
            caseActuelle = caseActuelle + lancer;
            nbCasesRestantes = nbCasesRestantes - lancer;
            System.out.println("Lancer " + i + " : Vous avez fait " + lancer + ". Vous êtes actuellement sur la case "
                    + caseActuelle + " (encore " + nbCasesRestantes + " cases)");
            score = lancer + score;
        }

        System.out.println("Score final : " + score);

        if (score == objectif) {
            System.out.println("Bravo tu as gagné !");
        } else {
            System.out.println("Vous avez perdu !");
        }
    }

}
