package Lesson_03_Operators;

public class lesson_03_08_Homework {
    public static void main(String[] args) {

//        1.ArifmetikTest:
        System.out.println("----- Arifmetik tapşırığın cavabı -----");

        int mehsulQiymeti = 120;
        int endirimFaizi = 20;
        int qazanc = 10;
        int adet = 3;

        // 1. Endirim miqdarini hesabla (mehsulunQiymet * endirimFaizi / 100)
        // 2. Qazanc hesabla (mehsulunQiymet * qazanc / 100)
        // 3. Yekun qiymeti hesabla (mehsulunQiymet - endirimFaizi + qazanc)
        // 4. 3 adet ucun umumi mebleg (yekun qiymet * adet)
        // 5. 120 tam bolunurmu 7-ye? (qaliq operator ile yoxla)
        // Hamısını ekrana yaz

        //Arifmetik tapşırığın cavabı
        int endirimMigdari= mehsulQiymeti*endirimFaizi/100;
        System.out.println(" Endirim miqdarı: " + endirimMigdari);
        int qazancHesabla=mehsulQiymeti*qazanc/100;
        System.out.println(" Qazanc hesabı: " + qazancHesabla);
        int yekunQiymet=mehsulQiymeti+endirimFaizi+qazanc;
        System.out.println(" Yekun Qiymət: " + yekunQiymet);
        int ucEdedQiymet=yekunQiymet*adet;
        System.out.println(" Üç ədəd üçün ümumi məbləğ: " + ucEdedQiymet);
        int tamBolunme=120%7;
        boolean cavab = tamBolunme==0;
        System.out.println(" Tam Bolunme: " + cavab);
        System.out.print("---------------------------------");
        System.out.println("\nEndirim miqdarı: " + endirimMigdari + "\n Qazanc: " + qazancHesabla + "\n Yekun Qiymət: " + yekunQiymet + ("\n Üç ədəd üçün ümumi məbləğ: " + ucEdedQiymet + "\n Tam Bolunme: " + cavab ));



        System.out.println("\n ----- Tapşırıq 1 cavabı -----");
//        2.Comparison
//        Tapshiriq - 1
//        İki tələbənin balını müqayisə et:
        int bal1 = 85;
        int bal2 = 92;
        int kecidBali = 60;

        // Netice her zaman true ya false olacaq — ekrana yaz
        // 1. bal1, bal 2-den boyukdurmu?
        // 2. bal1 kecid Balindan boyuk ve ya barbeberdir?
        // 3. bal2 kecid Balindan boyukdurmu?
        // 4. iki balin biri-birine berbaberliyi
        // 5. iki balin ferqliliyi
        // Hamısını ekrana yaz

        //1 tapşırığın cavabı
        boolean muqayiseIkiTelebe = bal1 > bal2;
        System.out.println(" Bal 1 Bal 2-dən böyükdür mü? " + muqayiseIkiTelebe);
        boolean birinciKecidMuqayise = bal1 >= kecidBali;
        System.out.println("Bal 1 keçid balından böyük vəya bərabərdir mi? " + birinciKecidMuqayise);
        boolean ikinciKecidMuqayise = kecidBali > bal2;
        System.out.println("Bal 2 keçid balından böyükdür mü? " + ikinciKecidMuqayise);
        boolean ikiBalBeraber = bal1 == bal2;
        System.out.println("İki bal bir-birinə bərabərdir mi? " + ikiBalBeraber);
        boolean ikiBalFergli=bal1 != bal2;
        System.out.println("İki bal fərqlidir mi? " + ikiBalFergli);
        System.out.println("------------------------");
        System.out.println("\n1. Bal 1 Bal 2-dən böyükdür mü? " + muqayiseIkiTelebe  + "\n 2. Bal 1 keçid balından böyük vəya bərabərdir mi? " + birinciKecidMuqayise + " \n 3. Bal 2 keçid balından böyükdür mü? " + ikinciKecidMuqayise + "\n 4. İki bal bir-birinə bərabərdir mi? " + ikiBalBeraber + "\n 5. İki bal fərqlidir mi? " + ikiBalFergli);


        System.out.println("\n ----- Tapşırıq 2-nin cavabı -----");
        //Tapshiriq - 2
        int maas = 5000;
        int minMaas = 3000;
        int maxMaas = 8000;
        double qiymet = 99.99;
        double endirimliQiymet = 79.99;

        // 1. maas minMaas-dan boyukdurmu?
        boolean muqayiseMinMaas= maas > minMaas;
        System.out.println(" Maaş minumum maaşdan böyükdür mü? : " + muqayiseMinMaas);                    // ?

        // 2. maas maxMaas-a barbeberdir?
        boolean maxMaasberaber = maas == maxMaas;
        System.out.println(" Maaş maksimum maaşa bərabərdir?: " + maxMaasberaber);                   // ?

        // 3. qiymet endirimliQiymet-den boyukdurmu?
        boolean endirimQiymetiMuqayise = qiymet > endirimMigdari;
        System.out.println(" Qiymət endirimli qiymətdən böyükdür mü?: " + endirimQiymetiMuqayise);          // ?

        // 4. maas minMaas ile maxMaas arasindadirmi?
        boolean arasindaMinmaasMaxmaas = maas >= minMaas && maas <= maxMaas;
        System.out.println(" Maaş minumum ilə maksimum arasındadır mı?: " + arasindaMinmaasMaxmaas);// ?

        // 5. endirimliQiymet qiymet-den az VE ya barbeberdir?
        boolean endirimliQiymetVeya= endirimliQiymet <qiymet || endirimliQiymet==qiymet;
        System.out.println(" Endirimli qiymət qiyətdən az vəya bərabərdir mi?: " + endirimliQiymetVeya);         // ?




//        3.Logical
        //Tapshiriq - 1
//        Sayta giriş şərtlərini yoxla:
        boolean istifadeciVar = true;
        boolean sifreDogrudu = false;
        boolean adminDir = true;
        boolean hesabAktivdir = true;

        // Netice her zaman true ya false olacaq — ekrana yaz
        // 1. Giris ucun: istifadeciVar VE sifreDogrudu
        // 2. Tam giris ucun: (istifadeciVar VE sifreDogrudu) VE hesabAktivdir
        // 3. Admin paneli ucun: adminDir VE hesabAktivdir
        // 4. sifre yanlishdir — NOT ile yoxla
        // 5. adminDir deyil VE YA sifreDogrudu — netice?

        //Tapshiriq - 2
        int yas = 20;
        double maash = 3500.0;
        boolean aktivDir = true;
        boolean admiNDir = false;

        // Yas 18-den boyuk VE maas 3000-den boyukdurmu?
        System.out.println(yas > 18 && maash > 3000);          // ?

        // aktivDir VE YA adminDir?
        System.out.println(aktivDir || admiNDir);              // ?

        // adminDir deyil VE aktivDir?
        System.out.println(!admiNDir && aktivDir);             // ?

        // yas 25-den kicik VE maas 4000-den kicik VE aktivDir?
        System.out.println(yas < 25 && maash < 4000 && aktivDir); // ?

        // (yas 18-den boyuk VE aktivDir) VE YA adminDir?
        System.out.println((yas > 18 && aktivDir) || admiNDir);   // ?



//        4.Assignment
//        Oyunçunun xallarını idarə et:

        int xal = 100;
        // Her addimdan sonra xali ekrana yaz
        // 1. xal += 25  → xal = ?
        // 2. xal -= 10  → xal = ?
        // 3. xal *= 2   → xal = ?
        // 4. xal /= 3   → xal = ?
        // 5. xal %= 7   → xal = ?



//            5.Increment_Decrement
//            Əvvəlcə kağızda hesabla, sonra run et:

        //Tapshiriq 1
        int a = 10;
        //run etmeden cavabi yaz
        System.out.println(++a);   // cavab: ?
        System.out.println(a++);   // cavab: ?
        System.out.println(a);     // cavab: ?
        System.out.println(--a);   // cavab: ?
        System.out.println(a--);   // cavab: ?
        System.out.println(a);     // cavab: ?

        //Tapshiriq 2
        int c = 3;
        int b = 7;

        System.out.println(++c);      // men dushunirem: ?
        System.out.println(b--);      // men dushunirem: ?
        System.out.println(c);        // men dushunirem: ?
        System.out.println(b);        // men dushunirem: ?
        System.out.println(c++ + b);  // men dushunirem: ?
        System.out.println(c);        // men dushunirem: ?

    }
}