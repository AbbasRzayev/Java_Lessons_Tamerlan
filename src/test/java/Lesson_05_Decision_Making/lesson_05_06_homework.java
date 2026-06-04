package Lesson_05_Decision_Making;

import java.util.Scanner;

public class lesson_05_06_homework {
    public static void main(String[] args) {
//        `if_else` və `if-else-if` — 5 Tapşırıq

//        1. Müsbət/Mənfi yoxlanışı: Konsoldan bir tam ədəd (`int`) qəbul edin. Əgər ədəd 0-dan böyükdürsə `"Müsbət"`, kiçikdirsə `"Mənfi"`, 0-a bərabərdirsə `"Sıfır"` çap edin.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Rəqəm daxil edin: ");
        int number = sc.nextInt();
        if (number > 0){
            System.out.println("Daxil etdiyiniz rəqəm müsbətdir");
        } else if (number < 0) {
            System.out.println("Daxil etdiyiniz rəqəm mənfidir");
        } else {
            System.out.println("Daxil etdiyiniz rəqəm sıfırdır");
        } */

        //--------------------------------------------------------

//        2. İmtahan keçid statusu: Konsoldan tələbənin imtahan balını (`int`) alın. Əgər bal 51-ə bərabər və ya böyükdürsə ekrana "Təbriklər, keçdiniz!", azdırsa "Təəssüf, kəsildiniz!" yazdırın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("İmtahan balınızı daxil edin: ");
        int bal = sc.nextInt();
        if (bal >= 51 ){
            System.out.println("Təbriklər, keçdiniz!");
        } else {
            System.out.println("Təəssüf, kəsildiniz!");
        } */

        //--------------------------------------------------------

//        3. Sürət Həddi: Avtomobilin sürətini konsoldan daxil edin. Sürət 60-dan kiçik və ya bərabərdirsə `"Normal"`, 60-90 arasıdırsa `"Ehtiyatlı ol"`, 90-dan çoxdursa `"Sürət həddi aşıldı! Cərimə"` yazın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Avtomobilin sürətini daxil edin: ");
        int speed = sc.nextInt();
        if (speed <= 60) {
            System.out.println("Normal");
        } else if (speed > 60 && speed <= 90) {
            System.out.println("Ehtiyyatlı ol");
        }else {
            System.out.println("Sürət həddi aşıldı! Cərimə");
        } */

        //--------------------------------------------------------

//        4. Mətn uzunluğu validasiyası: Konsoldan bir şifrə yazılmasını istəyin. Əgər şifrənin uzunluğu (`length()`) 8-dən kiçikdirsə `"Şifrə çox qısadır"`, əks halda `"Şifrə qəbul olundu"` çap edin.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Şifrə daxil edin: ");
       String pasword = sc.nextLine();
        if (pasword.length() < 8) {
            System.out.println("Şifrə çox qısadır");
        }else {
            System.out.println("Şifrə qəbul olundu");
        } */

        //--------------------------------------------------------

//        5. Ən böyük ədəd: Konsoldan 3 fərqli ədəd daxil edin və `if-else` köməyi ilə onlardan ən böyüyünü tapıb konsola yazdırın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Üç fərqli ədəd daxil edin: ");
        System.out.println("Birinci ədədi daxil edin: ");
        int one = sc.nextInt();
        System.out.println("İkinci ədədi daxil edin: ");
        int two = sc.nextInt();
        System.out.println("Üçüncü ədədi daxil edin: ");
        int three = sc.nextInt();
        int maximum = one;
        if (two > maximum){
            maximum = two;
        }
        if (three > maximum){
            maximum = three;
        }
        System.out.println("Daxil edilən ən böyük rəqəm: " + maximum); */

        //--------------------------------------------------------

//        Short Hand Ternary Operator — 5 Tapşırıq
//        (Bu tapşırıqları mütləq tək sətirdə `? :` operatoru ilə yazın)*
//        6. İmtahan keçid statusu: Tələbənin balını konsoldan alın. Bal 51 və ya daha çoxdursa `"Keçdi"`, azdırsa `"Kəsildi"` sözünü Ternary ilə bir dəyişənə mənimsədib çap edin.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Tələbə balını daxil etsin: ");
        int bal = sc.nextInt();
        String puan = (bal >= 51) ? "Keçdi" : "Kəsildi";
        System.out.println("İmtahan nəticəsi: " + puan); */

//        7. Böyük hərf/Kiçik hərf yoxlanışı: `int` tipli dəyişənə konsoldan dəyər verin. Əgər ədəd cütdürsə, bir String dəyişənini `"CÜT"`, təkdirsə `"tək"` halına gətirin.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Rəqəm yazın: ");
        int number = sc.nextInt();
        String tekCut = (number % 2 == 0) ? "Rəqəm cütdür" : "Rəqəm təkdir";
        System.out.println("Daxil etdiyiniz rəqəm: " + tekCut); */

//        8. Bir boolean `isTestFailed` dəyişəninə konsoldan `true/false` dəyəri alın. Ternary vasitəsilə əgər true-dursa `"Test uğursuz oldu"`, false-dursa `"Test uğurla keçdi"` yazdırın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Dəyər daxil edin: ");
        boolean deyer = sc.nextBoolean();
        String trueFalse = deyer ? "Test uğursuz oldu" : "Test uğurlu oldu";
        System.out.println("Dəyər nəticəniz: " + trueFalse); */

//        9. Mütləq Dəyər (Absolute Value):Daxil edilən mənfi və ya müsbət ədədi Ternary operatoru ilə həmişə müsbətə çevirib çap edin (Məsələn: `-5` daxil edilsə `5` çıxsın).
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Ədəd yazın: ");
        int nomre = sc.nextInt();
        int changePositive = (nomre < 0) ? nomre * -1 : nomre;
        System.out.println("Daxil edilən ədəd: " + changePositive); */

//        10.İstifadəçi tipi: Konsoldan gələn rəqəm `1`-dirsə dəyişənə `"Admin"`, fərqlidirsə `"User"` mənimsədin.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("İstifadəçi rəqəm girsin: ");
        int nom = sc.nextInt();
        String adminUser = (nom == 1) ? "Adminsiniz" : "Usersiniz";
        System.out.println("Siz: " + adminUser); */

        //--------------------------------------------------------

//        Nested `if` (İç-içə If) — 5 Tapşırıq
//        11.Kinoteatr bilet endirimi:  Konsoldan istifadəçinin yaşını (`int`) və tələbə olub-olmadığını (`boolean` - `isStudent`) alın. Əgər yaşı 18-dən kiçikdirsə, daxili `if` ilə yoxlayın: əgər tələbədirsə ekrana "Bilet pulsuzdur", deyilsə "Bilet 5 AZN". Yaşı 18 və daha çoxdursa birbaşa "Bilet 10 AZN" yazın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı yazın: ");
        int birthday = sc.nextInt();
        System.out.println("Tələbəsiniz?: true/false");
        boolean isStudent = sc.nextBoolean();
        if (birthday < 18) {
            if (isStudent) {
                System.out.println("Bilet pulsuzdur");
            } else {
                System.out.println("Bilet 5 Azn");
            }
            }else {
            System.out.println("Bilet 10 Azn");
        } */

//        12. Sistemə Giriş: Konsoldan `username` və `password` alın. Əgər username `"admin"`dirsə, daxildə password-u yoxlayın: password `"123"`sə `"Sistemə xoş gəldiniz"`, səhvdirsə `"Şifrə yalnışdır"`. Username səhvdirsə birbaşa `"İstifadəçi tapılmadı"` çap edin.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        if (username.equals("admin")) {
            if (password.equals("123")) {
                System.out.println("Sistemə xoş gəldiniz");
            } else {
                System.out.println("Şifrə yanlışdır");
            }
        }else {
            System.out.println("İstifadəçi tapılmadı");
        } */

//        13. Veb-element kliklənməsi: Konsoldan iki boolean dəyər alın: `isElementDisplayed` və `isElementEnabled`. Əgər element ekranda görünürsə (`true`), daxildə kliklənə bilən olub-olmadığını yoxlayın. Aktivdirsə `"Elementə klikləndi"`, deyilsə `"Element bloklanıb"`. Ekranda görünmürsə birbaşa `"Error: Element tapılmadı"`.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Element ekranda görünür? true/false");
        boolean isElementDisplayed = sc.nextBoolean();
        System.out.println("Element aktivdir? true/false");
        boolean isElementEnabled = sc.nextBoolean();
        if (isElementDisplayed) {
            if (isElementEnabled) {
                System.out.println("Elementə klikləndi");
            } else {
                System.out.println("Element bloklanıb");
            }
        }else {
            System.out.println("Element tapılmadı");
        } */

//        14. Sayt qeydiyyatı : Konsoldan istifadəçinin yaşını (`int`) və yaşadığı ölkəni (String `country`) alın. Əgər yaş 18-dən böyükdürsə, daxildə ölkəni yoxlayın: ölkə "Azərbaycan"dırsa "Qeydiyyat uğurludur", fərqlidirsə "Xidmət bu ölkədə aktiv deyil". Yaş 18-dən kiçikdirsə birbaşa "Yaşınız çatmır" yazın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı yazın: ");
        int birthday = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ölkənizi yazın: ");
        String country = sc1.next();
        if (birthday > 18){
            if (country.equals("Azərbaycan")){
                System.out.println("Qeydiyyat uğurludur");
            }else {
                System.out.println("Xidmət bu ölkədə aktiv deyil");
            }
        } else {
            System.out.println("Yaşınız çatmır");
        } */


//        15. Hava Nəqliyyatı (Baqaj yoxlanışı): Konsoldan baqajın çəkisini (`int`) alın. Çəki 20 kq-dan çoxdursa, əlavə ödəniş büdcəsini soruşun: Büdcə 50 AZN-dən çoxdursa `"Uçuşa icazə var"`, azdırsa `"Çəki çoxdur və büdcə yetmir"`. Çəki 20-dən azdırsa birbaşa `"Problem yoxdur"`.
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Baqajın çəkisini daxil edin: ");
        int ceki = sc.nextInt();
        if (ceki > 20) {
            System.out.print("Baqaj çəkisi limiti keçib. Əlavə ödəniş üçün büdcənizi daxil edin (Azn): ");
            int budce = sc.nextInt();
            if (budce > 50) {
                System.out.println("Uçuşa icazə var");
            } else {
                System.out.println("Çəki çoxdur və büdcə yetmir");
            }
        } else {
            System.out.println("Problem yoxdur");
        } */

