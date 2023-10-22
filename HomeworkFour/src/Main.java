
public class Main {

	public static void main(String[] args) {
		
		BinarySearchTree mytree = new BinarySearchTree();

		mytree.insert(new Node(2));
		mytree.insert(new Node(3));
		mytree.insert(new Node(9));
		mytree.insert(new Node(1));
		mytree.insert(new Node(6));
		mytree.insert(new Node(13));
		mytree.insert(new Node(7));
		mytree.insert(new Node(33));
		mytree.insert(new Node(11));
		mytree.insert(new Node(12));
		mytree.insert(new Node(4));
		mytree.insert(new Node(17));
		mytree.insert(new Node(15));
		
		
		mytree.display();
		
		System.out.println(mytree.search(1));
		
//		mytree.remove(1);
	}

}
