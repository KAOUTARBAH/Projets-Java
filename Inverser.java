/*
            1. Demander à l'utilisateur d'entrer une première valeur entière que l'on stockera dans une variable x
            2. Lui en demande une seconde que l'on stockera dans la variable y

            3. Inversser les deux valeurs : x doit valoir y et y doit valoir x (avec par exemple une troisième variable)
            4. Afficher x et y

            5. Réinversser les deux valeurs sans utiliser une troisième variable
            6. Afficher x et y
        */

        import java.util.Scanner;

public class Inverser {
    public static void main( String[] args ){
        // Création du scanner
        Scanner scan = new Scanner( System.in );

        System.out.println("Entrez un premier nombre x :");
        int x = scan.nextInt();
        System.out.println("Entrez un second nombre y :");
        int y = scan.nextInt();

        int m = x;
         x = y;
         y = m;
         
        System.out.println("la valeur x :" + x+ "la valeur y :" +y);
        System.out.println(String.format("la valeur de x = %d y = %d",x, y));

        // 5
        x = x + y ; // Avec x = 10 et  y = 5, x passe à 15 (la somme de xet y)
        y = x - y ; // Y passe à 15 - 5 soit 10  (y = total - y) pour avoir 
        x = x - y ; // X passe à 15 - 10 soit 5 (x= total -y) pour avoir x

        // 6 
        System.out.println(
            String.format(
                "X = %d et Y = %d", x, y
            )
        );

         /**
          // 1 
        Scanner mon_scan = new Scanner( System.in );

        System.out.print("Entrez un premier nombre : ");
        int x = mon_scan.nextInt();

        // 2
        System.out.print("Entrez un deuxième nombre : ");
        int y = mon_scan.nextInt();

        System.out.println(
            String.format(
                "X = %d et Y = %d", x, y
            )
        );

        // 3
        int z = x ; // Sauvegarde de x dans z
        x = y ; // Transfère y dans x
        y = z ; // Transfère l'ancienne valeur de x (z) dans y

        // 4
        System.out.println(
            String.format(
                "X = %d et Y = %d", x, y
            )
        );

        // 5
        x = x + y ; // Avec x = 10 et  y = 5, x passe à 15
        y = x - y ; // Y passe à 15 - 5 soit 10
        x = x - y ; // X passe à 15 - 10 soit 5

        // 6 
        System.out.println(
            String.format(
                "X = %d et Y = %d", x, y
            )
        );

          */
    }
}

