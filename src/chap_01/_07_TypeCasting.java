package chap_01;

import java.sql.SQLOutput;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double 정수형에서 실수형으로
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); //93.0
        System.out.println((double) score); //93.0

        // float, double to int 실수형에서 정수형으로
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_f = (float) 93 + (float) 98.8; // 93.0 + 98.8
        System.out.println(score_f); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)
        System.out.println(convertedScoreDouble);

        int convertedScoreInt = (int) score_f; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)
        System.out.println(convertedScoreInt);

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        String s3 = String.valueOf(96_000_000_000L);
        s3 = Long.toString(96_000_000_000L);
        System.out.println(s3); //96000000000

        //문자열을 숫자로
        int i1 = Integer.parseInt("93");
        System.out.println(i1); // 93

        double i2 = Double.parseDouble("98.8");
        System.out.println(i2); // 98.8

//        int error = Integer.parseInt("java");


    }
}
