class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a|b|c]+", ",");
        if(myStr.startsWith(",")) {
            myStr = myStr.substring(1);
        }
        if(myStr.equals("")) {
            myStr = "EMPTY";
        }
        return myStr.split("[,]");
    }
}
