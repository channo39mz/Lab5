package lab5;

public class Lab5Q365197 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 0; i<200;i++){
            // System.out.println(i);
            // ตัวสุดท้านเป็น 199 หรือต่อให้เป็น 200 ก็ไม่บวกอยู่ดีครับ
            if (i%10 == 0){
                continue;
            }
            else{
                num+=i;
            }
        }
        System.out.println(num);

    }
    
}
