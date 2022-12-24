package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다. ");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다 ");
	}
	
	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}

public class AnimalTest1 {
	
	 public static void main(String[] args) {
		  AnimalTest1 aTest = new AnimalTest1();
		  aTest.moveAnimal(new Human());
		  aTest.moveAnimal(new Tiger());
		  aTest.moveAnimal(new Eagle());
	 }

	 private void moveAnimal(Human human) {
		// TODO Auto-generated method stub
		
	}

	private void moveAnimal(Tiger tiger) {
		// TODO Auto-generated method stub
		
	}

	private void moveAnimal(Eagle eagle) {
		// TODO Auto-generated method stub
		
	}

	public void moveAnimal(AnimalTest1 animal) { //매개 변수의 자료형이 상위 클래스
		  animal.move();                     //재정의 된 메서드 호출
	 }

	private void move() {
		// TODO Auto-generated method stub
		
	}

}

