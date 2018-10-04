import java.util.*;

class CustomArrayList<T> implements Iterable<T> {

	List<T> myList = new ArrayList<>();

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>;
	}

}

public class MyIterator<T> implements Iterator<T> {
	//Node<T> current;

	public MyIterator(Node<T> first){
		//current = first;
	}

	public boolean hasNext() {
		//return current != null;
	}

	public T next() {
		// E data = current.data;
		// current = current.next;
		// return data;

	}

	public void remove() {
		//Does not support.
	}
}