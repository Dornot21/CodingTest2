package test1;


import java.util.*;

public class Lesson8_20210928 {
    public static void main(String[] args) {

        int[] qus = {93, 30, 55};
        int[] qus2 = {1, 30, 5};
        int[] result = solution(qus, qus2);
        for(int s:result){
            System.out.print(s);
        }
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        int []time = new int[progresses.length];

        int idx = 0;
        for(int prg:progresses){
            int day = (100 - prg) / speeds[idx];
            int nam = (100 - prg) % speeds[idx];
            if(nam > 0){
                day++;
            }
            time[idx++] = day;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<time.length; i++){
            int day = time[i];
            if(day < 0) continue;

            int cnt = 1;
            for(int j=i+1; j< time.length; j++){
                int cpm = time[j];

                if(day >= cpm){
                    time[j] = -1;
                    cnt++;
                }else{
                    break;
                }
            }
            list.add(cnt);
        }
        return list.stream().mapToInt(i ->i).toArray();
    }

}
