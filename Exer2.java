public class Exer2 {
    public static void main( String[] args ){

        /*
            1. Créer une variable contenant le nom d'un étudiant
            2. Créer une variable contenant la note de l'étudiant (il a eu 13.8542)
            3. Créer une variable contenant la matière pour laquelle l'étudiant a eu cette note

            4. Afficher en un seul print ces différentes informations sous la forme d'une phrase avec une concaténation simple (+)
            5. Idem que le 4 mais avec String.format
            6. Dans ce dernier print, n'afficher que 2 chiffres aprés la virgule

            7. Afficher la longeur totale de la chaine affichée dans le (6)
        */

        String etudiant = "Amine";
        double note =13.8542;
        String matiere="Anglais";

        System.out.println("Le nom d'étudient est " +etudiant+ " la note : " + note + " pour la matière " + matiere);

        //Formatage avec String.format
         System.out.println(
            String.format
             ("Le nom d'étudient est  %s et la note %f pour la matière du %s ",etudiant,note, matiere)
            );

        //Formatage avec String.format
        //afficher que 2 chiffres aprés la virgule
         System.out.println(
            String.format
             ("Le nom d'étudient est  %s et la note %.2f pour la matière du %s ",etudiant,note, matiere)
            );
   
      // Afficher la longeur totale de la chaine affichée 
      String ma_chaine = String.format("Le nom d'étudient est  %s et la note %.2f pour la matière du %s ",etudiant,note, matiere);
      System.out.println("la longeur totale de la chaine affichée : "  +ma_chaine.length());


      System.out.println(
            String.format
             ("Le nom d'étudient est  %s et la note %.2f pour la matière du %s ",etudiant,note, matiere).length()
            );

    }
    }