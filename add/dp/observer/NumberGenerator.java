package add.dp.observer;

import java.util.Vector;
import java.util.Iterator;

public abstract class NumberGenerator {
	
	private Vector observers = new Vector();

	public void addObserver(Observer observer) { 
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Object observer : observers) {
			Observer o = (Observer) observer;
			o.update(this);
		}
	}

	public abstract int getNumber();
	public abstract void execute();

}
