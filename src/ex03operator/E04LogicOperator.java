package ex03operator;

public class E04LogicOperator {

	/*
	논리연산자
		- && : 논리AND. 양쪽 모두가 ture일때만 true를 반환하고 나머지는 false를 반환
		- || : 논리OR. 한쪽이라도 true면 true를 반환하고 모두 false일때만 false 반환
		- !  : 논리NOT. 반대의 논리를 반환.
	 */
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		// false && true => false
		boolean result1 = (num1==100 && num2 == 20);
		// true || false => true
		boolean result2 = (num1 < 12 || num2 >= 30);
		
		System.out.println("result1의 결과 : " + result1); //false
		System.out.println("result2의 결과 : " + result2); //true
		
		// !(false) => true이므로 if문의 블록이 실행
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
	}

}
