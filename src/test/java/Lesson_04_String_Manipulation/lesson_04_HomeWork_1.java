package Lesson_04_String_Manipulation;

import java.util.Scanner;


public class lesson_04_HomeWork_1 {
    public static void main(String[] args) {
        //!HOMEWORK 1 — String Manipulation

//        1. Bölmə: Length (Uzunluq) — .length()
//
//        1. "Java Developer" mətninin uzunluğunu bir int dəyişəninə mənimsədin və çap edin.
//        2. İki fərqli sözün uzunluqlarının cəmini hesablayın.
//        3. "Automation" sözünün uzunluğunun tək və ya cüt olduğunu boolean (qalıq operatoru % 2 ilə) olaraq göstərin.
//        4. Boş bir String ("") yaradın və onun uzunluğunu çap edərək nəticəni görün.
//        5. Adınızın uzunluğunu tapın və həmin rəqəmi 5-ə vurun.
//        6. "  " (iki boşluq) mətninin uzunluğunu çap edin.
//        7. Adınızın uzunluğunu tapın və həmin rəqəmin kvadratını (rəqəmi özünə vurmaqla) hesablayın.
//        8. "123456789" String-inin uzunluğunun 10-a bərabər olub-olmadığını boolean olaraq yoxlayın.
//        9. İki String dəyişəninin uzunluqları arasındakı fərqi (çıxma əməliyyatı ilə) tapın.
//        10. Bir cümlənin uzunluğunun 0-dan böyük olub-olmadığını boolean ilə yoxlayın.

        //1
        String javaDevoloper = "Java Developer";
        int devUzunlug = javaDevoloper.length();
        System.out.println(devUzunlug);
        //2
        String name = "Abbas";
        String surname = "Rzayev";
        System.out.println(name.length() + surname.length());
        //3 - ?
        String ad = "Automation";
        int newName = ad.length();
        boolean deneme = newName % 2 == 0;
        System.out.println(deneme);
        //4
        String boslug = "";
        System.out.println(boslug.length());
        //5
        String adim = "Tamerlan";
        System.out.println(adim.length() * 5);
        //6
        String ikiBoslug = "     ";
        System.out.println(ikiBoslug.length());
        //7
        String adUzunlugu = "Tamerlan";
        System.out.println(adUzunlugu.length() * adUzunlugu.length());
        //8
        String reqemler = "123456789";
        int yeniReqemler = reqemler.length();
        boolean yoxlama = yeniReqemler == 10;
        System.out.println(yoxlama);
        //9
        String adFirst = "Mozambik";
        String adSecond = "Kenya";
        System.out.println(adFirst.length() - adSecond.length());
        //10
        String sifirdanBoyuk = "Bir cümlənin uzunluğunun 0-dan böyük olub-olmadığını boolean ilə yoxlayın";
        String muqayise = (sifirdanBoyuk.length() > 0) ? "Böyükdür" : "Kiçikdir" ;
        System.out.println(muqayise);


//        2. Bölmə: Upper & Lower Case — .toUpperCase(), .toLowerCase()
//
//        1. "qa engineer" mətnini tamamilə böyük hərflərə çevirib yeni bir dəyişəndə saxlayın.
        String qa = "qa engineer";
        System.out.println(qa.toUpperCase());
//        2. "Baki Səhəri" mətnini kiçik hərflərə çevirin.
        String sheher = "Baki Səhəri";
        System.out.println(sheher.toLowerCase());
        System.out.println("--------------------------------");
//        3. İstifadəçidən gələn sözün həm tam böyük, həm də tam kiçik versiyasını eyni sətirdə çap edin.
        Scanner istifadeci = new Scanner(System.in);
        String input = istifadeci.next();
        System.out.println(input.toUpperCase() + " " + input.toLowerCase());
        System.out.println("--------------------------------");
//        4. Mətnin toUpperCase() metodundan sonrakı uzunluğunu tapın (uzunluq dəyişirmi?).
        String text = "tamerlan";
        System.out.println(text.toUpperCase() + " adın uzunluğu: " + text.length());
//        5. "DATABASE" mətnini kiçik hərflərə çevirib, sonra həmin mətndə "a" hərfinin olub-olmadığını contains ilə yoxlayın.
        String database = "DATABASE";
        String kicikData = database.toLowerCase();
        System.out.println(kicikData.indexOf('a'));
//        6. "iphone 15 pro" mətnini tamamilə böyük hərflərə çevirin.
        String phoneModel = "iphone 15 pro";
        System.out.println(phoneModel.toUpperCase());
//       7. İstifadəçidən gələn adın ilk hərfini substring ilə götürün və onu böyük hərfə çevirin.
        String yeniAd = "novruz".substring(0,1);
        System.out.println(yeniAd.toUpperCase());
//        8. "JAVA" mətnini kiçik hərflərə çevirin və sonra həmin yeni mətndə "j" hərfinin olub-olmadığını yoxlayın.
        String javaMetni = "JAVA";
        String kicik = javaMetni.toUpperCase();
        System.out.println(kicik.indexOf('j'));
//?        9. "AbCdEf" mətnini kiçik hərflərə çevirin və orijinal mətnlə uzunluğunun eyni olub-olmadığını yoxlayın.
//        10. "ERROR: System failed" mesajını tamamilə kiçik hərflərə çevirib bir dəyişəndə saxlayın.
        String deyisen = "ERROR: System failed";
        String ikinciDeyisen = deyisen.toLowerCase();
        System.out.println(ikinciDeyisen);



//         3. Bölmə: Concat (Birləşdirmə) — .concat() və ya +
//
//        1. String s1 = "Manual"; və String s2 = "Testing"; dəyişənlərini .concat() metodu ilə birləşdirin.
        String s1 = "Manual";
        String s2 = "Testing";
        String result = s1.concat(" ").concat(s2);
        System.out.println("result = " + result);
//        2. Adınızı, soyadınızı və yaşınızı bir sətirdə (aralarında boşluq olmaqla) birləşdirib çap edin.
        String ad2 = "Tamerlan";
        String soyad2 = "Hüseynov";
        String yas2 = "35";
        String birleshtirme = ad2.concat(" ").concat(soyad2).concat("").concat(" ").concat(yas2);
        System.out.println(birleshtirme);
//        3. Bir mətnin sonuna .concat() ilə üç ədəd nida işarəsi (!!!) əlavə edin.
        String metn = "Hello World";
        String nida = "!!!";
        String metnSonu = metn.concat(" ").concat(nida);
        System.out.println(metnSonu);
//        4. Bir double qiymət (məs: 15.5) ilə " AZN" mətnini birləşdirin.
        double qiy = 15.5;
        System.out.println(qiy + " AZN ");
//        5. Üç fərqli şəhər adını .concat() metodunu zəncirvari (chained) şəkildə istifadə edərək bir String-də toplayın.
        String seherA = "Şəki";
        String seherB = "Bakı";
        String seherC = "İstanbul";
        String ucD = seherA.concat("-").concat(seherB).concat("-").concat(seherC);
        System.out.println(ucD);
//        6. "ID-" mətni ilə təsadüfi bir rəqəmi (məs: 550) birləşdirin.
        int reqemTes = 550;
        System.out.println(" ID: " + reqemTes );
//        7. Üç sözü ("Sürətli", "Öyrənmə", "Metodu") həm + ilə, həm də .concat() ilə birləşdirin.
        String suretli = "Sürətli";
        String ogrenme = "Öyrənmə";
        String metod = "Metodu";
        String ucBirlesme = suretli.concat(" ").concat(ogrenme).concat(" ").concat(metod);
        System.out.println(ucBirlesme);
        System.out.println(suretli + " " + ogrenme + " " + metod);
//        8. Bir şəhər adının sonuna ", Azerbaijan" mətnini əlavə edin.
        String seher = "Sheki";
        System.out.println(seher + " Azerbaijan ");
//        9. "Qiymət: " mətni ilə bir int dəyişəni birləşdirib sonuna " AZN" yazın.
        String qiymet = "Qiymət";
        int birlestirme = 35;
        System.out.println(qiymet + " " + birlestirme + " AZN ");
//        10. İki boş String-i ("") bir-birinə .concat() ilə birləşdirin və nəticəni çap edin.
        String bosBir = " ";
        String bosIki = " ";
        String ucBos = bosBir.concat("").concat(bosIki);
        System.out.println(ucBos);



//        4. Bölmə: Substring (Hissə alma) — .substring()
//        1. "Proqramlaşdırma" sözünün 0-dan 4-cü indeksinə qədər olan hissəsini kəsin.
        String programlshdırma = "Proqramlaşdırma";
        System.out.println(programlshdırma.substring(0,4));
//        2. "Software" sözünün yalnız "ware" hissəsini (4-cü indeksdən sona qədər) götürün.
        String software = "Software";
        System.out.println(software.substring(4,8));
//        3. Bir sözün ilk hərfini substring(0, 1) ilə kəsib çap edin.
        String adBir = "Fərid";
        System.out.println(adBir.substring(0,1));
//        4. "Level-Up" sözündəki tire (-) işarəsindən sonrakı hissəni götürün.
        String level = "Level-Up";
        System.out.println(level.substring(6,8));
//        5. İstifadəçinin daxil etdiyi 10 simvollu bir sözün tam ortasındakı 2 simvolu kəsib çıxarın.
        String orta = "Tamerlanda";
        System.out.println(orta.substring(4,6));
//        6. "Frontend" sözünün son 3 hərfini kəsib götürün.
        String frontend = "Frontend";
        System.out.println(frontend.substring(5,8));
//        7. "QA Automation" cümləsindən yalnız "Automation" sözünü kəsin.
        String automation = "QA Automation";
        System.out.println(automation.substring(0,2));
//        8. "0123456789" String-ində 2-ci indeksdən 7-ci indeksə qədər olan hissəni kəsin.
        String reqemle =  "0123456789";
        System.out.println(reqemle.substring(2,7));
//        ?9. Bir sözün ilk hərfini və son hərfini (uzunluqdan istifadə etməklə) substring ilə ayrı-ayrı dəyişənlərə götürün.
//        10. "Baku-2024" mətnindən yalnız ili (son 4 simvolu) kəsib götürün.
        String baku = "Baku-2024";
        System.out.println(baku.substring(0,5));



//        5. Bölmə: IndexOf & Contains — .indexOf(), .contains()

//        1. "I love Java" cümləsində "Java" sözünün hansı indeksdən başladığını tapın.
        String java = "I love Java";
        System.out.println(java.substring(7,11));
//       2. "Selenium" sözündə 'x' hərfinin olub-olmadığını contains() ilə yoxlayıb nəticəni boolean dəyişəndə saxlayın.
        String selenium = "Selenium";
        System.out.println(selenium.contains("x"));
//        3. "test_muesiseleri@gmail.com" mətnində "@" işarəsinin indeksini tapın.
        String mail = "test_muesiseleri@gmail.com";
        System.out.println(mail.substring(16,17));
// ?      4. Bir cümlədə həm "A", həm də "B" hərflərinin eyni anda olub-olmadığını && operatoru ilə yoxlayın.
//        5. "Axtarış nəticəsi: 150 element" mətnində "150" rəqəminin başladığı yeri indexOf ilə tapın.
        String yuzelli = "Axtarış nəticəsi: 150 element";
        System.out.println(yuzelli.indexOf("150"));
//        6. "Programmer" sözündə "r" hərfinin ilk rast gəlindiyi indeksi tapın.
        String programmer = "Programmer";
        System.out.println(programmer.indexOf('r'));
//        7. "test_case_01" mətnində alt xəttin (_) yerini tapın.
        String testCase = "test_case_01";
        int firstIndex = testCase.indexOf('_');
        int secondIndex = testCase.indexOf('_', firstIndex + 1);
        System.out.println("First character index: " + firstIndex + " " + "Second character index: " + secondIndex);
//        8. Bir cümlədə həm "java", həm də "script" sözlərinin olub-olmadığını contains ilə ayrı-ayrı yoxlayın
        String javaScript = "java script";
        System.out.println(javaScript.contains("java"));
        System.out.println(javaScript.contains("script"));
//        9. "Məhsulun qiyməti: 50.5 AZN" cümləsində "AZN" sözünün olub-olmadığını yoxlayın.
        String mehsulQiymeti = "Məhsulun qiyməti: 50.5 AZN";
        System.out.println(mehsulQiymeti.contains("AZN"));
//        10. "apple,banana,cherry" String-ində ikinci vergülün yerini tapın (İpucu: indexOf metodunda axtarışa başlamaq üçün indeks göstərin).
        String meyveler = "apple,banana,cherry";
        int firstFruit = meyveler.indexOf(',');
        int secondFruit = meyveler.indexOf(',', firstIndex + 1);
        System.out.println("Birinci vergül index: " + firstFruit + " " + "İkinci vergül index: " + secondFruit);
    }
}