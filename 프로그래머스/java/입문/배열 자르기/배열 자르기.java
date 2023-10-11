import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        System.arraycopy(numbers, num1, answer, 0, num2 - num1 + 1);
        return answer;
    }
}


System 클래스의 arraycopy 메소드
    특정 위치부터 특정 개수만큼 새로운 배열에 값을 저장한다.
    System.arraycopy(A, B, C, D, E);

A : 원본 배열
B : 원본 배열에서 시작할 위치
C : 새로운 배열
D : 새로운 배열의 시작 위치
- 0 으로 설정하면 복사한 원본 배열이 새로운 배열의 0번째 인덱스부터 저장된다.
- 3 으로 설정하면 3번째 인덱스부터 저장.
E : 원본 배열에서 복사되는 데이터 개수

예를 들어
int[] orgArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int[] newArray = new int[5];
각각 배열을 할당하고

System.arraycopy(orgArray, 3, newArray, 0, 4);
위와 같이 복사한다.

System.out.println("원본 배열 : " + Arrays.toString(orgArray));
System.out.println("잘린 배열 : " + Arrays.toString(newArray));
출력하면

원본 배열 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
잘린 배열 : [4, 5, 6, 7]
위와 같은 결과가 나온다.
