package ex02variable;

import java.util.Random;
import java.util.Scanner;

public class ExRSP {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = 2;	// 컴퓨터가 낸 것 : 초기값 바위
		int per = 2;	// 사용자가 낸 것 : 초기값 바위
		int game = 0;	// 총 경기 수
		int win = 0;	// 사용자가 승리한 경기 수
		int lose = 0;	// 컴퓨터가 승리한 경기 수
		
		// 가위바위보 및 종료 상수로 선언
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		final int EXIT = 0;
		
		
		while(true) {	// 종료 입력시 까지 반복
			com = random.nextInt(3) + 1; // 컴퓨터가 내는 것 지정

			// 선택지
			System.out.println("가위바위보");
			System.out.println("1:가위");
			System.out.println("2:바위");
			System.out.println("3:보");
			System.out.println("0:종료");
			
			per = scan.nextInt(); // 사용자 입력
			scan.nextLine();
			System.out.println();
			
			if (per < 0 || per > 3) {
				System.out.println();
				System.out.println("잘못된 입력");
				continue;
			} // 범위 밖의 입력 처리
			
			else if(per == EXIT) {
				
				System.out.println("종료");
				System.out.println();
				System.out.println("경기수 : " + game);
				System.out.println("승리 : " + win);
				System.out.println("패배 : " + lose);
				break;
			} // 종료

			else if(per == SCISSOR) { // 사용자 가위 선택
				
				System.out.println("사용자 : 가위");
				
				if (com == SCISSOR) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("비김");
				}
				else if (com == ROCK) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("패배");
					lose++; // 패배 횟수 추가
				}
				else if (com == PAPER) {
					System.out.println("컴퓨터 : 보");
					System.out.println("승리");
					win++; // 승리 횟수 추가
				}
				else {
					System.out.println("알 수 없는 오류1");
					continue;
				}	// 예외 처리
			}
			
			else if(per == ROCK) { // 사용자 바위 선택
				
				System.out.println("사용자 : 바위");
				
				if (com == SCISSOR) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("승리");
					win++;	// 승리 횟수 추가
				}
				else if (com == ROCK) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("비김");
				}
				else if (com == PAPER) {
					System.out.println("컴퓨터 : 보");
					System.out.println("패배");
					lose++;	// 패배 횟수 추가
				}
				else {
					System.out.println("알 수 없는 오류1");
					continue;
				}	// 예외 처리
			}
			
			else if(per == PAPER) { // 사용자 보 선택
				
				System.out.println("사용자 : 보");
				
				if (com == SCISSOR) {
					System.out.println("컴퓨터 : 가위");
					System.out.println("패배");
					lose++;	// 패배 횟수 추가
				}
				else if (com == ROCK) {
					System.out.println("컴퓨터 : 바위");
					System.out.println("승리");
					win++;	// 승리 횟수 추가
				}
				else if (com == PAPER) {
					System.out.println("컴퓨터 : 보");
					System.out.println("비김");
				}
				else {
					System.out.println();
					System.out.println("알 수 없는 오류1");
					continue;
				}	// 예외 처리
			}
			
			else{
				System.out.println();
				System.out.println("알 수 없는 오류2");
				continue;
			} // 예외 처리
			
			game++; // 경기 횟수 추가
			
			System.out.println();
		}
		System.out.println("5번의 게임이 끝났습니다. 게임을 계속 하시겠습니까?");
		System.out.println("재시작(1), 종료(0)");
		
		
		
		
	}
}
