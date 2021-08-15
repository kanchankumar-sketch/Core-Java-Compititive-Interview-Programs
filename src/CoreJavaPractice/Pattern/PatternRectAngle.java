package CoreJavaPractice.Pattern;

import java.util.Scanner;

public class PatternRectAngle {

    public static void patternPrinter()
    {
        System.out.println("Enater Height of triangle");
        Scanner sc=new Scanner(System.in);
        int height =sc.nextInt();
        //System.out.println(height);
        for(int i=1;i<=height;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Enter choice");
            System.out.println("1.Make new triangle \n 2.Exit");
            Scanner sc=new Scanner(System.in);
            int ch= sc.nextInt();

            switch(ch)
            {
                case 1:patternPrinter();
                    break;
                case 2: System.exit(0);
                default : System.out.println("Invalid Selection Choose again");
                    break;
            }
        }
    }
}
