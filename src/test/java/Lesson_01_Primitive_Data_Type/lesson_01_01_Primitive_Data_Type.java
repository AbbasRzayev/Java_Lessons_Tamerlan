package Lesson_01_Primitive_Data_Type;

/*İndi proqramlaşdırmanın ən vacib hissələrindən birinə keçirik Data Types.
Data type dəyişənin hansı tipdə məlumat saxladığını göstərir.
Kompüter bilməlidir ki, sən ona nə verirsən:
rəqəm?
mətn?
true/false?
Əgər data type səhvdirsə proqram səhv işləyəcək.

Primitive Data Types nədir?
“Primitive data types — Java-da ən sadə və əsas data tipləridir.”
“Onlar birbaşa dəyəri saxlayır (value saxlayır).”
      */
public class lesson_01_01_Primitive_Data_Type {
    public static void main(String[] args) {
        //Umumen 8 tip primitive data type movcuddur

        //1. byte - Kiçik tam ədədlər üçün istifadə olunur.
        // Size: 1 byte (8 bit)
        // Range: -128 → 127
        //byte a = -129; //rangeden kenar cixir
        byte a = 100;
        System.out.println("test = " + a);

        //2. short - Orta olculu tam ededler tipi
        // Size: 2 byte
        // Range: -32,768 → 32,767
//        short b = -32769; neqativ
//        short c = 32768;  neqativ
        short d = 31000;
        System.out.println(d);

        //3. int - EN cox istifade olunan tam eded tipi
        // Size: 4 byte
        // Range: -2,147,483,648 → 2,147,483,647
        int count = 5;
        System.out.println("count = " + count);

        //4. long - Cox boyuk tam ededler ucun
        // Size: 8 byte
        long l = 1000000000000L;
//        long z = 1000000000000; - L yazmasan xeta Suffix mutleqdir
        System.out.println("l = " + l);

        //5. float - Onluq edeler
        // Size^ 4 byte
        float f = 10.5f;
//        float f = 10.5; Xetadir Suffix olmayanda

//        6. double - daha deqiq onluq eded
//        Size: 8 byte
        double e = 20.5;
        System.out.println("e = " + e);

        //7. char - Tek simvol saxlayir
        //Size: 2 byte
        char p = 'a';
//        char y = 'aa'; - xeta olmaz iki simvol
//        char y = "a"'; - xeta olmaz cut xett
        System.out.println("p = " + p);

//        8. boolean - true/false saxlayir
        boolean isActive = true;
        isActive = false;
//        isActive = "true"; dirnaq icinde xetadir
        System.out.println("isActive = " + isActive);
    }
}
