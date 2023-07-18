package com.honeysang;

import java.util.Scanner;

public class B11382 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(" ");

        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        long c = Long.parseLong(split[2]);

        long answer = solution(a, b, c);

        System.out.println(answer);
    }


    public static long solution(long a, long b, long c) {
        return a + b + c;
    }
}