package Lesson_07_Arrays;

public class lesson_07_02_array_types {
    public static void main(String[] args) {
        //!Array novleri
        //!! TekOLculu Massivler (Single - Dimensional Arrays)
        //! Yalniz bir setirden ibaret olan sade-besit strukturdur

        //int array
        int[] num = {4,5};
        String [] words = {"Lex","Alex"};

        //! Iki olculu Massivler (Two Dimensional)
        //! Excel cedveli kimidir Hem setir (ROW) hemde sutun (Column) anlyahisi var
        //2d
        int [][] cedvel = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        //Muraciet [sira][sutu]
        System.out.println(cedvel[0][0]); //1
        System.out.println(cedvel[0][1]); //2
        System.out.println(cedvel[1][1]); //5
        System.out.println(cedvel[2][2]); //9
        System.out.println(cedvel[1][2]); //6

        String[][] users = {
                {"admin", "123", "Admin", "Active"},
                {"user1", "456", "User", "Active"},
                {"user2", "789", "User", "Passive"}
        };
        System.out.println("users[0][0] = " + users[0][0]);
        System.out.println("users[0][0] = " + users[1][1]);
        System.out.println("users[0][0] = " + users[1][3]);
        System.out.println("users[0][0] = " + users[2][1]);
        System.out.println("users[0][0] = " + users[2][3]);
    }
}