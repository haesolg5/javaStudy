package ex02variable;

public class E02SilsuType {
	/*
	실수자료형
	-정수형보다는 실수형이 더 큰 자료형이다. 
	  ->0과 1사이에 무수히 많은 실수가 존재하기 때문
	-따라서 long타입과 float타입을 연산하면 float의 결과가 나온다.
	 */

	public static void main(String[] args) {
		
		long long1 = 100;
		float float1 = 200;
		// 정수와 실수의 연산은 실수로 자동형변환 된다.
		float result1 = long1 + float1;
		// 300.0의 결과 출력
		System.out.println("long1 + float1 = " + result1);
		
		/*
		float(실수)와 long(정수)의 연산결과를 long타입으로 받고 싶다면
			1. float타입을 long타입으로 강제형변환 후 연산
			2. 계산결과 전체를 long으로 강제형변환
		 */
		long result2 = long1 + (long)float1;
		System.out.println("형변환 후 연산 = " + result2);
		long result3 = (long)(long1 + float1);
		System.out.println("계산 후 형변환 = " + result3);
		
		/*
		- 실수형의 기본은 double
		- 소수점이 있는 데이터를 컴파일러는 먼저 double로 인식
		- 단, 소수점이 없는 데이터는 float에 대입할 수 있음
		-소수점이 있는 데이터를 float에 대입하려면 접미사 F 또는 f를 붙여 사용
		 */
		float f3 = 100;
		
		// Error. 3.14를 double로 인식
		//float f4 = 3.14; // 접미사 없음
		float f4= (float)3.14; // 소수를 float로 형변환 -> 권장 X
		System.out.println("f4 = " + f4);
		
		// 접미사를 통해 float형 자료임을 명시 -> 권장
		// 성능의 차이
		float f5 = 3.14f;
		System.out.println("f5 = " + f5);
		
		// float타입 끼리의 연산은 기본규칙을 따른다.
		float f6 = f3 + f4;
		System.out.println("f6 = " + f6);
		
		// float타입보다 double타입이 더 크기 때문에 연산결과는 double 타입
		double d1 = 3.14;
		double d2 = f6 + d1;
		System.out.println("d2 = " + d2);
		
	}

}
