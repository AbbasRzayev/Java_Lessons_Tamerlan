package Lesson_04_String_Manipulation;

public class lesson_04_06_StartsWith_EndsWith {
    public static void main(String[] args) {
        //! Başlanğıc / Son yoxlama - startWith() | endsWith()
        String url = "https://google.com";
        String file = "report_2024.pdf";

        //!StartWith()
        System.out.println(url.startsWith("https")); //true
        System.out.println(url.startsWith("http://")); //false
        System.out.println(url.startsWith(".com")); //false

        //!EndsWith()
        System.out.println(file.endsWith(".pdf")); //true
        System.out.println(file.endsWith(".xlsx")); //false
        System.out.println(file.endsWith("report")); //false
    }
}