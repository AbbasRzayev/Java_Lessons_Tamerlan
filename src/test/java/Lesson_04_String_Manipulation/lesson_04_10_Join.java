package Lesson_04_String_Manipulation;

public class lesson_04_10_Join {
    public static void main(String[] args) {
        //! 10. Join birleshdirir

        String name = "Tamerlan";
        String surname = "Huseynov";
        String qa = "Automation";

        String nameSurname = String.join(" ",name,surname);
        System.out.println(nameSurname);
        
        String day = "29";
        String month = "04";
        String year = "2026";
        
        String calendar = String.join("/",day,month,year);
        System.out.println("calendar = " + calendar);
        String calendar2 = String.join(".",day,month,year);
        System.out.println("calendar2 = " + calendar2);
    }
}