import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1; //2가 한 번도 안 나올 경우
        int end = 0; //2가 한 번 나온 후 갱신
        
        for(int i = 0; i < arr.length; i++){ //arr을 순회하면서
            if(arr[i] == 2) { //원소의 값이 2라면
                start = i; //start에 인덱스 저장
                break;
            }
        }
        
        if(start != -1) { //2가 한 번 나오고 
            for(int i = start; i < arr.length; i++) { //처음 2가 나온 인덱스부터 arr을 순회
                if(arr[i] == 2) { //원소의 값이 2일 때
                    end = i; //end에 해당 인덱스 저장
                }
            }
        }
        
        if(start != -1) { //2가 한 번 나오고
            int[] answer = new int[end - start + 1]; //2에서 2까지의 길이만큼 정답 배열 초기화
            for(int i = 0; i < answer.length; i++) { //정답 배열 길이만큼 순회
                answer[i] = arr[start + i]; //처음 2가 나오는 인덱스부터 정답 배열에 복사
            }
            return answer;
        } else {
            return new int[]{-1}; //arr에 2가 없는 경우
        }
    }
}