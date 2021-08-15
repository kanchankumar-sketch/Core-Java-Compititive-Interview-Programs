package CoreJavaPractice.Competitive;

public class ReverseWord {
    public static void main(String[] args) {
        String s[]="kanchan kumar sharma ".split(" ");
        int len = s.length;
        String s1="";
        for(int i=len-1;i>=0;i--)
        {
            s1 +=s[i]+" ";
        }
        System.out.println(s1);
    }
}
