import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.print(Character.toLowerCase(str.charAt(i)));        
            }else if(Character.isLowerCase(str.charAt(i))){
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
        
    }
}

