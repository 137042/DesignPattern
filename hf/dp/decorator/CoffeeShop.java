package hf.dp.decorator;

import hf.MyHWInfo;

public class CoffeeShop {

    public static void main(String[] args){
        MyHWInfo.printInfo();

        Beverage beverage = new Espresso();
        System.out.printf("%s $ %.4f\n", beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.printf("%s $ %.4f\n", beverage2.getDescription(),+ beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.printf("%s $ %.4f\n", beverage3.getDescription(), beverage3.cost());
    }

}