package Lesson_06_Loops;

public class lesson_06_01_for {
    public static void main(String[] args) {
        //! Loop - eyni kodu defelerle tekrar icra etmeye imkan verir.

        System.out.println("Salam1");
        System.out.println("Salam2");
        System.out.println("Salam3");
        System.out.println("Salam4");
        System.out.println("Salam5");

        for(int i =1; i <=5; i++)
        {
            System.out.println("salam" + i);
        }


        //! Java-da Loop novleri:
        // 1. for loop
        // 2. while loop
        // 3. do-while loop
        // 4. for-each loop
        // 5. break
        // 6. continue
        // 7. Nested loop (ic-ice)

        //! for loop
        //Terif: Dovrun nece defe firlanacagi evvelceden deqiq bilinirse - for istifade edilir
        //Uc qisme bolunur: bashlangic deyer, Shert ve Artim/Azalma

        //for(bashlangic_deyer; shert;artim-azalim)
        // {tekrarlanan kod}
        for(int i =3; i <=5; i++)
        {
            System.out.println("Tamerlan" + i);
        }

        //Geriya sayma
        for(int i = 5; i >= 1; i--)
        {
            System.out.println(i);
        }

        //2 artim
        for(int i = 0; i <= 10; i+=2)
        {
            System.out.println(i);
        }
    }
}