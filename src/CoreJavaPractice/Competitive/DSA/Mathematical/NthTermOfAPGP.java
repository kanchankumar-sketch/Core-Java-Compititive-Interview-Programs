package CoreJavaPractice.Competitive.DSA.Mathematical;

public class NthTermOfAPGP {
    public static void main(String[] args) {
        int a=5,  r=9, n=10;

            // code here tn=a*r(n-1)
            int Nth= a * (int)Math.pow(r, n-1);
            System.out.println(Nth);
    }
}

