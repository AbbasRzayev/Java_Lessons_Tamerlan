package Lesson_04_String_Manipulation;

public class lesson_04_12_CompareTo {
    public static void main(String[] args) {

        //!12. Muqaise - compareTo()
        // Bu metod iki metni elifba sirasina gore muqaise edir
        // Netice: int (reqem) qaytarir
        // Musbet reqem: Birinci soz elifba sirasinda daha sonra gelir
        // Menfi reqem: Birinci soz elifba sirasinda evvel gelir
        // Sifir eyni olanda

        String a = "Apple";
        String b = "Banana";

        System.out.println(a.compareTo(b));  //Menfi - a, b-den evveldir
        System.out.println(b.compareTo(a));  //musbet - b a-dan sonradir
        System.out.println(a.compareTo(a));   //0 - eynidir
        System.out.println(b.compareTo(b));   //0 - eynidir

    }
}
