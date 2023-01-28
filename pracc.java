/*
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution_Hash {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion)
            map.put(player, map.get(player) - 1);

       */
/* for (String key: map.keySet()){
            if(map.get(key)!=0){
                answer = key;
                break;
            }
        }*//*


        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        //반복문을 대신 실행해주는 Iterator 클래스
        while(iter.hasNext()){ //iter라는 인스턴스를 하나씩 넘기면서
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution_Hash sol = new Solution_Hash();
        System.out.println(sol.solution(part, comp));
    }
}*/
