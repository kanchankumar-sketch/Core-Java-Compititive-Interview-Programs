package CoreJavaPractice.Competitive;

public class SortWithoutStringAPI {
    public static void main(String[] args) {
        String s="Coder Technology";
        char[] chars=s.toCharArray();
        int len=s.length();
        char temp=0;
        for (int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(chars[i]<chars[j])
                {
                    temp=chars[j];
                    chars[j]=chars[i];
                    chars[i]=temp;
                }
            }
        }
        String s1=new String(chars);
        System.out.println(s1);
    }
}
