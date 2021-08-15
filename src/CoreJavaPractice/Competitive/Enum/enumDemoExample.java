package CoreJavaPractice.Competitive.Enum;
enum EnumRator {
    RED("Stop"),GREEN("GO"),YELLOW("SLOW DOWN");
    private String action;
    public String getAction() {
        return this.action;
    }
    EnumRator(String action) {
        this.action = action;
    }
}

public class enumDemoExample {
    public static void main(String[] args) {
        EnumRator[] enumdemo = EnumRator.values();
        for (EnumRator e: enumdemo)
        {
            System.out.println("Name:"+e.name()+"  Action:"+e.getAction());
        }
    }
}
