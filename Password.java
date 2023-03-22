 /*
            1. Demander à l'utilisateur de rentrer un mot de passe
            2. Tant que le mot de passe n'est pas égal à "toto195", redemander son mot de passe à l'utilisateur
            3. Lorsque le mot de passe est bon, afficher "Connecté !"
        */
import java.util.Scanner;

public class password{
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
      
        String password ="";
        do{
            System.out.println("Entrez le mot de passe :");
            password = scan.nextLine();

        }while (!password.equals("toto195") );
        //}while (password != "toto195") ; non c'est incorrectre parce que on utilise scaner
        System.out.println("Connecté");

         do {
            System.out.print("Veuillez saisir votre mot de passe : ");  
        } while( !scan.nextLine().equals("toto195") ) ;

        System.out.println("Connecté !");


        /**
        Scanner scan = new Scanner( System.in );

        // Solution avec une chaine pour contenir le mot de passe
        String mdp ;
        do {

            System.out.print("Veuillez saisir votre mot de passe : ");
            mdp = scan.nextLine();
            
        } while( !mdp.equals("toto195") ) ;

        System.out.println("Connecté !");


        // Solution sans variable intermédiaire
        do {
            System.out.print("Veuillez saisir votre mot de passe : ");  
        } while( !scan.nextLine().equals("toto195") ) ;

        System.out.println("Connecté !");
         */
        



    }
    }


   