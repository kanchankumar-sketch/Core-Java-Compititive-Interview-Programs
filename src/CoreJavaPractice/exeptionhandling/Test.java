package CoreJavaPractice.exeptionhandling;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("exception:::" + e);
        }
    }
}
