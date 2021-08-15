package CoreJavaPractice.Competitive.array;

import java.util.Scanner;

public class FindIndexOfElement {
    public static void main(String[] args) {
        Integer a[][] = new Integer[4][4];
        System.out.println("Enter Array Element");
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number to find element=");
        int find =sc.nextInt();
        for (int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                if(a[i][j].equals(find))
                {
                    System.out.println("Position is("+i+","+j+")");
                }
            }
        }

    }
}
