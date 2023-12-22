class Solution {
    public String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numLog.length; i++) {
            int diff = i > 0 ? numLog[i] - numLog[i - 1] : numLog[i];

            if (diff == 1) {
                result.append("w");
            } else if (diff == -1) {
                result.append("s");
            } else if (diff == 10) {
                result.append("d");
            } else if (diff == -10) {
                result.append("a");
            }
        }

        return result.toString();
    }

}
