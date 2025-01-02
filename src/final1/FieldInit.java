package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;

//    public FieldInit(int value) {
//        this.value = value; //컴파일 오류. 이미 초기에 10이라는 값을 할당했기 때문에 final 특성상 안됨.
//    }
}
