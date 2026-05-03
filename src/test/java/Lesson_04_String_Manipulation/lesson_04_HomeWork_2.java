package Lesson_04_String_Manipulation;

public class lesson_04_HomeWork_2 {
    public static void main(String[] args) {

//        1. startsWith() və endsWith()
//        "Bakı" sözünün "B" hərfi ilə başlayıb-başlamadığını yoxlayın.
        String city = "Bakı";
        System.out.println(city.startsWith("B"));
//        "kitab.jpg" mətninin ".jpg" ilə bitib-bitmədiyini yoxlayın.
        String book = "kitab.jpg";
        System.out.println(book.endsWith(".jpg"));
//        "Proqramlaşdırma" sözünün "P" ilə başlayıb "a" ilə bitdiyini && ilə yoxlayın.
        String programming = "Proqramlaşdırma";
        System.out.println(programming.startsWith("P") && programming.endsWith("a"));
//         "https://google.com" mətninin "https" ilə başladığını yoxlayın.
        String url = "https://google.com";
        System.out.println(url.startsWith("https"));
//         "QA Automation" mətninin "n" hərfi ilə bitdiyini yoxlayın.
        String automation = "QA Automation";
        System.out.println(automation.endsWith("n"));

//        2. trim() və strip()
//        "  Java  " mətninin əvvəl və sonundakı boşluqları silin və yeni uzunluğunu çap edin.
        String java_old = "  Java  ";
        System.out.println(java_old);
        System.out.println(java_old.length());
        String java_new = "  Java  ";
        System.out.println(java_new.trim());
        String java_new2 = java_new.trim();
        System.out.println(java_new2.length());
//        " Salam " mətnini təmizləyin və təmizlənmiş halının "Salam" sözünə bərabərliyini yoxlayın.
        String hello = " Salam ";
        String hello_clean = hello.trim();
        String hello_2 = "Salam";
        System.out.println(hello_clean != hello_2);
//        " 100 " mətnindəki boşluqları silin.
        String number = " 100 ";
        System.out.println(number.trim());
//        "A B" mətninə trim() tətbiq edin və mərkəzdəki boşluğun qalıb-qalmadığını yoxlayın.
        String herf = "A B";
        String herf_clean = herf.trim();
        System.out.println(" Mərkəzdə boşluq var mı ?" + herf_clean.contains(" "));


//        Boşluqlu bir sözün əvvəlki uzunluğu ilə trim()-dən sonrakı uzunluğu arasındakı fərqi tapın.
          String bosluglu_uzunlug = "  Tamerlan  ";
          int bosluqlu = bosluglu_uzunlug.length();
          String boslugsuz_uzunlug = bosluglu_uzunlug.trim();
          int bosluqsuz = boslugsuz_uzunlug.length();
        System.out.println(bosluqlu - bosluqsuz);
//        3. replace() və replaceAll()
//        "2026-04-29" mətnindəki - işarələrini . ilə əvəz edin.
        String tarix = "2026-04-29";
        System.out.println(tarix.replace('-', '.'));
//        "Alma" sözündəki "l" hərfini "m" ilə əvəz edin.
        String apple = "Alma";
        System.out.println(apple.replace('l', 'm'));
//        "Mənim 5 manatım var" mətnində "5" rəqəmini "10" ilə əvəz edin.
        String text = "Mənim 5 manatım var";
        System.out.println(text.replace("5","10"));
//        "Salam Dünya" mətnindəki boşluğu alt-xətt (_) ilə əvəz edin.
        String hi = "Salam Dünya";
        System.out.println(hi.replace(' ','_'));
//        "1,2,3" mətnindəki vergülləri silin (boşluqsuz əvəz edin).
        String nomre = "1,2,3";
        System.out.println(nomre.replace(",",""));;


//        4. split()
//        "Alma,Armud,Nar" mətnini vergülə görə bölün və massivin (array) ölçüsünü çap edin.
        String fruits = "Alma,Armud,Nar";
        String[] fruits2 = fruits.split(",");
        System.out.println(fruits2.length);
//        "Java-Python-C#" mətnini - işarəsinə görə bölün.
        String program_language = "Java-Python-C#";
        String [] program_language2 = program_language.split("-");
        System.out.println(" Birinci " + program_language2[0]);
        System.out.println(" İkiinci " + program_language2[1]);
        System.out.println(" Üçüncü " + program_language2[2]);
//        "Baku Azerbaijan" mətnini boşluğa görə iki yerə bölün.
        String city_country = "Baku Azerbaijan";
        String [] city_country2 = city_country.split(" ");
        System.out.println("Şəhər " + city_country2[0]);
        System.out.println("Ölkə " + city_country2[1]);
//        "A/B/C" mətnini / işarəsinə görə bölün və neçə hissə yarandığını göstərin.
        String alfabet = "A/B/C";
        String [] alfabet2 = alfabet.split("/");
        System.out.println("Birinci " + alfabet2[0]);
        System.out.println("Birinci " + alfabet2[1]);
        System.out.println("Birinci " + alfabet2[2]);
//        "Ad:Soyad" mətnini : işarəsinə görə bölün.
        String name_surname = "Ad:Soyad";
        String [] name_surname2 = name_surname.split(":");
        System.out.println("Ad " + name_surname2[0]);
        System.out.println("Soyad " + name_surname2[1]);

//        5. join()
//        "A" və "B" hərflərini + işarəsi ilə birləşdirin (Nəticə: "A+B").
        String a = "A";
        String b = "B";
        String ab = String.join("+", a, b);
        System.out.println(ab);
//        "2026", "04", "29" rəqəmlərini nöqtə (.) ilə birləşdirin.
        String num1 = "2026";
        String num2 = "04";
        String num3 = "29";
        String numberPair=String.join(".", num1, num2, num3);
        System.out.println(numberPair);
//        "Bakı", "Gəncə" şəhərlərini vergül və boşluq (, ) ilə birləşdirin.
        String baku = "Bakı";
        String gence = "Gəncə";
        String baku_gence = String.join(", ", baku, gence);
        System.out.println(baku_gence);
//        Adınızı və soyadınızı araya boşluq qoyaraq join ilə birləşdirin.
        String adim = "Tamerlan";
        String soyadim = "Huseynov";
        String ad_soyad = String.join(" ", adim, soyadim);
        System.out.println(ad_soyad);
//        "Test1", "Test2", "Test3" sözlərini tire (-) ilə birləşdirin.
        String test1 = "Test1";
        String test2 = "Test2";
        String test3 = "Test3";
        String testings = String.join("-", test1, test2, test3);
        System.out.println(testings);


//        6. isEmpty() və isBlank()
//        "" (boş) mətninin isEmpty() nəticəsini çap edin.
        String bosluq = "";
        System.out.println(bosluq.isEmpty());
//        " " (boşluq) mətninin isEmpty() nəticəsini çap edin.
        String bosluq2 = " ";
        System.out.println(bosluq2.isEmpty());
//        " " (boşluq) mətninin isBlank() nəticəsini çap edin.
        String bosluq3 = " ";
        System.out.println(bosluq3.isBlank());
//        "Java" sözünün isEmpty() olub-olmadığını yoxlayın.
        String language_program = "Java";
        System.out.println(language_program.isEmpty());
//        "\n" (yeni sətir) simvolu üçün isBlank() nəticəsini yoxlayın.
        String setir = "\n";
        System.out.println("yeni sətir " + setir.isBlank());

//        7. compareTo()
//        "a" və "b" hərflərini müqayisə edin.
        String herf_new1 = "a";
        String herf_new2 = "b";
        System.out.println(herf_new1.compareTo(herf_new2));
//         "Apple" və "Apple" sözlərini müqayisə edib nəticənin 0 olduğunu yoxlayın.
        String apple1 = "Apple";
        String apple2 = "Apple";
        int sonuc = apple1.compareTo(apple2);
        System.out.println("Müqayisə nəticəsi: " + sonuc);
        System.out.println("Nəticə 0-dırmı?: " + (sonuc==0));
        System.out.println(apple1.compareTo(apple2));
//        "B" və "A" hərflərini müqayisə edin (Nəticə müsbət, yoxsa mənfidir?).
        String beta = "B";
        String alfa = "A";
        System.out.println("Nəticə müsbət, yoxsa mənfidir?: " + alfa.compareTo(beta));
//         "1" və "2" rəqəmlərini (String kimi) müqayisə edin.
        String one = "1";
        String two = "2";
        System.out.println(one.compareTo(two));
//        "Java" və "java" sözlərini müqayisə edin.
        String sozler1 = "Java";
        String sozler2 = "java";
        System.out.println(sozler1.compareTo(sozler2));
    }
}
