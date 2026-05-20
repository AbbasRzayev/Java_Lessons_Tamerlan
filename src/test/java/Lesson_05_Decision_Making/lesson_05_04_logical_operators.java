package Lesson_05_Decision_Making;

public class lesson_05_04_logical_operators {
    public static void main(String[] args) {
        //&& - AND (ikiside ture olmalidi)

        int age = 25;
        double salary = 4000.0;

        if (age >= 50 && salary >= 700000)
        {
            System.out.println("Maash artirilir");
        }
        else {
            System.out.println("Maash artirilmir");
        }

        // || - OR  (Biri true ols bes edir)

        boolean admin = false;
        boolean superUser = true;

        if(admin || superUser)
        {
            System.out.println("Girish ede biler");
        }
        else {
            System.out.println("Girish yoxdur");
        }


        //! - NOT(Tersi)
        boolean close = false;

        if(!close){
            System.out.println("Hesab aciqdir");
        }
        else{
            System.out.println("Hesab bagladir");
        }
    }
}