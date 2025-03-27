package ex02variable;

public class E06EscapeSequence {

	public static void main(String[] args) {
		
		// tab(탭) 기능으로 스페이스 4칸이 띄워진다.
		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔 \t벚꽃~~!");
		
		// 줄바꿈(Line feed) 기능
		System.out.print("Java World에 오신걸 환영합니다.\n");
		System.out.print("열심히\n해봅시다.\n");

		// 문자열 안에 "(더블 쿼테이션)을 표현하고 싶을때 사용
//		System.out.println("나는 "개발자"가 되고싶어요");
		System.out.println("나는 \"개발자\"가 되고싶어요");
		
		// printf() : 문자열을 서식에 맞춰 출력할때 사용
		int kor = 81, eng = 97, math = 79;
		// 정수는 %d, 줄바꿈은 %n으로 표현
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d%n", 
						kor, eng, math); // 끊어지는 부분, 연결부 없이 쭉 사용
		/* 같은 출력문장이지만 println()을 사용하면 아래와 같이 
		   문자열과 변수를 분리해서 기술해야 하므로 다소 복잡하고 불편한점 있음*/
		System.out.println("\n국어 : " + kor + ", 영어 : " + eng + 
						", 수학 : " + math); // 문자열이 끊어지고 +로 연결 필요
		
		// 실수는 %f 사용
		// 정수와 실수의 연산이므로 결과는 실수가 반환되어 double 타입으로 선언한 변수에 대입
		double avg = (kor + eng + math)/*해당 부분은 정수*/ / 3.0 /*3.0은 실수*/;
		System.out.printf("평균점수 : %f%n", avg);
		
		/*
		자리수 정하기
		%4d : 정수출력시 전체자리수를 4자리로 표현
		%6.2f : 실수 출력시 전체자리수는 6자리, 소수이하 2자리로 표현
			또한 양수는 우측정렬, 음수는 좌측정렬된다.
		 */
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d," 
				+ "%n평균 : %f %n", kor, eng, math, avg);
		System.out.printf("국어 : %6d, 영어 : %6d, 수학 : %6d," 
				+ "%n평균 : %7.2f %n", kor, eng, math, avg);
		System.out.printf("국어 : %-6d, 영어 : %-6d, 수학 : %-6d," 
				+ "%n평균 : %-7.4f %n", kor, eng, math, avg);
		
	}

}
