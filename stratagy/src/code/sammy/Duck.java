package code.sammy;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    public Duck(FlyBehavior flyBehavior) {this.flyBehavior = flyBehavior; }

    public void performFly() {flyBehavior.fly(); }

}
