class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int fourFive = 0;
        int fiveZero = 0;
        
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("americano") || order[i].contains("anything")) {
                fourFive++;
            } else if(order[i].contains("latte")) {
                fiveZero++;
            }
        }
        answer = (fourFive * 4500) + (fiveZero * 5000);
        return answer;
    }
}
