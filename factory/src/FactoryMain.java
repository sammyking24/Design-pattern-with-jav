import com.phone.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FactoryMain {
    public static void main(String [] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();

        OperatingSystem obj = osf.getInstance("Closed");
        obj.spec();

    }
}