package ch11.mycar.ex02;

// 필드와 메소드를 정의한 클래스
// 생성자 추가
public class Car {
    // 필드 (필드의 위치는 어디에 쓰든 문법적으로는 상관은 없지만, 보통은 필드를 먼저 나열을 한 후, 메소드 사이에 생성자를 넣어준다.)
    // 필드는 인스턴스가 생성될 때 만들어지고, Heap영역에 남아있으면 계속 남아있음
    String model;
    int speed;  // 필드를 초기화 하지 않으면 기본값으로 초기화 됨
    int gear;

    // 생성자  (반환값(return), void 작성 X) : 인스턴스가 호출될 때 자동으로 호출되는 메서드
    // 클래스 내부에 생성자를 하나도 만들지 않을 경우에 자바 컴파일러가 기본 생성자를 만들어준다.
    // 생성자를 하나라도 명시적으로 만들었을 경우 기본 생성자가 만들어지지 않음
    // 기본 생성자 : 매개변수가 없는 생성자
//    Car(){
//        System.out.println("Car() 생성자 호출됨");
//    }

    // 생성자도 Overloading이 가능함.(매개변수가 다르면 사용이 가능함)
    // 생성자는 클래스와 이름이 같아야 하기 때문에, 매개변수를 다르게 해줘야함
    Car(String model, int speed){  // 생성자는 메서드가 아님. 굳이 메서드라고 하면 특별한 목적의 메서드임.
        System.out.println("Car(String name) 생성자가 호출됨");
        this.model = model; // this는 자기 자신 인스턴스의 참조변수(= Car의 인스턴스.)
        // this를 쓰지 않으면 매개변수와 멤버변수의 이름이 겹치기 때문에 붙여줌.
        this.speed = speed;
    }

    // 10km/h 가속한다
    void speedUp() {
        speed += 10;    // 중복되지 않으면 this를 붙일 필요가 없다
        System.out.println("가속합니다. 현재 속도는 " + speed + "km/h 입니다.");
    }

    // 10km/h 감속한다
    void speedDown() {
        speed -= 10;
        System.out.println("감속합니다. 현재 속도는 " + speed + "km/h 입니다.");
    }

    // 기어를 1단 올린다
    void gearUp() {
        gear++;
        System.out.println("기어를 1단 올려서 " + gear + "단이 되었습니다.");
    }

    // 기어를 1단 내린다
    void gearDown() {
        gear--;
        System.out.println("기어를 1단 내려서 " + gear + "단이 되었습니다.");
    }

    // 출발한다
    void start() {
        System.out.println(model + ": 출발합니다.");
        gearUp();
        speedUp();

    }

    // 멈춘다
    void stop() {
        System.out.println("멈춥니다.");
        gear = 0;
        while (speed > 0) {
            speedDown();
        }
    }
}