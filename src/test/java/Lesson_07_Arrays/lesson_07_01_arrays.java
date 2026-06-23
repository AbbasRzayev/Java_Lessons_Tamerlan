package Lesson_07_Arrays;

import javax.sound.midi.Soundbank;

public class lesson_07_01_arrays {
    public static void main(String[] args) {
        //Javada Array(Massiv) - eyni tipli coxlu sayda datani yan-yana, nizamli shekilde saxlamaq ucun istfiade olunan
        //sabit olculu bir konteynerdir

        //Array nedir?
        //! Array - eyni tipli melumatlari ardicili saxlayan strukdutdur


        //Array olmadan - her biri ayri deyishen
        int xal1 = 5;
        int xal2 = 3;
        int xal3 = 2;
        int xal4 = 1;

        //Array ile - hamisi bir yerde

        //Data tipi(meselen int,String,double) + duz moterize + Adlandirma, Beraberlik (=) menimsetme, Figur moterize icinde deyerler
        int[] xallar = {5,3,2,1};

        //Array xususiyetleri
        //Eyni tipli elementler saxliyir
        // Olcusu sabitdir
        //Index 0- dan bashlayir
        //Suretli girish - indexle bir basha muraciet

        //!Array elan etmek

        // Usul 1  Elan + Deyer(en cox istifade olunan)
        int [] ededler = new int[5];
        ededler[0] = 10;
        ededler[1] = 10;
        ededler[2] = 10;
        ededler[3] = 10;
        ededler[4] = 10;


        //Usul 2 - new ile birlikde
        int[] numbers = new int[]{1,2,3};

        //Default deyer

        int[] arr = new int[3];
        //[0,0,0] - int default 0

         double[] arr1 = new double[3];
        //[0.0,0.0,0.0] - double default 0

        boolean[] arr3 = new boolean[3];
        //[false,false,false] - boolean default false

        String[] arr4 = new String[3];
        //hamsi 3 dene Null

        //Array muraciet

        String[] language = {"Java", "C#", "JS" , "Pyton"};
        //index                 0      1     2      3

        System.out.println("language = " + language[0]);
        System.out.println("language = " + language[1]);
        System.out.println("language = " + language[2]);
        System.out.println("language = " + language[3]);

        //! Uzunluq - length

        String[] diller = {"Java", "C#", "JS" , "Pyton"};
        System.out.println(diller.length); //4
        System.out.println(diller[4]); // index 4 yoxdur
        System.out.println(diller[-1]); // index  yoxdur

        //SOn element

        System.out.println(diller[diller.length - 1]); //Pyton

    }
}