package homework.h02;

import java.util.Scanner;

public class GameFunction {
    // return을 int 배열로 넣어줬기때문에 iut[] 배열로 메소드를 정의시켜주기(void는 return 사용이 불가능함)
    static int[] fight(int hp, int enemyHp){    // (int hp, int enemyHp 는 메인메소드에서 값을 받아야하기 때문에 매개변수로 지정.    // 각각의 메소드를 정의해줌
        System.out.println("적을 공격합니다.");
        int enemyDamage = (int)(Math.random() * 11);    // ?..
        enemyHp -= enemyDamage;
        int damage = (int)(Math.random() * 11);
        hp -= damage;
        System.out.println("적에게 " + enemyDamage + "의 피해를 입혔고 " + damage + "의 피해를 받았습니다." );
        System.out.println("당신의 남은 체력은 " + hp + "입니다.");
        System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");

        return new int[]{hp, enemyHp};  // return은 값을 하나만 리턴시킬 수 있기때문에, 배열로 리턴을 해준다.
    }

     static int[] runAway(int hp){
         int damage = (int)(Math.random() * 3);
         hp -= damage;
         int enemyHp = (int)(Math.random() * 90) + 10; // 10 ~ 99
         System.out.println("도망간다. 대신 " + damage + "의 체력이 소비되었다.");
         System.out.println("남은 체력은 " + hp + "입니다.");
         return new int[]{hp, enemyHp};
    }

    static int heal(int hp){
        hp += 10;
        System.out.println("체력이 10 회복 되었다.");
        System.out.println("남은 체력은 " + hp + "입니다.");
        return hp;
    }

    static int[] useUltimateSkill(int hp, int enemyHp, int ultimateSkill) {
        if (ultimateSkill > 0) {
            int chance = (int) (Math.random() * 2);
            int enemyDamage = enemyHp * chance;
            enemyHp -= enemyDamage;
            int damage = 0;
            ultimateSkill--;
            System.out.println("필살기를 사용하셨습니다.");
            System.out.println("적에게 " + enemyDamage + "의 피해를 입혔고 " + damage + "의 피해를 받았습니다.");
            System.out.println("당신의 남은 체력은 " + hp + "입니다.");
            System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
        } else {
            System.out.println("사용할 수 있는 필살기가 없습니다.");

        }
        return new int[]{enemyHp, ultimateSkill};
    }

    static void ending(int hp, int enemyHp){
        if(hp <= 0) {
            System.out.println("당신은 사망했습니다. -The end-");
        } else if(enemyHp <= 0) {
            System.out.println("전투에서 승리하셨습니다. -The end-");
        }
    }

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
        int enemyHp = (int)(Math.random() * 90) + 10;;   // 적군 에너지 // 10 ~ 99
        int enemyDamage = 0;    // 적군 피해량
        System.out.println(name + "님 어서오세요. 게임을 시작합니다.");   // 해당 문구가 나오면서 게임을 실행함 (Output)


        //중첩 for문을 이용해서 추가적인 전투를 실행할 수 있게 만들 수 있음
        System.out.println("당신의 체력은 " + hp + "입니다.");
        System.out.println(enemyHp + "체력을 가진 적을 발견했습니다. 당신은 어떤 행동을 하시겠습니까?");
        while(hp > 0 && enemyHp > 0){

            System.out.println("1) 공격  2) 도망  3) 체력 회복 사용(+ 10 HP)   4) 궁극기 사용");
            int action = s.nextInt();

            switch(action) {
                case 1 -> {
                    // 현재의 hp, enemyHp를 전달해서 싸운다.
                    int[] result = fight(hp, enemyHp);
                    // 싸우고 난 후의 수정된 Hp, enemyHp를 적용한다.
                    hp = result[0];
                    enemyHp = result[1];

                }
                case 2 -> {
                    // 현재의 hp, enemyHp를 전달해서 도망간다.
                    int[] result = runAway(hp);
                    // 싸우고 난 후의 수정된 Hp, enemyHp를 적용한다.
                    hp = result[0];
                    enemyHp = result[1];
                }

                case 3 -> {
                    hp = heal(hp);
                }
                case 4 -> {
                  int[] result = useUltimateSkill(hp, enemyHp, ultimateSkill);
                  enemyHp = result[0];
                  ultimateSkill = result[1];
                }
            }

            if(hp <= 0 || enemyHp <= 0) {
                break;
            }
        }

        ending(hp, enemyHp);
    }
}
