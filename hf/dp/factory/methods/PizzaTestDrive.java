package hf.dp.factory.methods;

import hf.MyHWInfo;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		MyHWInfo.printInfo();

		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}

}
