package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String bus = "상암08";
        bus = String.valueOf(1234);
        bus = Integer.toString(1234);
        bus = "1234";

        int minute = 3;
        minute = 5;

        double distance = 1.5;
        distance = 0.8;


        System.out.println(bus + "번 버스");
        System.out.println("약 " + minute + "분후 도착");
        System.out.println("남은거리 " + distance + "km");
    }
}
