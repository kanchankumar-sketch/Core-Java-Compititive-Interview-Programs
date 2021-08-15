package CoreJavaPractice.Pattern;

public class Pattern {
    public static void main(String[] args) {
        int i=1;
        int j=1;
      //  String s="*";
        while(i!=7)
        {
            for (j=1;j<=i;j++)
                System.out.print("*");
            i++;
            System.out.println();
        }
    }
}
