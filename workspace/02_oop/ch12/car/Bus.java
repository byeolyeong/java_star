package ch12.car;

public class Bus extends Car{
    private int passengerCount; // 승객 수
    private String no; // 버스 번호
    private String type;    // 광역 버스, 마을버스...
    private String[] stations;  // 버스 노선
    private int station; // 현재 위치
    private int price;  // 승차비
    private int maxPassengerCount; // 최대 승객 수
    private int money;  // 현재까지의 수익
    private int totalMoney; // 운영하는 모든 버스의 수익


    // 컴파일러에 의해서 자동으로 생성되는 기본 생성자 모습
//    Bus(){
//        super();    // 기본생성자를 만드려고 해서 오류가 생김.
//    }

// 우클릭 > generate > construct
    public Bus(String model, String no, String type, String[] stations, int price, int maxPassengerCount) {
//        super(); // 명시적으로 부모의 생성자를 호출하는 코드가 없으면, 부모의 기본 생성자를 호출하는 코드가 컴파일러에 의해서 자동으로 추가
        super(model);
        this.no = no;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.maxPassengerCount = maxPassengerCount;
    }

    // 승차합니다.
    void ride(){
        if(passengerCount < maxPassengerCount){
            passengerCount++;
            System.out.println("1명이 승차하였습니다.");
        } else {
            System.out.println("승차 인원이 초과되었습니다. 다음 버스를 이용해주세요.");
        }

    }
    // 하차합니다.
    void leave(){
        passengerCount--;
        System.out.println("1명이 하차하였습니다.");
    }

    // 오버라이딩 : 부모 메서드를 자식이 재정의
    void stop(){
        // 부모에 만들어놓은 메서드를 사용하고싶을때 super.를 사용하기
        super.stop(); // super.을 이용해 부모의 stop 메서드를 호출
        station++;
        if(station == stations.length){
            station = 0;
        }
        System.out.println("이번 역은 " + stations[station] + "역 입니다. This stop is...");
    }

    // 기다리는 버스가 몇 정거장 전에 있는가?
    int getStationsLeft(){
        int result = 0;

        return  result;
    }

    // 버스의 현재 상태를 출력합니다
    String getBusInfo(){
        return "버스 번호 : " + no
                + ", 종류 : " + type
                + ", 버스 요금 : " + price
                + ", 현재 위치 : " + stations[station]
                + ", 남은 죄석 : " + (maxPassengerCount - passengerCount);
    }
}


