package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {
		int x = 0; // 행
		 
		while(x<5) {
			int y = 0; // 열
			while(y<=x) { // x가 y이상일때 출력
				System.out.print("*");
				y++;
			}
			x++;
			System.out.println();
		}
	}
}
