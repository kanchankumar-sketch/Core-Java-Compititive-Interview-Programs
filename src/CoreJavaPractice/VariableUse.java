package CoreJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Arithmatic
{
    int x ,y,c;
    public void addition(int x,int y)
    {
        this.x=x;
        this.y=y;
        c=x+y;
        System.out.println("Addition:="+c);
    }
    public void substraction(int x,int y)
    {
        this.x=x;
        this.y=y;
        c=x-y;
        System.out.println("substraction:="+c);
    }
    public void division(int x,int y)
    {
        this.x=x;
        this.y=y;
        c=x/y;
        System.out.println("division:="+c);
    }
    public void multiplication(int x,int y)
    {
        this.x=x;
        this.y=y;
        c=x*y;
        System.out.println("multiplication:="+c);
    }
    public void modulus(int x,int y)
    {
        this.x=x;
        this.y=y;
        c=x-y;
        System.out.println("modulus:="+c);
    }
    public void operate() throws IOException {
        int a=0,b=0,c=0;
        String ch;
        System.out.println("Play Arithmatic operation");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Enter Two number  a  and   b");
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            System.out.println("Play Arithmatic operation \t 1. Addition \t 2.Substraction \t 3. Multiplication \t 4. modulus \t 5.division  \t 6. exit\n");
            c=Integer.parseInt(br.readLine());
            switch (c) {
                case 1:
                    addition(a, b);
                    break;
                case 2:
                    substraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    modulus(a, b);
                    break;
                case 5:
                    division(a, b);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Option not valid try again.....");
                    break;
            }
            System.out.println("Do you want to exit press \"y\" Ow press \"n\"");
            ch= br.readLine();
            if(ch=="y")
            {
                System.exit(1);
            }
        }while (true);
    }
}

public class VariableUse {

    public static void main(String[] args) throws IOException {
//        int b = 0, c = 0;
//        String Name1="9kanchan";
//
//        int lol=10;
//        String mob=Name1+lol;
//        System.out.println(mob+Name1.charAt(3));
//
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try
//
//        {
//            System.out.println("Enter your roll no:");
//            int a = Integer.parseInt(br.readLine());
//            System.out.println("Enter Your Date of birth:");
//            b=Integer.parseInt(br.readLine());
//            System.out.println("Your details is here ||\t\t Roll No || \t\t  DOB || \t\t  Name   ||");
//            System.out.println("Your details is here ||\t\t "+a+"   ||\t\t "+b+" || \t\t"+Name1+"||");
//        }
//        catch(IOException e)
//        {
//            e.printStackTrace();
//        }
        Arithmatic a1= new Arithmatic();
        a1.operate();

    }

}