        //--------------------------------------------------------

//        Logical Operators (`&&`, `||`, `!`) — 5 Tapşırıq
//        16. İstirahət Günü Validasiyası: Konsoldan günün adını String olaraq alın. Əgər gün `"Şənbə"` və ya `"Bazar"`dırsa `"İstirahət günüdür"`, digər günlərdirsə `"İş günüdür"` yazın (`||` istifadə edin).
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Günü daxil edin: ");
        String day = sc.nextLine();
        if (day.equals("Şənbə") || day.equals("Bazar")){
            System.out.println("İstirahət günüdür");
        } else {
            System.out.println("İş günüdür");
        } */
//        17. Təqaüd Şərtləri: Tələbənin yaşını (`int`) və ortalama balını (`double`) soruşun. Yaş 25-dən kiçik və bal 85-dən böyükdürsə `"Təqaüd qazandınız"`, əks halda `"Şərtlər ödənmir"` yazın (`&&` istifadə edin).
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı yazın: ");
        int year = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Balınızı yazın: ");
        double honey = sc1.nextDouble();
        if (year < 25 && honey > 85) {
            System.out.println("Təqaüd qazandınız");
        } else {
            System.out.println("Şərtlər ödəmir");
        } */

//        18. Daxil olma limiti: Konsoldan `int` tipli bir ədəd alın. Bu ədədin 10 ilə 50 arasında (10 və 50 də daxil olmaqla) olub-olmadığını tək bir `if` daxilində yoxlayın.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Rəqəmi yazın: ");
        int nuumber = sc.nextInt();
        if (nuumber >= 10 && nuumber <= 50) {
            System.out.println("Ədəd 10 ilə 50 arasındadır");
        } else {
            System.out.println("Ədəd limitdən kənardır.");
        } */

