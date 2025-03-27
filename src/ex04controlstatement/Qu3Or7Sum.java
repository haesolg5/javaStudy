package ex04controlstatement;
/*
문제1) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while,
do~while, for문으로 각각 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다.
출력의 결과는 누적되는 모든 수를 콘솔에 print한다. 
하나의 파일에 한꺼번에 작성하므로 동일한 결과가 3번 출력됩니다. 
 */
public class Qu3Or7Sum {

	public static void main(String[] args) {
		int sum = 0;
		
		// while문
		int i = 1;
		while(i<=100) {
			if((i%3==0) || (i%7==0)) { 	 // 3의 배수이거나 7의 배수인지 확인
				if(!(i%3==0 && i%7==0)){ // 3과 7의 공배수인지 확인
					sum += i;
				}
			}
			i++;
		}
		System.out.println("while합 : " + sum);
		
		// do~while문
		sum = 0; // sum 초기화
		i = 1;
		do {
			if((i%3==0) || (i%7==0)) {	// 3의 배수이거나 7의 배수인지 확인
				if(!(i%3==0 && i%7==0)){// 3과 7의 공배수인지 확인
					sum += i;
				}
			}
			i++;
		}while(i<=100);
		
		System.out.println("do~while합 : " + sum);
		
		// for문
		sum = 0; // sum 초기화
		for(int j = 1; j<=100; j++) {
			if((j%3==0) || (j%7==0)) {	// 3의 배수이거나 7의 배수인지 확인
				if(!(j%3==0 && j%7==0)){// 3과 7의 공배수인지 확인
					sum += j;
				}
			}
		}
		
		System.out.println("for합 : " + sum);
	}
}
