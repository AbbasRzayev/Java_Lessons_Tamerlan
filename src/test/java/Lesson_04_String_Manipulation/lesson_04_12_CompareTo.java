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

        //!13. .equals() - Muqaise metodu
        // Iki metni bir bir ile muqaise edir ve neticede boolen (true va ya false) qaytarir
        //  Java stringler == ile deyil, mehz bu metodla muqasie etmek tovsiye olunur
        // Xususiyeti: Boyuk ve kicik herlere qarshi hessasdir. (Case-sensitive)


        String s1 = "Java";
        String s2 = "java";

        boolean same = s1.equals(s2);
        System.out.println("berberdir:" + same); //

        String e = "Hello";
        String d = "Hello";
        String c = "hello";

        System.out.println(e.equals(d)); // true
        System.out.println(e.equals(c)); // false
        System.out.println(e.equalsIgnoreCase(c)); //true

    }
}