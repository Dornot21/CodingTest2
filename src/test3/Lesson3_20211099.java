package test3;

import java.util.Stack;

public class Lesson3_20211099 {
    public static void main(String[] args){
        String rlt = solution(14);

        System.out.println("rlt : " + rlt);
    }
    public static String solution(int  n)
    {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int remainder = n % 3;

            System.out.println("remainder:" + remainder);

            if (remainder == 0) {
                sb.append(4);
            } else if (remainder == 1) {
                sb.append(1);
            } else {
                sb.append(2);
            }
            if (remainder == 0) {
                n -= 1;
            }
            n /= 3;
        }
        return sb.reverse().toString();

    }
}
