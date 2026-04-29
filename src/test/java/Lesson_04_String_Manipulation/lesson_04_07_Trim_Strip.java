package Lesson_04_String_Manipulation;

public class lesson_04_07_Trim_Strip {
    public static void main(String[] args) {
        //! 7. Boşluq silmə - trim() | strip()

        String sentence = "    Hello World    ";

        System.out.println(sentence.trim()); //Hello World
        System.out.println(sentence.strip());

        //! Ortadaki boşluqları silmir!

        String example = "Hello   World";
        System.out.println(example.trim()); //Hello   World
    }
}