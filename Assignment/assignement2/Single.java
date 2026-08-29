class Add {
    int a = 10;

    void demo() {
        int x = 20, y = 30;
        System.out.println("addition:" + (a + x + y));

    }
}

class Subtract extends Add {
    int b = 5;

    void subtract() {
        System.out.println("subtract:" + (a - b));
    }
}

public class Single {
    public static void main(String args[]) {
        Subtract s = new Subtract();
        s.demo();
        s.subtract();

    }

}
