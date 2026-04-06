package Intro_Other;

//        Dəyişən 3 əsas hissədən ibarətdir:
//        Data Type (Tipi): Qutunun növü (ədəd, mətn, və s.).
//        Variable Name (Adı)
//        Value (Dəyəri): Qutunun içindəki real məlumat."


public class variable {
    public static void main(String[] args) {
        // Data type + Variable Name = Value;
        
        int test = 3;
        
        String count;
        count = "sdff";

        System.out.println("count = " + count);
 /*Java "Strongly Typed" bir dildir. Bu o deməkdir ki, bir dəyişəni (qutunu) yaradanda
    onun tipini (növünü) mütləq deməlisən və sonradan o qutuya başqa növ məlumat qoya bilməzsən.*/


        /*Dəyişənin Həyat Dövrü (Declaration vs Initialization)*/
        //1.Declaration (Elan etmə): Boş qutunu gətirib rəfə qoymaqdır.
          int a;
//        int yas; (Burada sadəcə yer ayrıldı, içində heç nə yoxdur).

//        2.Initialization (Başlatma/Dəyər vermə): Qutunun içinə ilk dəfə məlumat qoymaqdır.
//        yas = 25;
          a = 4;
          a= 5;
//        3.Declaration & Initialization (Eyni anda): int yas = 25; (Ən çox istifadə etdiyimiz forma budur).
          int age = 5;


          //Dəyişən adlandlırma qaydaları  - Naming conventions
//          Clean code:
//          - CamelCase Standartı: ilk söz kiçik, sonrakı sözlər böyük hərflə başlayır.
           String userCase;
//           String usercaseone;
//           String 1usercaseone;
//           Keywords: public, int, class

    }
}
