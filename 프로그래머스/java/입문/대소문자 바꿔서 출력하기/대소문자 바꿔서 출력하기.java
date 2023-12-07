import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){ //문자열을 순회하면서 대문자인지 확인
                System.out.print(Character.toLowerCase(str.charAt(i))); //대문자가 있으면 소문자로 변환
            }else if(Character.isLowerCase(str.charAt(i))){ //소문자인지 확인
                System.out.print(Character.toUpperCase(str.charAt(i))); //소문자를 대문자로 변환
            }
        }
        
    }
}

