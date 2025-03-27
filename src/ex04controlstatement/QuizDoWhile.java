package ex04controlstatement;

public class QuizDoWhile {

	public static void main(String[] args) {
		/*
		퀴즈 2] 다음과 같은 피라미드를 출력하는 프로그램을 
			do~while문으로 작성하시오.
		 *
		 **
		 ***
		 ****
		 *****
		*/
		
		//1.행을 위한 반복문 생성
		int i = 0;		
		do {
			// 2. 열을 위한 반복문 생성
			int j = 0;
		
			do {
				// 3. 반복문확인
				System.out.print("*");
				j++;
			 
		    // 5. 행에 해당하는 a의 갯수만큼만 *를 출력
			}while(i>=j);
			
			// 4. 출력 후 줄바꿈
			System.out.println();
			i++;
		} while(i<5);
		
		System.out.println("\n=================================\n");
	
		i = 0;		
		do {
			
			int j = 0;
		
			do {
				// i의 크기만큼 반복해서 *를 출력
				if(j<=i) {
					System.out.print("* ");
				}	
				j++;  
			} while(j<5);	
			
			System.out.println();
			
			i++;
		} while(i<5);
		
	}

}
