package CoreJavaPractice.Competitive.DSA.Mathematical;

import java.util.ArrayList;
import java.util.List;

public class TableOfNumber {
    public static void main(String[] args) {
        int N=4;
        ArrayList<Integer> table=new ArrayList<Integer>();
        for(int i=1;i<=10;i++)
        {
            table.add(N*i);
        }
        System.out.println(" "+table);
        table.remove(3);
        System.out.println(" "+table);
        table.set(3,16);
        System.out.println(" "+table);
        table.add(4,20);
        System.out.println(" "+table);
        List<Integer> List=new ArrayList<Integer>();
        List.addAll(table);
        System.out.println(" "+List);
        List.removeIf(n -> (n>6));
        System.out.println(List);
    }
}
