class Solution {
    public int[] solution(int[] arr) {
        int pow = 0;
        while(arr.length > Math.pow(2, pow)) {
            pow++;
        }
        
        int[] answer = new int[(int)Math.pow(2,pow)];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}

