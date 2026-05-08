package Lesson_04_String_Manipulation;

public class lesson_04_15_charAt {
    public static void main(String[] args) {
        //! charAt(int index) metodu stringin daxilinda olan simvolu (herfi, reqemi ve ya ishereni) qaytarir
        // Numune:
        
        String word = "Automation";
        
        //1. Ilk simvolu
        
        char firstCH = word.charAt(11);
        System.out.println("firstCH = " + firstCH);

        //2. 4 cusimvolu

        char firstCHF= word.charAt(4);
        System.out.println("Dorduncu = " + firstCHF);

        //3. sonuncu simvol
        char last = word.charAt(word.length()-1);
        System.out.println("last = " + last);
    }
}