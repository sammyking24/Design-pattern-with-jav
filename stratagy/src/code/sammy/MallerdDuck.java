package code.sammy;

public class MallerdDuck extends Duck{
    public MallerdDuck(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }
    public void performFly(){
        flyBehavior.fly();
    }

}
