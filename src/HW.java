import java.util.Vector;

public class HW {
	private static final int hatchback = 0;
	private static final int notchback = 1;
	private static final int truck = 2;
	private static final int crossOver = 3;
	private static final String SedanModelNameBundle[] = { "그랜저", "쏘나타", "K8", "G80", "K5", "벤츠 E-Class", "K3",
			"쏘나타 뉴라이즈", "BMW 5-Series", "G90" };
	private static String SUVModelNameBundle[] = { "쏘렌토", "스포티지", "투싼", "셀토스", "QM6", "팰리세이드", "아이오닉5", "GV70", "싼타페",
			"EV6" };
	private static final int yearOfReleaseBundle[] = { 2018, 2019, 2020, 2021, 2022 };
	private static final String powerSourceBundle[] = { "가솔린", "디젤", "전기" };
	private static final int SedanPeopleCapacityBundle[] = { 4, 5 };
	private static final int SUVPeopleCapacityBundle[] = { 8, 9 };
	private static final int loadCapacityBundle[] = { 100, 150, 200, 250, 300 };

	public static void main(String[] args) {
		Vehicle vehicle[] = new Vehicle[random(10, 100)];
		Vector<Vehicle> vehicleV = new Vector<>();
		for (int i = 0; i < vehicle.length; i++) {
			vehicle[i] = makeVehicle();
			vehicleV.add(vehicle[i]);
		}
		vehicle[0].printStartDriving();
		for (int i = 0; i < vehicle.length; i++) {
			System.out.printf("[ %d ]", i + 1);
			vehicleV.get(i).printInfo();
		}
		vehicle[0].printStartDriving();
	}

	public static int random(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

	public static Vehicle makeVehicle() {
		Vehicle vehicle = null;
		switch (random(hatchback, crossOver)) {
		case hatchback: {
			vehicle = new Hatchback(SedanModelNameBundle[random(0, SedanModelNameBundle.length - 1)],
					yearOfReleaseBundle[random(0, yearOfReleaseBundle.length - 1)],
					powerSourceBundle[random(0, powerSourceBundle.length - 1)],
					SedanPeopleCapacityBundle[random(0, SedanPeopleCapacityBundle.length - 1)],
					loadCapacityBundle[random(0, loadCapacityBundle.length - 1)]);
		}
		case notchback: {
			vehicle = new Hatchback(SedanModelNameBundle[random(0, SedanModelNameBundle.length - 1)],
					yearOfReleaseBundle[random(0, yearOfReleaseBundle.length - 1)],
					powerSourceBundle[random(0, powerSourceBundle.length - 1)],
					SedanPeopleCapacityBundle[random(0, SedanPeopleCapacityBundle.length - 1)],
					loadCapacityBundle[random(0, loadCapacityBundle.length - 1)]);
		}
		case truck: {
			vehicle = new Hatchback(SUVModelNameBundle[random(0, SUVModelNameBundle.length - 1)],
					yearOfReleaseBundle[random(0, yearOfReleaseBundle.length - 1)],
					powerSourceBundle[random(0, powerSourceBundle.length - 1)],
					SUVPeopleCapacityBundle[random(0, SUVPeopleCapacityBundle.length - 1)],
					loadCapacityBundle[random(0, loadCapacityBundle.length - 1)]);
		}
		case crossOver: {
			vehicle = new Hatchback(SUVModelNameBundle[random(0, SUVModelNameBundle.length - 1)],
					yearOfReleaseBundle[random(0, yearOfReleaseBundle.length - 1)],
					powerSourceBundle[random(0, powerSourceBundle.length - 1)],
					SUVPeopleCapacityBundle[random(0, SUVPeopleCapacityBundle.length - 1)],
					loadCapacityBundle[random(0, loadCapacityBundle.length - 1)]);
		}
		}
		return vehicle;
	}
}