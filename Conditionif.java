/*

            1. Demander à l'utilisateur de rentrer sa note de Java en valeur numérique
            2. Afficher une phrase de réaction en fonction du niveau de cette note
                2.1 Si la note est strictement inférieur à 5, afficher "Trés mauvais"
                2.2 Si la note est strictement inférieur à 10, afficher "Mauvais"
                2.3 Si la note est strictement inférieur à 15, afficher "Bien"
                2.4 Si la note est strictement inférieur à 18, afficher "Trés bien"
                2.3 Si la note est strictement inférieur à 20, afficher "Excellent"

            Correction à 14h43

        */
import java.util.Scanner;

public class Conditionif {
    public static void main( String[] args ){
        // Création du scanner
        Scanner scan = new Scanner( System.in );

        System.out.println("Entrez la note :");
        float note = scan.nextFloat();

        if (note <5)
        {
            System.out.println("Trés mauvais");

        }
        else if (note <10)
        {
            System.out.println("Mauvais");

        }

        else if (note <15)
        {
            System.out.println("Bien");

        }

        else if (note <18)
        {
            System.out.println("Trés bien");

        }

        else if (note <20)
        {
            System.out.println("Excellent");

        }
        else 
        {
            System.out.println("Parfait !");
        }

    }
    }