        //       19. Şifrə və Təkrar şifrə bərabərliyi:  Konsoldan `password1` və `password2` adlı iki String alın. Əgər hər iki şifrə eynidirsə və şifrənin uzunluğu 5-dən böyükdürsə ekrana "Şifrə yeniləndi", əks halda "Şifrələr uyğun deyil və ya çox qısadır" yazın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Password 1 daxil edin ");
        String password = sc.nextLine();
        System.out.println("Password 2 daxil edin ");
        String password2 = sc.nextLine();
        if (password.equals(password2) && password.length() > 5) {
            System.out.println("Şifrə yeniləndi");
        }else {
            System.out.println("Şifrələr uyğun deyil və ya çox qısadır");
        } */

//        20. Giriş İcazəsi :Konsoldan istifadəçinin rolunu (String) və abunəlik statusunu (boolean - `isActive`) alın. Rol `"VIP"` və ya abunəlik `true`-dursa, ekrana `"Kontentə giriş icazəsi var"` yazdırın.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("İstifadəçi rolunu yaz: ");
        String musteri = sc.nextLine();
        System.out.println("Abunəlik statusunuzu girin true/false: ");
        boolean isActive = sc.nextBoolean();
        if (musteri.equals("VIP") || isActive) {
            System.out.println("Kontentə giriş icazəsi var");
        } else {
            System.out.println("Kontentə giriş icazəsi yoxdur");
        } */

