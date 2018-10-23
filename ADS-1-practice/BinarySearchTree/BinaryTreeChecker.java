public class BinaryTreeChecker<Key extends Comparable<Key>, Value> {
	BinaryTreeChecker() {

	}

	private class Node {
		Key key;
		Value value;
		Node left;
		Node right;
	}
	int i = 0;

	public Key[] chettuChecking() {
		return chettuChecking(root);
	}

	public Key[] chettuChecking(Node root) {
		Key[] temp = (Key[]) new Comparable[];
		if (root == null) return temp;
		chettuChecking(root.left);
		temp[i++] = root.key;
		chettuChecking(root.right);
	}


}