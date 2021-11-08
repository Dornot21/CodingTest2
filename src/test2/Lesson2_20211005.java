package test2;


import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lesson2_20211005 {
    public static void main(String[] args) {

        int scv[] = {1, 2, 3, 9, 10, 12};
        long result = solution(scv, 7);
        System.out.print(result);

    }
    static int solution(int[] scoville, int k) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            queue.add(scoville[i]);
        }

        while(queue.peek() < k){
            if(queue.size() < 2) return -1;

            int a = queue.poll();
            int b = queue.poll();
            int c = a + (b*2);

            queue.add(c);
            answer++;
        }

        return answer;
    }

}
