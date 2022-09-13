
interface Driving {
	String startDriving = "Vehicle Info 시작";
	String endDriving = "Vehicle Info 끝";
}

interface PowerSource {
	String getPowerSource();
	// 자동차의 연료 표현. 가솔린, 디젤, 전기
}

interface MovingPower {
	String getMovingPower();
	// 자동차 구동력을 표현. 엔진 또는 전기모터
}

interface Feature {
	int getPeopleCapacity();

	// 수용인원
	int getLoadCapacity();

	// 적재용량
	String getFeature();
}
