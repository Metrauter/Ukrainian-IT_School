package classworks.lesson15;

public class ThreeGen<T, K, V> {
    private T ob1;
    private K ob2;
    private V ob3;

    ThreeGen(T o1, K o2, V o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    void showTypes() {
        System.out.println("Type of T is "
                + ob1.getClass().getName());

        System.out.println("Type of K is "
                + ob2.getClass().getName());

        System.out.println("Type of V is "
                + ob3.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    K getOb2() {
        return ob2;
    }

    V getOb3() {
        return ob3;
    }
}
