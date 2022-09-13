public abstract class Vehicle implements Driving {
	String name;
	int yearOfRelease;

	public Vehicle(String name, int yearOfRelease) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.yearOfRelease = yearOfRelease;
		
	}

	public String toString() {
		return String.format("%s(%d년도 출고), ", name, yearOfRelease);
	}

	abstract void printInfo();
	public void printStartDriving() {
		System.out.println(startDriving);
	}
	@Override
	public void printEndDriving() {
		System.out.println(endDriving);
	}
}

class Sedan extends Vehicle implements PowerSource, MovingPower {
	private String powerSource;
	private String movingPower;

	public Sedan(String name, int yearOfRelease, String powerSource) {
		super(name, yearOfRelease);
		this.powerSource = powerSource;
		if (powerSource == "전기") {
			this.movingPower = "전기모터";
		} else {
			this.movingPower = "엔진";
		}
	}
	

	@Override
	public String getPowerSource() {
		return powerSource;
	}

	@Override
	public String getMovingPower() {
		return movingPower;
	}

	public String toString() {
		return super.toString() + String.format("%s (%s), ", getMovingPower(), getPowerSource());
	}

	@Override
	void printInfo() {

	}

}

class Hatchback extends Sedan implements Feature {
	private int peopleCapacity;
	private int loadCapacity;

	public Hatchback(String name, int yearOfRelease, String powerSource, int peopleCapacity, int loadCapacity) {
		super(name, yearOfRelease, powerSource);
		this.peopleCapacity = peopleCapacity;
		this.loadCapacity = loadCapacity;
	}

	@Override
	public int getPeopleCapacity() {
		// TODO Auto-generated method stub
		return peopleCapacity;
	}

	@Override
	public int getLoadCapacity() {
		// TODO Auto-generated method stub
		return loadCapacity;
	}

	public String getFeature() {
		return "Hatchback";
	}

	public void printInfo() {
		System.out.printf(super.toString() + "수용 인원 : %d(명) 적재 용량 : %d(kg) 특징 : %s\n", peopleCapacity,
				getLoadCapacity(), getFeature());
	}
}

class Notchback extends Sedan implements Feature {
	private int peopleCapacity;
	private int loadCapacity;

	public Notchback(String name, int yearOfRelease, String powerSource, int peopleCapacity, int loadCapacity) {
		super(name, yearOfRelease, powerSource);
		this.peopleCapacity = peopleCapacity;
		this.loadCapacity = loadCapacity;
	}

	@Override
	public int getPeopleCapacity() {
		// TODO Auto-generated method stub
		return peopleCapacity;
	}

	@Override
	public int getLoadCapacity() {
		// TODO Auto-generated method stub
		return loadCapacity;
	}

	public String getFeature() {
		return "Notchback";
	}

	public void printInfo() {
		System.out.printf(super.toString() + "%s 수용 인원 : %d(명) 적재 용량 : %d(kg) 특징 : %s\n", peopleCapacity,
				getLoadCapacity(), getFeature());
	}

}

class SUV extends Vehicle implements PowerSource, MovingPower {
	private String powerSource;
	private String movingPower;

	public SUV(String name, int yearOfRelease, String powerSource) {
		super(name, yearOfRelease);
		this.powerSource = powerSource;
		if (powerSource == "전기") {
			this.movingPower = "전기모터";
		} else {
			this.movingPower = "엔진";
		}
	}

	@Override
	public void printStartDriving() {
		System.out.println(startDriving);
	}

	@Override
	public void printEndDriving() {
		System.out.println(endDriving);
	}

	@Override
	public String getPowerSource() {
		return powerSource;
	}

	@Override
	public String getMovingPower() {
		return movingPower;
	}

	public String toString() {
		return super.toString() + String.format("%s (%s), ", getMovingPower(), getPowerSource());
	}

	@Override
	void printInfo() {

	}

}

class Truck extends SUV implements Feature {
	private int peopleCapacity;
	private int loadCapacity;

	public Truck(String name, int yearOfRelease, String powerSource, int peopleCapacity, int loadCapacity) {
		super(name, yearOfRelease, powerSource);
		this.peopleCapacity = peopleCapacity;
		this.loadCapacity = loadCapacity;
	}

	@Override
	public int getPeopleCapacity() {
		// TODO Auto-generated method stub
		return peopleCapacity;
	}

	@Override
	public int getLoadCapacity() {
		// TODO Auto-generated method stub
		return loadCapacity;
	}

	public String getFeature() {
		return "Hatchback";
	}

	public void printInfo() {
		System.out.printf(super.toString() + "수용 인원 : %d(명) 적재 용량 : %d(kg) 특징 : %s\n", peopleCapacity,
				getLoadCapacity(), getFeature());
	}
}

class CrossOver extends Sedan implements Feature {
	private int peopleCapacity;
	private int loadCapacity;

	public CrossOver(String name, int yearOfRelease, String powerSource, int peopleCapacity, int loadCapacity) {
		super(name, yearOfRelease, powerSource);
		this.peopleCapacity = peopleCapacity;
		this.loadCapacity = loadCapacity;
	}

	@Override
	public int getPeopleCapacity() {
		// TODO Auto-generated method stub
		return peopleCapacity;
	}

	@Override
	public int getLoadCapacity() {
		// TODO Auto-generated method stub
		return loadCapacity;
	}

	public String getFeature() {
		return "Notchback";
	}

	public void printInfo() {
		System.out.printf(super.toString() + "%s 수용 인원 : %d(명) 적재 용량 : %d(kg) 특징 : %s\n", peopleCapacity,
				getLoadCapacity(), getFeature());
	}

}