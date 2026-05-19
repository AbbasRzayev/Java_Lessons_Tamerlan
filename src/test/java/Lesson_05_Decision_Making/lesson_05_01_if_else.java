package Lesson_05_Decision_Making;

public class lesson_05_01_if_else {
    public static void main(String[] args) {

        //! Proqramlashdirmada şərt strukturları - dogru(true) və ya false olmasından aslı olaraq fərqli kod blockları icra edilir.
        //! Şərt true olduqda blok işləyirç false oluqda keçir
        //1. if Strukturu
        //Nümunə:

        int age = 32;
        if (age >= 20)
        {
            System.out.println("Ugurlu");
        }

        //2. else Strukturu

        int bal = 45;

        if(bal >= 50 )
        {
            System.out.println("Imtahanda kecdininz");
            }
        else
        {
            System.out.println("Kecmediniz");
        }

        //else if stukturu

        int temperature = 25;

        if(temperature > 30)
        {
            System.out.println("hava istidir");
        }
        else if (temperature >= 20)
        {
            System.out.println("Hava normaldi");
        }
        else {
            System.out.println("hava soyuqdur");
        }
    }
}