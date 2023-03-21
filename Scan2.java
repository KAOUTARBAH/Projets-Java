/*
            1. Importer Scanner
            2. Créer un Scanner

            3. Demander à l'utilisateur d'entrer un premier nombre entier
            4. Lui en demander un second
            5. Afficher le calcul et le résultat de l'addition de ces deux nombres

            6. Demander à l'utilisateur d'entrer un caractère
            7. Afficher le n°ASCII correspondant à ce caractère
        */

        import java.util.Scanner;

public class Scan2 {
    public static void main( String[] args ){
        // Création du scanner
        Scanner scan = new Scanner( System.in );

        // Récupère le nom de l'utilisateur
        

        System.out.println("Entrez un premier nombre entier :");
        int nb1 = scan.nextInt();
        System.out.println("Entrez un second nombre entier :");
        int nb2 = scan.nextInt();
        int Resultat = nb1 + nb2;
        

        System.out.println("Resultat " +Resultat);
        System.out.println("Resultat " +nb1+"  " +nb2+"  " +(nb1 + nb2));
        
        System.out.println("Entrez un caractère :");
        char caractere = scan.next().charAt(0);
        //char nom = scan.next();
        System.out.println("Caractere " + caractere );

       // int ascii = int(caractere);
        //System.out.println(caractere);
       // System.out.println("la valeur ASCII DE "+caractere+ " est : " +ascii);


        // Récupère la note de l'utilisateur
       // System.out.println("Combien avez vous eu à votre évaluation de Java ?");
        //int note = scan.nextInt();
        //System.out.println("Bravo, vous avez eu " + note + " en Java !");

        // Fermeture du scanner
        //char ch = 'A';
        int ascii = (int)caractere;
        System.out.println("La valeur ASCII de "+caractere+" est: " + ascii);


        scan.close();

    /**
     
            1. Importer Scanner
            2. Créer un Scanner

            3. Demander à l'utilisateur d'entrer un premier nombre entier
            4. Lui en demander un second
            5. Afficher le calcul et le résultat de l'addition de ces deux nombres

            6. Demander à l'utilisateur d'entrer un caractère
            7. Afficher le n°ASCII correspondant à ce caractère
        

        // 2 
        Scanner scan = new Scanner( System.in );

        // 3
        System.out.println("Veuillez entrer à un premier nombre entier : ");
        int nombre_1 = scan.nextInt();

        // 4
        System.out.println("Veuillez entrer un second nombre entier : ");
        int nombre_2 = scan.nextInt();

        // 5
        System.out.println(
            String.format(
                "Le résultat du calcul de %d + %d = %d",
                nombre_1, nombre_2, nombre_1 + nombre_2
            )
        );

        // 6
        System.out.println("Entrez un caractère de votre choix :");
        char mon_caractere = scan.next().charAt(0);

        int ascii_code = (int) mon_caractere ;

        // 7
        System.out.println(
            String.format(
                "Le n°ASCII du caractère '%c' est le %d",
                mon_caractere, ascii_code
            )
        );
     */

        
    }}


