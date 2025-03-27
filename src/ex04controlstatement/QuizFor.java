package ex04controlstatement;

public class QuizFor {

	public static void main(String[] args) {

		/*
		퀴즈1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		
		// 단에 해당하는 for문(2~9)
		for(int i = 2 ; i <10 ; i++) {
			// 수에 해당하는 for문(1~9)
			for(int j = 1; j<10 ; j++) {
				System.out.printf("%2d *%2d =%3d |", i, j, i*j);
				//System.out.print(i + " * " + j + " = " + (i*j) + " ");
			}
			// 하나의 단을 출력한 후 줄바꿈
			System.out.println();
		}
		
		/*
		퀴즈2] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0
			1 0 0 0
		해법 : x와 y를 더해서 5가 될때 1을 출력한다.
		 */

		
		for(int x = 0 ; x < 4 ; x++) {
			for(int y = 0 ; y < 4 ; y++) {
				if((x+y)==3) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}

