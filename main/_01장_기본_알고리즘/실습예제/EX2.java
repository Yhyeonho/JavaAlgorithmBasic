package _01장_기본_알고리즘.실습예제;

// 3개의 정숫값 가운데 최댓값을 구하여 출력 (여러번 반복해서 구하는 상황)

public class EX2 {
    static int max3(int a, int b, int c) { // 메서드 이용
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(3,2,2) = " + max3(3,2,2));
        System.out.println("max3(3,1,2) = " + max3(3,1,2));
        System.out.println("max3(3,2,3) = " + max3(3,2,3));
        System.out.println("max3(2,1,3) = " + max3(2,1,3));
        System.out.println("max3(3,3,2) = " + max3(3,3,2));
        System.out.println("max3(3,3,3) = " + max3(3,3,3));
        System.out.println("max3(2,2,3) = " + max3(2,2,3));
        System.out.println("max3(2,3,1) = " + max3(2,3,1));
        System.out.println("max3(2,3,2) = " + max3(2,3,2));
        System.out.println("max3(1,3,2) = " + max3(1,3,2));
        System.out.println("max3(2,3,3) = " + max3(2,3,3));
        System.out.println("max3(1,2,3) = " + max3(1,2,3));
    }
}
