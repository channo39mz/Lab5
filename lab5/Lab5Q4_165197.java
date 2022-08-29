package lab5;
import java.util.ArrayList;
import java.util.List;

public class Lab5Q4_165197 {
    public static void main(String[] args) {
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        List<Character> newstr = new ArrayList<Character>();
        int wcount = 0;
        int mcount = 0;

        for (char i:str.toCharArray()){
            newstr.add(i);
        }
        // System.out.println(newstr);
        for (char o:newstr){
            if (o == 'W'){
                wcount += 1;
            }
            else{
                mcount+=1;
            }
        }
        System.out.printf(""+"W = %d and M = %d",wcount,mcount);
    }
}
