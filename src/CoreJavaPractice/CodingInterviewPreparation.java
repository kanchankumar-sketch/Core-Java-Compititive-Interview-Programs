package CoreJavaPractice;
interface IFruit{
    static final String TYPE="Apple";
}
class fruit implements IFruit
{

}

public class CodingInterviewPreparation extends fruit {
    static  int a=1111;
    static {
        a=a-- - --a;
    }
    static {
        a=a++ + ++a;
    }
    public static void main(String[] args) {
        //
        //\u000d System.out.println("hoooooooo]==="+a);
        String s="one"+1+2+"hii";

        Integer i1=128;
        Integer i2=128;
        System.out.println(i1.equals(i2));
        int i=10+(+11)-(-12)+(+13)-(-14)+(+15);
    boolean a="random".equals("rAndom");
        System.out.println(IFruit.TYPE);
        System.out.println(Math.min(Double.MIN_VALUE,0.8d));
    }

}
