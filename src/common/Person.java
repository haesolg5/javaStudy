package common;

public class Person {
	//자식에서 확장한 멤버변수 : 학번
	private String stNumber;
	
	//멤버변수
	private String name;
	private int age;
	//생성자
	public Person(String name, int age) {
		
		super();
		this.name = name;
		this.age = age;
	}
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}  
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//객체의 정보를 반환
	@Override
	public String toString() {
		/*
		부모에 정의된 ToString을 먼저 호출한 후
		자식쪽의 멤버를 추가한다. */
		return String.format("이름:%s, 나이:%d", name, age);
	}
}
