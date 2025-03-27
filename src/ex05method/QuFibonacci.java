package ex05method;

import java.util.Scanner;

public class QuFibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");   // 몇 번째 항까지 할 것인지 정한다.
        int num = scanner.nextInt();
        fibonacciProgression(num);
    }
    public static void fibonacciProgression(int num){
        System.out.println("1 번째 항: 0\n2 번째 항: 1");

        int first = 0;      // 첫째항 : 0
        int second = 1;     // 둘째항 : 1

        for(int i = 0; i<(num-2);i++){
            System.out.printf("%-2d번째 항: %d + %d = ", (i+3), first, second);
            int temp = second;  // 뒷항의 값을 temp에 임시저장
            second += first;    // 앞항과 뒷항을 더해 뒷항에 저장
            first = temp;       // temp에 있던 이전 뒷항의 값을 앞항에 저장
            System.out.printf("%d%n", second);
        }
    }
}
