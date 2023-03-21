public class Exercice1 {
    public static void main( String[] args ){
        String author="Kaoutar";
        int version = 2;
        String date ="20/03/2023";
        //CONCATINATION SIMPLE
        System.out.println("Ce programme a été crée par "+
        author+ " et est en version " + version+  " daté du "+ date);
       
        //Formatage avec String.format
         System.out.println(
            String.format
             ("Ce programme a été crée par  %s et est en version %d daté du %s ",author,version, date)
            );

        System.out.println(author.charAt(3));
        System.out.println((int)author.charAt(3));
    }}
    }}
