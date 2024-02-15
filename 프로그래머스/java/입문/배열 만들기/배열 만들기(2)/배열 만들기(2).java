import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>(); //정수 리스트 생성
        int count = 0; 
        for(int i = l; i <= r; i++){ //정수 l부터 r까지 순회
            String str = i + ""; //
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 48 || str.charAt(j) == 53){
                    count ++;
                }
            }
            if(count == str.length()){
                list.add(i);
            }
            count = 0;
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        int[] empty = {-1};
        if(answer.length == 0) return empty;
        return answer;

    }
}
