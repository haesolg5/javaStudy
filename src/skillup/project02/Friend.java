package skillup.project02;

// 부모클래스 : 친구의 공통사항 3가지를 멤버변수로 선언
public class Friend {
	public String name;
	public String phone;
	public String addr;
	
	// 생성자
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	
	// 멤버변수 출력용 메서드
	public void showFriendData()	{
		System.out.print("이름: " + this.name);
		System.out.print(", 전화번호: " + this.phone);
		System.out.print(", 주소: " + this.addr);
	}
}
