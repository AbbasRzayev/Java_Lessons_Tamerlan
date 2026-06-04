package Lesson_06_Loops;

public class lesson_06_06_continue {
    public static void main(String[] args) {
         //! continue - Novbetine kec
        //! cari iterasiyani atlayib kecir

        for (int i = 1; i <=10; i ++) {
            if (i % 2 !=0) {
                continue;
            }
            System.out.println(i);
        }

        String[] adlar = {"Jason", "Stathon", "", "Tamerlan"};

        for(String ad : adlar) {
            if(ad.isEmpty()) {
                continue;
            }
            System.out.println(ad);
        }
    }
}
