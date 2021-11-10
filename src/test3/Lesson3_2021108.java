package test3;

import java.util.Stack;

public class Lesson3_2021108 {
    public static void main(String[] args){
        int rlt = solution("baabb");

        System.out.println("rlt : " + rlt);
    }
    public static int solution(String s)
    {
        int answer = -1;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(!stack.empty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty() ? 0:1;
    }
}
