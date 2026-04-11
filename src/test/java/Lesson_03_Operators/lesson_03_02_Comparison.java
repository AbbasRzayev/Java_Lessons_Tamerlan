package Lesson_03_Operators;

public class lesson_03_02_Comparison {
    public static void main(String[] args) {

        //!2. Muqaise operatorlari (Comparison)
        //!Iki deyeri muqaise edir ve netice hemishe boolen-dir

        int a = 10;
        int b = 10;

        System.out.println(a == b); //false - beraberdir?
        System.out.println(a != b); //true - beraber deyil?
        System.out.println(a > b);  //true - boyukdur?
        System.out.println(a < b);  //false - kicikdir?
        System.out.println(a >= b); //true - böyük və ya bərabər?
        System.out.println(a <= b); //false - kicik və ya bərabər?

        //Numune

        double expected = 29.99;
        double actual = 29.99;
        System.out.println(expected == actual); // true test kecdi
        System.out.println(expected != actual);
        System.out.println(expected >= actual);
        System.out.println(expected <= actual);

    }
}