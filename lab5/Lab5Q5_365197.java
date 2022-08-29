package lab5;
import java.util.Scanner;

public class Lab5Q5_365197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int x = 1; x <= num ; x++ ){
            
            // ช่องว่างเท่ากับจำนวนที่ให้-1แล้วลดลงเรื่อยๆ
            for (int nul = 0; nul<num-x ;nul++){
                System.out.print(" ");
            }
            // ดาวจะมีรอบแรก1แล้สเพิ่มทีละ 2
            for(int y = 0; y<x*2-1 ; y++ ){
                System.out.print("P");
            }
        System.out.println();


        }
        sc.close();
    }
    
}
