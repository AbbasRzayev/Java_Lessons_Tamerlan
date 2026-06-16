package Lesson_06_Loops;

import java.util.Scanner;

public class lesson_06_07_homework {
    public static void main(String[] args) {

//        Lesson_06: Loops (Dövr Operatorları) — Kompleks Ev Tapşırıqları

//        Bu tapşırıqlar həm dövr operatorlarını (`for`, `while`, `do-while`, `foreach`, `nested`),
//        həm də keçmiş dərslərdə öyrəndiyiniz **String manipulyasiyaları** və **Decision Making (if-else/switch)**
//        mövzularını birlikdə tətbiq etmək üçün hazırlanmışdır.
//        Qızıl Qayda:** Bütün tapşırıqlarda dataları dinamik olaraq `Scanner` ilə istifadəçidən alın!


//        lesson_06_01_for (5 Tapşırıq)
//        1. **Sadə Ədəd Çapı (Ən Sadə):** Konsoldan bir limit ədədi (`int limit`) daxil edin. `for` dövrü vasitəsilə 1-den başlayaraq həmin limitə qədər olan bütün ədədləri yan-yana ekrana çap edin.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "");
        } */

//        2. **Ad Təkrarı (Ən Sadə):** Konsoldan istifadəçinin adını (String) və bir təkrar sayını (`int count`) alın. `for` dövrü ilə həmin adı daxil edilən sayı qədər ekrana alt-alta yazdırın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Adnızı daxil edin: ");
        String name = sc.nextLine();
        System.out.println("Təkrar sayını yaz: ");
        int replay = sc.nextInt();
        for (int i = 0; i < replay; i++) {
            System.out.println(name);
        } */

//        3. **Dinamik Toplama:** Konsoldan əvvəlcə bir limit ədədi (`int limit`) alın. Sonra `for` dövrü yaradaraq 1-dən başlayaraq həmin limitə qədər olan ədədləri toplayın, amma yalnız 3-ə və ya 5-ə tam bölünən ədədləri cəmə əlavə edin.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Rəqəm daxil edin: ");
        int limit = sc.nextInt();
        int cem = 0;
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                cem+=i;
            }
            System.out.println("1-dən " + limit + "-ə qədər 3-ə və ya 5-ə tam bölünən ədədlərin cəmi: " + cem);
        } */

//    ??  4. **Şifrə Təhlükəsizlik Validasiyası:** Konsoldan bir şifrə daxil edilməsini istəyin. `for` dövrü ilə şifrənin hər bir simvolunu tək-tək yoxlayın. Əgər şifrədə ən azı bir rəqəm varsa ekrana `"Şifrə təhlükəsizdir"`, yoxdursa `"Şifrədə rəqəm olmalıdır"` yazın.

//    ??  5. **Tərs Mətn (Reverse String):** Konsoldan daxil edilən hər hansı bir sözü `for` dövrünü geriyə doğru (`i--`) işlədərək tərsinə çevirin və konsola yazdırın.

//        lesson_06_02_while_loop (4 Tapşırıq)
//        6. **Düzgün Şifrə Tapılana Qədər:** Sistemdə bir gizli şifrə təyin edin (məs: `"QA2026"`). `while` dövrü ilə istifadəçidən şifrə istəyin. İstifadəçi düzgün şifrəni daxil edənə qədər proqram dayanmadan yenidən şifrə istəsin. Düzgün yazanda `"Sistemə daxil olundu"` desin.
        /* Scanner sc = new Scanner(System.in);
        String gizliSifre = "QA2026";
        String daxilEdilen = "";
        while (!daxilEdilen.equals(gizliSifre)) {
            System.out.println("Şifrəni yazın: ");
            daxilEdilen = sc.nextLine();
            if (!daxilEdilen.equals(gizliSifre)) {
                System.out.println("Yanlış şifrə,yenidən yoxla");
            }
        }
        System.out.println("Sistemə daxil olundu "); */

//      7. **Rəqəmlərin Cəmi:** Konsoldan çoxrəqəmli bir ədəd alın (məsələn: 543). `while` dövrü və riyazi operatorlar (`%` və `/`) vasitəsilə həmin ədədin rəqəmlərinin cəmini tapın (5 + 4 + 3 = 12).
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Rəqəm daxil edin: ");
        int number = sc.nextInt();
        int cem = 0;
        while (number > 0) {
            int qaliq = number % 10;
            cem += qaliq;
            number /= 10;
        }
        System.out.println(cem); */

