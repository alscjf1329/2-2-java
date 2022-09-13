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

	abstract void PrintInfo();
	abstract void printCarType();
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
	void PrintInfo() {
		System.out.println(this.toString());
	}

	@Override
	void printCarType() {
		System.out.print("Sedan");
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("수용 인원 : %d(명) 적재 용량 : %d(kg) 특징 : %s", peopleCapacity,
				getLoadCapacity(), getFeature());
	}

	public void PrintInfo() {
		System.out.println(this.toString());
	}
	@Override
	void printCarType() {
		// TODO Auto-generated method stub
		super.printCarType();
		System.out.println(" - Hatchback");
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("수용 인원 : %d(명) 적재 용량 : %d(kg) 특징 : %s", peopleCapacity,
				getLoadCapacity(), getFeature());
	}

	public void PrintInfo() {
		System.out.println(this.toString());
	}
	void printCarType() {
		// TODO Auto-generated method stub
		super.printCarType();
		System.out.println(" - Notchback");
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
	void PrintInfo() {
		System.out.println(this.toString());
	}
	@Override
	void printCarType() {
		System.out.print("SUV");
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
		return "Truck";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("수용 인원 : %d(명) 적재 용량 : %d(kg) 특징 : %s", peopleCapacity,
				getLoadCapacity(), getFeature());
	}

	public void PrintInfo() {
		System.out.println(this.toString());
	}
	void printCarType() {
		super.printCarType();
		System.out.println(" - Truck");
	}
}

class CrossOver extends SUV implements Feature {
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
		return "CrossOver";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("수용 인원 : %d(명) 적재 용량 : %d(kg) 특징 : %s", peopleCapacity,
				getLoadCapacity(), getFeature());
	}

	public void PrintInfo() {
		System.out.println(this.toString());
	}
	void printCarType() {
		super.printCarType();
		System.out.println(" - CrossOver");
	}
}