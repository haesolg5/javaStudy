package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요:");
		String id = scanner.nextLine();
		
		if(idValidate(id)) {
			System.out.println("사용할 수 있는 아이디입니다.");
		}
		else {
			System.out.println("사용할 수 없습니다.");
		}
		
	}
	
	public static boolean idValidate(String inputId) {
		boolean validate = true; // 기본적으로 true를 입력
		
		if(inputId.length()<8 || inputId.length()>12) {
			System.out.println("8~12자 사이만 사용가능합니다.");
			validate = false;
			return validate;
		}	// 글자수 확인 후 범위 밖이면 false
		
		for(int i = 0 ; i < inputId.length(); i++) {
			if(!((inputId.charAt(i)>='0'&&inputId.charAt(i)<='9')||
			   (inputId.charAt(i)>='A'&&inputId.charAt(i)<='Z')||
			   (inputId.charAt(i)>='a'&&inputId.charAt(i)<='z'))) {
				System.out.println("영어와 숫자만 사용하세요.");
				validate = false;
				return validate;
			}	// 영어와 숫자를 제외한 문자를 사용할 경우 false
		}
		
		return validate;
	}
}
