package ex04controlstatement;

import java.io.IOException;

public class E01If01 {

	/*
	if문형식1
		if(조건문){
			실행문장;
		}
		-if문의 조건문은 반드시 비교식 혹은 논리식이어야한다. 
		-즉 조건의 결과로 true/false를 반환해야한다. => boolean변수 가능
		-조건문에 산술식이 포함되면 에러발생
		-실행문장이 하나라면 중괄호 생략가능
	 */
	public static void main(String[] args) throws IOException {
		
		int num = 10;
		
		// 아래 문장은 조건식이 아닌 산술식이므로 에러 발생
//		if(num%2) {
//			System.out.println("잘못된 조건식");
//		}
//		if(num) {
//			System.out.println("잘못된 조건식");
//		}
		
		// 조건식은 아래와 같이 boolean값을 반환해야한다
		// 비교식으로 처리
		if(num%2 == 0) {
			System.out.printf("%d는 짝수입니다.", num);
		}
		
		// 논리식으로 처리
		if(num%2==0 && num >= 10) {
			System.out.printf("%n%d는 짝수이고 10보다 크거나 같다.%n", num);
		}
		
		// 경우에 따라 무조건 실행되는 조건문이 필요한 경우에 사용
		if(true) {
			System.out.println("무조건 실행되는 if문입니다.");
		}
		
		/*
		if(조건식);=> ;은 문장의 끝을 나타내므로 저건에 상관없이 중괄호에 있는 문장이 실행된다.
					따라서 사용에 주의
		 */
		if(num%2 != 0) //; => ;찍으면 if문이 끝나므로 아래의 구문이 무조건 실행된다.
		{
			System.out.printf("%d는 홀수입니다.", num);
		}
		
		// 실행 문장이 한 문장일경우(한 줄 뿐일 경우) => 중괄호 생략가능
		// 단, 실행문이 2개 이상이라면 첫번째 문장만 if문에 포함되므로 반드시 중괄호로 묶어준다.
		if(num%2 == 0) 
			System.out.println("\n" + num + "은 짝수이다.");
		
		
		if(num%2 != 0) {
			System.out.println("num은 " + num + "입니다.");
			System.out.println(num + "은 홀수입니다."); // 두번째문장
		} // 중괄호 생략하면 두번째문장이 조건에 상관 없이 출력된다.
		
		/*
		시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해서 작성하시오.
		참조) System.in.read() : 키보드를 통해 입력한 문자의 아스키코드를 정수형으로 반환하는 
								메서드. 두글자 이상 입력하더라도 첫번째 문자만 입력된다.  
		 */
		
		System.out.println();

		System.out.println("하나의 문자를 입력하세요");
		System.out.println("E 또는 e를 입력하면 종료합니다.");
		
		int asciiCode = System.in.read(); // 문자 여러개 입력해도 가장 앞의 문자만 적용		
		
		// a는 97, 1은 49가 출력됨.
		System.out.println("입력한 문자는:" + asciiCode);
		
		/*
		아스키코드를 알고 있을때의 구현방법. 문자 0과 9는 아스키코드 48, 57에 해당하므로 
		구간내에 있는지 확인하면 된다.
		 */
		if (asciiCode >= 48 && asciiCode <= 57) {
			System.out.println("입력한 문자는 숫자입니다. [1]");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다. [1]");
		}
		
		/*
		아스키코드를 모를때 구현하는 방법으로 문자 '0'과 '9'가 메모리에 저장시 아스키코드로 변환됨을
		이용해 아래와 같은 조건으로도 확인이 가능하다.
		 */
		if (asciiCode >= '0' && asciiCode <= '9') {
			System.out.println("입력한 문자는 숫자입니다. [2]");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다. [2]");
		}		
		
	} // main

} // class
