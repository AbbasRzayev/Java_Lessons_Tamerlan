package Lesson_04_String_Manipulation;

public class lesson_04_02_UpperCase_LowerCase {
    public static void main(String[] args) {
        //! 2. Böyük/Kiçik hərf - toUpperCase() / toLowerCase()
        //Herf Registerini deyishmek:

        String example = "Qa Automation";

        System.out.println(example.toUpperCase()); // QA AUTOMATION
        System.out.println(example.toLowerCase()); // qa automation
        System.out.println(example); //Qa Automation
        
        String nameChange = example.toUpperCase();
        String nameChange2 = nameChange.toLowerCase();
        System.out.println("example = " + example);
        System.out.println("nameChange = " + nameChange);
        System.out.println("nameChange2 = " + nameChange2);
    }
}