package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 신발 사이즈는 250 부터 295까지 5단위로 증가
        // 신발 사이즈 수는 총 10가지
        // 사이즈 250 (재고있음)

        int size[] = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (i*5);
            System.out.println("사이즈 " + size[i] + " (재고있음)");
        }

        System.out.println("---------");

        int sizes[] = new int[10];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = 250 + (i*5);
        }
        for (int sizu : sizes ) {
            System.out.println("사이즈 " + sizu + " (재고있음)");
        }
    }
}
