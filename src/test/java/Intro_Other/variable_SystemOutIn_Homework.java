package Intro_Other;
import java.util.Scanner;

public class variable_SystemOutIn_Homework {
    public static void main(String[] args) {
//    Task 1 — İstifadəçi məlumatları
//        - İstifadəçidən aşağıdakı məlumatları soruş:
//        - Ad
//        - Soyad
//        - Yaş
//        - Haralısan
//        - Sonra aşağıdakı formatda çap et:
//
//        --- İstifadəçi Məlumatı ---
//        Ad: Abbas
//        Soyad: Rzayev
//        Yaş: 37
//        Yer: Nachivan

//        Task 2 — İki ədədin cəmi
//        İstifadəçidən 2 ədəd al soruş
//        Onların cəmini hesabla və çap et

        //Task 1 həlli
        System.out.println(" Adınızı daxil edin: ");
        Scanner ad = new Scanner(System.in);
        String ad_cavab = ad.nextLine();
        System.out.println(" Soyadnızı daxil edin: ");
        Scanner soyad = new Scanner(System.in);
        String soyad_cavab = soyad.nextLine();
        System.out.println(" Yaşınızı daxil edin: ");
        Scanner yas = new Scanner(System.in);
        int yas_cavab = yas.nextInt();
        System.out.println(" Doğum yerinizi daxil edin: ");
        Scanner dogum = new Scanner(System.in);
        String dogum_cavab = dogum.nextLine();
        System.out.println(ad_cavab + soyad_cavab + yas_cavab + dogum_cavab);

        //Task 2 həlli
        System.out.println(" Ilk ədədi daxil edin: ");
        Scanner birinci_eded = new Scanner(System.in);
        int birinci_eded_cavab = birinci_eded.nextInt();
        System.out.println(" Ikinci ədədi daxil edin: ");
        Scanner ikinci_eded = new Scanner(System.in);
        int ikinci_eded_cavab = ikinci_eded.nextInt();
        int cem = birinci_eded_cavab + ikinci_eded_cavab;
        System.out.println(cem);


    }
}