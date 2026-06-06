package Lesson_06_Loops;

public class lesson_06_07_homework {
    public static void main(String[] args) {

//        Lesson_06: Loops (Dövr Operatorları) — Kompleks Ev Tapşırıqları

//        Bu tapşırıqlar həm dövr operatorlarını (`for`, `while`, `do-while`, `foreach`, `nested`),
//        həm də keçmiş dərslərdə öyrəndiyiniz **String manipulyasiyaları** və **Decision Making (if-else/switch)**
//        mövzularını birlikdə tətbiq etmək üçün hazırlanmışdır.
//        Qızıl Qayda:** Bütün tapşırıqlarda dataları dinamik olaraq `Scanner` ilə istifadəçidən alın!


//        lesson_06_01_for (5 Tapşırıq)
//        1. **Sadə Ədəd Çapı (Ən Sadə):** Konsoldan bir limit ədədi (`int limit`) daxil edin. `for` dövrü vasitəsilə 1-den başlayaraq həmin limitə qədər olan bütün ədədləri yan-yana ekrana çap edin.
//        2. **Ad Təkrarı (Ən Sadə):** Konsoldan istifadəçinin adını (String) və bir təkrar sayını (`int count`) alın. `for` dövrü ilə həmin adı daxil edilən sayı qədər ekrana alt-alta yazdırın.
//        3. **Dinamik Toplama:** Konsoldan əvvəlcə bir limit ədədi (`int limit`) alın. Sonra `for` dövrü yaradaraq 1-dən başlayaraq həmin limitə qədər olan ədədləri toplayın, amma yalnız 3-ə və ya 5-ə tam bölünən ədədləri cəmə əlavə edin.
//        4. **Şifrə Təhlükəsizlik Validasiyası:** Konsoldan bir şifrə daxil edilməsini istəyin. `for` dövrü ilə şifrənin hər bir simvolunu tək-tək yoxlayın. Əgər şifrədə ən azı bir rəqəm varsa ekrana `"Şifrə təhlükəsizdir"`, yoxdursa `"Şifrədə rəqəm olmalıdır"` yazın.
//        5. **Tərs Mətn (Reverse String):** Konsoldan daxil edilən hər hansı bir sözü `for` dövrünü geriyə doğru (`i--`) işlədərək tərsinə çevirin və konsola yazdırın.


//        lesson_06_02_while_loop (4 Tapşırıq)
//        6. **Düzgün Şifrə Tapılana Qədər:** Sistemdə bir gizli şifrə təyin edin (məs: `"QA2026"`). `while` dövrü ilə istifadəçidən şifrə istəyin. İstifadəçi düzgün şifrəni daxil edənə qədər proqram dayanmadan yenidən şifrə istəsin. Düzgün yazanda `"Sistemə daxil olundu"` desin.
//        7. **Rəqəmlərin Cəmi:** Konsoldan çoxrəqəmli bir ədəd alın (məsələn: 543). `while` dövrü və riyazi operatorlar (`%` və `/`) vasitəsilə həmin ədədin rəqəmlərinin cəmini tapın (5 + 4 + 3 = 12).
//        8. **Mətn təmizləmə (QA Ssenarisi):** Konsoldan davamlı olaraq mətnlər qəbul edin. Əgər daxil edilən mətnin tərkibində boşluqlar varsa, `.trim()` edib ekrana yazdırın. İstifadəçi konsola `"exit"` yazdıqda dövrü dayandırın.
//        9. **Dinamik Axtarış Ssenarisi:** Bir `int saygac = 1` yaradın. Konsoldan hər dəfə bir söz alın. Əgər sözün daxilində `"error"` ifadəsi keçirsə (`.contains()`), dövrü dayandırın və neçənci addımda xəta tapıldığını çap edin.

//       lesson_06_03_do_while (4 Tapşırıq)
//        10. **ATM Menu Ssenarisi:** `do-while` istifadə edərək ekrana 3 seçimli menu çıxarın: `1. Balans`, `2. Pul çıxarma`, `3. Çıxış`. İstifadəçi 3 daxil edənə qədər hər əməliyyatdan sonra menu yenidən qarşına çıxsın.
//        11. **Məhdud Giriş Cəhdi:** İstifadəçiyə sistemə daxil olmaq üçün 3 cəhd haqqı verin. `do-while` daxilində hər dəfə istifadəçi adı və şifrə soruşun. Səhv daxil etdikdə cəhd haqqını azaldın. Cəhd bitdikdə və ya şifrə düz olduqda dövr dayansın.
//        12. **Müsbət Ədədlərin Filtri:** `do-while` daxilində davamlı olaraq konsoldan ədədlər alın və toplayın. İstifadəçi mənfi ədəd daxil etdiyi an dövr dayansın və mənfi ədədə qədər olan müsbət ədədlərin cəmini göstərsin.
//        13. **Minimum 1 Simvol Tələbi:** İstifadəçidən adını daxil etməsini istəyin. Əgər istifadəçi heç bir şey yazmadan Enter sıxıbsa (yəni `.isEmpty()` true-dursa), `do-while` vasitəsilə ondan mütləq ən azı 1 simvollu ad yazmasını tələb edin.



//      lesson_06_04_foreach (4 Tapşırıq)
//        14. **Brauzer Yoxlanışı (QA):** Bir String massivi yaradın və içinə fərqli brauzer adları qoyun (`{"chrome", "FIREFOX", "  edge  ", "Safari"}`). `foreach` dövrü ilə hamısını oxuyun, hər birini `.trim().toLowerCase()` edərək ekrana vahid formatda çıxarın.
//        15. **Uğurlu Testlərin Sayı:** Ssenarilərin nəticələrini saxlayan bir String massivi yaradın (`{"PASSED", "FAILED", "PASSED", "PASSED", "SKIPPED"}`). `foreach` ilə keçid edərək neçə testin `"PASSED"` olduğunu sayın və faiz göstəricisini tapın.
//        16. **Email Validasiyası:** Sistemdə mövocud olan fərqli emaillərdən ibarət bir massiv yaradın. `foreach` ilə bütün emailləri gəzin və daxilində `"@gmail.com"` olanları ekrana çıxarın, olmayanlar üçün xəta mesajı yazdırın.
//        17. **Qiymət Endirimi:** Layihədə məhsulların qiymətlərini saxlayan bir `double[]` massivi daxil edin. `foreach` ilə bütün qiymətləri yoxlayın, əgər qiymət 100-dən böyükdürsə ona 20% endirim tətbiq edib yeni qiymətini konsola yazın.

//       lesson_06_05_break (3 Tapşırıq)
//        18. **İlk Uğursuz Testdə Dayandır (QA):** Test addımlarını saxlayan bir massiv təyin edin. `for` dövrü daxilində addımları yoxlayın. Əgər massivdə `"FAILED"` sözünə rast gəlinsə, ekrana `"Test yarımçıq kəsildi!"` yazdırın və `break` ilə dövrü dərhal dayandırın.
//        19. **Rəqəm Axtarışı:** Konsoldan bir mətn alın. `for` dövrü ilə mətnin daxilində gəzin, qarşınıza çıxan **ilk rəqəmi** tapan kimi dövrü sındırın (`break`) və həmin rəqəmi ekrana çıxarın.
//        20. **Sonsuz Dövr Qırılması:** `while(true)` daxilində istifadəçidən sözlər alın. Əgər istifadəçi bir-birinin ardınca tamamilə eyni olan iki söz daxil edərsə, `break` operatoru ilə dövrü dayandırın.

//   lesson_06_06_continue (3 Tapşırıq)
//    21. **Xətalı Sətirləri Ötür:** Bir mətn massivi yaradın. `foreach` dövrü daxilində əgər mətnin dəyəri `null` və ya boşluqdırsa (`.isEmpty()`), `continue` istifadə edərək onu ötürün, digər mənalı mətnləri konsola yazdırın.
//    22. **Sait Hərfləri Bloklamaq:** Konsoldan bir söz alın. `for` dövrü vasitəsilə sözün hər bir hərfinə baxın. Əgər hərf saitdirsə (a, e, i, o, u), `continue` ilə onu çap etmədən növbəti hərfə keçin (Beləcə sözün yalnız samitləri çap olunacaq).
//    23. **Xüsusi Rəqəmlərin Ötürülməsi:** 1-dən 20-yə qədər ədədləri `for` ilə fırladın. Əgər ədəd həm 3-ə, həm də 5-ə tam bölünürsə (və ya sadəcə 7-dirsə), `continue` istifadə edərək onu çap etməyin, qalan ədədləri ekrana çıxarın.

//    lesson_06_06_nested (2 Tapşırıq)
//    24. **Multi-Browser Test Ssenarisi (QA):** * Xarici dövrdə brauzerlərin adları dövr etsin: `"Chrome"`, `"Firefox"`.
//    * Daxili dövrdə isə test ssenarilərinin adları dövr etsin: `"LoginTest"`, `"PaymentTest"`.
//    * Konsolda çıxış bu formatda olmalıdır: `"[Chrome] işlədilir: LoginTest"`, `"[Chrome] işlədilir: PaymentTest"` və s.
//    25. **Ulduzlarla Düzbucaqlı:** Konsoldan sətir (`int row`) və sütun (`int col`) sayını alın. İç-içə `for` dövrləri vasitəsilə konsola ulduzlardan (`*`) ibarət düzbucaqlı bir matrix forması çap edin.

    }
}
