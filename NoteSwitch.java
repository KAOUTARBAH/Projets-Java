 /*
 1. Reprendre l'exercice sur la note (le précédent) avec des nombres entiers
            2. Plutot que d'utiliser une structure if, utilisez une structure switch
            3. Ne pas prend en compte les valeur inférieur à 0 ou supérieures à 20
        */


import java.util.Scanner;

public class NoteSwitch {
    public static void main( String[] args ){
        // Création du scanner
        Scanner scan = new Scanner( System.in );

        System.out.println("Entrez la note :");
        int note = scan.nextInt();

        switch(note){
            case 0,1,2,3,4:
            
            System.out.println("Trés mauvais");
            break;

            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            System.out.println("mauvais");
            break;

            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            System.out.println("Bien");
            break;

            case 15:
            case 16:
            case 17:
            
            System.out.println("Trés Bien");
            break;
            
            


            default:
            System.out.println("Excellent");


        }


        /**
         System.out.println("Entrez votre note de Java : ");
        int note_java = scan.nextInt();

        switch( note_java ) {

            case 0, 1, 2, 3, 4:
                System.out.println("Trés mauvais");
                break;

            case 5, 6, 7, 8, 9:
                System.out.println("Mauvais");
                break;

            case 10, 11, 12, 13, 14:
                System.out.println("Bien");
                break;

            case 15, 16, 17: 
                System.out.println("Trés bien");
                break;

            default: 
                System.out.println("Excellent");
        }

        // switch( note_java / 5 ) {

        //     case 0:
        //         System.out.println("Trés mauvais");
        //         break;

        //     case 1:
        //         System.out.println("Mauvais");
        //         break;

        //     case 2:
        //         System.out.println("Bien");
        //         break;

        //     default: 
        //         if( note_java < 18 ) {
        //             System.out.println("Trés bien");
        //         } 
        //         else {
        //             System.out.println("Excellent");
        //         }
        //         break;
        // }


         */
    }
    }