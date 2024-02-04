class Solution {
    public int solution(String number) {
        int answer = 0; 
        int sum = 0;
        for(int i = 0; i < number.length(); i++){ //문자열을 순환하면서
            sum += Character.getNumericValue(number.charAt(i)); //getNumericValue를 이용하여 문자열을 정수로 변환한 뒤 합계에 누적 합산
        }
        
        answer = sum % 9; //각 자리 합산 값을 9로 나눈 나머지를 answer에 할당
        
        return answer;
    }
}
