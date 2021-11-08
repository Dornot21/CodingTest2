package test2;


import java.math.BigInteger;
import java.util.ArrayList;

public class Lesson1_20211004 {
    public static void main(String[] args) {

        //long result = solution(8, 12);
        //System.out.print(result);

        String result2 = solution2(5);
        System.out.print(result2);
    }
    public static long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }
    static String solution2(int x){
        String rlt = "";

        while(x > 0){
            int temp = x%3;
            x = x/3;

            if(temp == 0){
                x--;
                temp = 4;
            }
            rlt = temp + rlt;
        }
        return rlt;
    }
}
