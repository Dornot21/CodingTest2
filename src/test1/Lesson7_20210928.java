package test1;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lesson7_20210928 {
    public static void main(String[] args) {

        String[] qus = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = solution(qus);
        for(String s:result){
            System.out.println(s);
        }
    }
    public static String[] solution(String[] record) {
        Map<String, String> name = new HashMap<String,String>();
        List<String[]> rlt = new LinkedList<String[]>();

        for(int i=0; i< record.length; i++){
            String s = record[i];
            String[]item = s.split(" ");

            String ment = "";
            if("Enter".equals(item[0])){
                name.put(item[1], item[2]);
                rlt.add(item);
            }else if("Leave".equals(item[0])){
                rlt.add(item);
            }else if("Change".equals(item[0])){
                name.put(item[1], item[2]);
            }
        }

        String[] answer = new String[rlt.size()];
        for(int i=0; i< rlt.size(); i++){
            String []item = rlt.get(i);

            if("Enter".equals(item[0])){
                answer[i] = name.get(item[1])+"님이 들어왔습니다.";
            }else  if("Leave".equals(item[0])){
                answer[i] = name.get(item[1])+"님이 나갔습니다.";
            }
        }

        return answer;
    }

}
