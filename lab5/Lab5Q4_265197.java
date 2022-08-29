package lab5;
import java.util.*;;

public class Lab5Q4_265197 {
    public static void main(String[] args) {
        //String s1 = “I am happy”; // 0 with s1 = s1.toLowerCase();
        //String s2 = “xyz” // -1
        Scanner cs = new Scanner(System.in);
        String tex = cs.nextLine().toLowerCase();
        List<Character> str = new ArrayList<Character>();
        int ans = 0;
        for(char i:tex.toCharArray()){
            str.add(i);
        }
        for(char o:str){
            if(o == 'a' || o == 'e' || o == 'i' || o == 'o' || o == 'u'){
                break;
            }
            ans++;
        }
        cs.close();
        if (ans==str.size()){
            ans = -1;
        }
        System.out.printf(""+"your Vowels is in %d position",ans);
    }
    
}
