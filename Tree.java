class Node
{
    int data;
    Node left, right;
 
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
class Tree
{
    Node root;
 
    // Recursive function to check if two Nodes are
    // siblings
    boolean isSibling(Node root, Node a, Node b)
    {
        // Base case
        if (root == null)
            return false;
 
        return ((root.left == a && root.right == b) ||
                (root.left == b && root.right == a) ||
                isSibling(root.left, a, b) ||
                isSibling(root.right, a, b));
    }
 
    public static void main(String[] args)
    {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
 
        Node Node1, Node2;
		// node 4 and 5
        Node1 = tree.root.left.left;
        Node2 = tree.root.left.right;
		System.out.print(Node1.data + " and " + Node2.data + " are siblings? ");
        System.out.println(tree.isSibling(tree.root, Node1, Node2));
		
		// node 4 and 7
		Node1 = tree.root.left.left;
        Node2 = tree.root.right.right;
		System.out.print(Node1.data + " and " + Node2.data + " are siblings? ");
        System.out.println(tree.isSibling(tree.root, Node1, Node2));
    }
}