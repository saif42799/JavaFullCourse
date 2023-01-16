package AccessModifers.package1;
import AccessModifers.package2.*;

public class A {

    protected String protectMessage = "This is protected";

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.publicMessage);



    }
}
