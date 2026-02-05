package operator.test;
/*
설명: 변수 totalSeconds에 4000초가 들어있습니다.
이 시간을 "시, 분, 초" 단위로 변환하여 출력하는 코드를 작성하세요.
 */
public class Test1 {
    public static void main(String[] args) {
        int totalSeconds = 4_000;

        int hour = totalSeconds / 3600;
        int temp = totalSeconds % 3600;

        int minute = temp / 60;

        int second = temp % 60;

        System.out.println(totalSeconds + "초는 " + hour + "시간 " + minute + "분 " + second + "초 입니다.");
    }
}
