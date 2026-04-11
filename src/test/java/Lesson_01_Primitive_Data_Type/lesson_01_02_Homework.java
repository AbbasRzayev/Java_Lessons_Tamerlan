package Lesson_01_Primitive_Data_Type;

public class lesson_01_02_Homework {
    public static void main(String[] args) {

        //Birinci tapşırıq - Hər 8 tipi burda yaz
        // byte, short, int, long, float, double, boolean, char
        //ekrana cixard


        //İkinci tapşırıq - Aşağıdakı dəyişənləri düzgün primitiv tip ilə elan et:
        // 1. Məhsulun qiyməti: 29.99
        // 2. Stokdakı məhsul sayı: 250
        // 3. Məhsulun mövcudluğu: true
        // 4. Məhsul kodunun ilk hərfi: 'A'
        // 5. Ümumi satış miqdarı: 9999999999
        // 6. Endirim faizi: 12.5


        //Nümunə:
        //double qiymet = 19.22;
        //Ekrana çap
        //System.out.println("Qiymət: " + qiymet);

        //Task həlli
        double mehsulun_qiymeti = 15.75;
        System.out.println(" Məhsulun qiyməti " + mehsulun_qiymeti);
        int mehsulun_sayi = 250;
        short mehsulun_sayi2 = 250;
        System.out.println("Məhsulun sayi " + mehsulun_sayi);
        System.out.println("Məhsulun sayi 2 " + mehsulun_sayi2);
        boolean mehsulun_movcudlugu = true;
        System.out.println("Məhsulun movcudlugu " + mehsulun_movcudlugu);
        char ilk_herf = 'A';
        System.out.println("Ilk herf " + ilk_herf);
        long satis_miqdari = 9999999999l;
        System.out.println("Satis miqdari " + satis_miqdari);
        float endirim = 12.5f;
        System.out.println("Endirim " + endirim);
    }
}