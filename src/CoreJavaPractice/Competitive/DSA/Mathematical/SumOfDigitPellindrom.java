package CoreJavaPractice.Competitive.DSA.Mathematical;

import java.util.Scanner;

public class SumOfDigitPellindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your No to Check sum of digit is pellindrom ");
        Integer N=sc.nextInt();
        Integer sum=0;
        while(N!=0)
        {
            sum=sum+N%10;
            N=N/10;
        }

        System.out.println("Sum="+sum);
        Integer temp=sum;
        Integer reverse=0;
        Integer rem=0;
        while(sum!=0)
        {
            rem=sum%10;
            reverse=rem+(reverse*10);
            sum=sum/10;
        }
        System.out.println("Reverse of sum is="+reverse);
        System.out.println(temp.equals(reverse));
        if(temp.equals(reverse))
        {
            System.out.println("sum of digit of number is pellindrom");
        }
        else
        {
            System.out.println("sum is not  pellindrom");
        }
    }
}
