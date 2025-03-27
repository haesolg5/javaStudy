package ex04controlstatement;

public class QuizWhile {

	public static void main(String[] args) {
		/*
		퀴즈 1] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
		*/
		
		int x;
		
		x = 0;
		
		while(x<4) {
			// 행이 고정된 상태에서 열을 4번 반복하기 위한 변수
			int y = 3;
			while(y>-1) {
				// 행과 열의 번호가 동일할 때 1 출력
				if (x==y) {
					System.out.print("1 ");
				}
				// 이외의 경우 0 출력
				else {
					System.out.print("0 ");
				}
				y--;
			}
			System.out.println();
			x++;
		}
		System.out.println("\n=================================\n");
		
		x = 0;
		while(x<4) {
			// 행이 고정된 상태에서 열을 4번 반복하기 위한 변수
			int y = 0;
			while(y<4) {
				// 행과 열의 번호가 동일할 때 1 출력
				if (x+y==3) {
					System.out.print("1 ");
				}
				// 이외의 경우 0 출력
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		System.out.println("\n=================================\n");
		
	}

}
