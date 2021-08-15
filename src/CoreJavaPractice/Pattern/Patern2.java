package CoreJavaPractice.Pattern;

public class Patern2 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int line=6;
        int ll=line/2;
        //  String s="*";
        while(i!=7)
        {
            for (j=1;j<=ll;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j=ll;j<line;j++)
            {
                System.out.print(" ");
            }
                i++;
            System.out.println();
        }
    }
}
