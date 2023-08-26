package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "박준순";
        int hour = 15;


        System.out.println(name + "님, 로젠택배입니다. 배송이 " + hour + "시에 도착예정입니다.");
        System.out.println(name + "님, 로젠택배입니다. 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        name = "박준순";
        System.out.println("이번 시험에 합격했을까요? " + pass);
        System.out.println("WoW! " + name + "님 정말 대단해요!");

        double d = 3.14123456789;
        float f = 2.19F;
        System.out.println(d);
        System.out.println(f);

        long i = 1_000_000_000_000L;
        System.out.println(i);

    }
}
