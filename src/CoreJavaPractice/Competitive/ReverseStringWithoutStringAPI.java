package CoreJavaPractice.Competitive;

public class ReverseStringWithoutStringAPI {
    public static void main(String[] args) {
        String s="Coder Technology";
        System.out.println(s.charAt(0));
        int length = s.length();
        for (int i = length-1;i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
