import code.phone.Phone;
import code.phone.PhoneBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Shop{
    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("Android").setBattery(900).setScreenSize(50).getPhone();
        System.out.println(p);
    }
}