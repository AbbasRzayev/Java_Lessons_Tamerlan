package Lesson_05_Decision_Making;

public class lesson_05_05_switch_case {
    public static void main(String[] args) {
        //Terif: Deyisheni bir nece case (hal) ile muqaise edir
        //Vacib: her case-in sonunda break yazilmalidir - yoxsa proqram dayanmadan butun kodlari icra eder

        //Format

//        switch(deyer)
//        {
//            case variant:
//                kod
//                break;
//
//            case variant2:
//                kod
//                break;
//
//            default:
//                //hec biri uygun gelmedikde

//        int day = 1;
//
//        switch (day) {
//            case 1:
//                System.out.println("Bazaer ertesi");
//                break;
//            case 2:
//                System.out.println("Cershenbe axshami");
//                break;
//            case 3:
//                System.out.println("Cershenbme");
//                break;
//            case 4:
//                System.out.println("Cume axshami");
//                break;
//            case 5:
//                System.out.println("Cume");
//                break;
//            case 6:
//                System.out.println("shenbe");
//                break;
//            case 7:
//                System.out.println("Bazar");
//                break;
//            default:
//                System.out.println("Yalnish gun");
//

//        int statusCode = 800;
//
//        switch (statusCode) {
//            case 200:
//                System.out.println("Ok");
//                break;
//
//            case 201:
//                System.out.println("Created");
//                break;
//
//            case 400:
//                System.out.println("Bad request");
//                break;
//
//            case 404:
//                System.out.println("Not found");
//
//            case 500:
//                System.out.println("Server error");
//                break;
//
//            default:
//                System.out.println("Unkknown statusCode");
//        }

        String role = "user";
        String roleCHeck = "admin";
        String roleCHeckGuest = "guest";

        switch (roleCHeckGuest) {
            case "admin":
                System.out.println("Tam girish edile biler");
                break;

            case "user":
                System.out.println("Mehdud girish");
                break;

            default:
                System.out.println("Namelum rol");
        }
    }
}