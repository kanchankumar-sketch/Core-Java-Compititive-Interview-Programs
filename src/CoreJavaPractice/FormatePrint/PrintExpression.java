package CoreJavaPractice.FormatePrint;

import java.util.Scanner;

public class PrintExpression {
  public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                for(int j=0;j<n;j++)
                {
                    a=a+(int)(Math.pow(2,j))*b;
                    System.out.print(a+" ");
                }
                System.out.println();
            }
            in.close();
        }
        // 596290607923
       // 01/01/1943
    //473698835688
    //01/01/1964
    //mishrilal sharma
    //8521976610 Sona lal
    }