//     8. **Mətn təmizləmə (QA Ssenarisi):** Konsoldan davamlı olaraq mətnlər qəbul edin. Əgər daxil edilən mətnin tərkibində boşluqlar varsa, `.trim()` edib ekrana yazdırın. İstifadəçi konsola `"exit"` yazdıqda dövrü dayandırın.
        /* Scanner sc = new Scanner(System.in);
       while (true) {
           System.out.println("Mətn daxil edin: ");
           String metn = sc.nextLine();
           if (metn.equals("exit")) {
               System.out.println("Dövrü dayandırdınız");
               break;
           } else {
               System.out.println("Təmiz mətn: " + metn.trim());
           }
       } */

//     9. **Dinamik Axtarış Ssenarisi:** Bir `int saygac = 1` yaradın. Konsoldan hər dəfə bir söz alın. Əgər sözün daxilində `"error"` ifadəsi keçirsə (`.contains()`), dövrü dayandırın və neçənci addımda xəta tapıldığını çap edin.
        /* Scanner sc = new Scanner(System.in);
        int saygac = 1;
        while (true){
            System.out.println("Söz daxil edin: ");
            String soz = sc.nextLine();
            if(soz.contains("error")){
                System.out.println(" Dövrü dayandırdınız " + saygac);
                break;
            }else {
                System.out.println("Təkrar mətn daxil edin: " + soz);
                saygac++;
            }
        } */

//       lesson_06_03_do_while (4 Tapşırıq)
//        10. **ATM Menu Ssenarisi:** `do-while` istifadə edərək ekrana 3 seçimli menu çıxarın: `1. Balans`, `2. Pul çıxarma`, `3. Çıxış`. İstifadəçi 3 daxil edənə qədər hər əməliyyatdan sonra menu yenidən qarşına çıxsın.
       /* Scanner sc = new Scanner(System.in);
        int secim;
        do {
            System.out.println("--- ATM MENYU ---");
            System.out.println("1. Balans");
            System.out.println("2. Pul çıxarma");
            System.out.println("3. Çıxış");
            System.out.print("Zəhmət olmasa bir seçim edin: ");
            secim = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Balansnızda 100$ var");
                    break;
                case 2:
                    System.out.println("Çıxarmaq istədiyiniz məbləği daxil edin: ");
                    break;
                    case 3:
                        System.out.println("Sistemdən çıxış edilir");
                        break;
                        default:
                            System.out.println("Səhv seçim etdiniz");
                            break;
            }
        } while (secim != 3);
        System.out.println("Bizi seçdiyiniz üçün təşəkkür edirik :)");

    }
} */


//        11. **Məhdud Giriş Cəhdi:** İstifadəçiyə sistemə daxil olmaq üçün 3 cəhd haqqı verin. `do-while` daxilində hər dəfə istifadəçi adı və şifrə soruşun. Səhv daxil etdikdə cəhd haqqını azaldın. Cəhd bitdikdə və ya şifrə düz olduqda dövr dayansın.
        /* Scanner sc = new Scanner(System.in);
        String ad = " ";
        String parol = "";
        int cehd = 3;
        do {
            System.out.println("İstifadəçi adını daxil edin: ");
            System.out.println("Parolu daxil edin: ");
            ad = sc.nextLine();
            parol = sc.nextLine();
            if (ad.equals("admin") && parol.equals("12345")) {
                System.out.println("Sistemə daxil oldunuz");
                break;
            }else {
                System.out.println("Ad vəya parol yanlışdır");
                cehd --;
            }
        } while (cehd > 0);
        if (cehd == 0) {
            System.out.println("İstifadə limitini bitirdiniz");
        }

        }
        } */

//        12. **Müsbət Ədədlərin Filtri:** `do-while` daxilində davamlı olaraq konsoldan ədədlər alın və toplayın. İstifadəçi mənfi ədəd daxil etdiyi an dövr dayansın və mənfi ədədə qədər olan müsbət ədədlərin cəmini göstərsin.
        /* Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Müsbət ədədlərin toplanması");
        System.out.println("Dövrü dayandırmaq üçün mənfi ədəd daxil edin");
        do {
            System.out.println("Rəqəm daxil edin: ");
            number = sc.nextInt();
          if (number >= 0) {
              System.out.println("Toplam");
              sum += number;
          }else {
              System.out.println("Menfi ədəd daxil etdiniz");
          }
        }while (number >= 0 );
        System.out.println("Mənfi ədəd daxil edərək dövrü dayandırdınız");
        System.out.println("Toplam ədədlərin cəmi: " + sum);
        }
        } */

//        13. **Minimum 1 Simvol Tələbi:** İstifadəçidən adını daxil etməsini istəyin. Əgər istifadəçi heç bir şey yazmadan Enter sıxıbsa (yəni `.isEmpty()` true-dursa), `do-while` vasitəsilə ondan mütləq ən azı 1 simvollu ad yazmasını tələb edin.
        /* Scanner sc = new Scanner(System.in);
        String ad;
        System.out.println("Qeydiyyat sistemi ");
        do {
            System.out.println("Adınızı daxil edin:");
            ad = sc.nextLine();
            if (ad.trim().isEmpty()) {
                System.out.println("Ad sahəsi boş buraxıla bilməz! Ən azı 1 simvol yazın");
            }
        }while (ad.trim().isEmpty());
        System.out.println("Təbrik edirik! Adınız uğurla qeydə alındı: " + ad);
        }
        } */

