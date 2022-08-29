package lab5;
import java.util.Scanner;

public class Lab5Q5_265197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 0; i<num;i++){
            for(int o = 0;o<i+1;o++){
                System.out.printf(""+"%d ",num-o);
            }
            System.out.println();
        }
        sc.close();
    }

}
