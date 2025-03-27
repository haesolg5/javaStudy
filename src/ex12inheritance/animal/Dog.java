package ex12inheritance.animal;

public class Dog extends Animal{
	private String dogKind;	// 강아지 품종 
	private String dogName;
	
	public Dog(String species, int age, String gender, String dogKind, String dogName) {
		super(species, age, gender);
		this.dogKind = dogKind;
		this.dogName = dogName;
	}
	
	public void bark() {
		System.out.printf("이름이 %s이고 종(%s)이 %s인 강아지가 짖는다.\n"
				, this.dogName, super.getSpecies(),this.dogKind);
	} // 생성자

	public void showDog() {
		super.showAnimal();
		System.out.println("품종 : " + this.dogKind);
		System.out.println("이름 : " + this.dogName);	
	} // 기본 동물 정보 출력 + 강아지의 품종과 이름까지 추가로 출력
	
	//getter
	public String getKind() {
		return this.dogKind;
	}
	
	public String getName() {
		return this.dogName;
	}
	
}
