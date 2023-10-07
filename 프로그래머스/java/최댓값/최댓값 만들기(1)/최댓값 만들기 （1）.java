class Solution {
    public int solution(int[] numbers) {
        int largest = 0; // 최대값
        int secondLargest = 0; // 다음 최대값

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        return largest * secondLargest;
    }
}



-------처음 제출했던 오류 코드-------

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int largest = numbers[0];
        int secLargest = numbers[1];
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                secLargest = largest;
                largest = numbers[i];
            }
            else if(numbers[i] > secLargest){
                secLargest = numbers[i];
            }
               
        }
        
        answer = largest*secLargest;
        return answer;
    }
}
