import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>(); //answer를 List 타입으로 변환
        
        for(int i = 0; i < arr.length; i++){
            answer.add(arr[i]); //answer에 arr의 배열 할당
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){ //배열 arr와 배열 delete_list의 요소가 같을 때
                    answer.remove(Integer.valueOf(arr[i])); //answer 리스트에서 중복되는 요소를 삭제
                }
            }
        }
        return answer;
    }
}
