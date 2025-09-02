package edu.inheritance.ex2;

/**
 * 교통수단 클래스 상속 실습 문제
 *
 * Vehicle 부모 클래스와 Car, Motorcycle, Bicycle 자식 클래스들을 활용하여
 * 상속의 개념과 메소드 오버라이딩을 연습합니다.
 */
public class VehicleInheritanceRun {

    public static void main(String[] args) {

        // ============== 문제 1: 기본 생성자 + Setter 활용 ==============
        // Car 객체를 기본 생성자로 생성하고 setter로 다음 정보를 설정하세요.
        // 브랜드: "현대", 모델: "아반떼", 연도: 2023, 색상: "흰색", 연료타입: "가솔린", 문개수: 4

        Car car1 = new Car();
        // 여기에 setter 메소드들을 사용하여 정보 설정
        car1.setBrand("현대");
        car1.setModel("아반떼");
        car1.setYear(2023);
        car1.setColor("흰색");
        car1.setFuel("가솔린");
        car1.setDoor(4);

        // ============== 문제 2: 매개변수 생성자 활용 ==============
        // Motorcycle 객체를 매개변수 생성자로 생성하세요.
        // 브랜드: "야마하", 모델: "R1", 연도: 2022, 색상: "파란색", 배기량: 998, 헬멧착용: true

        Motorcycle motorcycle = new Motorcycle("야마하", "R1", 2022, "파란색", 998, true);
        // 여기에 코드 작성


        // ============== 문제 3: 다양한 생성자 활용 ==============
        // Bicycle 객체 두 개를 서로 다른 생성자로 생성하세요.
        // bike1: 4개 매개변수 생성자 사용 ("트렉", "FX", 2023, "검정색")
        // bike2: 6개 매개변수 생성자 사용 ("자이언트", "이스케이프", 2023, "빨간색", 21, true)

        // 여기에 코드 작성
        Bicycle bicycle = new Bicycle("트렉", "FX", 2023, "검정색");
        Bicycle bicycle1 = new Bicycle("자이언트", "이스케이프", 2023, "빨간색", 21, true);

        Vehicle[] vehicles = {car1, motorcycle, bicycle, bicycle1};

        // ============== 문제 4: 교통수단 정보 출력 ==============
        // 모든 교통수단의 기본 정보를 showInfo() 메소드로 출력하세요.

        System.out.println("=== 교통수단 정보 ===");
        // 여기에 코드 작성
        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
        }

        // ============== 문제 5: 공통 행동 테스트 ==============
        // 모든 교통수단이 시동을 걸고 정지하는 행동을 해보세요. (start, stop 메소드)

        System.out.println("\n=== 시동 걸기 ===");
        // 여기에 코드 작성
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

        System.out.println("\n=== 정지하기 ===");
        // 여기에 코드 작성
        for (Vehicle vehicle : vehicles) {
            vehicle.stop();
        }

        // ============== 문제 6: 오버라이딩된 메소드 테스트 ==============
        // 각 교통수단의 고유한 가속과 제동 방식을 확인하세요.

        System.out.println("\n=== 가속 방식 ===");
        // 여기에 accelerate() 메소드 호출
        for (Vehicle vehicle : vehicles) {
            vehicle.accelerate();
        }

        System.out.println("\n=== 제동 방식 ===");
        // 여기에 brake() 메소드 호출
        for (Vehicle vehicle : vehicles) {
            vehicle.brake();
        }

        // ============== 문제 7: 각 교통수단의 고유 메소드 실행 ==============
        // 자동차: honk(), openTrunk()
        // 오토바이: wheelie(), putOnHelmet()
        // 자전거: ringBell(), pedal()

        System.out.println("\n=== 교통수단별 특별한 행동 ===");
        // 여기에 코드 작성
        car1.honk();
        motorcycle.wheelie();
        bicycle1.ringBell();

        // ============== 문제 8: 상속 관계 확인 ==============
        // instanceof 연산자를 사용하여 각 객체가 Vehicle의 인스턴스인지 확인하세요.

        System.out.println("\n=== 상속 관계 확인 ===");
        // 여기에 instanceof 확인 코드 작성
        // 예: System.out.println("car1은 Vehicle의 인스턴스입니다: " + (car1 instanceof Vehicle));
        System.out.println("car1은 Vehicle의 인스턴스입니다. : " + (car1 instanceof  Vehicle));
        System.out.println("motorcycle은 Vehicle의 인스턴스입니다. : " + (motorcycle instanceof  Vehicle));
        System.out.println("bicycle은 Vehicle의 인스턴스입니다. : " + (bicycle1 instanceof  Vehicle));

        // ============== 문제 9: 정보 수정 후 재확인 ==============
        // car1의 연도를 2024로, 연료타입을 "하이브리드"로 변경한 후 정보를 다시 출력하세요.

