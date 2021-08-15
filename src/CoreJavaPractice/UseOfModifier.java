package CoreJavaPractice;
abstract class AbstractClass
{
     String name;
     abstract void name();
}
interface InterfaceExample{
    String name="kanchan";
    void setName();

}
interface InterfaceExample2{
    String name="kanchan";
    void setName();
    void GetName();

}
class myleft implements InterfaceExample,InterfaceExample2 {
    public void lelo() {
        System.out.println("hiiii");

    }

    @Override
    public void setName() {
        System.out.println("2nd interface");
    }
    public void Amazon3()
    {
        System.out.println("jooooo");
    }
    @Override
    public void GetName() {
        System.out.println("3nd interface");
    }
}
public class UseOfModifier {
    public static void main(String[] args) {
        AbstractClass h=new AbstractClass() {
            @Override
            void name() {
                System.out.println("hell abstract");
            }
        };
        //this lambada expresssion only used for functional interface
        myleft IE=new myleft();
        h.name="hii";
        h.name();
        IE.setName();
        IE.Amazon3();

    }
}
