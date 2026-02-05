package operator.test;
/*
문제 3: 윤년 판별기 (Leap Year Checker)
설명: 어떤 연도(year)가 윤년(Leap Year)인지 아닌지 판별하는 boolean 로직을 작성하세요.
윤년의 조건은 다음과 같습니다.

연도가 4로 나누어 떨어져야 한다.
그리고(&&) 연도가 100으로 나누어 떨어지면 안 된다.
또는(||) 연도가 400으로 나누어 떨어지면 무조건 윤년이다.

위 조건을 만족하면 true, 아니면 false를 출력하세요.
(변수 year를 2024로 설정해서 테스트해보세요)
 */
public class Test3 {
    public static void main(String[] args) {
        int year = 2024;

        boolean leapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

        System.out.println(year + "년은 윤년입니까? " + leapYear);
    }
}
