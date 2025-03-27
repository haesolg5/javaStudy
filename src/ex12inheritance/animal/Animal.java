package ex12inheritance.animal;

public class Animal {
	private String species; // 종류
	private int age;		// 나이 
	private String gender;  // 성별
	
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	} // 생성자
	
	public void showAnimal() {
		System.out.println("종류 : "+species);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
	} // 정보 출력

	// getter
	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
	
}
