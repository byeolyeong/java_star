package ch13.supercar;

public class DriveTest {
    public static void main(String[] args){

        GasolineCar gcar = new GasolineCar(8);   // 생성자 호출
        HybridCar hcar = new HybridCar(7);
        ElectricCar ecar = new ElectricCar(4);
        PlugInHybridCar pcar = new PlugInHybridCar(5);
        Driver driver = new Driver();

        // 1 (프로그램 실행 순서)
        driver.drive(gcar); // driver에 정의된 drive 메서드를 호출
        driver.drive(hcar);
        driver.drive(ecar);
        driver.drive(pcar);

        // 6
        System.out.println("프로그램 종료");
    }
}
