package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		/*
		char 타입 : 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할때 '로 감싸서 표현
				   만약 "로 감싸면 문자열로 인식하므로 String으로 선언해야한다
		 */
		char ch1 = '가';
		// 에러. 문자열이므로 char로 선언 불가능
		//char chStr = '가나다라';
		// String타입으로 선언하면 정상작동
		String chStr = "가나다라";
		System.out.println("ch1 =" + ch1);
		System.out.println("chStr = " + chStr);
		/*
		아스키코드 : 1byte로 표현할 수 있는 문자로 영어, 숫자를 십진수로 정의
				Ex) A => 65, a=> 97
		유니코드 : 1byte로 표현할 수 없는 문자로 영어, 숫자를 제외한 모든 문자를 2byte로 표현
				보통 큰 숫자이므로 16진수로 표현
		 */
		char ch2 = 'A'; // 메모리에 65로 저장
		int num1 = 2;
		//문자 + 정수 => 아스키코드로 저장되므로 연산이 가능함
		int num2 = ch2 + num1; // 65 + 2
		// 정수로 표현시 67
		System.out.println("num2 = " + num2); 
		// 문자로 표현시 C
		System.out.println("(char)num2 = " + (char)num2);
		
		// 연산결과를 char타입으로 형변환
		char ch3 = (char)(ch2+num1); 
		System.out.println("ch3(문자출력)=>"+ ch3);
		// 결과를 int타입으로 형변환 후 출력
		System.out.println("ch3(아스키코드출력)=>"+ (int)ch3);
		
		// '로 감쌌으므로 문자 1(아스키코드:49)
		char ch4 = '1';
		// 연산결과는 50이므로 해당하는 문자는 2
		char ch4_1 = '1' + 1;
		System.out.println("ch4 = " + ch4/*문자 1*/ 
					+", ch4_1 = " + ch4_1/*문자 2*/ + 
					", ch4_1 = " + (int)ch4_1 /*정수 50*/);

		/*
		boolean타입 : true 혹은 false 두가지의 값만 가질 수 있는 자료형으로
		산술연산, 비교연산에서는 사용할 수 없고 논리연산에서만 사용할 수 있다.
		 */
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 = " + bn1 + ", bn2 = " + bn2);
		
		/*
		&& : 논리AND로 양쪽 모두 true 일때만 true 반환
		|| : 논리OR로 둘 중 하나만 true 여도 true 반환
		 */
		
		// T && F => F
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3(AND) = " + bn3);
		// T || F => T
		bn3 = bn1||bn2;
		System.out.println("bn3(OR) = " + bn3);
		
		// 문자 '가'는 유니코드 44032로 표현되므로 true 반환
		bn3 = '가' > 30000;
		System.out.println("bn3(가) = " + bn3);
		System.out.println("가 : " + (int)'가');
		
	}

}
