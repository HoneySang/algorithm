package com.honeysang;

import java.util.Scanner;

public class B2420 {

    public static void main(String[] args) {
        // 사용자 입력을 변수화
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine()
                .split(" ");
        long n = Long.parseLong(nm[0]);
        long m = Long.parseLong(nm[1]);

        long answer = solution(n, m);

        System.out.println(answer);
    }

    // 접근제어자 스태틱여부 변환타입 메서드명(파라미터)

    public  static long solution(long n, long m) {
        return Math.abs(n - m);
    }
}