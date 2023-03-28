
public class Main {

    public static void main( String[] args ) {

        // Scénario d'un combat entre Bilbo et Golum
        Personnage bilbo = new Personnage(
            "Bilbo",
            new Arme( "Poings", 150 ),
            new Armure( "Cape", 50 )
        );
        Personnage golum = new Personnage(
            "Golum",
            new Arme( "Fléche", 80 ),
            new Armure( "Cuirasse", 100 )
        );
        
        bilbo.afficher();
        golum.afficher();

        System.out.println( golum.get_nom() ) ;

        bilbo.attaquer( golum );

        bilbo.afficher();
        golum.afficher();

        // // Scénario d'un combat entre Bilbo et 3 trolls
        Personnage[] trolls = {
            new Personnage(
                "Toto",
                new Arme( "Lance", 70 ),
                new Armure( "Pagne", 10) 
            ),
            new Personnage(
                "Gogo",
                new Arme( "Arc", 50 ),
                new Armure( "Casque", 30) 
            ),
            new Personnage(
                "Koko",
                new Arme( "Epée", 100 ),
                new Armure( "Cuirasse", 120) 
            ),
        };

        bilbo.attaquer( trolls );

        // // Et ici création de Frodon
        Personnage frodon = new Personnage( 
            "Frodon", 
            new Arme( "Epée", 100 ),
            new Armure( "Cuirasse", 120),
            110 
        );
        Personnage sam = new Personnage( frodon );
        // Personnage sam = Personnage.copy( frodon );
        Personnage pipin = frodon.copy();

        sam.set_nom( "Sam" );
        pipin.set_nom( "Pipin" );

        sam.afficher();
        pipin.afficher();

        System.out.println("Nous avons créé " + Personnage.get_nombre() + " personnages");
    }

}

public class Arme {

    private String nom ;
    private int attaque ;

    public Arme( String nom, int attaque ) {
        this.set_nom( nom );        // Soit l'un
        this.attaque = attaque ;    // Soit l'autre, en fonction des cas
    }

    public Arme( Arme a ) {
        this( a.get_nom(), a.get_attaque() );
    }

    public Arme copy() {
        return new Arme( this );
    }

    public String get_nom() {
        return this.nom ;
    }

    public int get_attaque() {
        return this.attaque ;
    }

    public void set_nom( String value ) {
        this.nom = nom ;
    }

    public void set_attaque( int value ) {
        this.attaque = attaque ;
    }

}

public class Armure {

    private String nom ;
    private int protection ;

    public Armure( String nom, int protection ) {
        this.nom = nom ;
        this.protection = protection ;
    }

    public Armure( Armure armure ) {
        this( armure.get_nom(), armure.get_protection() );
    }

    public String get_nom() {
        return this.nom ;
    }

    public int get_protection() {
        return this.protection ;
    }

    public void set_nom( String nouvelle_valeur ) {
        this.nom = nouvelle_valeur ;
    }

    public void set_protection( int protection ) {
        this.protection = protection ;
    }

}

public class Personnage {

    // Attributs de classe
    private static int nombre = 0 ;

    // Attributs
    private String nom ;
    private int sante ;
    private Arme arme ;
    private Armure armure ;
    
    // Constructeurs
    public Personnage( String nom, Arme arme, Armure armure, int sante ) {
        this.nom = nom ;
        this.arme = arme ;
        this.armure = armure ;
        this.sante = sante ;
        Personnage.nombre += 1 ;
    }

    public Personnage( String nom, Arme arme, Armure armure ) {
        this( nom, arme, armure, 100 );
    }

    public Personnage( Personnage p ) {
        this( p.nom, p.arme, p.armure, p.sante );
    }

    // Méthode de copie
    public Personnage copy() {
        return new Personnage( this );
    }

    // Méthodes statiques
    public static int get_nombre() {
        return nombre ;
    } 

    // Getters et setters
    public String get_nom() {
        return this.nom ;
    }

    public void set_nom( String nouveau_nom ) {
        this.nom = nouveau_nom ;
    }

    public int get_sante() {
        return this.sante ;
    }

    public void set_sante( int nouvelle_valeur ) {
        this.sante = nouvelle_valeur ;
    }

    public Arme get_arme() {
        return this.arme ;
    }

    public void set_arme( Arme nouvelle_arme ) {
        this.arme = nouvelle_arme ;
    }

    public int get_attaque() {
        return this.arme.get_attaque() ;
    }

    // Ici retourne l'objet Armure
    public Armure get_armure() {
        return this.armure ;
    }

    // Ici on retourne la valeur de protection de l'objet Armure
    public int get_protection() {
        return this.get_armure().get_protection() ;
    }

    public void set_armure( Armure nouvelle_armure ) {
        this.armure = nouvelle_armure ;
    }

    // Méthodes
    public void afficher() {
        String affichage = String.format(
            "Notre ami %s dispose de %d de santé, de %d d'attaque et de %d de protection",
            this.nom, this.sante, this.get_attaque(), this.get_protection()
        );
        System.out.println( affichage );
    }

    public void attaquer( Personnage cible ) {

        int valeur_attaque = this.get_attaque() - cible.get_protection() ;

        System.out.printf(
            "%s subit une attaque de %s d'une valeur de %d\n%s ne dispose plus que de %d de santé\n",
            cible.nom, this.nom, valeur_attaque, cible.nom,
            cible.sante - ( valeur_attaque )
        );

        cible.sante -= valeur_attaque ;

    }

    // Méthode permettant d'attaquer simultanément plusieurs cibles
    public void attaquer( Personnage[] cibles ) {
        for( Personnage p : cibles ) {
            this.attaquer( p );
        }
    }

    

}