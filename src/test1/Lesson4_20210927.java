package test1;

public class Lesson4_20210927 {
    public static void main(String[] args) {

        int numbers1[] = {1,2,3,4};
        int numbers2[] = {-3,-1,0,2};

        int result = solution(numbers1, numbers2);
        System.out.println(result);
    }
    public static int solution(int[]numbers1, int[] numbers2){
        int answer = 0;

       for(int i=0; i<numbers1.length; i++){
           answer += numbers1[i]*numbers2[i];
       }
        return answer;
    }
}
