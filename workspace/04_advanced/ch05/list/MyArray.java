package ch05.list;

/**
 *  배열의 불편한 점은 다음과 같다.
 *  배열의 불편한 점
 *  생성시 길이를 지정해야 함
 *  생성된 배열의 길이는 수정 못함
 *  요소 추가, 삭제, 삽입이 어려움
 *  한 종류의 데이터만 넣지 못함(Object 클래스를 사용하면 됨)
 *
 *  이러한 불편한 점을 개선하여 배열을 쓰기 쉽게 만드는 클래스
 */
public class MyArray<E> implements MyList<E> {
    // 한 줄 주석

    /**
     * 내부적으로 요소를 저장하는 배열을 선언
     *
     */
    private Object[] data;
    /**
     * 배열의 실제 담겨있는 요소의 개수
     */
    private int count;

    /** Java Doucument 주석
     *  기본 생성자
     *  초기 배열의 크기를 10개로 지정한다.
     */
    public MyArray(){
        this(10);
    }

    /**
     * 초기 배열의 크기를 지정한 size 크기의 배열을 생성한다.
     * @param size  배열의 초기 크기 지정
     */
    public MyArray(int size){
        this.data = new Object[size];
    }

    /**
     * 배열의 마지막 위치에 지정한 elem를 추가한다.
     * @param elem  배열에 추가할 요소
     */
    public synchronized void add(E elem){
        add(count, elem);
    }

    /**
     *  배열의 index에 elem를 삽입한다.
     * @param index 삽입할 위치
     * @param elem 삽일할 요소
     */
    public   void add(int index, E elem){
        if(index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " < 0");
        } else if(index > count) {
            throw new ArrayIndexOutOfBoundsException(index + " > " + count);
        }
        if(count >= data.length) {  // 내부 배열의 공간이 다 찼을 경우 배열의 크기를 늘린다.(1.5배)
            Object[] temp = new Object[data.length + data.length/2];
            for(int i = 0; i<data.length; i++){
                temp[i] = data[i];
            }
//            System.out.println(data.length + " -> " + temp.length);
            data = temp;
        }

        // synchronized는 블록으로 지정이 하면 해당 블록만 기능이 작동함
        // 임계형 영역으로 스레드 코드가 여려개 실행될때 오류가 생기지 않도록 한번에 하나씩만 실행되도록 해주는 코드
        synchronized(this) {
            // index 부터 끝까지 하나씩 뒤로 미는 작업
            System.arraycopy(data, index, data, index + 1, count - index);  // 배열의 복사
            data[index] = elem;
            count++;
        }
    }

    /**
     * 지정한 index의 요소를 삭제한다.
     * @param index
     */
    public void remove(int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);   // throw가 실행되는 순간 나머지 코드는 실행이 안됨
        } else if(index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " < 0");
        } else if(index > count) {
            throw new ArrayIndexOutOfBoundsException(index + " > " + count);
        }

        // index 부터 끝까지 하나씩 앞으로 당기는 작업
        System.arraycopy(data, index+1, data, index, count-index-1);  // 배열의 복사
        count--;
        data[count] = null;
    }

    /**
     * 지정한 위치의 데이터를 반환한다.
     * @param index 반환할 데이터의 위치
     * @return 지정한 위치의 데이터
     */
    public E get(int index){   // 정삭적이면 elem을 하나 return하고, 비정상적이면 throw를 실행한다.
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);   // throw가 실행되는 순간 나머지 코드는 실행이 안됨
        } else if(index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " < 0");
        }
        return (E)data[index];
    }

    public int size(){
        return this.count;
    }

    @Override
    public String toString(){
//       StringBuffer str = new StringBuffer("[");  // 멀티 스레드 환경에서 사용
       StringBuilder str = new StringBuilder("[");  // 싱글 스레드 환경에서 사용

       if(count > 0){
           str.append(data[0]);
       }

       for(int i = 1; i<count; i++) {
           str.append(", ").append(data[i]);
       }

       str.append("]");

       return str.toString();
    }
}
