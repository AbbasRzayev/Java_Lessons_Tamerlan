package Lesson_07_Arrays;

import java.util.Arrays;

public class lesson_07_05_arraysClass {
    public static void main(String[] args) {
        //Siralamaq

        int[] arr = {5,3,1,4,2};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        
        //beraberlik iki arrayi 
        int[] arr2 = {5,3,1,4,2};
        int[] arr1 = {5,3,1,4,2};
        System.out.println(Arrays.equals(arr1,arr2)); //True

        //ArrayCopyalamaq

        int[] original = {1, 2, 3 ,4,5};
        int[] copy = Arrays.copyOf(original,3);
        System.out.println(Arrays.toString(copy));

        //elave etmek

        int[] arr3 = new int[5];
        Arrays.fill(arr3,7);
        System.out.println(Arrays.toString(arr3));

 //        Java-da massivlər (Arrays) bəsit dəyişənlər (primitive types) deyil, onlar Obyektdir.
//        Biz xallar dəyişənini ekrana çıxarmaq istəyəndə, Java bizə massivin içindəki rəqəmləri yox,
//        həmin massivin yaddaşdakı ev ünvanını (referansını / heş-kodunu) gətirir.
//        Kompüter daxilindəki rəqəmlər yaddaşda yan-yana duran soyuq baytlar toplusudur.
//        Onları insanın oxuya biləcəyi formaya salmaq lazımdır.
//        Arrays.toString() metodu bizim əvəzimizə arxa fonda gizli bir for dövrü işlədir.
//        O, massivin daxilinə tək-tək daxil olur, oradakı 85, 90, 78 rəqəmlərini götürür
//        və onları insanın gözünün rahat görə biləcəyi vizual bir mətnə (String-ə) çevirir.


    }
}