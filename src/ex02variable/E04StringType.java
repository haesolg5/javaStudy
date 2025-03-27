package ex02variable;

public class E04StringType {

	public static void main(String[] args) {
		/*
		String클래스 : 참조형 변수로써 기본자료형이 아닌 클래스로 문자열을 
					 저장하고, 조작하는 기능을 가지고 있다.
					 자바에서는 문자열을 표현할때 "로 감싸주면 되고 연결시에는 
					 + 기호를 사용한다.
		 */
		int number;
		number = 99;
		
		/*
		클래스를 통해 생성한 참조형 변수와 기본자료형 변수 사이에서는 형변환이 불가능
			-> 서로 사용하는 메모리 공간이 다르기 때문
		- 기본자료형 변수 : Stack(스택) 영역 사용
		- 클래스(참조형) 변수 : Heap(힙) 영역 사용
		 */
		// 에러 문장
//		int stringNumber1 = (int)"100";
//		String stringNumber2 = (String)100;
		
		// String + int => 단순 연결
		String strNumber = "100";
		System.out.println(strNumber + number);
		
		// String은 클래스이므로 new를 사용해서 생성가능
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		// 대체로 아래와 같은 방식으로 생성
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic + " " + plusString);
		
		/*
		문자열 + 정수 : 우선순위가 없다면 문자열과 숫자가 연결된 상태로 출력
				소괄호로 묶어 우선순위에 변화를 주면 산술연산의 결과 출력 가능
		 */
		int kor = 100, eng = 99, math = 98;
		// 1009998
		System.out.println("총점 : " + kor + eng + math);
		// 297
		System.out.println("총점 : " + (kor + eng + math));
	}

}
