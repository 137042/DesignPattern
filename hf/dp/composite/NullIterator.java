package hf.dp.composite;
 
import java.util.Iterator;
  
public class NullIterator implements Iterator {

	public MenuComponent next() {
		return null;
	}

	public boolean hasNext() {
		return false;
	}

//	public void remove() {
//		throw new UnsupportedOperationException();
//	}

}
