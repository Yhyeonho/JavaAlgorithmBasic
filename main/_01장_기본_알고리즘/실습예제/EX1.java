package _01장_기본_알고리즘.실습예제;

import java.util.Scanner;

// 3개의 정수값을 입력하고 최댓값을 구하여 출력

public class EX1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : "); int a = stdin.nextInt();
        System.out.print("b의 값 : "); int b = stdin.nextInt();
        System.out.print("c의 값 : "); int c = stdin.nextInt();

        int max = a; // 1. max에 a값을 넣음
        if (b > max) max = b; // 2. b값이 max보다 크면 max에 b값을 넣음
        if (c > max) max = c; // 3. c값이 max보다 크면 max에 c값을 넣음

        // --> 순차(sequential) 구조 : 여러 문장(프로세스)이 순차적으로 실행되는 구조
        // 2, 3은 if 문 --> 선택(selection) 구조

        System.out.println("최댓값은 " + max + " 입니다.");
    }
}
