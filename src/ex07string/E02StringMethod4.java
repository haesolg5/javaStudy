package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {
	public static void main(String[] args) {
		
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는 프로그램을 
				charAt()을 이용해서 작성하시오.
			190419-3000000=>남자
			190419-4000000=>여자
		 */
		System.out.println("=시나리오1=================\n");
		
		String jNum1 = "190419-3000000";
		String jNum2 = "190419-4000000";
		
		System.out.println("성별확인1: " + jNum1);
		if(jNum1.charAt(7)=='1'||
		   jNum1.charAt(7)=='3'||
		   jNum1.charAt(7)=='5') {
			System.out.println("남성입니다.");
		}
		else if(jNum1.charAt(7)=='2'||
				jNum1.charAt(7)=='4'||
				jNum1.charAt(7)=='6') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("?");
		}
		
		System.out.println("성별확인2: " + jNum2);
		if(jNum2.charAt(7)=='1'||
		   jNum2.charAt(7)=='3'||
		   jNum2.charAt(7)=='5') {
			System.out.println("남성입니다.");
		}
		else if(jNum2.charAt(7)=='2'||
				jNum2.charAt(7)=='4'||
				jNum2.charAt(7)=='6') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("?");
		}
		
		
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는 프로그램을
				contains()를 이용해서 작성하시오.
			hong@daum.net=>이메일형식임
			not@naver=>이메일형식아님
		 */
		System.out.println("\n=시나리오2=================\n");
		
		String email1 = "hong@daum.net";
		String email2 = "not@naver";
		String email3 = "3218021@dankook.ac.kr";
		String email4 = "no.t@naver";
		String email5 = "not@na@ver.com";
		String email6 = "na3453.com";
		String email7 = "na3453com";
		
		
		
		emailCheck(email1);
		
		emailCheck(email2);
		
		emailCheck(email3);
		
		emailCheck(email4);
		
		emailCheck(email5);
		
		emailCheck(email6);
		
		emailCheck(email7);
		
//		if(email1.contains("@") && email1.contains(".")) {
//			if (email1.indexOf("@") < email1.indexOf(".")) {
//				if(email1.indexOf("@")==email1.lastIndexOf("@")) {
//					if(email1.indexOf(".")==email1.lastIndexOf(".")) {
//						System.out.println("이메일형식입니다.");
//					}
//					else {
//						System.out.println("이메일형식이아닙니다.");
//					}
//				}
//				else {
//					System.out.println("이메일형식이아닙니다.");
//				}
//			}
//			else {
//				System.out.println("이메일형식이아닙니다.");
//			}
//		}
//		else {
//			System.out.println("이메일형식이아닙니다.");
//		}
		
		
		/*
		시나리오3] 주민등록번호로 성별을 구분하는 프로그램을 
				indexOf()와 charAt()을 이용해서 작성하시오.
		 */
		System.out.println("\n=시나리오3=================\n");
		
		Scanner scan = new Scanner(System.in);
		
		String iJNum;
		
		while(true) {
			System.out.println("주민번호를 -까지 포함해서 입력하세요.");
			iJNum = scan.nextLine();
			
			if (iJNum.length()!=14) {
				System.out.println("숫자13자리와 -을 입력해주세요");
				continue;
			}
			if (!(iJNum.contains("-"))) {
				System.out.println("-을 포함해주세요.");
				continue;
			}		
			if (iJNum.indexOf("-")!=iJNum.lastIndexOf("-")) {
				System.out.println("-을 하나만 입력해주세요.");
				continue;
			}
			
			
			String[] iJNumArr = iJNum.split("-");
			
			if(iJNumArr[0].length()!=6) {
				System.out.println("앞자리는 6자리, 뒷자리는 7자리를 입력해주세요.");
				continue;
			}
			
			break;
		}
		
		genderCheck(iJNum);
		
		while(true) {
			System.out.println("주민번호를 -까지 포함해서 입력하세요.");
			iJNum = scan.nextLine();
			
			if (iJNum.length()!=14) {
				System.out.println("숫자13자리와 -을 입력해주세요");
				continue;
			}
			if (!(iJNum.contains("-"))) {
				System.out.println("-을 포함해주세요.");
				continue;
			}
			if (iJNum.indexOf("-")!=iJNum.lastIndexOf("-")) {
				System.out.println("-을 하나만 입력해주세요.");
				continue;
			}
			
			String[] iJNumArr = iJNum.split("-");
			
			if(iJNumArr[0].length()!=6) {
				System.out.println("앞자리는 6자리, 뒷자리는 7자리를 입력해주세요.");
				continue;
			}
			
			break;
		}
		
		genderCheck(iJNum);
		
//		int genderNum = jNum1.indexOf("-") + 1;
//		System.out.println("성별확인1: " + jNum1);
//		if(jNum1.charAt(genderNum)=='1'||
//		   jNum1.charAt(genderNum)=='3'||
//		   jNum1.charAt(genderNum)=='5') {
//			System.out.println("남성입니다.");
//		}
//		else if(jNum1.charAt(genderNum)=='2'||
//				jNum1.charAt(genderNum)=='4'||
//				jNum1.charAt(genderNum)=='6') {
//			System.out.println("여성입니다.");
//		}
//		else {
//			System.out.println("?");
//		}
//		
//		System.out.println("성별확인2: " + jNum2);
//		if(jNum2.charAt(genderNum)=='1'||
//		   jNum2.charAt(genderNum)=='3'||
//		   jNum2.charAt(genderNum)=='5') {
//			System.out.println("남성입니다.");
//		}
//		else if(jNum2.charAt(genderNum)=='2'||
//				jNum2.charAt(genderNum)=='4'||
//				jNum2.charAt(genderNum)=='6') {
//			System.out.println("여성입니다.");
//		}
//		else {
//			System.out.println("?");
//		}
		
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오.
			파일명 : my.file.images.jpg
		 */
		
		System.out.println("\n=시나리오4=================\n");
		
		String fileName = "my.file.images.jpg";
		
		int extIndex = fileName.lastIndexOf(".");
		
		String ext = fileName.substring(extIndex+1);
		
		System.out.println("확장자는 " + ext);
		
		String[] fileSplit = fileName.split("[.]");
		System.out.println("확장자는 " + fileSplit[fileSplit.length-1]);
	}
	
	static void emailCheck(String email) {
		if(email.contains("@") && email.contains(".")) {
			if (email.indexOf("@") < email.indexOf(".")) {
				if(email.indexOf("@")==email.lastIndexOf("@")) {
					System.out.println(email + "은 이메일형식입니다.");
				}
				else {
					System.out.println(email + "은 이메일형식이아닙니다.");
				}
			}
			else {
				System.out.println(email + "은 이메일형식이아닙니다.");
			}
		}
		else {
			System.out.println(email + "은 이메일형식이아닙니다.");
		}
	}
	
	static void genderCheck(String jNum) {
		int genderNum = jNum.indexOf("-") + 1;
		
		System.out.println("성별확인: " + jNum);
		if(jNum.charAt(genderNum)=='1'||
		   jNum.charAt(genderNum)=='3'||
		   jNum.charAt(genderNum)=='5') {
			System.out.println("남성입니다.");
		}
		else if(jNum.charAt(genderNum)=='2'||
				jNum.charAt(genderNum)=='4'||
				jNum.charAt(genderNum)=='6') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("?");
		}
	}
	
}
