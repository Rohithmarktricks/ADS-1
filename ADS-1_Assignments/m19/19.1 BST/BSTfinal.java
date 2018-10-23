import java.util.*;

public class BSTfinal <Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		private Key key;
		private Value value;
		private Node left, right;
		private int size;

		private Node(Key key, Value value, int size) {
			this.key = key;
			this.value = value;
			this.size = size;
		}
	}

	public BSTfinal() {
		//empty.
	}

	public boolean isEmpty() {
		return size() == 0;
	}


	public int size() {
		return size(root);
	}

	private int size(Node x) {
		if (x == null) {
			return 0;
		}
		return x.size;
	}

	public boolean contains(Key key) {
		if (key == null) {
			throw new IllegalArgumentException("Argument passed to contains() is null");
		}
		return get(key) != null;
	}

	public Value get(Key key) {
		return get(root, key);
	}

	private Value get(Node rootx, Key key) {
		if (key == null) {
			throw new IllegalArgumentException("Call to get() gives null");
		}
		if (rootx == null) {
			return null;
		}
		int cmp = key.compareTo(rootx.key);
		if (cmp < 0) {
			return get(rootx.left, key);
		}
		if (cmp > 0) {
			return get(rootx.right, key);
		} else {
			return rootx.value;
		}
	}


	public void put(Key key, Value value) {
		if (key == null) {
			throw new IllegalArgumentException("calls puts() with null key");
		}
		if (val == null) {
			delete(key);
			return;
		}
		root = put(root, key, value);
		assert check();
	}

	private void put(Node rootx, Key key, Value value) {
		if (rootx == null) {
			return new Node(key, value, 1);
		}
		int comp = key.compareTo(rootx.key);
		if (comp < 0) {
			rootx.left = put(rootx.left, key, value);
		} else if (comp > 0) {
			rootx.right = put(rootx.right, key, value);
		} else {
			rootx.value = value;
		}
		rootx.size = 1 + size(rootx.left) + size(rootx.right);
		return rootx;
	}

	public void delMin() {
		if (isEmpty()) {
			throw new NoSuchElementException("Symbol table is underflow");
		}
		root = delMin(root);
		assert check();
	}

	public Node delMin(Node rootx) {
		if (rootx.left == null) {
			return rootx.right;
		}
		rootx.left = delMin(rootx.left);
		rootx.size = size(rootx.left) + size(rootx.right) + 1;
	}
}
