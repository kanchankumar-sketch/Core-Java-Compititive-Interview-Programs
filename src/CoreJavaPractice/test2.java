package CoreJavaPractice;

public class test2 {
    public static void main(String[] args) {
        final class constant{
            public final static String name="PI";
        }
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(constant.name);
            }
        });
        thread.start();
    }
}
