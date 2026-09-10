package cat;

public class cat {
	String breed;
	String color;
	int age;
	
	public cat(String breed,String color, int age) {
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	public cat(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}
	
	public cat(String breed) {
		this.breed = breed;
	}
	
	void eat(String time) {
		System.out.println(time + "에 사료를 먹습니다.");
	}
	void scratch() {
		System.out.println("scratching");
		
	}
	void meow() {
		System.out.println("meow~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	void setColor(String color) {
		this.color = color;
	}
}
