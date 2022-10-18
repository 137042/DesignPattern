package practice.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Excellent Dark Roast";
    }

    public float cost(){
        return 1.99f + super.cost();
    }
}
