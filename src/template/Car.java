package template;

public abstract class Car {
	
	// 추상메서드
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	// 구현된 메서드
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}

}
