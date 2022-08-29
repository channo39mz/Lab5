package lab5;
import java.util.Scanner;

public class Lab5Q5_165197 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        // ถ้า หาร 2 ลงตัวตรงกลางจะมี 2 ที่ทำทีละครึ่ง
        if(n%2 == 0){
            // ครึ่งบนจะเป็นช่องว่างเมื่อ เป็นตัวแรกและตัวสุดท้ายแล้วขยับเข้า1ตัวแหน่ง 
            for(int i =0;i<n/2;i++){
                for(int o = 0;o<n;o++){
                    if(o == i || o == n-i-1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("x");
                    }
                    
                }
                System.out.println();
            }
            // ครึ่งบนจะเป็นช่องว่างเมื่อ เป็นตำแหน่งตรงกลางแล้วขยับออกทีละตำแหน่ง
            for(int y =0;y<n/2;y++){
                for(int z = 0;z<n;z++){
                    if(z == (n/2)+y || z == (n/2)-y-1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("x");
                    }
                
                }
                System.out.println();
            }

    }
    // ถ้า หาร 2 ไม่ลงตัวตรงกลางจะมี 1 ที่ทำทีละครึ่งแต่ต้อง +1 ด้วยเพราะปัดเศษทิ้งทำให้หายไป 1 รอบ
    else{
        // ครึ่งบนจะเป็นช่องว่างเมื่อ เป็นตัวแรกและตัวสุดท้ายแล้วขยับเข้า1ตัวแหน่ง ซึ่งจะไปไม่ถึงตำแหน่งกลางเพราะปัดเศษทิ้ง
        for(int i =0;i<n/2;i++){
            for(int o = 0;o<n;o++){
                if(o == i || o == n-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("x");
                }
                
            }
            System.out.println();
        }
        // ครึ่งบนจะเป็นช่องว่างเมื่อ เป็นตำแหน่งตรงกลางแล้วขยับออกทีละตำแหน่ง ต้อง +1 แทนการปัดเศษที่ทำให้หายไป 1รอบ
        for(int y =0;y<(n/2)+1;y++){
            for(int z = 0;z<n;z++){
                if(z == (n/2)+y || z == (n/2)-y){
                    System.out.print(" ");
                }
                else{
                    System.out.print("x");
                }
            
            }
            System.out.println();
        }

    }
    cs.close();
}
}

