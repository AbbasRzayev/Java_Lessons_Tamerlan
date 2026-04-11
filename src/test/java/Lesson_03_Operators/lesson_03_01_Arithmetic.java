package Lesson_03_Operators;

public class lesson_03_01_Arithmetic {
    public static void main(String[] args) {

        //Operator - dəyərlər üzərində əməliyyat aparan simvoldur.
        //Java-da 7 növ operator var.

        //!1.Arifmetik Operatorlar(Arithmetic) - Riyazi əməliyyatlar üçün istifadə olunur:
        int a = 10;
        int b = 3;

        System.out.println(a + b);  //13 - toplama
        System.out.println(a - b);  //7 - cixma
        System.out.println(a * b);  //30 - vurma
        System.out.println(a / b);  //3 - bolme (tam hisse)
        System.out.println(a % b);  //1 - bolme (qaliq)

       // Numune:
        int umumi = 100;
        int endirim = 20;
        int yekun = umumi - endirim;
        System.out.println("yekun = " + yekun);
    }
}