/*
    1. Créer une classe Personnage
    2. Ajouter à chaque personnage les attributs : sante, attaque et armure, nom
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

    12. Créer une nouvelle classe Arme 
    12.1 Elle comportera un nom et une puissance d'attaque
    12.2 Respecter le principe d'encapsulation

    13. Créer une nouvelle classe Armure (piéce d'équippement de protection)
        13.1 Elle comportera un nom et une puissance de protection
        13.2 Respecter le principe d'encapsulation

    14. Modifier la classe Personnage pour lui intégrer systématiquement une Arme et une Armure 
        14.0 Remplacer l'attribut int attaque par Arme arme et l'attribut int armure par Armure armure
        14.1 Modifier les constructeurs
        14.2 Modifier les getters, setters (accesseurs)
        14.3 Adapter l'ensemble des méthodes si nécéssaire
        14.4 Adapter le scénario du main
*/

public class Main {

    public static void main( String[] args ) {

        // Scénario d'un combat entre Bilbo et Golum
        //Personnage bilbo = new Personnage("Bilbo", 4, 13);
        Arme arme = new Arme("arme1", 150);
        Armure armure = new Armure("armure1", 50);

        Personnage bilbo = new Personnage("Bilbo", arme, armure);
        Personnage golum = new Personnage("Golum",
                                            new Arme("arme2", 20),
                                            new Armure("arme2", 1));
        
        bilbo.afficher();
        golum.afficher();

        System.out.println( golum.get_nom() ) ;

        bilbo.attaquer( golum );

        bilbo.afficher();
        golum.afficher();

        // Scénario d'un combat entre Bilbo et 3 trolls
        Personnage[] trolls = {
            new Personnage("Toto", 
                        new Arme("arme3", 10),
                        new Armure("arme3", 3)),
            new Personnage("Gogo", 
                            new Arme("arme4", 8),
                            new Armure("arme4", 6)),
            new Personnage("Koko",
                            new Arme("arme5", 5),
                            new Armure("arme5", 5))
        };

        bilbo.attaquer( trolls );

        // Et ici création de Frodon
        Personnage frodon = new Personnage( "Frodon",
                                            new Arme("arme6", 15),
                                            new Armure("arme7", 110),
                                            6);
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

    /**
     14. Modifier la classe Personnage pour lui intégrer systématiquement une Arme et une Armure 
        14.0 Remplacer l'attribut int attaque par Arme arme et l'attribut int armure par Armure armure
        14.1 Modifier les constructeurs
        14.2 Modifier les getters, setters (accesseurs)
        14.3 Adapter l'ensemble des méthodes si nécéssaire
        14.4 Adapter le scénario du main
     */

    // Attributs de classe
    private static int nombre = 0 ;

    // Attributs
    private String nom ;
    //private int sante, attaque, armure ;
    private int sante;
    //attaque
    private Arme arme;
    private Armure armure;
    
    // Constructeurs
    //Personnage(String, int, int, int)
    //14.1 Modifier les constructeurs
    //Personnage(String, Arme, Armure, int)
    public Personnage( String nom, Arme arme , Armure armure, int sante ) {
        this.nom = nom ;
        this.arme = arme ;
        this.armure = armure ;
        this.sante = sante ;
        Personnage.nombre += 1 ;
    }

  //Personnage(String, int, int)
  ////Personnage(String, Arme, Armure)
    public Personnage( String nom,  Arme arme , Armure armure ) {
        this( nom, arme, armure, 100 );
    }

    //Personnage(Personnage)
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
    //14.2 Modifier les getters, setters (accesseurs)
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
        //return this.attaque ;
        return this.arme.get_attaque();
    }
    

    public void set_attaque( Arme nouvelle_valeur ) {
        //this.attaque = nouvelle_valeur ;
        this.arme = nouvelle_valeur ;

    }
    
    //returne l'objet armure
    public Armure get_armure() {
        return this.armure ;
    }

    //return
    public int get_protection(){
        return this.get_armure().get_armure();
    }

    public void set_armure( Armure nouvelle_valeur ) {
        this.armure = nouvelle_valeur ;
    }

    // Méthodes
    public void afficher() {
        String affichage = String.format(
            //"Notre ami %s dispose de %d de santé, de %d d'attaque et de %d de protection",
            "Notre ami %s dispose de %d de santé, de %d d'attaque et de %d d'armure",
            this.nom, this.sante, this.get_attaque(), this.get_protection()
        );
        System.out.println( affichage );
    }

    public void attaquer( Personnage cible ) {

        //int valeur_attaque = this.get_attaque() - cible.get_protection() ;
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
/*
12. Créer une nouvelle classe Arme 
    12.1 Elle comportera un nom et une puissance d'attaque
    12.2 Respecter le principe d'encapsulation
*/

//classe Arme
public class Arme
{
    // Attributs
    private String nom;
    private int attaque;

    // Constructeurs
    //Arme(String, int)
    public Arme( String nom, int attaque)
    {
        this.nom = nom ;
        this.attaque = attaque ;
    }

    //constructeur de copie
     //Arme(Arme)
    public Arme( Arme arm ) {
        //this (arm.get_nom(),arm.get_attaque());
        this( arm.nom, arm.attaque);
    }

    // Getters et setters
    public String get_nom() {
        return this.nom ;
    }

    public int get_attaque() {
        return this.attaque ;
    }

    public void set_nom( String nouvelle_nom ) {
        this.nom = nouvelle_nom ;
    }

    public void set_attaque( int nouvelle_attaque ) {
        this.attaque = nouvelle_attaque ;
    }

    // Méthode de copie
    public Arme copy() {
        return new Arme( this );
    }

}

/*
    13. Créer une nouvelle classe Armure (piéce d'équippement de protection)
        13.1 Elle comportera un nom et une puissance de protection
        13.2 Respecter le principe d'encapsulation
*/
//classe Armure
public class Armure
{
    // Attributs
    private String nom;
    private int armure;

    // Constructeurs
    //Armure(String, int)
    public Armure( String nom, int armure)
    {
        this.nom = nom ;
        this.armure = armure ;
    }

    //constructeur de copie
     //Armure(Armure)
    public Armure( Armure arm ) {
        this( arm.nom, arm.armure);
    }

    // Getters et setters
    public String get_nom() {
        return this.nom ;
    }

    public int get_armure() {
        return this.armure ;
    }

    public void set_nom( String nouvelle_nom ) {
        this.nom = nouvelle_nom ;
    }

    

    public void set_armure( int nouvelle_armure ) {
        this.armure = nouvelle_armure ;
    }

    // Méthode de copie
    public Armure copy() {
        return new Armure( this );
    }


}