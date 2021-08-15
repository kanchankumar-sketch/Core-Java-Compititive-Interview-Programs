package CoreJavaPractice.Competitive.DSA.Mathematical;

public class Armstrong {
    public static void main(String[] args) {
        Integer sum=0;
        Integer n=153;
        Integer t=n;
        while(n!=0)
        {   Integer rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(t.equals(sum))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
