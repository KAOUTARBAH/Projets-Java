import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Jeu {
   public static void main(String[] args) {
     //char[] table_symboles ={'A','B','C','A','D'};
    char[] table_symboles ={ '&', '#', '~', '9', ')', '(', '{', '}', '^', '$', '%', ':', '!', '¨', '/'};
    //int result = count ('&',table_symboles);
    //System.out.println(result);
  
  
    
// System.out.println("Il vous reste " + credit+ "crd");
  // credit = 0;
  /* if (credit == 0){
     System.out.println("Gameover et quitte la partie ");
     //pour quiter le programme
     System.exit(0);
   }
   */

   // Création du scanner
    Scanner scan = new Scanner( System.in );
   // Random r = new Random();
    
    int credit = 10;
    
    do{
        System.out.println("Il vous reste " + credit+ "crd");
        System.out.println("Appyer sur Entrée pour lancer le jeux , ou bien exit pour quitter");
        //appler le scaner
        String valeur_Entrer = scan.nextLine();

        if (valeur_Entrer.equals("exit") || valeur_Entrer.equals("stop") || valeur_Entrer.equals("quit")){
            System.out.println("fin de partie avec les crédits " +credit);
            System.exit(0);
            
        }

        else {
            //décementer le credit
            credit--;    

            //Effectuer un tirage avec la fonction tirage
            char[] tirage1 = tirage(table_symboles);
            for (char c : tirage1) {
            System.out.println(c);
            int result = count(c,tirage1);
                if (result ==  3){
                        credit += 5;
                        System.out.println("un symbole intervient 3 fois, ajouter 5 crédits" );
                    }
                else if(result ==  2){
                        credit += 2;
                        System.out.println("un symbole intervient 2 fois, ajouter 2 crédits" );

                    }
            }

           
         
        }

    }while(credit > 0);
    System.out.println("Gameover et quitte la partie ");
  
   

    /** 
    char[] t1 = tirage(table_symboles);
    for (char c : t1) {
         System.out.println(c);
    }
    */

   }

 /*****Fonction count */
   public static int count (char x, char[] table){
    int nbr_char = 0;
        for (int i=0 ; i< table.length ;i++){
            if(table[i] == x){
                nbr_char++;
            }
        }

        return nbr_char;
   }


   /*****Fonction Tirage ******/



   public static char[] tirage(char[] symbols){
        Random r = new Random();
        //creation d'un tableau
        char[] ma_table =new char[3];
        
        //Tirage aléatoir d'un caractére pour chaque case
        for(int i = 0; i < 3; i++){
            ma_table[i]=symbols[r.nextInt(symbols.length)];
        }
        
        //retour tirage
        return ma_table;
    }
   
   }