import java.util.Scanner;

public class Somme{
    public static void main(String[] args){
        /*
            // Faire la somme d'un ensemble de nombre

            1. Demander à l'utilisateur combien de nombre il souhaite entrer
            2. Créer un Array comportant assez de cases pour que l'utilisateur puisse rentrer tout ses nombres
            3. Demander à l'utilisateur de rentrer ces différents nombres un a un et les stocker dans l'Array
            4. Afficher les différentes valeur entrées par l'utilisateur sur une même ligne
            5. Calculer et afficher la somme de tous ces nombres
        */


        // Création du scanner
        Scanner scan = new Scanner( System.in );
        System.out.println("Entrez le nombre :");
        int nombre = scan.nextInt();
        
        int[] ma_table =new int[nombre];

        int i = 0;
        int somme =0;
        //while (i<ma_table.length){
        while (i<nombre){
           
            System.out.println("Entrez le nombre  du tableau de l'index :"+i+ " ");
           //incrimenter i++ =  ma_table[i++]
          
            ma_table[i] = scan.nextInt();
           // System.out.println(t);
            //ma_table[i]=t;
            somme += ma_table[i] ;
           //somme += scan.nextInt();
            System.out.println("la somme : " +somme);
            System.out.println("l'indexe " +i+ " la valeur " +ma_table[i]);       
             i++;
        }
        System.out.print("La liste: "); 
        i = 0;
         while (i<nombre){
            System.out.print(+ma_table[i]+" , "); 
            i++;
         }
         
         System.out.println("la somme : " +somme);

         /**
            // 1
        Scanner scan = new Scanner( System.in );
        System.out.println("Combien de nombres souhaitez vous additionner ?");
        int nombre = scan.nextInt();

        // 2
        int[] liste_nbr = new int[ nombre ];

        // 3
        // Demander <nombre> fois à l'utilisateur de rentrer un nombre
        // Stocker se nombre dans une case du tableau
        int nombre_iteration = 0 ;
        while( nombre_iteration < nombre ) {
            System.out.print("Entrez le nombre n°" + (nombre_iteration + 1) + " : ");
            liste_nbr[ nombre_iteration++ ] = scan.nextInt();
            // nombre_iteration += 1 ;
        }

        // 4
        nombre_iteration = 0 ;
        while( nombre_iteration < nombre ) {
            System.out.print( liste_nbr[ nombre_iteration ] + " " );
            nombre_iteration += 1 ;
        }

        // 5
        nombre_iteration = 0 ;
        int somme = 0 ;
        while( nombre_iteration < nombre ) {
            somme += liste_nbr[nombre_iteration];
            nombre_iteration++;
        }
        System.out.println("\nVoici la somme totale : " + somme);

          */

          /**
          deusieme SOULUTION
          // 1
        Scanner scan = new Scanner( System.in );
        System.out.println("Combien de nombres souhaitez vous additionner ?");
        int nombre = scan.nextInt();

        // 3, 4, 5
        // Demander <nombre> fois à l'utilisateur de rentrer un nombre
        // Stocker se nombre dans une case du tableau
        int nombre_iteration = 0 ;
        int somme = 0 ;
        while( nombre_iteration < nombre ) {

            System.out.print("Entrez le nombre n°" + (++nombre_iteration) + " : ");
            somme += scan.nextInt() ;
            
        }
        System.out.println("\nVoici la somme totale : " + somme);
           */

       

    }
}