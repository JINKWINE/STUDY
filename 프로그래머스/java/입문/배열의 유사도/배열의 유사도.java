class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String element1 : s1){ //각 원소 꺼내기
            for(String element2 : s2){
                if(element1.equals(element2)){ //꺼낸 원소 비교
                    answer++; //일치하면 카운트
                    break;
                }
            }
        }
        return answer;
    }
}
