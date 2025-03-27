package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {
	/*
	시나리오] 여려개의 숫자를 입력받은 후 최대값을 구하는 메소드 정의
	숫자의 갯수는 매개변수로 전달, 숫자의 갯수만큼 Scanner클래스를 통해 입력
	입력받은 숫자 중 최대값을 찾아서 반환하도록 정의
	 */
	public static void main(String[] args) {
		
		// 정수 4개 중에서 최대값 찾기
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1 : "+ maxValue1);
		
		// 정수 6개 중에서 최대값 찾기
		//int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2 : "+ returnMaxNumber(6));
		
	}
	
	/*
	main() 에서 전달한 인수의 크기만큼 반복해서 정수를 입력받은 후
	최대값을 찾아서 반환해주는 메서드 정의
	 */
	static int returnMaxNumber(int numberCnt) {
		
		Scanner scan = new Scanner(System.in);
		
		// 최대값을 저장할 변수
		int maxVal = 0;
		// 매개변수로 전달된 인수의 크기만큼 반복
		for (int i=0 ; i<numberCnt ; i++) {
			System.out.print("정수를 입력하시오 : ");
			int inputNum = scan.nextInt()	;
			
			if(i==0) {
				/*
				입력받은 정수중 최대값을 찾아야하므로, 
				첫번째 입력값을 비교를 위한 기준값으로 설정
				 */
				maxVal = inputNum;
			}
			
			else {
				/*
				두번째 입력값부터는 기존의 최대값과 비교해서 더 큰값이 발견되면 교체한다.
				 */
				if(maxVal<inputNum) {
					maxVal = inputNum;
				}
			}
		}
		/*
		즉 새로운 값이 입력되면 기존값과 비교해서 큰 경우 지속적으로 교체하여 최대값을 찾는다.
		이 값을 호출한 지점으로 반환한다.
		 */
		return maxVal;
	}

}
