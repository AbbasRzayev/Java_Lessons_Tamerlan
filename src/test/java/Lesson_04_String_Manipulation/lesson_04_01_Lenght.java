package Lesson_04_String_Manipulation;

public class lesson_04_01_Lenght {
    public static void main(String[] args) {
        //! Java-da String simvollarin (char) ardiciliqindan ibaret ola bir Class ve Obyektdir.

        String name = "Tamerlan";
        String email = "tamerlan@gmail.com";
        String password = "test1234";

        //String primitiv deyil - Classdır. Primitiv deyerleri saxliyir.
        //String - obyektdir, metodlari var


        //! 1. Uzunluq - length()
        // Metndeki herf sayini qaytarir - Metinin nece simvoldan ibaret oldugunu qaytarir

        name.length();
        System.out.println(name.length());
        System.out.println("email = " + email.length());
        System.out.println("password = " + password.length());

        String none = " ";
        System.out.println(none.length());

    }
}