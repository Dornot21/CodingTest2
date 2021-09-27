package test1;

public class Lesson3_20210927 {
    public static void main(String[] args) {

        int numbers[] = {4,7,12};
        boolean signs[] = {true,false,true};

        int result = solution(numbers, signs);
        System.out.println(result);
    }
    public static int solution(int[]numbers, boolean[] signs){
        int answer = 0;

        for(int i=0; i<numbers.length; i++){
            answer += (signs[i]?1:-1)*numbers[i];
        }
        return answer;
    }
}
