import java.lang.Math;
import java.util.Random;
/*
            1. Générer un array d'entiers de 10 cases
            2. Remplir chacunes de ces cases par un nombre entre 10 et 50, de manière aléatoire
            3. Rendre le nombre de case du tableau aléatoire (entre 5 à 20 cases)

            4. Afficher la somme de ces nombres
            5. Afficher la valeur maximale et minimale
        */

public class Nombre_aleatoire{
    public static void main (String[] args){
        int mint = 5, maxt = 20;
        int min = 10, max = 50;
        int somme =0;
        int random_t = (int)(Math.random() * (maxt + 1 - mint ) + mint);
        
        
        int[] ma_table =new int[random_t];
        int valMin =0;
        int valMax =0;
        
        System.out.print(" le nombre de case du tableau : " +random_t);
        System.out.println("\n");
        
        for(int i=0 ;i<ma_table.length ; i++){    
            ma_table[i] = (int)(Math.random() * ( max + 1 - min ) + min ) ;   
            if (i==0 ) {
                valMin = ma_table[0];
                valMax = ma_table[0];
            }
            else if( valMax < ma_table[i] ){
                valMax = ma_table[i] ;    

            } 
                         

             else if( valMin > ma_table[i] ) {
                 valMin = ma_table[i] ;

             }
               
            somme += ma_table[i] ;  

             System.out.print(" " + ma_table[i] + " ");
            
        }  

        
       int  nombre_max = ma_table[0],
            nombre_min = ma_table[0];

        for( int value : ma_table  ) {

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
        }


          
            //System.out.println(" val min: " +valMin);
            //System.out.println(" val max: "+valMax);


         

        System.out.println("\n");
        System.out.println(" La somme de ces nombres : " + somme + " ");
        System.out.println(
                    String.format("Max :%d et Min : %d ", valMax, valMin));

        System.out.println(
                    String.format("Max2 :%d et Min2 : %d ", nombre_max, nombre_min));

        
        //System.out.println( random_n );
        //System.out.println( Math.random());

        //avec le module Random
    
       // Random r = new Random();
        //System.out.println( r.nextInt( max + 1 - min ) + min  );



    }
}

/*
// Génération d'un nombre entier aléatoire entre min et max
        int min = 5, max = 10 ;
        int random_n = (int)(Math.random() * ( max + 1 - min ) + min ) ;

          // Avec le module Random
        Random r = new Random();
        System.out.println( r.nextInt( max + 1 - min ) + min  );

        
            1. Générer un array d'entiers de 10 cases
            2. Remplir chacunes de ces cases par un nombre entre 10 et 50, de manière aléatoire
            3. Rendre le nombre de case du tableau aléatoire (entre 5 à 20 cases)

            4. Afficher la somme de ces nombres
            5. Afficher la valeur maximale et minimale
        */
/**
*
            1. Générer un array d'entiers de 10 cases
            2. Remplir chacunes de ces cases par un nombre entre 10 et 50, de manière aléatoire
            
            3. Rendre le nombre de case du tableau aléatoire (au démarrage du programme, à la place du 10) (entre 5 à 20 cases)

            4. Afficher la somme de ces nombres
            5. Afficher la valeur maximale et minimale
        

        // 1
        int[] tableau = new int[ 10 ];

        // 2
        int min = 10, max = 50 ;
        for( int index = 0 ; index < tableau.length ; index++ ) {
            tableau[ index ] = (int)(Math.random() * ( max + 1 - min ) + min ) ;
        }
 */

 /**
 

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
  */