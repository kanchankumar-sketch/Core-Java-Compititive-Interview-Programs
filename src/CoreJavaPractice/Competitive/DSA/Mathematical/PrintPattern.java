package CoreJavaPractice.Competitive.DSA.Mathematical;

public class PrintPattern {
    public static void main(String[] args) {
        // Your code here
        int n=2;
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>0;j--)
            {
                for(int z =0; z< n-i ; z++)
                {
                    System.out.print(j+" ");
                }
                //System.out.print(j);
            }
            System.out.print("$");

        }
    }
}
