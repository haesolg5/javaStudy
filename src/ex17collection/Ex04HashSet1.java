package ex17collection;

import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<Object>();
		
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt = 100;
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
		/*
		객체 저장
		 */
		System.out.println("add결과:"+set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
		System.out.println("[중복 저장 전 객체 수]:"+set.size()); //5개
		/*
		기본클래스의 객체 중복 저장
		 */
		System.out.println(set.add(varString2) ? "저장성공":"저장실패");
		System.out.println("[중복 저장 후 객체 수]:"+ set.size());
		
		/*
		이터레이터를 통한 객체 출력
		 */
		Iterator itr = set.iterator();

		

	}

}
