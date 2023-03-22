/*
            1. Créer une variable initialisée à une valeur choisie par l'utilisateur
            2. Afficher un décompte de cette valeur à 0
        */
import java.util.Scanner;

public class StructureFor{
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        System.out.println("Entrez le nombre  de décompte :");
        //int nombre = scan.nextInt();

        //Structure For
       /* for(int i = 0 ; i<nombre ; i++){
             System.out.println("l'indexe " +i);

        }
        */

        for(int i = scan.nextInt() ; i>=0 ; i--){
            System.out.println("le Décompte : " +i);
        }

       /* for(int i = nombre ; i>0 ; i--){
            System.out.println("l'indexe " +i);
        }
        */
        }
    }

    /**
    Scanner scan = new Scanner( System.in );

        System.out.print("A partir de combien souhaitez-vous décompter ? ");

        for( int n = scan.nextInt() ; n >= 0 ; n -= 2 ) {
            System.out.println( n );
        }
     */