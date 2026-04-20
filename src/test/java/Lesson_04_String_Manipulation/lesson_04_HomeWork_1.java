package Lesson_04_String_Manipulation;

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


//        2. Bölmə: Upper & Lower Case — .toUpperCase(), .toLowerCase()
//
//        1. "qa engineer" mətnini tamamilə böyük hərflərə çevirib yeni bir dəyişəndə saxlayın.
//        2. "Baki Səhəri" mətnini kiçik hərflərə çevirin.
//        3. İstifadəçidən gələn sözün həm tam böyük, həm də tam kiçik versiyasını eyni sətirdə çap edin.
//        4. Mətnin toUpperCase() metodundan sonrakı uzunluğunu tapın (uzunluq dəyişirmi?).
//        5. "DATABASE" mətnini kiçik hərflərə çevirib, sonra həmin mətndə "a" hərfinin olub-olmadığını contains ilə yoxlayın.
//        6. "iphone 15 pro" mətnini tamamilə böyük hərflərə çevirin.
//        7. İstifadəçidən gələn adın ilk hərfini substring ilə götürün və onu böyük hərfə çevirin.
//        8. "JAVA" mətnini kiçik hərflərə çevirin və sonra həmin yeni mətndə "j" hərfinin olub-olmadığını yoxlayın.
//        9. "AbCdEf" mətnini kiçik hərflərə çevirin və orijinal mətnlə uzunluğunun eyni olub-olmadığını yoxlayın.
//        10. "ERROR: System failed" mesajını tamamilə kiçik hərflərə çevirib bir dəyişəndə saxlayın.



//         3. Bölmə: Concat (Birləşdirmə) — .concat() və ya +
//
//        1. String s1 = "Manual"; və String s2 = "Testing"; dəyişənlərini .concat() metodu ilə birləşdirin.
//        2. Adınızı, soyadınızı və yaşınızı bir sətirdə (aralarında boşluq olmaqla) birləşdirib çap edin.
//        3. Bir mətnin sonuna .concat() ilə üç ədəd nida işarəsi (!!!) əlavə edin.
//        4. Bir double qiymət (məs: 15.5) ilə " AZN" mətnini birləşdirin.
//        5. Üç fərqli şəhər adını .concat() metodunu zəncirvari (chained) şəkildə istifadə edərək bir String-də toplayın.
//        6. "ID-" mətni ilə təsadüfi bir rəqəmi (məs: 550) birləşdirin.
//        7. Üç sözü ("Sürətli", "Öyrənmə", "Metodu") həm + ilə, həm də .concat() ilə birləşdirin.
//        8. Bir şəhər adının sonuna ", Azerbaijan" mətnini əlavə edin.
//        9. "Qiymət: " mətni ilə bir int dəyişəni birləşdirib sonuna " AZN" yazın.
//        10. İki boş String-i ("") bir-birinə .concat() ilə birləşdirin və nəticəni çap edin.



//        4. Bölmə: Substring (Hissə alma) — .substring()
//
//        1. "Proqramlaşdırma" sözünün 0-dan 4-cü indeksinə qədər olan hissəsini kəsin.
//        2. "Software" sözünün yalnız "ware" hissəsini (4-cü indeksdən sona qədər) götürün.
//        3. Bir sözün ilk hərfini substring(0, 1) ilə kəsib çap edin.
//        4. "Level-Up" sözündəki tire (-) işarəsindən sonrakı hissəni götürün.
//        5. İstifadəçinin daxil etdiyi 10 simvollu bir sözün tam ortasındakı 2 simvolu kəsib çıxarın.
//        6. "Frontend" sözünün son 3 hərfini kəsib götürün.
//        7. "QA Automation" cümləsindən yalnız "Automation" sözünü kəsin.
//        8. "0123456789" String-ində 2-ci indeksdən 7-ci indeksə qədər olan hissəni kəsin.
//        9. Bir sözün ilk hərfini və son hərfini (uzunluqdan istifadə etməklə) substring ilə ayrı-ayrı dəyişənlərə götürün.
//        10. "Baku-2024" mətnindən yalnız ili (son 4 simvolu) kəsib götürün.



//        5. Bölmə: IndexOf & Contains — .indexOf(), .contains()

//        1. "I love Java" cümləsində "Java" sözünün hansı indeksdən başladığını tapın.
//        2. "Selenium" sözündə 'x' hərfinin olub-olmadığını contains() ilə yoxlayıb nəticəni boolean dəyişəndə saxlayın.
//        3. "test_muesiseleri@gmail.com" mətnində "@" işarəsinin indeksini tapın.
//        4. Bir cümlədə həm "A", həm də "B" hərflərinin eyni anda olub-olmadığını && operatoru ilə yoxlayın.
//        5. "Axtarış nəticəsi: 150 element" mətnində "150" rəqəminin başladığı yeri indexOf ilə tapın.
//        6. "Programmer" sözündə "r" hərfinin ilk rast gəlindiyi indeksi tapın.
//        7. "test_case_01" mətnində alt xəttin (_) yerini tapın.
//        8. Bir cümlədə həm "java", həm də "script" sözlərinin olub-olmadığını contains ilə ayrı-ayrı yoxlayın.
//        9. "Məhsulun qiyməti: 50.5 AZN" cümləsində "AZN" sözünün olub-olmadığını yoxlayın.
//        10. "apple,banana,cherry" String-ində ikinci vergülün yerini tapın (İpucu: indexOf metodunda axtarışa başlamaq üçün indeks göstərin).
    }
}