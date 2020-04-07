
class Based extends Main{
    static {
        System.out.println("sadas");
    }
    public Based(String s){
        System.out.println(s);
    }
}

public class Main {
    static {
        System.out.println("asdasd");
    }
    private final static String s = "asd";

    public static void main(String[] args){
            Based b = new Based("123");
    }
}
