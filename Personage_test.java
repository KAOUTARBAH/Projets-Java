/*
    1. Créer une classe Personnage
    2. Ajouter à chaque personnage les attributs : sante, attaque et armure
    3. Créer un constructeur permettant d'initialiser ces 3 attributs
    4. Ajouter au Personnage une méthode "afficher" permettant de présenter le personnage

    5. Ajouter au Personnage une méthode "attaquer" permettant d'attaquer un autre personnage
        5.1 Cet autre personnage est donc un paramètre de la méthode
        5.2 L'attaquant fait baisser la sante de l'adverssaire en fonction de son armure et de sa propre puissance d'attaque
        5.3 Ajouter un affichage du combat

    6. Créer deux instances de Personnage
    7. La première attaque la seconde

    8. Créer une surcharge du constructeur de Personnage permettant de spécifier la valeur de son attribut santé

    9. Respecter le principe d'encapsulation pour notre classe Personnage
        9.1 Tous les attributs doivent être privés
        9.2 Définir toutes les méthode comme publique
        9.3 Réaliser les getters et setters de tous nos attributs
        9.4 Réaliser un constructeur par copie : une surcharge de constructeur prenant en paramètre une instance de la classe et en copiant toutes les valeurs de ses attributs
    10. A la suite de la création de Frodon, créer Sam par copie à Frodon
    11. S'assurer que le nom de Sam soit bien "Sam"
*/

public class Main {

    public static void main( String[] args ) {

        // Scénario d'un combat entre Bilbo et Golum
        Personnage bilbo = new Personnage("Bilbo", 4, 13);
        Personnage golum = new Personnage("Golum", 20, 1);
        
        bilbo.afficher();
        golum.afficher();

        System.out.println( golum.get_nom() ) ;

        bilbo.attaquer( golum );

        bilbo.afficher();
        golum.afficher();

        // Scénario d'un combat entre Bilbo et 3 trolls
        Personnage[] trolls = {
            new Personnage("Toto", 10, 3),
            new Personnage("Gogo", 8, 6),
            new Personnage("Koko", 5, 5)
        };

        bilbo.attaquer( trolls );

        // Et ici création de Frodon
        Personnage frodon = new Personnage( "Frodon", 6, 15, 110 );
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

class Personnage {

    // Attributs de classe
    private static int nombre = 0 ;

    // Attributs
    private String nom ;
    private int sante, attaque, armure ;
    
    // Constructeurs
    public Personnage( String nom, int attaque, int armure, int sante ) {
        this.nom = nom ;
        this.attaque = attaque ;
        this.armure = armure ;
        this.sante = sante ;
        Personnage.nombre += 1 ;
    }

    public Personnage( String nom, int attaque, int armure ) {
        this( nom, attaque, armure, 100 );
    }

    public Personnage( Personnage p ) {
        this( p.nom, p.attaque, p.armure, p.sante );
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

    public int get_attaque() {
        return this.attaque ;
    }

    public void set_attaque( int nouvelle_valeur ) {
        this.attaque = nouvelle_valeur ;
    }

    public int get_armure() {
        return this.armure ;
    }

    public void set_armure( int nouvelle_valeur ) {
        this.armure = nouvelle_valeur ;
    }

    // Méthodes
    public void afficher() {
        String affichage = String.format(
            "Notre ami %s dispose de %d de santé, de %d d'attaque et de %d d'armure",
            this.nom, this.sante, this.attaque, this.armure
        );
        System.out.println( affichage );
    }

    public void attaquer( Personnage cible ) {

        int valeur_attaque = this.attaque - cible.armure ;

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