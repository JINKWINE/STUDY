class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";

        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);

            if (mode == 0) {
                if (currentChar != '1' && idx % 2 == 0) {
                    ret += currentChar;
                } else if (currentChar == '1') {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (currentChar != '1' && idx % 2 != 0) {
                    ret += currentChar;
                } else if (currentChar == '1') {
                    mode = 0;
                }
            }
        }

        String answer = (ret.isEmpty()) ? "EMPTY" : ret;
        return answer;
    }
}
