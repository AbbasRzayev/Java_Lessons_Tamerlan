package Lesson_04_String_Manipulation;

public class lesson_04_05_IndexOf_Contains {
    public static void main(String[] args) {
        //! Axtarish - indexOF() / contains()

        String example = "STLC testing life";

        //indexOf - movqe qaytarir, tapilmasa -1

        System.out.println(example.indexOf('C'));// indexsi qaytarir 4
        System.out.println(example.indexOf("STLC"));// indexsi qaytarir 1
        System.out.println(example.indexOf("testing"));// indexsi qaytarir 6
        System.out.println(example.indexOf("a"));// indexsi qaytarir -1

        //Contains - true/False
        System.out.println(example.contains("life"));// true
        System.out.println(example.contains("hard"));// false
    }
}