package hf.dp.decorator;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " + 두유";
    }

    public double cost(){
        return .2 + beverage.cost();
    }

}
