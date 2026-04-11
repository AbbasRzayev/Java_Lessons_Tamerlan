package Lesson_03_Operators;

public class lesson_03_04_Assignment {
    public static void main(String[] args) {
        //! 4. Menimsetme opratorlari (Assignment)
        //Deyishene deyer menimsetmek ucun istifade olunur:

        int a = 10; //menisetme
        int b = 10; //menisetme
        int c = 10; //menisetme
        double d = 10; //menisetme
        double e = 10; //menisetme

        a += 5; // a = a + 5   (15)
        System.out.println("a = " + a);

        b -= 3; // b = b - 3 (7)
        System.out.println("b = " + b);

        c *= 2; // c = c * 2 (20)
        System.out.println("c = " + c);

        d /= 4; // d = d / 4 (2)
        System.out.println("d = " + d);

        e %= 4; // e = e % 4 (2)
        System.out.println("e = " + e);
    }
}