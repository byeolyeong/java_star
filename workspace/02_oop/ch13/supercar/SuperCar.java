package ch13.supercar;

public class SuperCar {
    int zero100;

    SuperCar(int zero100){
        this.zero100 = zero100;
    }
    void move(){
        // 4    (호출을 하고 실행을 했으니 리턴)
        System.out.println("슈퍼카가 100m 달리는데 " + zero100 + "초 걸렸다.");
    }
}
