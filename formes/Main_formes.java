/*
    1. Créer une classe Rectangle
        1.1 Elle dispose des attributs largeur et longeur
        1.2 Respecter l'encapsulation et ajouter un constructeur prenant en paramètre la largeur et la longeur
        1.3 Lui ajouter la méthode périmétre (retourne le périmétre du rectangle : (longeur + largeur) * 2)
        1.4 Lui ajouter la méthode aire (retourne l'aire du rectangle : (longeur * largeur) )

    2. Dans le main, créer un rectangle r1 de 9 de longeur et de 6 de largeur
        2.1 Afficher son périmétre et son aire

    3. Créer une classe Carre
        3.1 Lui ajouter un constructeur ne prenant qu'un unique paramètre coté, faisant appel au constructeur du rectangle
        3.2 Créer un carré c1, de coté 12, dont on affichera le périmétre et l'aire

*/

class Main {

    public static void main( String[] args ){

        // Rectangle r1 = new Rectangle( 9, 6 );

        // System.out.println(
        //     "Le périmétre de r1 est de " + Rectangle.perimetre( r1 )
        // );

        // System.out.println(
        //     "Le périmétre de r1 est de " + r1.perimetre()
        // );

        // int aire_de_r1 = r1.aire();

        // System.out.println(
        //     "L'aire de r1 est de " + aire_de_r1
        // );

        Carre c1 = new Carre( 5 );

        System.out.println(
            "Le périmétre de c1 est de " + c1.perimetre()
        );

        System.out.println(
            "L'aire de c1 est de " + c1.aire()
        );

    }

}

class Rectangle {

    protected int largeur, longeur ;

    // Constructeur par défaut
    public Rectangle() {}

    public Rectangle( int longeur, int largeur ) {
        this.largeur = largeur ;
        this.longeur = longeur ;
    }

    public int get_longeur() {
        return this.longeur ;
    }

    public int get_largeur() {
        return this.largeur ;
    }

    public void set_longeur( int longeur ) {
        this.longeur = longeur ;
    }

    public void set_largeur( int largeur ) {
        this.largeur = largeur ;
    }

    public static int perimetre( Rectangle r ) {
        return ( r.get_largeur() + r.get_longeur() ) * 2 ;
    }

    public int perimetre() {
        return ( this.get_largeur() + this.get_longeur() ) * 2 ;
    }

    public int aire() {
        int valeur_aire = this.longeur * this.largeur ;
        return valeur_aire ;
    }

}

class Carre extends Rectangle {

    Carre( int cote ) {
        super( cote, cote );
    }

}