import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    result.add(arr[i]);
                }
            }else{
                int size = result.size();
                for(int j = 0; j < arr[i]; j++) {
                    result.remove(size - 1 - j);
                }
                
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
