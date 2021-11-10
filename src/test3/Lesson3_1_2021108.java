package test3;

import java.util.Stack;

public class Lesson3_1_2021108 {
    public static void main(String[] args){
        int ar[] = {1, 1, 1, 1, 1};
        int rlt = solution(ar, 3);

        System.out.println("rlt : " + rlt);
    }
    public static int solution(int[] numbers, int target)
    {
        int current = numbers[0];
        int answer = 0;
        answer += dfs(current, 1, numbers, target);
        answer += dfs(-current, 1, numbers, target);
        return answer;

    }

    public static int dfs(int prev, int index, int[] numbers, int target) {

        System.out.println("prev : " + prev);
        if (index >= numbers.length) {
            if (target == prev) {
                return 1;
            }
            return 0;
        }
        int cur1 = prev + numbers[index];
        int cur2 = prev - numbers[index];
        int ans = 0;
        ans += dfs(cur1, index + 1, numbers, target);
        ans += dfs(cur2, index + 1, numbers, target);
        return ans;
    }

}
