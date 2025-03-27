package ex04controlstatement;
/*
while문
	: 반복의 횟수가 명확하지 않은 경우에 주로 사용하는 반복문으로 반복을 위한 초기값, 조건, 증감식을 따로 작성한다.
	형식]
		반복을 위한 변수;
		while(반복의 조건){
			반복 실행문장;
			증감시기; <- 반복문 탈출을 위한 조건
		}
	조건이 true일때 반복하고, 반복문의 처음으로 돌아가면 조건을 확인한다.
	반복의 조건이 false일때 탈출한다.
 */
public class E03While {

	public static void main(String[] args) {
		/* while문 맛보기 */
		// 반복을 위한 변수 i를 생성한 후 1로 초기화
		int i = 1;
		// 반복을 위한 조건 : i가 11미만일때만 반복
		while(i<11) {
			System.out.println("i = " + i);
			// 반복문 탈출을 위한 증감식(여기서는 증가식)
			i++;
		}
		
		/*
		시나리오] 1~10까지의 합을 구하는프로그램을 while문으로 작성
		 */
		
		// 누적합을 계산하기 위한 변수 sum 생성 후 0으로 초기화
		int sum = 0;
		// 반복을 위한 변수 j 생성 후 1로 초기화
		int j = 1;
		while(j<11) {
			// sum = sum + j; <=왼쪽처럼도 가능
			sum += j;	// 복합대입연산자를 통해 증가하는 j를 sum에 누적해서 합산
			// 반복문 탈출을 위한 증감식(여기서는 증가식)
			j++;
		}
		System.out.println("1~10까지의 합 : " + sum);
		
		System.out.println();
		
		/*
		시나리오] 1~100까지의 정수중 3의 배수이거나 4의 배수인 정소의 합을 구하는 프로그램을
				while문을 이용해 작성
		 */
		// 반복을 위한 변수 k 선언 및 초기화
		int k = 1;
		// 합계산을 위한 sum 변수 0으로 초기화
		sum = 0;
		
		// k가 101미만일때 반복(지금은 100회 반복)
		while(k<101) {
			// 3의 배수 또는 4의 배수일때 if문 실행 두 경우 모두 실행되어야하므로 ||(OR) 사용
			if(k%3 == 0 || k%4 == 0) { 
				// 조건에 맞는 k를 sum에 더해준다.
				sum += k;
				System.out.println("k = " + k); // k를 확인하기 위한 k출력
			}
			k++;
		}
		System.out.println("3 또는 4의 배수의 합: " + sum);
		
		/*
		시나리오] 구구단을 출력하는 프로그램을 while문으로 작성
		 */
		// 구구단의 '단'을 표현하는 변수
		int dan = 2; 
		// 단에 대한 조건(2~9단)			 
		while (dan<10) {
			// '수'를 표현한 변수 1로 초기화
			int su = 1;
			// '수'에 대한 조건(단이 고정된 상태에서 1~9까지 증가)
			while(su<10) {
				// 서식문자를 통해서 구구단을 출력
				System.out.printf("%-2d*%2d =%3d|", dan, su, (dan*su));
				// 수에 대한 증감식(증가)
				su++;
			}
			// 단이 바뀔 때 줄바꿈
			System.out.println(); 
			// 단에 대한 증감식(증가)
			dan++;
		}
		System.out.println("\n=================================\n");
		
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		// 행으로 4번 반복하기 위한 변수
		int x = 0;
		while(x<4) {
			// 행이 고정된 상태에서 열을 4번 반복하기 위한 변수
			int y = 0;
			while(y<4) {
				// 행과 열의 번호가 동일할 때 1 출력
				if (x==y) {
					System.out.print("1 ");
				}
				// 이외의 경우 0 출력
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		System.out.println("\n=================================\n");
		
		/*
		퀴즈] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
		*/
		
		x = 0;
		while(x<4) {
			// 행이 고정된 상태에서 열을 4번 반복하기 위한 변수
			int y = 3;
			while(y>-1) {
				// 행과 열의 번호가 동일할 때 1 출력
				if (x==y) {
					System.out.print("1 ");
				}
				// 이외의 경우 0 출력
				else {
					System.out.print("0 ");
				}
				y--;
			}
			System.out.println();
			x++;
		}
		System.out.println("\n=================================\n");
		
		x = 0;
		while(x<4) {
			// 행이 고정된 상태에서 열을 4번 반복하기 위한 변수
			int y = 0;
			while(y<4) {
				// 행과 열의 번호가 동일할 때 1 출력
				if (x+y==3) {
					System.out.print("1 ");
				}
				// 이외의 경우 0 출력
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		System.out.println("\n=================================\n");
		
		x = 0;
		while(x<9) {
			if(x<5) {
				int y = 8;
				while(y>-1) {
					if(y>4) {
						if(x<(y-4)) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
						y--;
					}
					else {
						if(x<(4-y)) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
						y--;
					}
				}
				System.out.println();
				x++;
			}
			else {
				int y = 8;
				while(y>-1) {
					if(y>4) {
						if((8-x)<=(y-5)) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
						y--;
					}
					else {
						if(x>=(y+5)) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
						y--;
					}			
				}
				System.out.println();
				x++;
			}
			
		}
		System.out.println("\n=================================\n");
	}

}
