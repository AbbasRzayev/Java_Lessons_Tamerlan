package Lesson_04_String_Manipulation;

public class lesson_04_03_Concat {
    public static void main(String[] args) {
        //! 3. Birleshdirme - concat() / +
        // Iki metni birleshdirir yapishdirir.

        String name = "Tamerlan";
        String surname = "Huseynov";
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);

        //Concat() ile
        String result = name.concat(" ").concat(surname).concat(" QA Expert");
        System.out.println("result = " + result); //Tamerlan Huseynov QA Expert

        // + ile
        String exam = name + " " + surname + " QA Expert";
        System.out.println("exam = " + exam);// Tamerlan Huseynov QA Expert

        //Reqemle birleshdirme
        int age = 35;
        System.out.println("Age:" + age); // Age:35
    }
}