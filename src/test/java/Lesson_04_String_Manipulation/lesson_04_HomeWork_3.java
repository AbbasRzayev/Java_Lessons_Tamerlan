package Lesson_04_String_Manipulation;

public class lesson_04_HomeWork_3 {
    public static void main(String[] args) {
//        1. `.equals()` (Müqayisə) — 5 Tapşırıq
//        1. İki String dəyişəni yaradın ("Apple" və "apple") və onların bərabərliyini `.equals()` ilə yoxlayın.
//        2. İstifadəçidən bir şifrə daxil etməsini istəyin və həmin şifrənin "Admin123" olub-olmadığını yoxlayın.
//        3. Bir mətnin həm `trim()` edildikdən sonrakı halını, həm də orijinal halını özü ilə müqayisə edin.
//        4. "Java" sözünü bir dəyişəndə saxlayın, digər dəyişəndə isə "JAVA".toLowerCase() yazın. Bu iki dəyişənin bərabərliyini yoxlayın.
//        5. Boş bir String (`""`) ilə digər bir boş String-in bərabərliyini yoxlayın.

//        2. `valueOf()` / `parseInt()` (Çevirmələr) — 5 Tapşırıq
//        1. "500" String-ini tam ədədə (int) çevirin və üzərinə 100 gəlib nəticəni çap edin.
//        2. `double` tipli 15.99 qiymətini `String.valueOf()` ilə mətnə çevirin.
//        3. İki String rəqəmi ("10" və "20") `parseInt()` edərək toplayın.
//        4. "true" mətni verilib. Onu `Boolean.valueOf()` ilə boolean-a çevirin və nəticəni çap edin.
//        5. Bir `int` dəyişənini String-ə çevirib, onun uzunluğunu (`length()`) çap edin.

//        3. `repeat(count)` (Təkrar) — 5 Tapşırıq
//        1. Ekranda ulduzlardan ibarət 30 simvolluq bir xətt çəkin (`*`).
//        2. "Gözəl " sözünü 3 dəfə təkrar edərək bir cümlə yaradın.
//        3. Bir boşluq simvolunu (`" "`) 10 dəfə təkrar edib uzunluğunu yoxlayın.
//        4. Öz adınızı 5 dəfə yan-yana çap edin.
//        5. Test hesabatını ayırmaq üçün `"="` simvolunu 15 dəfə təkrar edib sonuna "TEST START" sözünü əlavə edin.

//        4. `charAt(int index)` (Simvol tapma) — 5 Tapşırıq
//        1. "Automation" sözünün ilk hərfini çap edin.
//        2. "Developer" sözünün 3-cü indeksindəki simvolu tapın.
//        3. Öz adınızın sonuncu hərfini `length() - 1` düsturu ilə tapın.
//        4. "12345" mətninin tam ortasındakı rəqəmi `charAt()` ilə götürün.
//        5. "Java" sözünün 0-cı və 3-cü indeksindəki hərflərini çap edin.

//        5. `.replaceAll()` — 20 Tapşırıq (Regex)
//        1. `"2024-05-08"` tarihindəki bütün `-` işarələrini `/` ilə əvəz edin.
//        2. `"Qiymət: 100 AZN"` mətnindəki bütün rəqəmləri silin (boşluqla əvəz edin).
//        3. `"User123_Pass456"` mətnindəki bütün hərfləri silin, yalnız rəqəmlər qalsın.
//        4. Mətndəki bütün boşluqları alt-xətt (`_`) ilə əvəz edin.
//        5. `"Maaş: 2500.50"` mətnindəki nöqtəni vergüllə əvəz edin.
//        6. Bir cümlədəki bütün "a" hərflərini "e" hərfi ilə əvəz edin.
//        7. `"Admin@123!"` mətnindəki bütün xüsusi simvolları (rəqəm və hərflərdən başqa hər şeyi) silin.
//        8. `"1 2 3 4 5"` mətnindəki boşluqları silərək bitişik rəqəmlər halına salın.
//        9. `"test1, test2, test3"` mətnindəki vergülləri nöqtəli vergüllə (`;`) əvəz edin.
//        10. Bir mətndəki bütün böyük hərfləri ulduz (`*`) simvolu ilə əvəz edin.
//        11. `"I like Python. Python is cool."` cümləsindəki bütün "Python" sözlərini "Java" ilə əvəz edin.
//        12. Kart nömrəsinin (`"4169 1234 5678 9012"`) ilk 12 rəqəmini `*` ilə maskalayın.
//        13. Mətndəki bütün yeni sətir (`\n`) simvollarını boşluqla əvəz edin.
//        14. `"A B  C   D"` mətnindəki çoxlu boşluqları (birdən çox olanları) tək boşluğa endirin.
//        15. Bir cümlənin sonundakı nida işarəsini sual işarəsi ilə əvəz edin.
//        16. `"Error 404, Error 500"` mətnindəki "Error" sözlərini "Problem" sözünə çevirin.
//        17. Mətndəki bütün kiçik hərfləri silin.
//        18. `"ID_#9988_Test"` mətnindəki `#` və `_` işarələrini silin.
//        19. `"Sentyabr, Oktyabr, Noyabr"` mətnindəki ayları nömrələrlə (09, 10, 11) əvəz edin.

    }
}