//      lesson_06_04_foreach (4 Tapşırıq)
//        14. **Brauzer Yoxlanışı (QA):** Bir String massivi yaradın və içinə fərqli brauzer adları qoyun (`{"chrome", "FIREFOX", "  edge  ", "Safari"}`). `foreach` dövrü ilə hamısını oxuyun, hər birini `.trim().toLowerCase()` edərək ekrana vahid formatda çıxarın.
       /* String[] brauzerler = {"chrome", "FIREFOX", "  edge  ", "Safari"};
        for (String b : brauzerler) {
            String temizlenmisBrauzer = b.trim().toLowerCase();
            System.out.println(temizlenmisBrauzer);
        }
    }
} */

//        15. **Uğurlu Testlərin Sayı:** Ssenarilərin nəticələrini saxlayan bir String massivi yaradın (`{"PASSED", "FAILED", "PASSED", "PASSED", "SKIPPED"}`). `foreach` ilə keçid edərək neçə testin `"PASSED"` olduğunu sayın və faiz göstəricisini tapın.
        /* String[] ssenari = {"PASSED", "FAILED", "PASSED", "PASSED", "SKIPPED"};
        int umumiTest = ssenari.length;
        int passedTest = 0;
        for (String s : ssenari) {
        if (ssenari.equals("PASSED")) {
        passedTest ++;
        }
        }
        double ugurluFaiz = ((double) passedTest / umumiTest) *100;
        System.out.println("Ümumi icra olunan test: " + umumiTest);
        System.out.println("Passed testlərin sayı: " + passedTest);
        System.out.println("Ugurlu faiz: " + ugurluFaiz);
        }
    } */

//        16. **Email Validasiyası:** Sistemdə mövocud olan fərqli emaillərdən ibarət bir massiv yaradın. `foreach` ilə bütün emailləri gəzin və daxilində `"@gmail.com"` olanları ekrana çıxarın, olmayanlar üçün xəta mesajı yazdırın.
        /* String[] emailler = {"eli@gmail.com", "veli@outlook.com", "pirveli@yahoo.com", "xoren@mail.com"};
        System.out.println("Gmail yoxlanışı");
        for (String email : emailler) {
           if (email.toLowerCase().contains("@gmail.com")) {
               System.out.println("Uğurlu gmail hesabı " + email);
           }else {
               System.out.println(email + " bu gmail hesabı deyil");
           }
        }
        }
    } */

//        17. **Qiymət Endirimi:** Layihədə məhsulların qiymətlərini saxlayan bir `double[]` massivi daxil edin. `foreach` ilə bütün qiymətləri yoxlayın, əgər qiymət 100-dən böyükdürsə ona 20% endirim tətbiq edib yeni qiymətini konsola yazın.
        /* double[] qiymetler = {45.5, 120.0, 80.0, 250.5, 99.9};
        System.out.println("100AZN yuxarı məhsullara 20% endirim");
        for (double qiymet : qiymetler) {
            if (qiymet > 100) {
                double yeniQiymet = qiymet * 0.8;
                System.out.printf("Köhnə qiymət: % AZN - 20% Endirimli qiymət: AZN", qiymet, yeniQiymet);
            } else {
                System.out.printf("Bu məhsula endirim düşmür. Qiymət: AZN", qiymet);
            }
        }
    }
} */

//       lesson_06_05_break (3 Tapşırıq)
//        18. **İlk Uğursuz Testdə Dayandır (QA):** Test addımlarını saxlayan bir massiv təyin edin. `for` dövrü daxilində addımları yoxlayın. Əgər massivdə `"FAILED"` sözünə rast gəlinsə, ekrana `"Test yarımçıq kəsildi!"` yazdırın və `break` ilə dövrü dərhal dayandırın.
        /* String[] addimlar = {"PASSED", "PASSED", "FAILED", "PASSED"};
        for (String addim : addimlar) {
            if (addim.equals("FAILED")) {
                System.out.println("Test yarımçıq kəsildi " + addim);
                break;
            }System.out.println("Addım icra olundu " + addim);

            }
        }

        } */

