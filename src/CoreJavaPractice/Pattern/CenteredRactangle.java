 package CoreJavaPractice.Pattern;

import java.util.Scanner;

public class CenteredRactangle {
    public static void CentralTrianle()
    {
        System.out.print("Enter height:::=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++)
            {
                System.out.print("*");
            }
            for (int j=2;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Enter choice");
            System.out.println("1.Make new Centraltriangle \n 2.Exit");
            Scanner sc=new Scanner(System.in);
            int ch= sc.nextInt();

            switch(ch)
            {
                case 1:CentralTrianle();
                    break;
                case 2: System.exit(0);
                default : System.out.println("Invalid Selection Choose again");
                    break;
            }
        }

    }
}
