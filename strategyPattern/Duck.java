package strategyPattern;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performQuack(){
        quackBehavior.quack();
    }

    void performFly(){
        flyBehavior.fly();
    }

    public void display(){
    }

    public void swim(){

    }

    void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
