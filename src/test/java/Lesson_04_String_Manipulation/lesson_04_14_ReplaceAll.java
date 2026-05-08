package Lesson_04_String_Manipulation;

public class lesson_04_14_ReplaceAll {
    public static void main(String[] args) {
        //! .replaceAll() - Regex ile Toplu deyishdirme (Regular Expretions)
        // replaceAll() metodun feqrlendiren esas cehet mentiqi qruplari ve shablar(Regex) tanimasidir
        // Xususiyeti: Mueyyen bir qelibe(pattern) uygun gelen butun hisseleri deyishirir
        //Meselen; butun reqermleri, boshluqrlar ve.s


 //        Şablon,    Adı / Mənası,            Nümunə Mətn,       Nəticə
//           \\d,    Bütün rəqəmlər (0-9),    "Kod 123",       "Kod ***"
//           \\D,    Rəqəm olmayan hər şey,    "Kod 123",      "****123"
//           \\s,    Boşluqlar (Space/Tab),    "A B C",        "A*B*C"
//           \\S,   Boşluq olmayan hər şey,    "A B C",        "* * *"
//           \\w,   "Hərf, rəqəm və _",         "A!1_",        "*!**"
//           \\W,   Hərf və rəqəm olmayan,      "A!1_",        "A*1_"
//         [a-z],   Kiçik hərflər,              "Java12",      "J***12"
//         [A-Z],   Böyük hərflər,              "Java12",      "*ava12"
//      [a-zA-Z],   Bütün hərflər,              "Java12",      "****12"
//        [^0-9],   Rəqəm olmayan hər şey,      "Bakı 2024",   "*****2024"
//          \\s+,   Bir və ya çox boşluq,        "A   B",      "A*B"

        //1. Mentden yalniz reqemleri temizlemlem (\\d)
        // Test zamani ID-ni gizlemtek

        String id = "user_ID_9988";
        System.out.println(id.replaceAll("\\d","X"));

        //2. Metnden herleri silmek ([a-zA-Z])
        // Qiymetin yaninda valyuta silmek

        String price = "550 AZN";
        System.out.println(price.replaceAll("[a-zA-Z]",""));

        //3. Xususi simvolari temizlelemek [^a-zA-Z0-9]
        //URl ve fayl adi ucun metni temizlemek  (yalniz herf ve reqem qalsin)

        String file = "hesabar_2026!@W.pdf";
        System.out.println(file.replaceAll("[^a-zA-Z0-9]", ""));

        //4. Coxlu boshluqlarin silinmesi (\\s+)

        String emtpySpace = "Java    is    cool";
        System.out.println( emtpySpace.replaceAll("\\s+"," "));

        //5. Qiymetden $ sil ve edede cevir
        String qiymet = "$1,500";
        String clean = qiymet.replace("[^0-9]","");
        System.out.println("clecleanan = " + clean);
        int eded = Integer.parseInt(clean);

        //        6. URL-dən Parametrləri Sil:
        String url = "https://test.example.com?user=admin&pass=1234";
// ? və sonrasını sil
        String temizUrl = url.replaceAll("\\?.*", "");
        System.out.println(temizUrl);  // https://test.example.com

//        7️/ Vergülü Nöqtəli Vergüllə Əvəz Et:
        String csv = "ad,soyad,yas,sehir";

        String netice = csv.replaceAll(",", ";");
        System.out.println(netice);  // ad;soyad;yas;sehir
    }
}