package Lesson_03_Operators;

public class lesson_03_06_Ternary {
    public static void main(String[] args) {
        //!6.  Ternary operator
        //if-else - in qısa yazılış formasıdır
        
        int age = 35;
        if ( age >= 18) {
            System.out.println("Boyukdur");
        }
        else {
            System.out.println("Yetikinlik yashina catmayib");
        }
        
        //Ternary ile eyni netice daha qisa
        
        String answer = (age >= 18) ? "boyukdur" : "Yetikinlik yashina catmayib";
        System.out.println(answer);
        // shert ? dogrudursa bu : yanlishdirsa bu
        
        //Numune 
        int stok = 0;
        String status = (stok>0) ? "stokda var" : "stok bitib";
        System.out.println(status);
        System.out.println("status = " + status);
    }
}
