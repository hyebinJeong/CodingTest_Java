import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (list.isEmpty() || list.get(list.size() -1) != arr[i]){
                list.add(arr[i]);
            }
        }
        
        // List -> int[]로 반환 (반환타입이 int[]니까)
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        

        return answer;
    }
}