        System.out.println("\n=== 정보 수정 후 ===");
        // 여기에 코드 작성
        car1.setYear(2024);
        car1.setFuel("하이브리드");
        car1.showInfo();


        // ============== 문제 10: Super 키워드 이해 ==============
        // 자식 클래스 생성자에서 부모 생성자가 어떻게 호출되는지 확인해보세요.
        // 새로운 Car 객체를 여러 생성자로 만들어 차이점을 관찰하세요.

        System.out.println("\n=== Super 키워드 테스트 ===");
        Car car2 = new Car(); // 기본 생성자
        Car car3 = new Car("기아", "K5", 2023, "회색"); // 4개 매개변수 생성자
        Car car4 = new Car("BMW", "320i", 2023, "검정색", "디젤", 4); // 6개 매개변수 생성자

        // 각 자동차 정보 출력해보기
        car2.showInfo();
        car3.showInfo();
        car4.showInfo();


        // ============== 보너스 문제 1: 메소드 오버라이딩 vs 부모 메소드 ==============
        // Vehicle의 기본 accelerate()와 자식의 오버라이딩된 accelerate() 비교

        System.out.println("\n=== 오버라이딩 비교 ===");
        Vehicle vehicle = new Vehicle("일반", "교통수단", 2023, "무색");
        vehicle.accelerate(); // 부모 클래스 메소드
        car1.accelerate();    // 오버라이딩된 메소드


        // ============== 보너스 문제 2: 생성자 체이닝 ==============
        // 같은 정보를 가진 교통수단을 서로 다른 방식으로 생성해보세요.
        // 방식1: 기본 생성자 + setter들
        // 방식2: 매개변수 생성자

        System.out.println("\n=== 생성자 방식 비교 ===");
        // 같은 정보("혼다", "시빅", 2023, "은색")를 가진 두 개의 Car 객체를 다른 방식으로 생성
        Car carA = new Car("혼다", "시빅", 2023, "은색");
        Car carB = new Car();
        carB.setBrand("혼다");
        carB.setModel("시빅");
        carB.setYear(2023);
        carB.setColor("은색");
        carA.showInfo();
        carB.showInfo();

        // ============== 보너스 문제 3: 교통수단 종류별 통계 ==============
        // 각 교통수단별 연도 평균과 가장 최신 모델을 찾아보세요.

        System.out.println("\n=== 교통수단 통계 ===");
        Vehicle[] allVehicles = {
                car1, motorcycle, bicycle, bicycle1, car2, car3, car4, carA, carB, vehicle
        };

        int carCount = 0, motorcycleCount = 0, bicycleCount = 0;
        int carYearSum = 0, motorcycleYearSum = 0, bicycleYearSum = 0;

        Vehicle newestCar = null;
        Vehicle newestMotorcycle = null;
        Vehicle newestBicycle = null;

        for (Vehicle v : allVehicles) {
            if (v instanceof Car) {
                carCount++;
                carYearSum += v.getYear();
                if (newestCar == null || v.getYear() > newestCar.getYear()) {
                    newestCar = v;
                }
            } else if (v instanceof Motorcycle) {
                motorcycleCount++;
                motorcycleYearSum += v.getYear();
                if (newestMotorcycle == null || v.getYear() > newestMotorcycle.getYear()) {
                    newestMotorcycle = v;
                }
            } else if (v instanceof Bicycle) {
                bicycleCount++;
                bicycleYearSum += v.getYear();
                if (newestBicycle == null || v.getYear() > newestBicycle.getYear()) {
                    newestBicycle = v;
                }
            }
        }

        System.out.println("--- 자동차 통계 ---");
        if (carCount > 0) {
            System.out.printf("평균 연식: %.1f\n", (double) carYearSum / carCount);
            System.out.println("가장 최신 모델: " + newestCar.getBrand() + " " + newestCar.getModel() + " (" + newestCar.getYear() + "년)");
        } else {
            System.out.println("자동차 데이터가 없습니다.");
        }

        System.out.println("--- 오토바이 통계 ---");
        if (motorcycleCount > 0) {
            System.out.printf("평균 연식 : %.1f\n", (double) motorcycleYearSum / motorcycleCount);
            System.out.println("가장 최신 모델 : " + newestMotorcycle.getBrand() + " " + newestMotorcycle.getModel() + " (" + newestBicycle.getYear() + "년)");
        } else {
            System.out.println("오토바이 데이터가 없습니다.");
        }

        System.out.println("--- 자전거 통계 ---");
        if (bicycleCount > 0) {
            System.out.printf("평균 연식 : %.1f\n", (double) bicycleYearSum / bicycleCount);
            System.out.println("가장 최신 모델 : " + newestBicycle.getBrand() + " " + newestBicycle.getModel() + " ( " + newestBicycle.getYear() + "년)");
        }

        System.out.println("\n🚦 교통수단 관리 시스템 종료!");
    }

}

