package hf.dp.factory.methods;

import java.util.*;

abstract public class Pizza {

	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare(){
		System.out.println(name + "도우가 하늘에서 날아다니는 중...");
	}

	public void bake(){
		System.out.println(name + "가 바삭하게 구워지는 중...");
	}

	public void cut(){
		System.out.println(name + "가 한 입 크기로 잘리는 중...");
	}

	public void box(){
		System.out.println("먹음직스러운 " + name + "가 박스에 담기는 중...");
	}

	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append("---- ").append(name).append(" ----\n");
		display.append(dough).append("\n");
		display.append(sauce).append("\n");
		for (String topping : toppings) {
			display.append(topping).append("\n");
		}
		return display.toString();
	}

}

