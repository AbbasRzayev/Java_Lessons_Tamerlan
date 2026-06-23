package Lesson_07_Arrays;

public class lesson_07_04_array_operations {
    public static void main(String[] args) {
        //! Elementi deyishmek  "="

        String[] diller = {"Java","Pyton","SQL"};
        System.out.println( diller[1]); //Pyton

        diller[1] = "Selenium"; //Deyishdirildi
        System.out.println( diller[1]); //Selenium

        //! Maksiumu/Minumum tapmaq

        int[] ededler = {45,12,78,34,90,23};
        int max = ededler[0];
        int min = ededler[0];

        for(int eded : ededler){
            if(eded > max) max = eded;
            if(eded < min) min = eded;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
