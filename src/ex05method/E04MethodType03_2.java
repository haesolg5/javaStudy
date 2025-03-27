package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {
	
	/*
	퀴즈] 사용자로부터 정수 2개를 입력받아 이에 해당하는 구구단을 출력하는 메서드를 작성하시오. 
	무조건 첫번째 입력받는수가 작아야한다.
	입력예]
		첫번째숫자 : 3
		두번째숫자 : 12
		3*1=3 3*2=6........
		........
		...................12*9=108
	메서드명 : inputGugudan(int sNum, int eNum)
	 */
	
	public static void inputGugudan(int sNum, int eNum) {
		if(sNum > eNum) {
			System.out.println("첫번째 숫자가 더 작아야합니다");
			return;
		}
		
		for(int i = sNum ; i <=eNum ; i++) {
			System.out.print("|");
			for(int j = 1; j<10 ; j++) {
				System.out.printf("%2d *%2d =%4d |", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int s = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int e = scan.nextInt();
		
		inputGugudan(s, e);
	}

}
