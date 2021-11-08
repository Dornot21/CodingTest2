package test3;

public class Lesson3_2021108 {
    public static void main(String[] args){
        int rlt = solution("baabb");

        System.out.println("rlt : " + rlt);
    }
    public static int solution(String s)
    {
        int answer = -1;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static String check(String s){

        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch == ch2){
                s = s.substring(i+1);
                break;
            }
        }


        return check(s);
    }
}
