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

public class Main {
    public static void main( String[] args ) 
    {
        Rectangle my_rectangle = new Rectangle(10,4);
        my_rectangle.perimetre();
        my_rectangle.aire();

        Carre my_Carre = new Carre(6);
        my_Carre.perimetre();
        my_Carre.aire();


    }

}

public class Rectangle 
{ 
    //attributs
    protected int largeur, longeur ;

    //constructeur
    Rectangle (int largeur,int longeur )
    {
        this.largeur = largeur ;
        this.longeur = longeur ;
    }

    //constructeur un seul param
    Rectangle(int largeur){
        this(largeur, largeur);
    }
    
    //copie constructeur
    Rectangle(Rectangle r){
        this(r.largeur, r.longeur);
    }

     // Méthode de copie
    public Rectangle copy() {
        return new Rectangle( this );
    }
        
    public int get_largeur() {
        return this.largeur ;
    }
     
    //getter et setter
    public void set_largeur( int nouvelle_largeur ) {
        this.largeur = nouvelle_largeur ;
    }

    public int get_longeur() {
        return this.longeur ;
    }

    public void set_longeur( int nouvelle_longeur ) {
        this.largeur = nouvelle_longeur ;
    }
     
     
    // 1.3 Lui ajouter la méthode périmétre (retourne le périmétre du rectangle : (longeur + largeur) * 2)

    public int perimetre (){   
        //return(this.longeur + this.largeur) * 2;
        int perimetre = (this.longeur + this.largeur) * 2;

        String affichage = String.format(
            "le périmetre %d : de largeur %d, et de longeur%d ",
             perimetre , this.largeur , this.longeur
        );
        System.out.println(affichage);
        return perimetre;    
    }

    public int aire (){   
        //return(this.longeur + this.largeur) * 2;
        int aire = this.longeur * this.largeur;

        String affichage = String.format(
            "l'aire  %d : de largeur %d, et de longeur%d ",
             aire , this.largeur , this.longeur
        );
        System.out.println(affichage);
        return aire;    
    }
}



/**
 3. Créer une classe Carre
        3.1 Lui ajouter un constructeur ne prenant qu'un unique paramètre coté, faisant appel au constructeur du rectangle
        3.2 Créer un carré c1, de coté 12, dont on affichera le périmétre et l'aire
 */
public class Carre extends Rectangle
{ 
    Carre (int cote){
        super( cote , cote );
        //this.largeur = cote;
       // this.longeur = cote;
        //System.out.println( "Le coté du carré :" + this.largeur);

    }

    
}