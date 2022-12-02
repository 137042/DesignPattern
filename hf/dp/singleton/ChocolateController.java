package hf.dp.singleton;

import hf.MyHWInfo;

public class ChocolateController {
	public static void main(String[] args) {
		MyHWInfo.printInfo();

		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}
}
