package hf.dp.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " + 휘핑";
    }

    public double cost(){
        return .2 + beverage.cost();
    }

}
