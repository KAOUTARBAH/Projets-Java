import java.lang.Math;
import java.util.Random;
/*
            1. Générer un array d'entiers de 10 cases
            2. Remplir chacunes de ces cases par un nombre entre 10 et 50, de manière aléatoire

            3. Rendre le nombre de case du tableau aléatoire (au démarrage du programme, à la place du 10) (entre 5 à 20 cases)
            4. Afficher la somme de ces nombres
            5. Afficher la valeur maximale et minimale
        */
public class Nombre_aleatoire{
    public static void main (String[] args){
        // 1 et 3
        int taille = (int)(Math.random() * ( 20 + 1 - 5 ) + 5 ) ;
        int[] tableau = new int[ taille ];

        // 2
        int min = 10, max = 50 ;
        for( int index = 0 ; index < tableau.length ; index++ ) {
            tableau[ index ] = (int)(Math.random() * ( max + 1 - min ) + min ) ;
        }

        // 4 et 5
        int somme = 0,
            nombre_max = tableau[0],
            nombre_min = tableau[0];

        for( int value : tableau  ) {

            // Recherche du maximum
            if( nombre_max < value ) {
                nombre_max = value ;
            }

            // Recherche du minimum
            else if( nombre_min > value ) {
                nombre_min = value ;
            }

            // Affichage du nombre
            System.out.print( value + " " );

            // Calcul de la somme
            somme += value ;
        }

        // Affichages
        System.out.println("\nLa somme des nombres du tableau est : " + somme);
        System.out.println(
            String.format("Max : %d et Min : %d", nombre_max, nombre_min)
        );
        }
        }