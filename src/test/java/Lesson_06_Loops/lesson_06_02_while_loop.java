package Lesson_06_Loops;

public class lesson_06_02_while_loop {
    public static void main(String[] args) {
        //! while loop (Shertle bagli tekrarlar)
        //Shert true olduqu mudetdce ishleyir. Nece defe olacaqi evvelceden melum deyil

//        while(shert)
//        {
//         shert true olduqda ishleyir
//        }

        int count = 3;

        while(count > 0)
        {
            System.out.println("Geriye sayim" + count);
             count--; // bu olmasa dovr bitmiyecek.
        }
        System.out.println("Start!");
    }
}