//        19. **Rəqəm Axtarışı:** Konsoldan bir mətn alın. `for` dövrü ilə mətnin daxilində gəzin, qarşınıza çıxan **ilk rəqəmi** tapan kimi dövrü sındırın (`break`) və həmin rəqəmi ekrana çıxarın.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Konsola mətn girin: ");
        String konsol = sc.nextLine();
        System.out.println("Axtarış başladıldı");
        for (int i = 0; i < konsol.length(); i++) {
        char simvol = konsol.charAt(i);
        if(Character.isDigit(simvol)) {
            System.out.println("Mətndə ilk rəqəm: " + simvol);
            break;
        }
            System.out.println("Yoxlanıldı (Hərf/Simvol): " + simvol);
        }
        System.out.println("Proqram başa çatdı.");
        }
    } */

//        20. **Sonsuz Dövr Qırılması:** `while(true)` daxilində istifadəçidən sözlər alın. Əgər istifadəçi bir-birinin ardınca tamamilə eyni olan iki söz daxil edərsə, `break` operatoru ilə dövrü dayandırın.
/* Scanner sc = new Scanner(System.in);
        String evvelkiSoz = "";
        while (true){
            System.out.println("Söz daxil edin: ");
           String indikiSoz = sc.nextLine();
           if(indikiSoz.equals(evvelkiSoz)){
               System.out.println("Təkrar söz daxil etdiniz,bye bye");
               break;
           }evvelkiSoz = indikiSoz;
        }
        }
        } */

//   lesson_06_06_continue (3 Tapşırıq)
//    21. **Xətalı Sətirləri Ötür:** Bir mətn massivi yaradın. `foreach` dövrü daxilində əgər mətnin dəyəri `null` və ya boşluqdırsa (`.isEmpty()`), `continue` istifadə edərək onu ötürün, digər mənalı mətnləri konsola yazdırın.
        /*  String[] metnler = {"Salam", null, "Java", "", "QA Automation"};
        for (String m : metnler) {
      if (m == null || m.isEmpty()) {
          continue;
      }
      System.out.println("Mənalı mətn: " + m);
        }
        }
    } */

//    22. **Sait Hərfləri Bloklamaq:** Konsoldan bir söz alın. `for` dövrü vasitəsilə sözün hər bir hərfinə baxın. Əgər hərf saitdirsə (a, e, i, o, u), `continue` ilə onu çap etmədən növbəti hərfə keçin (Beləcə sözün yalnız samitləri çap olunacaq).
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Söz daxil edin: ");
        String soz = sc.nextLine();
        for (int i = 0; i < soz.length(); i++) {
char herf = soz.charAt(i);
            if (herf == 'a' || herf == 'e' || herf == 'i' || herf == 'o' || herf == 'u') {
            continue;
            }
            System.out.println(herf);
        }
        }
    } */

//    23. **Xüsusi Rəqəmlərin Ötürülməsi:** 1-dən 20-yə qədər ədədləri `for` ilə fırladın. Əgər ədəd həm 3-ə, həm də 5-ə tam bölünürsə (və ya sadəcə 7-dirsə), `continue` istifadə edərək onu çap etməyin, qalan ədədləri ekrana çıxarın.
               /* System.out.println("1-dən 20-yə qədər ədədlərin çapı");
                System.out.println("(7 və həm 3-ə, həm 5-ə bölünən ədədlər ötürülür)");
                for (int i = 1; i <= 20; i++) {
                    if ((i % 3 == 0 && i % 5 == 0) || i == 7) {
                        continue;
                    }
                    System.out.println(i + "");
                }
                System.out.println("Proqram uğurla başa çatdı.");
            }
        } */

//    lesson_06_06_nested (2 Tapşırıq)
//    24. **Multi-Browser Test Ssenarisi (QA):** * Xarici dövrdə brauzerlərin adları dövr etsin: `"Chrome"`, `"Firefox"`.
//    * Daxili dövrdə isə test ssenarilərinin adları dövr etsin: `"LoginTest"`, `"PaymentTest"`.
//    * Konsolda çıxış bu formatda olmalıdır: `"[Chrome] işlədilir: LoginTest"`, `"[Chrome] işlədilir: PaymentTest"` və s.
        /* String[] browsers = {"Chrome", "Firefox"};
        String[] tests = {"LoginTest", "PaymentTest"};
        for (String browser : browsers) {
            for (String test : tests) {
                System.out.println(browser + "+  işlədilir: " + test);
            }
        }
    }
} */

//    25. **Ulduzlarla Düzbucaqlı:** Konsoldan sətir (`int row`) və sütun (`int col`) sayını alın. İç-içə `for` dövrləri vasitəsilə konsola ulduzlardan (`*`) ibarət düzbucaqlı bir matrix forması çap edin.
        Scanner sc = new Scanner(System.in);
        System.out.print("Sətir sayını daxil edin (row): ");
        int row = sc.nextInt();
        System.out.print("Sütun sayını daxil edin (col): ");
        int col = sc.nextInt();
        System.out.println(" Nticə' ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

