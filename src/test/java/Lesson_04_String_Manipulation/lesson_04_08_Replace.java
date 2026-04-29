package Lesson_04_String_Manipulation;

public class lesson_04_08_Replace {
    public static void main(String[] args) {
       //! 8. Simvol və ya mətn dəyişdirmə - replace()
       // Bu metod mətndəki müəyyən bir simvolu və ya sözü başqası ilə əvə etmək üçün istifadə olunur.
       // Xususiyyeti: Metnde tapdigi butun uygunluqlari deyishir.

        String hello = "Heiio Worid";
        System.out.println(hello.replace('i','l')); //Hello World

        System.out.println(hello.replace("Heiio","Love"));
        System.out.println(hello.replace("Heiio Worid","Hello World")); //Hello World

        String originalText = "QA manual";
        String changeOriginal = originalText.replace("manual", "automation");
        System.out.println(changeOriginal);
    }
}