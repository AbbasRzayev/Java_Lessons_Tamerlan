package Lesson_04_String_Manipulation;

import javax.sound.midi.Soundbank;

public class lesson_04_13_ValueOF_ParseInt {
    public static void main(String[] args) {

        //! 13. Cevirme - valueOF() / parseInt()
        // int to String
        
        int num = 25;
        String changeToString = String.valueOf(num);
        System.out.println(changeToString + " yashindadir");
        
        //String to int 
        String year = "2026";
        int numYear = Integer.parseInt(year);
        System.out.println("numYear = " + numYear);

        //Bu yalnishdir
        String word = "abc";
        int notGood = Integer.parseInt(word);
        System.out.println("notGood = " + notGood);

    }
}