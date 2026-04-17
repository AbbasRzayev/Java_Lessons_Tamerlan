package Lesson_04_String_Manipulation;

public class lesson_04_04_Substring {
    public static void main(String[] args) {
        //! Hisse hisse kesme - substring()
        // Metnin mueyyen bir parcasini kesib goturur.

        String nameSurname = "Tamerlan Huseynov";
        System.out.println(nameSurname.substring(9));

        //substring(bashlagic,son)
        System.out.println(nameSurname.substring(1,8));

        // Menfi index olmaz
        System.out.println(nameSurname.substring(-1)); // Xeta

        //Son uzunluqdan boyuk ola bilmez
        System.out.println(nameSurname.substring(0,50)); // Xeta
    }
}