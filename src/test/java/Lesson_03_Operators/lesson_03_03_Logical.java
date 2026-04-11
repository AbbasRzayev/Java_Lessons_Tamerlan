package Lesson_03_Operators;

public class lesson_03_03_Logical {
    public static void main(String[] args) {

        //! 3.Mentiqi operatorlar (Logical)
        //Bir nece sherti birleshdirmek ucun istifade olunur:

        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // && - "AND" her ikisi true olmalidi
        System.out.println(a || b); // || OR biri true olsa kecir
        System.out.println(!b);  //tersi Yeni a nin icindekinin tersine bax. true idise false ve ya eksine false idise true.

        boolean isButtonEnabled = false; // Duyme aktiv deyil

        if (!isButtonEnabled){
            System.out.println("Test kecdi Duyme heqiqetende  sonuludur");
        }

        //Numune
        boolean istifadeciVar = true;
        boolean sifreDogrudu = false;

        if(istifadeciVar && sifreDogrudu){
            System.out.println("Girish ugurludur" );
        }
        else {
            System.out.println("Girish ugursuzdur");
        }
    }
}