package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
do~while문
	: 반드시 한번은 실행해야 할 경우 사용하는 반복문으로 조건검사없이 무조건 한번은 실행된다.
	형식]
	반복을 위한 변수;
	do{
		실행문장;
		증감식;
	} while(조건식); <= 문장 끝에 세미콜론 존재
 */
public class E04DoWhile {

	public static void main(String[] args) throws IOException {
		
		/*
		시나리오] E03 예제의 1~10까지 더하는 수열문제를 do~while문으로 변경하여
			   구현하시오.
		 */
		
		// 누적합을 계산하기 위한 변수 sum, 반복을 위한 변수 i 선언
		int sum = 0;
		int i = 1;
		
		// 조건없이 진입해서 일단 실행
		do {
			// 증가하는 변수 i를 누적해서 sum에 더한다
			sum += i;
			// 증감식(증가)
			i++;
			
			// 탈출 조건 검사
		} while (i<11);
		
		System.out.println("합은 " + sum);
		
		
		/*
		시나리오] 1부터 1000까지의 정수중 4의 배수이거나 7의 배수인 수의 합을 구하여 출력하는 프로그램
		       작성. do~while문 사용.
		 */

		// 새로운 작업을 위해 변수 초기화
		sum = 0;
		i = 1;
		
		do {
			// 4 또는 7의 배수일때 if문 문장 실행
			if((i%4==0) || (i%7==0)) {
				sum += i;
				System.out.println("i = " + i);
			}
			// 증감식(증가)
			i++;
			
			// 탈출 조건 검사
		} while (i<1001);
		System.out.println("합은 " + sum);
		
		/*
		시나리오] 국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A~F학점을 판단하여 출력하는
			    프로그램 작성
			    사용자가 x, X를 입력하면 프로그램 종료, do~while문 사용
		 */
		
		System.out.println("\n=================================\n");
		
		// 사용자 입력을 위한 참조변수 생성
		Scanner scn = new Scanner(System.in);
		
		// 점수와 탈출문자 입력을 위한 변수 생성
		int kor, eng, math;
		int exitCode = 0;
		double avg;
		
		do {
			// 점수를 정수로 입력받음
			System.out.print("국어 점수 : ");
			
			kor = scn.nextInt();
			
			if(kor<0 || kor>100) {
				System.out.println("올바른 성적을 입력하세요");
				continue;
			}
			
			System.out.print("영어 점수 : ");
			
			eng = scn.nextInt();
			
			if(eng<0 || eng>100) {
				System.out.println("올바른 성적을 입력하세요");
				continue;
			}
			
			System.out.print("수학 점수 : ");
			
			math = scn.nextInt();
			
			if(math<0 || math>100) {
				System.out.println("올바른 성적을 입력하세요");
				continue;
			}
			
			// 평균값 계산
			avg = (kor + eng + math)/3.0;
			
			// switch문을 사용하기 위해 구간 나누기
			int grade = (int) avg / 10;
			
			System.out.printf("평균점수 : %.1f%n", avg);
						
			switch (grade) {
			case 10: case 9: 
				System.out.println("A학점");
				break;
			case 8: 
				System.out.println("B학점");
				break;
			case 7: 
				System.out.println("C학점");
				break;
			case 6: 
				System.out.println("D학점");
				break;
			case 5: case 4: case 3: case 2: case 1: case 0: 
				System.out.println("F학점");
				break;
			default:
				System.out.println("잘못된 성적입력");
			}
			
			System.out.println();
			
			System.out.println("종료하려면 X 또는 x를 입력하세요");
			System.out.println("계속하려면 다른 키를 입력하세요");
			
			// 사용자로부터 문자를 입력받는다.
			exitCode = System.in.read();
			
			System.out.println();
			
			// 탈출 문자 검사
		} while (!(exitCode=='x'||exitCode=='X'));
		/*
		x를 입력한 경우
			!(true||false) => !(true) => false
			탈출!
		a를 입력한 경우
			!(false||false) => !(false) => true
			탈출 불가 -> 반복
		 */
		scn.close();
		
		System.out.println("프로그램 종료");
		
	}

}
