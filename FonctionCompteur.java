/*
            1. Créer une fonction "compter" qui affiche les nombres de 0 à 10
            2. Modifier la fonction compter pour qu'elle prennent en paramètre un min et un max. Elle comptera de min jusqu'à max.
            3. Créer une fonction "randint" prenant en paramètre deux entier min et max et retournant une valeur aléatoire entre min et max
            4. Dans le main, utiliser la fonction compter avec un minimum aléatoire entre 0 et 10 et un maximum aléatoire entre 15 et 25
        */

import java.lang.Math;
public class FonctionCompteur {
    
   
   public static void main(String[] args) {
    
    //compter( randint( 0, 15), randint (15 ,25 ));
    //compter( randint( 0, 10 ), randint( 15, 25 ) );
    
     int nombre_min = (int)(Math.random() * ( 10 + 1 - 0 ) + 0 ) ;
     int nombre_max = (int)(Math.random() * ( 25 + 1 - 15 ) + 15 ) ;
      //compteur(6,10);
      System.out.println("nombre_min : " +nombre_min + " , nombre_max : " +nombre_max);
      compteur(nombre_min,nombre_max);
      System.out.println("\n");
      //System.out.println(randint(6,10));
      System.out.println(randint(nombre_min,nombre_max));
      System.out.println(randint(15 ,25 ));
      System.out.println(randint(0 ,10 ));

    
   }
   
  /* private static void compteur() {
      for (int i = 0 ; i<=10 ; i++)
      {
        System.out.println(i);
      }
   }
    */
   private static void compteur(int min, int max) {
      for (int i = min ; i<=max ; i++)
      {
        System.out.print(" "+i +" ");
      }
   }
 //int permet de recupuer une valeur randit
 
   private static int randint(int min, int max) {
       // System.out.println((int)(Math.random() * (max + 1 - min ) + min));
        int random_n = (int)(Math.random() * (max + 1 - min ) + min);
        return(random_n);
   }
   
}
    

/**
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main {

    public static void compter( int minimum, int maximum ) {

        for( int i = minimum ; i <= maximum ; i++ ) {
            System.out.print( i + " " );
        }
        System.out.println("");

    }

    public static int randint( int minimum, int maximum ) {
        Random r = new Random();
        return r.nextInt( maximum + 1 - minimum ) + minimum ;
    }

    public static void main( String[] args ) {    

        
            1. Créer une fonction "compter" qui affiche les nombres de 0 à 10
            2. Modifier la fonction compter pour qu'elle prennent en paramètre un min et un max. Elle comptera de min jusqu'à max.
            3. Créer une fonction "randint" prenant en paramètre deux entier min et max et retournant une valeur aléatoire entre min et max
            4. Dans le main, utiliser la fonction compter avec un minimum aléatoire entre 0 et 10 et un maximum aléatoire entre 15 et 25
        

        // 1 et 2
        compter( 6, 18 );
        compter( 0, 21 );
        compter( 3, 21 );

        // 3
        System.out.println( randint( 0, 10 ) );

        // 4
        compter( randint( 0, 10 ), randint( 15, 25 ) );

        // 4 bis
        int min = randint(0, 10) ;
        int max = randint(15, 25) ;
        compter( min, max );



    }

}
 */