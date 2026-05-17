package Lesson_04_String_Manipulation;

import java.util.Scanner;

public class lesson_04_HomeWork_3 {
    public static void main(String[] args) {
//       I. `.equals()` (Müqayisə) — 5 Tapşırıq
//        1. İki String dəyişəni yaradın ("Apple" və "apple") və onların bərabərliyini `.equals()` ilə yoxlayın.
        String alma1 = "Apple";
        String alma2 = "apple";
        boolean almalar = alma1.equals(alma2);
        System.out.println("Almalar bir-birinə bərabərdir? " + almalar);

//        2. İstifadəçidən bir şifrə daxil etməsini istəyin və həmin şifrənin "Admin123" olub-olmadığını yoxlayın.
        Scanner input = new Scanner(System.in);
        System.out.println("Şifrə daxil edin:" );
        String daxilEdilenSifre = input.nextLine();
        boolean dogrudurmu = daxilEdilenSifre.equals("Admin123");
        System.out.println("Şifrə düzgündür? " + dogrudurmu);

//        3. Bir mətnin həm `trim()` edildikdən sonrakı halını, həm də orijinal halını özü ilə müqayisə edin.
        String orjinalMetn = "  Java proqramlaşdırma  ";
        String trimEdilmisMetn = orjinalMetn.trim();
        System.out.println("Orjinal mətn: " + orjinalMetn.length());
        System.out.println("Trim edilmiş mətn: " + trimEdilmisMetn.length());
        boolean muqayise = orjinalMetn == trimEdilmisMetn;
        System.out.println("İki mətnin müqayisəsi: " + muqayise);

//        4. "Java" sözünü bir dəyişəndə saxlayın, digər dəyişəndə isə "JAVA".toLowerCase() yazın. Bu iki dəyişənin bərabərliyini yoxlayın.
        String programLanguage = "Java";
        String programLanguage2 = "JAVA".toLowerCase();
        boolean beraberlik = programLanguage.equals(programLanguage2);
        System.out.println("Bunlar bərabərdir? " + beraberlik);

//        5. Boş bir String (`""`) ilə digər bir boş String-in bərabərliyini yoxlayın.
        String empty = "";
        String empty2 = " ";
        boolean empty3 = empty.equals(empty2);
        System.out.println("Boş stringlər bərabərdir? " + empty3);

        //-----------------------------------------------------

//        II. `valueOf()` / `parseInt()` (Çevirmələr) — 5 Tapşırıq
//        1. "500" String-ini tam ədədə (int) çevirin və üzərinə 100 gəlib nəticəni çap edin.
        String num = "500";
        int deyisen = Integer.parseInt(num);
        System.out.println(deyisen + 100);

//        2. `double` tipli 15.99 qiymətini `String.valueOf()` ilə mətnə çevirin.
        double reqem = 15.99;
        String cevirme = String.valueOf(reqem);

//        3. İki String rəqəmi ("10" və "20") `parseInt()` edərək toplayın.
        String on = "10";
        String yirmi = "20";
        int change = Integer.parseInt(on) + Integer.parseInt(yirmi);

//        4. "true" mətni verilib. Onu `Boolean.valueOf()` ilə boolean-a çevirin və nəticəni çap edin.
        String musbet = "true";
        boolean change2 = Boolean.parseBoolean(musbet);
        System.out.println(change2);

//        5. Bir `int` dəyişənini String-ə çevirib, onun uzunluğunu (`length()`) çap edin.
        int yuz = 100;
        String change3 = String.valueOf(yuz);
        System.out.println("Stringin uzunlugu " + change3.length());

        //-----------------------------------------------------

//        III. `repeat(count)` (Təkrar) — 5 Tapşırıq
//        1. Ekranda ulduzlardan ibarət 30 simvolluq bir xətt çəkin (`*`).
        String ulduz = "*";
        String ulduz2 = ulduz.repeat(30);
        System.out.println(ulduz2);

//        2. "Gözəl " sözünü 3 dəfə təkrar edərək bir cümlə yaradın.
        String gozel = "Gözəl".repeat(3);
        String cumle = gozel + " bir gün keçirdik.";
        System.out.println(cumle);

//        3. Bir boşluq simvolunu (`" "`) 10 dəfə təkrar edib uzunluğunu yoxlayın.
        String bosluq = " ".repeat(10);
        System.out.println(bosluq.length());

//        4. Öz adınızı 5 dəfə yan-yana çap edin.
        String ad = "Tamerlan".repeat(5);
        System.out.println(ad);

//        5. Test hesabatını ayırmaq üçün `"="` simvolunu 15 dəfə təkrar edib sonuna "TEST START" sözünü əlavə edin.
        String beraber = "=".repeat(15);
        System.out.println(beraber + "TEST START");

        //-----------------------------------------------------

//        IV. `charAt(int index)` (Simvol tapma) — 5 Tapşırıq
//        1. "Automation" sözünün ilk hərfini çap edin.
        String avto = "Automation";
        char first = avto.charAt(0);

//        2. "Developer" sözünün 3-cü indeksindəki simvolu tapın.
        String dev = "Developer";
        char third = dev.charAt(3);

//        3. Öz adınızın sonuncu hərfini `length() - 1` düsturu ilə tapın.
        String name = "Tamerlan";
        char ich = name.charAt(name.length() - 1);

//        4. "12345" mətninin tam ortasındakı rəqəmi `charAt()` ilə götürün.
        String reqemler = "12345";
        int uzunluq = reqemler.length();
        int orta = uzunluq / 2;
        char ortaReqem = reqemler.charAt(orta);
        System.out.println("Mətnin ortasındaki rəqəm " + ortaReqem);

//        5. "Java" sözünün 0-cı və 3-cü indeksindəki hərflərini çap edin.
        String sifirUc = "Java";
        char ilkHerf = sifirUc.charAt(0);
        char ucuncuHerf = sifirUc.charAt(3);
        System.out.println("İlk hərf " + ilkHerf);
        System.out.println("Üçüncü hərf " + ucuncuHerf);

        //-----------------------------------------------------

//        V. `.replaceAll()` — 20 Tapşırıq (Regex)
//        1. `"2024-05-08"` tarihindəki bütün `-` işarələrini `/` ilə əvəz edin.
        String tarix = "2024-05-08";
        System.out.println(tarix.replaceAll("-","/"));

//        2. `"Qiymət: 100 AZN"` mətnindəki bütün rəqəmləri silin (boşluqla əvəz edin).
        String manat = "Qiymət: 100 AZN";
        System.out.println(manat.replaceAll("\\d"," "));

//        3. `"User123_Pass456"` mətnindəki bütün hərfləri silin, yalnız rəqəmlər qalsın.
        String butunHerfler = "User123_Pass456";
        System.out.println(butunHerfler.replaceAll("[a-zA-Z]", ""));

// ?        4. Mətndəki bütün boşluqları alt-xətt (`_`) ilə əvəz edin.
        String butunBosluqlar = "Salam aleykum fani dünya";
        System.out.println(butunBosluqlar.replaceAll(" ", "_"));

//        5. `"Maaş: 2500.50"` mətnindəki nöqtəni vergüllə əvəz edin.
        String maas = "Maaş: 2500.50";
        String yeniMaas = maas.replaceAll(".",",");
        System.out.println(yeniMaas);

//        6. Bir cümlədəki bütün "a" hərflərini "e" hərfi ilə əvəz edin.
        String a = "Ağacdan al rəngli almaları apardı";
        System.out.println(a.replaceAll("a", "e"));

//        7. `"Admin@123!"` mətnindəki bütün xüsusi simvolları (rəqəm və hərflərdən başqa hər şeyi) silin.
        String admin = "Admin@123!";
        System.out.println(admin.replaceAll("\\W",""));

//        8. `"1 2 3 4 5"` mətnindəki boşluqları silərək bitişik rəqəmlər halına salın.
        String bosluqMetn = "1 2 3 4 5";
        System.out.println(bosluqMetn.replaceAll(" ", ""));

//        9. `"test1, test2, test3"` mətnindəki vergülləri nöqtəli vergüllə (`;`) əvəz edin.
        String test = "test1, test2, test3";
        System.out.println(test.replaceAll(",", ";"));

//        10. Bir mətndəki bütün böyük hərfləri ulduz (`*`) simvolu ilə əvəz edin.
        String boyekHerfler = "Almalar Ləzzətli İdi";
        System.out.println(boyekHerfler.replaceAll("[A-Z]", "*"));

//        11. `"I like Python. Python is cool."` cümləsindəki bütün "Python" sözlərini "Java" ilə əvəz edin.
        String phyton = "I like Python. Python is cool.";
        System.out.println(phyton.replaceAll("Python", "Java"));

//        12. Kart nömrəsinin (`"4169 1234 5678 9012"`) ilk 12 rəqəmini `*` ilə maskalayın.
        String maska = "4169 1234 5678 9012";
        System.out.println(maska.replaceAll("\\d","*"));

//        13. Mətndəki bütün yeni sətir (`\n`) simvollarını boşluqla əvəz edin.
        String n = "o \n yaxşı \n biri \n idi";
        System.out.println(n.replaceAll("\n", ""));

//        14. `"A B  C   D"` mətnindəki çoxlu boşluqları (birdən çox olanları) tək boşluğa endirin.
        String birdenCoxBosluq = "A B  C   D";
        System.out.println(birdenCoxBosluq.replaceAll("\\s+", " "));

//        15. Bir cümlənin sonundakı nida işarəsini sual işarəsi ilə əvəz edin.
        String nida = "O əsəbidir!";
        System.out.println(nida.replaceAll("!","?"));

//        16. `"Error 404, Error 500"` mətnindəki "Error" sözlərini "Problem" sözünə çevirin.
        String problem = "Error 404, Error 500";
        System.out.println(problem.replaceAll("Error", "Problem"));

//        17. Mətndəki bütün kiçik hərfləri silin.
        String kicikHerf = "O Pisdir";
        System.out.println(kicikHerf.replaceAll("[a-z]",""));

//        18. `"ID_#9988_Test"` mətnindəki `#` və `_` işarələrini silin.
        String id = "ID_#9988_Test";
        System.out.println(id.replaceAll("#", "_"));

//        19. `"Sentyabr, Oktyabr, Noyabr"` mətnindəki ayları nömrələrlə (09, 10, 11) əvəz edin.
        String aylar = "Sentyabr, Oktyabr, Noyabr";
        String aylarReqemler = aylar.replace("Sentyabr", "09").replace("Oktyabr", "10").replace("Noyabr","11");
        System.out.println(aylarReqemler);

    }
}