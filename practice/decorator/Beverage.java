package practice.decorator;

public class Beverage {

    final float MILK_COST = 0.9f;
    final float SOY_COST = 0.9f;
    final float MOCHA_COAST = 0.9f;
    final float WHIP_COST = 0.9f;

    protected String description;
    boolean milk, soy, mocha, whip;

    public float cost(){
        float condimentCost = 0.0f;
        if(hasMilk()){
            condimentCost += MILK_COST;
        }
        if(hasSoy()){
            condimentCost += SOY_COST;
        }
        if(hasMocha()){
            condimentCost += MOCHA_COAST;
        }
        if(hasWhip()){
            condimentCost += WHIP_COST;
        }
        return condimentCost;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
