package Lesson_06_Loops;

public class lesson_06_05_break {
    public static void main(String[] args) {

        //Break - Loopdan cix
        //Loopun derhal daymasini temin edir

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Tapildi: " + i);
                break; // loopu dayandir
            }
            System.out.println(i);
        }

        //Shifre tapildiqda dayan

        String[] shifreler = {"1111", "2222", "1234","4444"};
        String axtarilan = "1234";

        for (String shifre : shifreler ) {

         if (shifre.contains(axtarilan))
         {
             System.out.println("Shifre tapildi: " + shifre);
             break;
         }
            System.out.println(shifre + " - uygun deyil");
        }
    }
}