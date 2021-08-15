package CoreJavaPractice;

public   class Recatngle {
     int length;
    int breath;
    public Recatngle()
    {
        length=34;
        breath=35;
    }
    static {
        System.out.println("It should be first to run in field.............");
    }
    public Recatngle(int length,int breath)
    {
        this.length=length;
        this.breath=breath;
    }
    static {
        System.out.println("It should be first to run in field");
    }
    private int area()
    {
        int ar=(length*breath);
        return ar;
    }

    public static void main(String[] args) {
        String same="first";
        System.out.println("hashcosdeeddhucdhjsdhj====="+same.contentEquals(""));
        Recatngle rect=new Recatngle();
        Recatngle rect1=new Recatngle(23,56);
        System.out.println("rect onject breath and length is:"+rect.length+"breath :"+rect.breath);
        System.out.println("rect1 onject breath and length is:"+rect1.length+"breath :"+rect1.breath);
        int are1=rect.area();
        System.out.println("area of rect obj"+are1);
        int area2=rect1.area();
        System.out.println("rect1 onject area is:"+area2);
    }

}
