import java.util.Scanner ;

class Main {

    public static void main( String[] args ){

        Scanner scan = new Scanner( System.in );

        while( true ) {

            System.out.println("Entrez une valeur à diviser :");
            int valeur = scan.nextInt();
            System.out.println("Entrez un diviseur :");
            int diviseur = scan.nextInt();

            double resultat = 0.0 ;

            try {
                resultat = valeur / diviseur ;
            }

            catch( Exception e ) {
                System.out.println("Opération impossible (Diviseur = " + diviseur + ")");
            }


            System.out.println("Résultat : " + resultat);
        }        

    }

}