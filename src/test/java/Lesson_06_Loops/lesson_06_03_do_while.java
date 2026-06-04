package Lesson_06_Loops;

public class lesson_06_03_do_while {
    public static void main(String[] args) {

        //! do-while loop (En azi 1 defe dovr ishleyecek)
        //! Evvelce ishleyir, sonra sherti yoxlayir

//         do {
//             //evvelce ishleyir
//         }
//         while(shert) // sonra yoxlayir

        int x = 7;

        do {
            System.out.println("Metn 1 defe gorunecek. X deyeri" + x);
            x++;
        }
        while(x < 5);

        //while vs do-while ferqi:
        //while - shert fasle olsa hec ishlemir
        int j = 10;
        while (j< 5)
        {
            System.out.println("while" + j);
        }

        //do-while-shert false olsa bele bir defe ishleyecek
        int b = 10;
        do  {
            System.out.println("do-while" + b);
        }
        while (b<5);
    }
}