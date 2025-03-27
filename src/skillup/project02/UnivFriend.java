package skillup.project02;

// High 클래스와 구조가 동일함
public class UnivFriend extends Friend{
	// 멤버변수
	// 자식클래스에서 '전공'을 확장
	public String major;
	
	// 생성자
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	
	// 멤버메서드
	void showAllData()	{
		System.out.println("==대딩친구(전체정보)==");
		super.showFriendData();
		System.out.println(", 전공: " + this.major);
	}
	
	void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.print("이름: " + super.name);
		System.out.print(", 전공: " + this.major);
		System.out.println(", 전화번호: " + super.phone);
	}
	
}
