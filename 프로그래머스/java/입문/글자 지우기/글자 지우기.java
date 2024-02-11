import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices); //배열 정렬
        StringBuilder myS = new StringBuilder(my_string);  //문자열을 StringBuilder에 저장
        for(int i = indices.length - 1; i >= 0; i--){ //배열을 뒤에서부터 순회
            int index = indices[i]; //index에 현재 배열 원소 저장
            if(index < myS.length()){ //인덱스가 문자열의 길이보다 작을 때만
                myS.deleteCharAt(index); //해당 인덱스 삭제
            }
        }
        return myS.toString();
    }
}
