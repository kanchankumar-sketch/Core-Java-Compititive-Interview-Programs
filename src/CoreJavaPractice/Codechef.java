package CoreJavaPractice;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        double aBal=0.0;
        double wBal=0;

        Scanner sc=new Scanner(System.in);
        wBal=sc.nextDouble();
        aBal=sc.nextDouble();
        if(aBal>wBal)
        {
            if((wBal%5)==0)
            {
                System.out.println(aBal-(wBal+0.50));

            }
            else{
                System.out.println(aBal);
            }
        }
        else{
            System.out.println(aBal);
        }

    }
}
