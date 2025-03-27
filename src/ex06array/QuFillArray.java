package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		int[] nomal = new int[10];
		
		for(int i = 0; i<10; i++) {
			System.out.printf("%d번째 정수를 입력하세요:",(i+1));
			num = scanner.nextInt();
			
			nomal[i] = num;
		}
		
		System.out.println("순서대로입력된결과");
		for(int i = 0; i<nomal.length; i++) {
			System.out.printf("%d ", nomal[i]);
		}
		
		int[] oddEven = new int[10];
		
		
		int evenCtr = nomal.length-1;
		int oddCtr = 0;
		
		for(int i = 0; i<nomal.length; i++) {
			if(nomal[i]%2==0) {
				oddEven[evenCtr] = nomal[i];
				evenCtr--;
			}
			else {
				oddEven[oddCtr] = nomal[i];
				oddCtr++;
			}
		}
		System.out.println("\n홀수/짝수 구분입력결과");
		for(int i = 0; i<oddEven.length; i++) {
			System.out.printf("%d ", oddEven[i]);
		}
	}

}
