/*
            1. Demander à l'utilisateur de fournir un nombre entier que l'on nommera n
            2. Créer un Array contenant les résultats des multiplications de 3 par (0 jusqu'à n)
                -> Exemple : { 0, 3, 6, 9, ... }

            3. Afficher toutes les valeurs contenues dans ce tableau à l'aide d'un for
            4. Modifier le (3) pour n'afficher que les valeurs paires
            5. En faire un total des résultats au sein du même for et l'afficher

            7. A l'aide d'un foreach, rechercher et afficher la valeur maximale et la valeur minimale du tableau et les afficher
        
        */

import java.util.Scanner;

public class Table2{
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        System.out.println("Entrez un nombre   :");
        int n = scan.nextInt();
        int[] array =new int[n];
        int somme =0;
        int valMin = array[0];
        int valMax =array[0];
        int valMinPaire = array[0];
        int valMaxPaire =array[0];

        for(int i = 0 ; i<array.length ; i++){
            array[i]= i*3;
             
             //if (array[i] % 2 == 0) {
             if (i % 2 == 0) {
                somme += array[i] ;
                if (array[i] > valMaxPaire) 
                    valMaxPaire=array[i];
                
                if (array[i] < valMinPaire) 
                    valMinPaire=array[i];
                
                System.out.println("l'indexe " +i+ " la valeur " +array[i]);
             }
             

        }
         System.out.println("la somme : " +somme);
         System.out.println("\n");
         
         //Structure Foreach
         for(int valeur:array){      
                if (valeur > valMax) 
                    valMax=valeur;
                
                if (valeur < valMin) 
                    valMin=valeur;
                
                 System.out.print(" "+valeur+" ");                
             }

                System.out.println("\n");
                //System.out.println("La valeur Max : " +valMax);
                //System.out.println("La valeur Min : " +valMin);
                // System.out.println("La valeur Max paire : " +valMaxPaire);
                //System.out.println("La valeur Min paire : " +valMinPaire);
                System.out.println(
                    String.format("Max :%d et Min : %d ", valMax, +valMin));

                System.out.println(
                    String.format("Max paire :%d et Min paire: %d ", valMaxPaire, +valMinPaire));
             
    }
}

/**
Scanner scan = new Scanner( System.in );

        // 1
        System.out.println("Entrez un nombre : ");
        int n = scan.nextInt();

        // 2
        int[] array = new int[n];
        int somme = 0 ;

        for( int i = 0 ; i < n ; i += 1 ) {
            array[i] = i * 3 ;

            // 3 et 4
            if( array[i] % 2 == 0 ) {
                somme += array[i] ;
                System.out.println( array[i] ) ;
            }
        }

        System.out.println("Somme : " + somme );

        
            7. A l'aide d'un foreach, rechercher et afficher la valeur maximale et la valeur minimale du tableau et les afficher
        
        int valeur_min = array[0] ;
        int valeur_max = array[0] ;
        for( int my_int : array ) {

            // Recherche du minimum
            if( valeur_min > my_int ) {
                valeur_min = my_int ;
            }

            // Recherche du maximum
            else if( valeur_max < my_int ) {
                valeur_max = my_int ;
            }

        }

        System.out.println(
            String.format("Max : %d et Min : %d", valeur_max, valeur_min)
        );
 */