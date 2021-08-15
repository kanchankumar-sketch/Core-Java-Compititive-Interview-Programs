package CoreJavaPractice.Competitive.DSA.Mathematical;

import static java.lang.Math.abs;
import static javax.swing.text.html.HTML.Attribute.N;

public class closestNumber {
    public static void main(String[] args) {
        int N1=13;
        int N2=13;
        int M=4;
        while((N1%M)!=0 && (N2%M)!=0)
        {
            N1++;
            N2--;
        }
        if((N1%M)==0 && (N2%M)==0)
        {
            if(abs(N1)>abs(N2))
            {
                System.out.println(N1);
            }
            else {
                System.out.println(N2);
            }
        }
        if((N1%M)==0 && (N2%M)!=0)
        {
            System.out.println(N1);
        }
        if ((N1%M)!=0 && (N2%M)==0)
        {
            System.out.println(N2);
        }

    }
}
