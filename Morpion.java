import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Morpion {

    /*****Fonction count */
    public static int count (char x, char[][] table){
    int nbr_char = 0;
        for (int i=0 ; i< table.length ;i++){
            for (int j=0 ; j< table[i].length ;j++)
            {
                if(table[i][j] == x)
                {
                    nbr_char++;
                }
            }
        }
       
        return nbr_char;
   }
    
    /*****Fonction free_cell */
    
    
    // Fonction pour compter le nombre de cases libres dans la grille de jeu
    public static int free_cells(char[][] table) {
    // On compte le nombre des étoiles  '*' dans le tableau pour savoir combien de cases sont libres
    //avec la fonction count
        return count('*', table);                           
    }
    
    
    /*****Fonction get_column */
    public static char[] get_column(int index_colonne,char[][] table)
    {
    char[] colonne = new char[table.length];
       for (int i=0 ; i< table.length ;i++)
        {
              colonne [i]= table [i][index_colonne];    
        }

        return colonne;
    }



   public static void main(String[] args) {

   // Créer une grille de 3 x 3 case.
    char[][] grille =new char[3][3];
    Scanner scan = new Scanner( System.in );
    char joueur = 'O';
    int compteur_tour = 1;

    
    
    //Initialiser le tableau grille
   
    for (int i=0 ; i< grille.length ;i++)
    {
            for (int j=0 ; j< grille[i].length ;j++)
            {
                grille[i][j] ='*';             
            }       
    }

    int nbr_vide = free_cells(grille);
    System.out.println("nbr vide : " +nbr_vide);
    
    //constion de test 
    
    //int x =5;
    //while (x==5){
    while (nbr_vide>0)
    {
        //x++;

        if (nbr_vide % 2 == 0) {
            joueur = 'X';
        }
        else {
            joueur = 'O';
        }
        System.out.println("le numéro du tour " +compteur_tour + " le joueur " +joueur);

        

        System.out.println("entrer la ligne  0-1-2" );
        int ligne =scan.nextInt();
        System.out.println("entrer la ligne  0-1-2" );
        int colonne = scan.nextInt();
        
        //Vérifier la case est vide
        if (ligne < 0 || ligne > 2 ||  colonne < 0  || colonne > 2 )
        {                
            System.out.println("valeur incorrecte");    
            continue;            
        }
        //verifier les valeurs entre 0 et 2
        else if (grille[ligne][colonne] != '*') 
        { 
            System.out.println("La case choisis déja ocuupé!!!!");
            continue;
            
           // break;
           /* System.out.println("Rentrer la ligne  0-1-2" );
            ligne =scan.nextInt();
            System.out.println("Rentrer la ligne  0-1-2" );
            colonne = scan.nextInt();
            */
        }
       
        grille[ligne][colonne]= joueur;
        //Afficher la grille
        System.out.println("  0 1 2");
       
        for (int i=0 ; i< grille.length ;i++)
        {
            System.out.print(i+ " ");

            for (int j=0 ; j< grille[i].length ;j++)
            {
                System.out.print(grille[i][j]+ " ");
            }
            System.out.println();
        }

        
        
        nbr_vide--;
        System.out.println("nbr vide : " +nbr_vide);
    }

    

   }


}