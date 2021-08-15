package CoreJavaPractice.Competitive;

public class ReverseStrinngWithSB {
    public static void main(String[] args) {
        StringBuilder br = new StringBuilder("kanchan");
        System.out.println(br.reverse());
        String word = "kanchan kumar sharma is a very honest and loyal person";
        String word1[] = word.split(" ");
        int n=word1.length;
        for (int i = 0; i <n; i++) {
            System.out.print(word1[9-i]+" ");
        }
    }
}
