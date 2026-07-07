package ch06.annotation;

import java.sql.Time;

public class AnnotationTest {
    void main(){
        Work w = new Work();
//        w.task1();
//        w.task2();

        TimeProcessor processor = new TimeProcessor();
        processor.process(w);
    }
}
