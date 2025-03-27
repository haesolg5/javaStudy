package ex04controlstatement;

public class QuPyramid2 {
	public static void main(String[] args) {
		int x = 0; // 행
		 
		do {
			int y = 0; // 열
			do { 
				System.out.print("*");
				y++;
			} while((5-y)>x); // 5-y가 x보다 클때 *출력
			x++;
			System.out.println();
		} while(x<5);
	}
}
