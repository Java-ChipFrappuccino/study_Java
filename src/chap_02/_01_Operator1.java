package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        // 정수로 쓰면 정수값만 출력 , 실수로 쓰면 실수값 출력
        System.out.println(5.0 / 2.0); // 2.5
        System.out.println(2 / 4.0); // 0.5

        // 나머지 연산 , 앞에서 뒤를 나누고 몫을 뺀 나머지 값
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); //8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11
        System.out.println(val++); // 11
        System.out.println(++val); // 13
        System.out.println(val); // 13

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9
        System.out.println(val--); // 9
        System.out.println(--val); // 7
        System.out.println(val); // 7

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기인원: " + waiting++ + "명 입니다"); // 0명
        System.out.println("대기인원: " + waiting++ + "명 입니다"); // 1명
        System.out.println("대기인원: " + waiting++ + "명 입니다"); // 2명
        System.out.println("총 대기인원: " + waiting + "명 입니다"); // 3명

    }
}
