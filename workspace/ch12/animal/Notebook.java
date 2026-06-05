package ch12.animal;

// 상속은 관계(is a)가 성립이 되어야함
// Notebook is a(= extends) Animal 이라고 생각을 하면 됨.(해당 관계는 성립이 되지 않음.)
public class Notebook extends Animal{
        void turnOn(){
            System.out.println("전원을 킨다.");
        }
}
