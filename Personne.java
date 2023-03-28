/*
    1. Créer une classe Personnage
    2. Ajouter à chaque personnage les attributs : sante, attaque et armure
    3. Créer un constructeur permettant d'initialiser ces 3 attributs
    4. Ajouter au Personnage une méthode "afficher" permettant de présenter le personnage

    5. Ajouter au Personnage une méthode "attaquer" permettant d'attaquer un autre personnage
        5.1  Cet autre personnage est donc un paramètre de la méthode
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

public class Personne 
{
   public static void main(String[] args) 
   {
        Personnage minny = new Personnage("Minny", 4, 15);
        Personnage mikey = new Personnage("Mikey", 20, 2);
        Personnage bilbo = new Personnage("Bilbo", 4, 13);
        Personnage golum = new Personnage("Golum", 20, 1);
       
        Personnage nada = new Personnage("nada", 13, 6,120);

        nada.afficher();
        bilbo.afficher();
        golum.afficher();
        minny.afficher();
        mikey.afficher();
        
        minny.attaquer(mikey);

        minny.afficher();
        mikey.afficher();

   }
}

class Personnage {

    private String nom;
    private int sante, attaque, armure ;

    //constructeur Personnage pour utilser a l'exterieur
    Public Personnage( String nom, int attaque, int armure )
    {
        this.sante = 100;
        this.attaque = attaque;
        this.armure = armure;
        this.nom = nom;
    }

    //2 éme constructeur Personnage
    Public Personnage( String nom, int attaque, int armure , int sante) 
    {
        this(nom,attaque,armure);
        this.sante = sante;
    }

    Public Personnag(String nom, int attaque, int armure , int sante)
    {
        this.get_nom = nom;
        this.get_attaque = attaque;
        this.get_armure = armure;
        this.get_sante = sante;

        this.set_nom = nom;
        this.set_attaque = attaque;
        this.set_armure = armure;
        this.set_sante = sante;

    }

    //getters et setters 
    public String get_nom()
    {
        return this.nom;
    }

     public int get_sante()
    {
        return this.sante;
    }

    public int get_attaque()
    {
        return this.attaque;
    }

    public int get_armure()
    {
        return this.armure;
    }

    public String set_nom(String nouveau_nom)
    {
        this.nouveau_nom;
    }

     public int set_sante(int nouveau_sante)
    {
        this.nouveau_sante;
    }

    public int set_attaque(int nouveau_attaque)
    {
        this.nouveau_attaque;
    }

    public int set_armure(int nouveau_armure)
    {
        this.nouveau_armure ;
    }



    //méthode afficher
    
    public void afficher() {
        String affichage = String.format(
            "Notre ami %s dispose de %d de santé, de %d d'attaque et de %d d'armure",
            this.nom, this.sante, this.attaque, this.armure
        );
        System.out.println( affichage );
    }

    /*void attaquer(Personnage cible){
        //le personnage qui lance l'attaque
        this;

         //le personnage attaqué
         cible.sante -= this.attaque - cible.armure;

        System.out.printf("%s attaque % avec une valeur de %d\n%s
        ne sispose plus que de %d  de sante", cible.nom ,this.attaque-)
        int valeur_attaque = this.attaque - cible.armure;

        return this.nom + " " +  this.sante + " " +  valeur_attaque ,cible.nom, ; 
    }*/
    
    //metode attaquer
    public void attaquer( Personnage cible ) {

        int valeur_attaque = this.attaque - cible.armure ;

        System.out.printf(
            "%s subit une attaque de %s d'une valeur de %d\n%s ne dispose plus que de %d de santé\n",
            cible.nom, this.nom, valeur_attaque, cible.nom,
            cible.sante - ( valeur_attaque )
        );

        cible.sante -= valeur_attaque ;

    }


}