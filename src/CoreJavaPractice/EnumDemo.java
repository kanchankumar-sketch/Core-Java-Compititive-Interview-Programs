package CoreJavaPractice;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

enum Day{
    Sunday , Monday , Tuesday , Wednesday , Thursday , Friday , Saturday
}
public class EnumDemo {
    Day day;
    public EnumDemo(Day day)
    {
        this.day=day;
    }
    public void work()
    {
        switch (day)
        {
            case Monday:System.out.println("Monday is bad.");
                break;
            case Tuesday:System.out.println("Tuesday is better");
                break;
            case Saturday:System.out.println("sturday is best");
                break;
            default:System.out.println("Mid Day are so-so");
                break;
        }
    }

    public static void main(String[] args) {
        EnumDemo endm1=new EnumDemo(Day.Monday);
        endm1.work();
    }
}
