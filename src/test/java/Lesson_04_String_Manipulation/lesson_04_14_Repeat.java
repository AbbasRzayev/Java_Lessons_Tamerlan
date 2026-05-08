package Lesson_04_String_Manipulation;

import com.sun.tools.javac.Main;

public class lesson_04_14_Repeat {
    public static void main(String[] args) {
        //! repeat(count) - tekrar ucun istifade edilir (countla tekrarin sayi mueyyen edilir)
        //Numune:

        String word = "Java";
        String theSame = word.repeat(3);
        System.out.println(theSame); // JavaJavaJava

    }
}