package Lesson_03_Operators;

public class lesson_03_05_Increment_Decrement {
    public static void main(String[] args) {
        //! Inkrement ve Dekrement Nedir?

        //Bu terminler sadece deyishenin deyerinin hansi istiqametde deyishdiyini bildirir.
        // Inkrement (++): Deyeri 1 vahid artirmaq demekdir.
        // a = a + 1 yazmaq evezine qisaca a++ ve ya ++a yaziriq

        // Dekrement (--) deyeri 1 vahid azaltmaq demekdir
        // a = a -1 yazmaq evezina qisaca a-- ve ya --aa

        //! Prefix ve Postfix nedir? (Emeliyyat zamani)

        // Artma ve ya azalmanin ne vaxt bash vereceyini teyin edir
        // Xususile deyiseni bashqa bir emeliyatin daxilinde istifade ederken onemlidir ( shertler, menimsetme v.s)

        //!Prefix (ön şəkilçi): ++a  və ya --a
        // İşarə dəyişəndən əvvəl gəlir
        // Qayda: Əvvəl dəyiş (artır və ya azalt) sonra istifadə et

        //Numune:

        int a = 5;
        System.out.println(a);
        System.out.println(++a); // Ekranda 6 cixacaq cunki cap etmeden evvel artirdi.


        //!Postfix (Son - shekilci): a++ ve ya a--
        // İşarə dəyişəndən sonra gəlir
        // Qayda əvvəl istifadə et (olduğu kimi) sonra dəyiş

        //Numune

        int b = 5;

        System.out.println(b);
        System.out.println(b++); // Ekrana 5 cixacaq Cunki evvel cap etdi sonra yaddashda 6 eledi
        System.out.println(b); // Indi baxsaq artiq 6 oldugunu gorerik

        //test

        int d = 5;
        int c = d++;
        System.out.println("d " + d); //5
        System.out.println("c " + c); //6

        int count = 10;
        System.out.println(++count + count++); // 22

        int x = 8;
        int y = ++x + x++ + --x;

        System.out.println("y = " + y); // 27
        System.out.println("x = " + x); // 9
    }
}