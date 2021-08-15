package CoreJavaPractice.Pattern;

import java.util.Scanner;

public class LeftnumRightAlfa {
    public static void main(String[] args) {
        System.out.print("Enter height:::=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int z=0;z<=i;z++)
            {
                System.out.print(1+z);
            }
            for (int j=1;j<=i;j++) {
                System.out.print((char)(i-j+65));
            }
            System.out.println();
        }
    }
}
