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
