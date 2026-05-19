package Lesson_05_Decision_Making;

public class lesson_05_02_Short_Hand_Ternary_Operator {
    public static void main(String[] args) {
        //! Ternary - Operator: if-else in bir setirlik qisa yazilishidir.
        //Sintaksin: deyishen = (shert) ? true_olarsa : false_olarsa;

//        int time = 20;
//
//        String netice = (time < 18) ? "Welcome" : "Exit";

        int x = 10;
        String result;

        if (x > 5) {
            System.out.println("Boyukdur");
        } else {
            System.out.println("Kicikdir");
        }

        String sum = (x > 5) ? "Boyukdur" : "Kicikdir";
        double qiymet = (x == 10) ? 99.99 : 150.0;

    }
}