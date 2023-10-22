
public class BinarySearchTree {

	//MY ROOT
	Node root;
	
	// INSERTION METHOD
	public void insert(Node node) {
		root = insertHelp(root, node);
	}
	// HELPER FOR THE INSERTION METHOD (Helps with recursion)
	private Node insertHelp(Node root, Node node) {
		int data = node.data;
		
		if(root == null) {
			root = node;
			return root;
		}
		else if(data < root.data) {
			root.left = insertHelp(root.left, node);
		}
		else {
			root.right = insertHelp(root.right, node);
		}
		
		return root;
	}
	
	//DISPLAY METHOD
	public void display() {
		displayHelp(root);
	}
	private void displayHelp(Node root) {
		
		if(root != null) {
			displayHelp(root.left);
			System.out.println(root.data);
			displayHelp(root.right);
		}
	}
	
	// SEARTH METHOD
	public boolean search(int data) {
		return searchHelp(root, data);
	}
	private boolean searchHelp(Node root, int data) {
		
		if(root == null) {
			return false;
		}
		else if(root.data == data) {
			return true;
		}
		else if(root.data > data) {
			return searchHelp(root.left, data);
		}
		else{
			return searchHelp(root.right, data);
		}
	}
	
	// REMOVE METHOD
	public void remove(int data) {
		
		if(search(data)) {
			removeHelp(root, data);
		}
		else {
			System.out.println(data + " could not be found");
		}
		
	}
	
	public Node removeHelp(Node root, int data) {
		
		if(root == null) {
			return root;
		}
		else if(data < root.data) {
			root.left = removeHelp(root.left, data);
		}
		else if(data > root.data) {
			root.right = removeHelp(root.right, data);
		}
		else {
			if(root.left == null && root.right == null) {
				root = null;
			}
			else if(root.right != null) {// FIND SUCCESSOR
				root.data = successor(root);
				root.right = removeHelp(root.right, root.data);
			}
			else { // FINDS A PREDECESSOR
				root.data = successor(root);
				root.left = removeHelp(root.left, root.data);
			}
		}
		
		return root;
	}
	private int successor(Node root) {
		root = root.right;
		while(root.left != null) {
			root = root.right;
		}
		return root.data;
	}
	private int presuccessor(Node root) {
		root = root.left;
		while(root.right != null) {
			root = root.right;
		}
		return root.data;
	}
	
}
