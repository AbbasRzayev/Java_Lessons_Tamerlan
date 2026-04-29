package Lesson_04_String_Manipulation;

public class lesson_04_09_Split {
    public static void main(String[] args) {
        //! 9. Bölmə - split()



        //1.Boshluga gore boluruk. Her boshluq gordukde Java bir kesim edir ve indexsine gore yerleshdiri.
        String text = "bu cumlede men splitden istifade edecem";
                      //0   1      2    3          4       5
        String[] words = text.split("e");

        //2 Her bir sozu oz indeksi ile cagiraq:
        System.out.println("0-ci soz: " + words[0]); //bu
        System.out.println("1-ci soz: " + words[1]); //cumlede
        System.out.println("2-ci soz: " + words[2]); //men
        System.out.println("3-ci soz: " + words[3]); //splitden
        System.out.println("4-ci soz: " + words[4]); //istifade
        System.out.println("5-ci soz: " + words[5]); //edecem
    }
}
