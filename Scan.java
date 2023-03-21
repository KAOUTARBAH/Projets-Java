import java.util.Scanner;

public class Scan {
    public static void main( String[] args ){
        // Création du scanner
        Scanner scan = new Scanner( System.in );

        // Récupère le nom de l'utilisateur
        System.out.println("Entrez votre nom d'utilisateur :");
        String nom = scan.nextLine();
        System.out.println("Bienvenue " + nom + " !");

        // Récupère la note de l'utilisateur
        System.out.println("Combien avez vous eu à votre évaluation de Java ?");
        int note = scan.nextInt();
        System.out.println("Bravo, vous avez eu " + note + " en Java !");

        // Fermeture du scanner
        scan.close();



        /*

        Scanner scan = new Scanner ( System.in);

        System.out.println("Entrer votre nom d'utilisateur");
        String nom = scan.nextLine();
        System.out.println("Bienvenue" + nom);
        
        System.out.println("combien");
        int note = scan.nextInt();
        System.out.println("la note"+note);

        System.out.println("Bravo");
        scan.close();
        */
    }}


