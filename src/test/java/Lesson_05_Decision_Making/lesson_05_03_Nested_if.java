package Lesson_05_Decision_Making;

public class lesson_05_03_Nested_if {
    public static void main(String[] args) {

        //if blokun incde bashqa if olasidir - Nested

        String istifadeciADi = "Admin";
        String shifre = "Admin";
        boolean hesabAktiv = true;
        if(istifadeciADi.equals("admin"))
        {
            if(shifre.equals("1234")){
                if(hesabAktiv) {

                    System.out.println("Welcome, Admin");
                }
                else{
                    System.out.println("Hesab aktiv deyil");
                }
            }
        }
        if(istifadeciADi.equals("AdminS")) {
            System.out.println("Test");
        }
        else
        {
            System.out.println("Istifadeci tapilmadi");
        }
    }
}