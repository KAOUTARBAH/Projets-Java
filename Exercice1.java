/*
            1. Afficher le résultat du calcul de 3 + 5 * 6
            2. Créer une variable A contenant la valeur entière de 45
            3. Incrémenter de 1 A
            4. Créer une variable B dont la valeur sera A x 2 + 10
            5. Afficher B - A
            6. Créer une nouvelle variable C, dont la valeur sera B + 0.25
            7. Afficher C
            8. Afficher la valeur apres la vigule de C décimale de C
        */

    /**
    // 1
        System.out.println( 3 + 5 * 6 );
        
        // 2
        int a = 45 ;
        
        // 3
        a = a + 1 ;
        // a += 1 ;
        // a++ ;
        // ++a ;

        // 5
        int b = a * 2 + 10 ;
        System.out.println( b - a );

        // 6
        double c = b + 0.25 ;

        // 7
        System.out.println( c );

        // 8
        double d = c - (int) c ;
        System.out.println( d );
     */

        public class Exercice1 {
    public static void main( String[] args ){
        int a = 45;
        a++ ;
        int b = a * 2 + 10;
        double c = b  + 0.25;
        int valeurc = (int)c;
        
         System.out.println(3 + 5 * 6);
         System.out.println("a: " +a);
         System.out.println("b: " +b);
         System.out.println("b - a : " + (b-a));
         System.out.println("c: " +c);
        System.out.println("valeurc: " +(c-valeurc));


    
    }
}