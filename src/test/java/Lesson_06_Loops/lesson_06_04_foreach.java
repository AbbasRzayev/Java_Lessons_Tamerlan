package Lesson_06_Loops;

public class lesson_06_04_foreach {
    public static void main(String[] args) {
        //! Maasivler (array) ve Kolleksiyalar daxildeki elementleri index sirasi ile bashda
        //! sona qeder oxumaq ucun istidade olunan en tehlukesiz ve qisa dovr novudur
        //!Indeks saygacina (i++) ehtiyac qalmir

        //for(dataTipi element : massivinAdi)
//        {
//             element ile gorulecek ishler
//        }

        String[] browsers = {"Chrome","FireFox", "Edge", "Safari"};

        for(String browser : browsers)
        {
            System.out.println("Test edilen brazuer: " + browser);
        }

        String[] languages = {"Java","Pyton", "C#", "JS"};

        for(String language : languages)
        {
            System.out.println(language);
        }

        int[] numbers = {10, 20 , 30, 40 , 50};

        int sum = 0;
        for (int num : numbers)
        {
            sum += num;
        }
        System.out.println("sum" + sum); //150
    }
}