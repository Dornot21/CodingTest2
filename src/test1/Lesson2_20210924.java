package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Lesson2_20210924 {
    public static void main(String[] args) {

        int numbers[] = {1,2,3,4,6,7,8,0};

        int result = solution(numbers);
        System.out.println(result);
    }
    public static int solution(int[]numbers){
        AtomicInteger answer = new AtomicInteger();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1; i<10; i++){
            map.put(i, i);
        }

        for(int t:numbers){
            map.remove(t);
        }

        map.forEach((key,value)->
                answer.addAndGet(value));
/*
        Set<Integer> key = map.keySet();

        Iterator<Integer> it = key.iterator();
        while(it.hasNext()){
            int item = it.next();
            answer += item;
            System.out.println("item : " + item);
        }
*/
        return answer.get();
    }
}
