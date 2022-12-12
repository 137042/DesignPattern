package hf.dp.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

	ArrayList<MenuItem> items;
	int position = 0;
 
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
 
	public MenuItem next() {
		return items.get(position++);
	}
 
	public boolean hasNext() {
		return items.size() > position;
	}

}
