import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> result = new ArrayList<>(); //배열을 추가하고 삭제하기 위한 리스트 생성
        
        for(int i = 0; i < arr.length; i++) { //배열 arr을 순회하면서
            if(flag[i]) { //flag[i]의 원소가 true라면(if 조건문의 default는 true)
                for(int j = 0; j < arr[i] * 2; j++) { //arr인덱스의 원소의 2배 길이 만큼 반복
                    result.add(arr[i]); //리스트에 arr의 원소를 j만큼 추가
                }
            }else{ //flag[i]의 원소가 false일 때
                int size = result.size(); //배열의 뒤에서 삭제하기 위한 크기 설정
                for(int j = 0; j < arr[i]; j++) { //arr인덱스 원소의 길이만큼 반복
                    result.remove(size - 1 - j); //배열의 끝에서부터 하나씩 차례로 삭제
                }
                
            }
        }
        
        int[] answer = new int[result.size()]; //리스트를 옮길 배열 생성
        for(int i = 0; i < result.size(); i++) { //리스트의 길이만큼 순회하면서
            answer[i] = result.get(i); //리스트를 배열에 할당
        }
        return answer;
    }
}
