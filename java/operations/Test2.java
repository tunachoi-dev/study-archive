package operator.test;
/*
문제 2: 자릿수 쪼개기 (Digit Splitter)
설명: 세 자릿수 정수 number가 678로 주어졌을 때,
백의 자리, 십의 자리, 일의 자리를 각각 분리하여 출력하는 코드를 작성하세요.

힌트: int 형 나눗셈의 특성(소수점 버림)을 이용하면 자릿수를 잘라낼 수 있습니다.
 */
public class Test2 {
    public static void main(String[] args) {
        int number = 678;

        int hundredsPlace = number / 100;
        number %= 100;

        int tensPlace = number / 10;
        number %= 10;

        int onesPlace = number;

        System.out.println("백의 자리: " + hundredsPlace);
        System.out.println("십의 자리: " + tensPlace);
        System.out.println("일의 자리: " + onesPlace);
    }
}
