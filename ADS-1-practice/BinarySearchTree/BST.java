class BST<Key extends Comparable<Key>, Value> {
	private class Node {
		Key key;
		Value value;
		Node left;
		Node right;
		Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
	}
	private Node root;

	public void insert(Key key, Value value) {
		root = insert(root, key, value);
	}

	private Node insert(Node root, Key key, Value value) {
		if (root == null) return new Node(key, value);
		int cmp = key.compareTo(root.key);
		if (cmp < 0) root.left = insert(root.left, key, value);
		else if (cmp > 0) root.right = insert(root.right, key, value);
		else root.value = value;
		return root;
	}

	public Value get(Key key) {
		return get(root, key);

	}

	private Value get(Node root, Key key) {
		if (root == null) return null;
		int cmp = key.compareTo(root.key);
		if (cmp < 0) return get(root.left, key);
		if (cmp > 0) return get(root.right, key);
		return root.value;
	}

	public Key min() {
		return min(root);
	}

	public Key min(Node root) {
		if (root == null) {
			return null;
		}
		if (root.left != null) {
			return min(root.left);
		}
		return root.key;
	}

	public Key max() {
		return max(root);
	}

	public Key max(Node root) {
		if (root == null) {
			return null;
		}
		if (root.right != null) {
			return max(root.right);
		}
		return root.key;
	}

	public Key max2() {
		return max2(root);
	}

	public Key max2(Node root) {
		Key maxx = max();
		if (maxx == null) {
			return null;
		}
		if (root.right.key != maxx) {
			root = root.right;
			return max2(root);
		}
		if (root.right.key == maxx && root.right.left != null) {
			return max(root.right.left);
		}
		return root.key;
	}

	/*public Key commonAncestor(Node node1, Node node2) {
		return commonAncestor(root, node1, node2);
	}

	public Key commonAncestor(Node root, Node n1, Node n2) {
		if (root.key > n1.key && root.key > n2.key) {
			return commonAncestor(root.left, n1, n2);
		}
		if (root.key < n1.key && root.key < n2.key) {
			return commonAncestor(root.right, n1, n2);
		}
		return root;
	}*/


	public void inorder() { inorder(root); }

	private void inorder(Node root) {
		if (root == null) return;
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}
	public static void main(String[] args) {
		BST<String, Integer> bst = new BST<>();
		String[] st = "M O N E Y H E I S T Z".split(" ");
		int i = 0;
		for (String s : st)
			bst.insert(s, i++);
		bst.inorder();
		System.out.println(bst.get("Z"));
		System.out.println(bst.get("E"));
		System.out.println("Min : " + bst.min());
		System.out.println("Max : " + bst.max());
		System.out.println("2nd Max : " + bst.max2());
		//System.out.println("commonAncestor : " + commonAncestor());
	}
}
/*if (root.right == maxx) {

		}
		while (root.right != null) {
			if (root.right != maxx) {
				root = root.right;
			} else {
				root = root.right;
				root = root.left;
				return max(root);
		*/
//break;
//}