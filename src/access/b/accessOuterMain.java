package access.b;

import access.a.AccessData;

public class accessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();


        //같은 패키지 default 호출 가능
//        data.defaultField = 2;
//        data.defaultMethod();
//
//        private 호출 불가
//        data.privateField = 2;
//        data.privateMethod();

        data.innerAccess();

    }
}
