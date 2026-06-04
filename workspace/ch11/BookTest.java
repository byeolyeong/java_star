package ch11;

// 하나의 소스코드(.java) 내에 여러 개의 클래스를 정의할 수 있음
// 단, public class는 하나에만 지정 가능하고 파일명과 동일한 클래스에만 지정이 가능함
class Book {
    // 필드 생성
    String title;
    String author;

    // 생성자 작성
    Book(){ // 명시적으로 생성자를 만들었기 때문에, 기본 생성자를 직접 만들어줘야함
        this("제목 미상", "작가 미상"); // 자신의 생성자를 호출(this()는 생성자 안에서만 사용 가능.)
//        this.title = "자바 기초";
//        this.author = "자바의 신";
    }

    // 생성자 작성
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

}

public class BookTest { // 파일명과 똑같은 곳에 public을 붙일 수 있음
    public static void main(String[] args){
        Book book1 = new Book();    // 생성자를 호출 1
//        book1.title = "자바 기초";
//        book1.author = "자바의 신";
        Book book2 = new Book("자바를 잡아라", "용쌤"); // 생성자를 호출 2

        System.out.println("제목 : " + book1.title + ", 작가 : " + book1.author);
        System.out.println("제목 : " + book2.title + ", 작가 : " + book2.author);
    }
}
