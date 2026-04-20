package Lesson_03_Operators;

public class lesson_03_07_Bitwise {
    public static void main(String[] args) {
        //! Bitwise opertaları proqramlaşdırmaının "atom" seviyeesidir.
        // Eger indiye qeder biz reqemlerle tam olaraq ishdiyirdikse Bitwise operatlari reqemin daxiline
        // girir ve onu teshkil eden 0 ve 1-lerle (bitlerle) manipulasiya edir

        //Bit səviyyəsində əməliyyatlar üçündür
        int a = 5;    // binary: 0101
        int b = 3;    // binary: 0011

        System.out.println(a & b);    // 1  — AND
        System.out.println(a | b);    // 7  — OR
        System.out.println(a ^ b);    // 6  — XOR
        System.out.println(~a);       // -6 — NOT
        System.out.println(a << 1);   // 10 — sola sürüşdür
        System.out.println(a >> 1);   // 2  — sağa sürüşdür
    }
}