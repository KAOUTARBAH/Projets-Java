/*
            
            1. Demander à l'utilisateur d'entrer son âge
            2. Afficher à l'utilisateur s'il est majeur ou mineur sans utiliser ni de structure if, ni de structure switch

        */

import java.util.Scanner;

public class Ternaireif {
    public static void main( String[] args ){
        // Création du scanner
        Scanner scan = new Scanner( System.in );

        System.out.println("Entrez votre âge:");
        int age = scan.nextInt();

        //Opérateur ternaire
        System.out.println("L'utilisateur est " 
        +( age < 18 ? "mineur" : "majeur"));

    }}



