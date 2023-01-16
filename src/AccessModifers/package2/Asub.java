package AccessModifers.package2;
import AccessModifers.package1.*;

public class Asub extends A {
    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.noModDefaluMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectMessage);

    }

}
