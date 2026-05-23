package Lesson_05_Decision_Making;

public class lesson_05_06_homework {
    public static void main(String[] args) {
//        `if_else` və `if-else-if` — 5 Tapşırıq
//        1. Müsbət/Mənfi yoxlanışı: Konsoldan bir tam ədəd (`int`) qəbul edin. Əgər ədəd 0-dan böyükdürsə `"Müsbət"`, kiçikdirsə `"Mənfi"`, 0-a bərabərdirsə `"Sıfır"` çap edin.
//        2. İmtahan keçid statusu: Konsoldan tələbənin imtahan balını (`int`) alın. Əgər bal 51-ə bərabər və ya böyükdürsə ekrana "Təbriklər, keçdiniz!", azdırsa "Təəssüf, kəsildiniz!" yazdırın.
//        3. Sürət Həddi: Avtomobilin sürətini konsoldan daxil edin. Sürət 60-dan kiçik və ya bərabərdirsə `"Normal"`, 60-90 arasıdırsa `"Ehtiyatlı ol"`, 90-dan çoxdursa `"Sürət həddi aşıldı! Cərimə"` yazın.
//        4. Mətn uzunluğu validasiyası: Konsoldan bir şifrə yazılmasını istəyin. Əgər şifrənin uzunluğu (`length()`) 8-dən kiçikdirsə `"Şifrə çox qısadır"`, əks halda `"Şifrə qəbul olundu"` çap edin.
//        5. Ən böyük ədəd: Konsoldan 3 fərqli ədəd daxil edin və `if-else` köməyi ilə onlardan ən böyüyünü tapıb konsola yazdırın.

//        Short Hand Ternary Operator — 5 Tapşırıq
//        (Bu tapşırıqları mütləq tək sətirdə `? :` operatoru ilə yazın)*
//        6. İmtahan keçid statusu: Tələbənin balını konsoldan alın. Bal 51 və ya daha çoxdursa `"Keçdi"`, azdırsa `"Kəsildi"` sözünü Ternary ilə bir dəyişənə mənimsədib çap edin.
//        7. Böyük hərf/Kiçik hərf yoxlanışı: `int` tipli dəyişənə konsoldan dəyər verin. Əgər ədəd cütdürsə, bir String dəyişənini `"CÜT"`, təkdirsə `"tək"` halına gətirin.
//        8. Bir boolean `isTestFailed` dəyişəninə konsoldan `true/false` dəyəri alın. Ternary vasitəsilə əgər true-dursa `"Test uğursuz oldu"`, false-dursa `"Test uğurla keçdi"` yazdırın.
//        9. Mütləq Dəyər (Absolute Value):Daxil edilən mənfi və ya müsbət ədədi Ternary operatoru ilə həmişə müsbətə çevirib çap edin (Məsələn: `-5` daxil edilsə `5` çıxsın).
//        10.İstifadəçi tipi: Konsoldan gələn rəqəm `1`-dirsə dəyişənə `"Admin"`, fərqlidirsə `"User"` mənimsədin.

//        Nested `if` (İç-içə If) — 5 Tapşırıq
//        11.Kinoteatr bilet endirimi:  Konsoldan istifadəçinin yaşını (`int`) və tələbə olub-olmadığını (`boolean` - `isStudent`) alın. Əgər yaşı 18-dən kiçikdirsə, daxili `if` ilə yoxlayın: əgər tələbədirsə ekrana "Bilet pulsuzdur", deyilsə "Bilet 5 AZN". Yaşı 18 və daha çoxdursa birbaşa "Bilet 10 AZN" yazın.
//        12. Sistemə Giriş: Konsoldan `username` və `password` alın. Əgər username `"admin"`dirsə, daxildə password-u yoxlayın: password `"123"`sə `"Sistemə xoş gəldiniz"`, səhvdirsə `"Şifrə yalnışdır"`. Username səhvdirsə birbaşa `"İstifadəçi tapılmadı"` çap edin.
//        13. Veb-element kliklənməsi: Konsoldan iki boolean dəyər alın: `isElementDisplayed` və `isElementEnabled`. Əgər element ekranda görünürsə (`true`), daxildə kliklənə bilən olub-olmadığını yoxlayın. Aktivdirsə `"Elementə klikləndi"`, deyilsə `"Element bloklanıb"`. Ekranda görünmürsə birbaşa `"Error: Element tapılmadı"`.
//        14. Sayt qeydiyyatı : Konsoldan istifadəçinin yaşını (`int`) və yaşadığı ölkəni (String `country`) alın. Əgər yaş 18-dən böyükdürsə, daxildə ölkəni yoxlayın: ölkə "Azərbaycan"dırsa "Qeydiyyat uğurludur", fərqlidirsə "Xidmət bu ölkədə aktiv deyil". Yaş 18-dən kiçikdirsə birbaşa "Yaşınız çatmır" yazın.
//        15. Hava Nəqliyyatı (Baqaj yoxlanışı): Konsoldan baqajın çəkisini (`int`) alın. Çəki 20 kq-dan çoxdursa, əlavə ödəniş büdcəsini soruşun: Büdcə 50 AZN-dən çoxdursa `"Uçuşa icazə var"`, azdırsa `"Çəki çoxdur və büdcə yetmir"`. Çəki 20-dən azdırsa birbaşa `"Problem yoxdur"`.

//        Logical Operators (`&&`, `||`, `!`) — 5 Tapşırıq
//        16. İstirahət Günü Validasiyası: Konsoldan günün adını String olaraq alın. Əgər gün `"Şənbə"` və ya `"Bazar"`dırsa `"İstirahət günüdür"`, digər günlərdirsə `"İş günüdür"` yazın (`||` istifadə edin).
//        17. Təqaüd Şərtləri: Tələbənin yaşını (`int`) və ortalama balını (`double`) soruşun. Yaş 25-dən kiçik və bal 85-dən böyükdürsə `"Təqaüd qazandınız"`, əks halda `"Şərtlər ödənmir"` yazın (`&&` istifadə edin).
//        18. Daxil olma limiti: Konsoldan `int` tipli bir ədəd alın. Bu ədədin 10 ilə 50 arasında (10 və 50 də daxil olmaqla) olub-olmadığını tək bir `if` daxilində yoxlayın.
 //       19. Şifrə və Təkrar şifrə bərabərliyi:  Konsoldan `password1` və `password2` adlı iki String alın. Əgər hər iki şifrə eynidirsə və şifrənin uzunluğu 5-dən böyükdürsə ekrana "Şifrə yeniləndi", əks halda "Şifrələr uyğun deyil və ya çox qısadır" yazın.
//        20. Giriş İcazəsi :Konsoldan istifadəçinin rolunu (String) və abunəlik statusunu (boolean - `isActive`) alın. Rol `"VIP"` və ya abunəlik `true`-dursa, ekrana `"Kontentə giriş icazəsi var"` yazdırın.

//        `switch_case` — 5 Tapşırıq
//        21. Kalkulyator: Konsoldan iki ədəd (`double`) və bir simvol (char `+`, `-`, `*`, `/`) alın. `switch-case` vasitəsilə simvola uyğun riyazi əməliyyatı icra edib nəticəni çap edin.
//        22. Ayın adları: Konsoldan 1-dən 12-yə qədər bir rəqəm alın. `switch-case` ilə həmin rəqəmə uyğun gələn ayın adını çap edin (Məsələn: 1 -> "Yanvar"). `default` halında `"Yanlış ay nömrəsi"` yazın.
//        23. Brauzer Seçimi: Konsoldan testin işləyəcəyi brauzer adını (String `browser`) alın.
//    * `"chrome"` -> `"Chrome driver başladılır..."`
//    * `"firefox"` -> `"Firefox driver başladılır..."`
//    * `"edge"` -> `"Edge driver başladılır..."`
//    * `default` -> `"Error: Dəstəklənməyən brauzer!"`
//
//        24. **Həftə içi / Həftə sonu:** Konsoldan 1-7 arası gün nömrəsi alın. 1, 2, 3, 4, 5 halları üçün ortaq bir mesaj `"Həftə içi"`, 6 və 7 üçün `"Həftə sonu"` çap edin (`break` məntiqini düzgün qruplaşdıraraq).
//        25. **Qiymətləndirmə hərfləri: Konsoldan 'A', 'B', 'C', 'D', 'F' hərflərindən birini alın.
//    * `'A'` -> `"Əla"`
//    * `'B'` -> `"Yaxşı"`
//    * `'C'` -> `"Kafi"`
//    * `'F'` -> `"Kəsildiniz"`
//    * `default` -> `"Yanlış hərf"`.
    }
}
