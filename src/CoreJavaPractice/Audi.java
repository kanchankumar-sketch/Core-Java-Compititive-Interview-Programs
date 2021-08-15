package CoreJavaPractice;

class Car {
    void run()
    {
        System.out.println("car is running");
    }
}
class Audi extends Car {
    void run()
    {
        int o[][] ={{1,2,3,4,5},{1,2,3,4,5}};
        for (int[] k:o)
        {
            for(int l:k) {
                System.out.print(l+" ");
            }
            System.out.println();
        }
        System.out.println("Audi is running safely with 100km");
        System.out.println(60 & 13);
        /* Here is a comment **** */
        /* This is also a comment /* More comments */     }
    public static void main(String args[])
    {
        Car b= new Audi();    //upcasting
        b.run();
    }
}
