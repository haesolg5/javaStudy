package ex02variable;

public class E05ConstantVar {

	public static void main(String[] args) {
		/*
		상수 : 저장된 값이 변하지 않는 메모리의 한 종류로 변수를 선언한 후 
			  앞에 final을 추가하면된다.
		 - 상수는 한번만 초기화되고, 그 이후 값을 변경할 수 없다.
		 - 선언시 전체를 대문자로 기술하고, 연결되는 단어가 있다면 _를 사용한다.
		 - 주로 프로그램의 가독성을 높이기 위해 사용된다.
		 */
		final double PI = 3.14;
		System.out.println("PI(원주율) = " + PI);
		
		// final로 선언한 상수는 초기화 이후 변경 불가
		//PI = 3.141592;
		
		final String NICK_NAME;
		// 초기값이 없는 상태이므로 출력불가
		//System.out.println("우리는 " + NICK_NAME);
		// 반드시 초기화 이후 출력해야한다.
		NICK_NAME = "개발자";
		System.out.println("우리는 " + NICK_NAME);
		
		/*
		가위바위보 게임 제작을 위해 개발자가 1, 2, 3으로 정한 후 코딩한다고 가정
		 */
		// 상수 선언 및 초기화
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		// 변수 선언
		int computer, user;
		
		/*
		1과 3은 개발자 본인만 알 수 있는 내용이므로, 다른 사람이 읽었을때는 가독성이 떨어진다.
		 */
		computer = 1;
		user = 3;
		System.out.println("컴퓨터가 이겼습니다.");
		
		/*
		PAPER와 같은 단어는 누가 보더라도 이해할 수 있으므로 가독성이 높은 명시적인 코드라 할 수 있다.
		 */
		computer = SCISSOR;
		user = PAPER;
		System.out.println("Computer Win");
		
		user = computer + ROCK;
		computer = user;
	}

}