        //--------------------------------------------------------

//        `switch_case` — 5 Tapşırıq
// ??       21. Kalkulyator: Konsoldan iki ədəd (`double`) və bir simvol (char `+`, `-`, `*`, `/`) alın. `switch-case` vasitəsilə simvola uyğun riyazi əməliyyatı icra edib nəticəni çap edin.
        /* Scanner sc = new Scanner(System.in);
        System.out.println("İlk ədədi gir: ");
        double num1 = sc.nextDouble();
        System.out.println("Əməliyyatı daxil edin (+, -, *, /): ");
        char emeliyyat = sc.next().charAt(0);
        System.out.println("İkinci ədədi gir: ");
        double num2 = sc.nextDouble();
        double result = 0;
        boolean error = false;
        switch (emeliyyat) {
            case '+':
                double result = num1 + num2;
                break;
                case '-':
                    result = num1 - num2;
                    break;
                    case '*':
                        result = num1 * num2;
                        break;
                        case '/':
                            result = num1 / num2;
                            break;
                            default:
                                System.out.println("Yanlış operator daxil edilib");
                                error = true;
                                break;
        } */

//        22. Ayın adları: Konsoldan 1-dən 12-yə qədər bir rəqəm alın. `switch-case` ilə həmin rəqəmə uyğun gələn ayın adını çap edin (Məsələn: 1 -> "Yanvar"). `default` halında `"Yanlış ay nömrəsi"` yazın.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Ayı rəqəmlə daxil edin ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("Yanvar");
                break;
                case 2:
                    System.out.println("Fevral");
                    break;
                    case 3:
                        System.out.println("Mart");
                        break;
                        case 4:
                            System.out.println("Aprel");
                            break;
                            case 5:
                                System.out.println("May");
                                break;
                                case 6:
                                    System.out.println("İyun");
                                    break;
                                    case 7:
                                        System.out.println("İyul");
                                        break;
                                        case 8:
                                            System.out.println("Avqust");
                                            break;
                                            case 9:
                                                System.out.println("Sentyabr");
                                                break;
                                                case 10:
                                                    System.out.println("Oktyabr");
                                                    break;
                                                    case 11:
                                                        System.out.println("Noyabr");
                                                        break;
                                                        case 12:
                                                            System.out.println("Dekabr");
                                                            break;
            default:
                System.out.println("Yanlış ay nömrəsi");
                break;
        } */

//        23. Brauzer Seçimi: Konsoldan testin işləyəcəyi brauzer adını (String `browser`) alın.
//    * `"chrome"` -> `"Chrome driver başladılır..."`
//    * `"firefox"` -> `"Firefox driver başladılır..."`
//    * `"edge"` -> `"Edge driver başladılır..."`
//    * `default` -> `"Error: Dəstəklənməyən brauzer!"`
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Browser daxil edin");
        String browser = sc.nextLine();
        switch (browser) {
            case "Chrome":
                System.out.println("Chrome driver başladılır...");
                break;
                case "Firefox":
                    System.out.println("Firefox driver başladılır...");
                    break;
                    case "Edge":
                        System.out.println("Edge driver başladılır...");
                        break;
            default:
                System.out.println("Error: Dəstəklənməyən brauzer!");
                break;
        } */

//        24. **Həftə içi / Həftə sonu:** Konsoldan 1-7 arası gün nömrəsi alın. 1, 2, 3, 4, 5 halları üçün ortaq bir mesaj `"Həftə içi"`, 6 və 7 üçün `"Həftə sonu"` çap edin (`break` məntiqini düzgün qruplaşdıraraq).
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Həftənin gününü rəqəmlə yazın: (1-7) ");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                case 2:
                    case 3:
                        case 4:
                            case 5:
                                System.out.println("Həftə içi");
                                break;
                                case 6:
                                    case 7:
                                        System.out.println("Həftə sonu");
                                        break;
            default:
                System.out.println("Belə bir gün yoxdur");
                break;
        } */

//        25. **Qiymətləndirmə hərfləri: Konsoldan 'A', 'B', 'C', 'D', 'F' hərflərindən birini alın.
//    * `'A'` -> `"Əla"`
//    * `'B'` -> `"Yaxşı"`
//    * `'C'` -> `"Kafi"`
//    * `'F'` -> `"Kəsildiniz"`
//    * `default` -> `"Yanlış hərf"`.
        Scanner sc = new Scanner(System.in);
        System.out.println("'A', 'B', 'C', 'D', 'F' hərflərindən birini yazın");
        char herf = sc.next().charAt(0);
        switch (herf) {
            case 'A':
                System.out.println("Əla");
                break;
            case 'B':
                System.out.println("Yaxşı");
                break;
            case 'C':
                System.out.println("Kafi");
                break;
            case 'F':
                System.out.println("Kəsildiniz");
                break;
            default:
                System.out.println("Yanlış hərf");
        }
    }
}