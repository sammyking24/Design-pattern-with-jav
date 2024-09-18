import code.sammy.Duck;
import code.sammy.FlyBehavior;
import code.sammy.FlyWithWings;
import code.sammy.MallerdDuck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FlyBehavior flyWithWings = new FlyWithWings();
        Duck mallerdDuck = new MallerdDuck(flyWithWings);
        mallerdDuck.performFly();

    }
}