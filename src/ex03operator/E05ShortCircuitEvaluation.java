package ex03operator;

public class E05ShortCircuitEvaluation {

	/*
	SCE(Short-Circuit-Evaluation)
		- 하나의 조건검사만으로 결과를 알 수 있는 경우 Java컴파일러는 뒤의 조건을 수행하지 않고 건너뛴다.
		  이 경우 변수의 값이 변경되는 코드가 있다면 실행되지 않으므로 주의해야한다.
	 */
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		/*
		논리AND의 경우 둘 중 하나만 false이면 false를 반환하므로 첫번째 조건이 false이면
		두번째 조건은 검사(실행)하지 않는다.
		 */
		// 첫 조건이 false이므로 두번째 조건 실행 x => num2가 증가하지 않는다.
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		// false
		System.out.println("result = " + result);
		// num2는 초깃값인 0을 유지
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		/*
		논리OR의 경우 둘 중 하나만 true이면 true를 반환하므로 첫번째 조건이 true이면
		두번째 조건은 검사(실행)하지 않는다.
		 */
		// 첫 조건이 true이므로 두번째 조건 실행 x => num2가 증가하지 않는다.
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		// true
		System.out.println("result = " + result);
		// num2는 여전히 초깃값인 0을 유지
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		/*
		num2의 값이 프로그램의 실행결과에 영향을 줄 수 있다면 주의해야한다.
		 */
	} 

}
