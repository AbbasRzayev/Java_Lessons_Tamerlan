package Lesson_06_Loops;

public class lesson_06_06_nested {
    public static void main(String[] args) {
     //! Nested Loop - ice ice loop
     //! DOvrun daxilinda dovriye yazilmasidir. Outer loop ve inner loop

        for (int setir = 1; setir <= 2; setir++)
        {
            for (int sutun =1; sutun <= 3; sutun++)
                System.out.println("Setir: " + setir + " Sutun: " + sutun);
        }
        System.out.println("Finish baby");
    }
}