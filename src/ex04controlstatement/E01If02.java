package ex04controlstatement;

import java.util.Scanner;
/*
if문 형식2
	if(조건식) {
		조건식 true일때 실행문장;
	}
	else {
		조건식 false일때 실행문장;
	}
 */
public class E01If02 {

	public static void main(String[] args) {
		
		//120을 2로 나누면 나머지가 0이므로 짝수로 판단 / 아닐 경우 홀수로 판단
		int num = 120;
		if(num%2 == 0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다.");
		}
		/*
		삼항 연산자(조건연산자)
		: if~else문과 동일하지만 짧은 코드로 표현이가능하므로 실무에서 자주 사용된다.
		형식]
			변수 = (조건식) ? (true일때) : (false일때);
		 */
		String numberResult = (num%2==0) ? "짝수" : "홀수";
		System.out.println("숫자" + num + "은(는) " + numberResult);

		
		/*
		시나리오] 숫자를 홀/짝인지 먼저 판단한 후 100이상인지를 판단하는 프로그램을 if~else문으로 작성하시오
		 */
		
		int numUser = 0;
		
		Scanner scn = new Scanner(System.in); // scanner 생성
		
		numUser = scn.nextInt();	// scanner를 통해 정수입력받기
		
		// 홀짝 판별
		if(numUser%2==0) {
			System.out.printf("%d는 짝수이면서", numUser);
		}
		else {
			System.out.printf("%d는 홀수이면서", numUser);
		}
		
		// 100이상/미만 판별
		if(numUser>=100) {
			System.out.println(" 100이상");
		}
		else {
			System.out.println(" 100미만");
		}
		
		// 중첩된 if문으로 여러 조건을 추가할 수 있다.
		if(numUser%2==0) {
			if(numUser>=100) {
				System.out.printf("%d는 짝수이면서 100이상 [2]%n", numUser);
			}
			else {
				System.out.printf("%d는 짝수이면서 100미만 [2]%n", numUser);
			}	
		}
		else {
			if(numUser>=100) {
				System.out.printf("%d는 홀수이면서 100이상 [2]%n", numUser);
			}
			else {
				System.out.printf("%d는 홀수이면서 100미만 [2]%n", numUser);
			}			
		}
		
		scn.close();	//scanner 닫기
	}	
}
