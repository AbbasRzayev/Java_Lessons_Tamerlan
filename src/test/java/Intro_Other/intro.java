package Intro_Other;
import java.util.Scanner;

/*
Java 1991-ci ildə James Gosling və onun komandası (Green Team) tərəfindən Sun Microsystems-də yaradılıb.
əvvəlcə adı 'Oak' (Palıd) olub, sonra isə içdikləri qəhvənin şərəfinə 'Java' qoyublar.
2010-cu ildən bəri Java Oracle-a məxsusdur. Java-nın əsas hədəfi məişət texnikası üçün sadə və təhlükəsiz bir dil olmaq idi,
amma o, korporativ sistemlərin və avtomatlaşdırmanın mərkəzinə çevrildi.*/

/*
Kompilyator nədir?”
“Biz kodu insan dili kimi yazırıq (Java), amma kompüter bunu başa düşmür.”
“Kompilyator — bizim yazdığımız kodu kompüterin başa düşdüyü dilə çevirir.
 “Java code → Compiler → Machine code”*/

/*Sən yazırsan        →    Kompilyator       →    JVM
  (.java)                (javac)                (.class)
 Human dili          Java Bytecode          Maşın işlədir*/

//“Kompüter kodu necə oxuyur?”
//“Yuxarıdan aşağıya, sətir-sətir oxuyur.
//“Java heç vaxt ortadan başlamır — həmişə yuxarıdan aşağı”

//Addım 1 — Kompilyasiya (javac)
//javac sənin Java kodunu Bytecode-a çevirir. Bu hələ maşın dili deyil — aralıq bir dildir.

//Addım 2 — JVM işləyir (java)
//JVM həmin Bytecode-u götürüb sənin sisteminin maşın dilinə çevirir və işlədir.

//“IDE (Integrated Development Environment) — proqram yazmaq, yoxlamaq və işlətmək üçün istifadə olunan tam inkişaf mühitidir.”
//“IntelliJ IDEA — Java üçün ən güclü IDE-lərdən biridir və JetBrains şirkəti tərəfindən hazırlanıb.”

public class intro {
    public static void main(String[] args) {

//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.print("Hello World");
//        System.out.print("Hello World");

     /*    Single-line comments start with two forward slashes (//).

     // This is a comment    (hotkey: ctrl+ /)
    System.out.println("Hello World");

    Multi-line comments start with *//* and ends with *//*.  -  (hotkey: ctrl+shift+ /)
    Any text between *//* and *//* will be ignored by Java.
         *//* The code below will print the words Hello World
    to the screen, and it is amazing *//*
    System.out.println("Hello World");*/

        System.out.println("Imtahndan nece kecdi?"); //System out
        Scanner klaviatura = new Scanner(System.in);
        String cavab = klaviatura.nextLine(); //System in
        System.out.println("Sizin imtahan aciqlamasi: " + cavab);

    }
}
