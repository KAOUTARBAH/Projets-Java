public class Table{
    public static void main (String[] args){

        /*
            // Attention, les n° de case sont les indexs (0 à n) //
            1. Créer un Array d'entiers contenant les valeurs 5, 87, -20, 17, -9 et 25
            2. Afficher les cases 3 et 5
            3. Ajouter à la case 3, la valeur de la case 0
            4. Soutraire à la case 5 la valeur de la case 3
            5. Afficher les cases 3 et 5
            6. Multiplier la case 2 par la valeur de la case 4
            7. Afficher la case 2
        */

        int[] my_array ={5, 87, -20, 17, -9, 25};
        System.out.println(my_array [3]);
        System.out.println(my_array [5]);
        my_array[3] += my_array[0];
        //my_array[5] -= my_array[3];
        my_array[5] = my_array[5] - my_array[3];
        System.out.println(my_array [3]);
        System.out.println(my_array [5]);

        my_array[2] *= my_array[4];
        System.out.println(my_array [2]);

        //Structure For
        for(int i = 0; i<my_array.length;i++){
             System.out.println("l'indexe " +i+ " la valeur " +my_array [i]);
             
        }

        //Structure Foreach
        for(int val_array : my_array){
            System.out.println(val_array);
        }

        int i=0;
        while(i < my_array.length){
            i++; 
            //System.out.println(i);
            System.out.println("l'indexe " +i+ " la valeur " +my_array [i]);
        }

       /**
       // 1
        int[] mon_array = { 5, 87, -20, 17, -9, 25 };

        // 2
        System.out.println( "Case 3 : " + mon_array[3] );
        System.out.println( "Case 5 : " + mon_array[5] );

        // 3
        mon_array[3] += mon_array[0] ;
        // mon_array[3] = mon_array[3] + mon_array[0] ;

        // 4
        mon_array[5] -= mon_array[3];

        // 5
        System.out.println( "Case 3 : " + mon_array[3] );
        System.out.println( "Case 5 : " + mon_array[5] );

        // 6
        mon_array[2] *= mon_array[4];

        // 7
        System.out.println( "Case 2 : " + mon_array[2] );
        */


       /*
        int[] ma_table ={1, 24, 67, 9, 18};
        int[] ma_table2 =new int[6];
        ma_table[0]=3;
        ma_table[1]=0;
        ma_table[2]=7;
        ma_table[3]=8;

        System.out.println(ma_table[2]);
        System.out.println(ma_table.length);
        System.out.println(ma_table2.length);
        */
    }
}