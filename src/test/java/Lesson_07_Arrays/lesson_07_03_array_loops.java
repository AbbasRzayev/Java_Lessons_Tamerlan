package Lesson_07_Arrays;

public class lesson_07_03_array_loops {
    public static void main(String[] args) {

        int[] xallar = {85, 90, 78, 92, 88};

        for (int i = 0; i < xallar.length; i++) {
            System.out.println("Xal = " + i + ": " + xallar[i]);
        }
        //Xal 0 : 85
        //Xal 1 : 90
        //Xal 2 : 78
        //Xal 3 : 92
        //Xal 4 : 88

        //Foreach
        String[] diller = {"Java", "C#", "JS" , "Pyton"};
        for( String dil : diller){
            System.out.println("Dil:" + dil );
        }
    }
}