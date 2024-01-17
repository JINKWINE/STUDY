class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            if(i > idx && arr[i] == 1){
                answer = i;
                break;
                
            }else if(i == idx && arr[i] == 1){
                answer = idx;
                break;
                
            }else if(i == idx && arr[i] == 0){
                answer = -1;
            }else if(i > idx && arr[i] == 0){
                answer = -1;
            }
        }
        return answer;
    }
}

//문제에서 원하는 건 주어진 idx보다 큰 인덱스가 조건이었으니 
//굳이 0부터 시작하지 않고 idx부터 인덱스를 찾아도 됐기 때문에 아래와 같이 풀이하는 것이 더 깔끔함

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i = idx; i< arr.length;i++){
           if(arr[i]==1){
               answer = i;
               break;
           }else if(arr[i]!=1){
               answer = -1;
           }
        }

        return answer;
    }
}
