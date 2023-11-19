package inhertance;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("Parent Class Mobile");
        SamsungMobile m = new SamsungMobile();
        m.openbox();
        m.insertcard();
        m.startmobile();
        m.registratio();


        System.out.println( " Child Class Sm20Ultra");
        SamsungMobile S20 = new Sm20Ultra();
        S20.openbox();
        S20.insertcard();
        S20.startmobile();
        S20.registratio();

        System.out.println( " Child Class Sm20Ultra");
        SamsungMobile S21 = new Sm21Ultra();
        S21.openbox();
        S21.insertcard();
        S21.startmobile();
        S21.registratio();

        System.out.println( " Child Class Sm20Ultra");
        SamsungMobile S22 = new Sm22Ultra();
        S22.openbox();
        S22.insertcard();
        S22.startmobile();
        S22.registratio();

        System.out.println( " Child Class Tablate");
        SamsungTablate  Tablate = new SamsungTablate();
        Tablate. model();
        Tablate. camera();
        Tablate. Hdd ();
    }
}
