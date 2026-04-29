package Lesson_04_String_Manipulation;

public class lesson_04_11_IsEmpty_IsBlank {
    public static void main(String[] args) {
        //! 11. Bosh yoxlama - IsEmpty() | IsBlank()

        String bosh = "";
        String boshluq = "   ";
        String dolu = "Hello";

        //isEmpty - yalniz tamamile boshdursan true
        System.out.println("bososhh = " + bosh.isEmpty()); //true
        System.out.println("bluq = " + boshluq.isEmpty()); //false - bosluq var!
        System.out.println("dolu = " + dolu.isEmpty()); //false

        //isBlank - bosh ve ya boshluqlardan ibaredirse true
        System.out.println("bosh = " + bosh.isBlank()); //true
        System.out.println("boshluq = " + boshluq.isBlank()); //true
        System.out.println("dolu = " + dolu.isBlank()); //false
    }
}