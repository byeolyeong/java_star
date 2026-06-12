package homework.h01;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        System.out.println("*** 멋쟁이 전사처럼 ***");
        Scanner s = new Scanner(System.in);
        System.out.println("캐릭터 이름을 생성해주세요.");
        String name = s.next();     //사용자가 이름을 지정을 했으면 (Input)
        int hp = 50;   // 플레이어 HP
        int damage = 0; // 플레이어 데미지
        int ultimateSkill = 1;  // 필살기 기술 수량
        int Item = 3;   // 체력 회복 포션 수량
        int Defend = 0;    // 적의 공격을 방어
        int enemyHp = 10;   // 적군 에너지
        int enemyDamage = 0;    // 적군 피해량
        System.out.println(name + "님 어서오세요. 게임을 시작합니다.");   // 해당 문구가 나오면서 게임을 실행함 (Output)

        enemyHp = (int)(Math.random() * 90) + 10;   // 10 ~ 99

        //중첩 for문을 이용해서 추가적인 전투를 실행할 수 있게 만들 수 있음
        System.out.println("당신의 체력은 " + enemyHp + "입니다.");
        System.out.println(enemyHp + "체력을 가진 적을 발견했습니다. 당신은 어떤 행동을 하시겠습니까?");
        while(true) {

            System.out.println("1) 공격  2) 수비  3) 체력 회복 사용(+ 10 HP)   4) 궁극기 사용   5) 도망");
            int action = s.nextInt();

            switch(action) {
                case 1 -> {
                    System.out.println("적을 공격합니다.");
                    enemyDamage = (int)(Math.random() * 11);
                    enemyHp -= enemyDamage;
                    damage = (int)(Math.random() * 11);
                    hp -= damage;
                    System.out.println("적에게 " + enemyDamage + "의 피해를 입혔고 " + damage + "의 피해를 받았습니다." );
                    System.out.println(name + "님의 남은 체력은 " + hp + "입니다.");
                    System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
                }
                case 2 -> {     // 05.24 수비 추가 (방어 사용시 50% 경감)
                    System.out.println("적의 공격을 방어합니다.");

                    damage = (int)(Math.random() * 11);     // 적의 공격 피해량
                    damage = damage / 2;    // 피해량 감소

                    hp -= damage;       // 현재 체력 - 감소된 피해량

                    System.out.println("적의 공격을 방어했습니다.");
                    System.out.println(damage + "의 피해를 입었습니다.");

                    System.out.println(name + "의 남은 체력은" + hp + "입니다.");
                    System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
                }

                case 3 -> {     //05.22 회복 사용 횟수 제한
                    if(Item > 0) {
                        int chance = (int) (Math.random() * 4);
                        hp -= damage;
                        Item--;
                        hp += 10;
                        System.out.println("체력 회복을 사용하셨습니다.(남은 횟수 : " + Item + " 회)");
                        System.out.println(name + "님의 체력이 10 회복되었습니다.");
                        System.out.println("적에게 " + enemyDamage + "의 피해를 입혔고 " + damage + "의 피해를 받았습니다." );
                        System.out.println(name + "님의 남은 체력은 " + hp + "입니다.");
                    } else {
                        System.out.println("더 이상 회복할 수 없습니다.");
                    }
                }
                case 4 -> {
                    if(ultimateSkill > 0){
                        int chance = (int)(Math.random() * 2);
                        enemyDamage = enemyHp * chance;
                        enemyHp -= enemyDamage;
                        damage = 0;
                        ultimateSkill--;
                        System.out.println("필살기를 사용하셨습니다.");
                        System.out.println("적에게 " + enemyDamage + "의 피해를 입혔고 " + damage + "의 피해를 받았습니다." );
                        System.out.println(name + "님의 남은 체력은 " + hp + "입니다.");
                        System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
                    } else {
                        System.out.println("사용할 수 있는 필살기가 없습니다.");
                    }
                }
                case 5 -> {
                    damage = (int)(Math.random() * 5);
                    hp -= damage;
                    enemyHp = (int)(Math.random() * 90) + 10;   // 10 ~ 99
                    System.out.println("적에게서 도망쳤습니다. 하지만 당신은 " + damage + "의 피해를 입었습니다." );
                    System.out.println(enemyHp + "새로운 적을 발견했습니다. 어떤 행동을 하시겠습니까?");
                }
            }

            if(hp <= 0 || enemyHp <= 0) {
                break;
            }
        }

        if(hp <= 0) {
            System.out.println("당신은 사망했습니다. -The end-");
        } else if(enemyHp <= 0) {
            System.out.println("전투에서 승리하셨습니다. -The end-");
        }
    }
}
