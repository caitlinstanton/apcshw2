public class BST {

<<<<<<< HEAD
    private Node r;
    
    public BST() {
	r = new Node();
    }

    public BST(Node n) {
	r = n;
    }
    
    public Node search(Node T, Integer i) {
	while (T != null) {
	    int c = T.getData().compareTo(i);
	    if (c > 0) {
		T = T.getRight();
	    } else if (c < 0) {
		T = T.getLeft();
	    } else {
		return T;
=======
    private Node root;
    
    public BST() {
	root = new Node();
    }

    public BST(Node n) {
	root = n;
    }
    
    /*
    public Node search(Node t, Integer i) {
	while (t != null) {
	    if (t.getData() < i) {
		t = t.getRight();
	    } else if (t.getData() > i) {
		t = t.getLeft();
	    } else {
		return t;
>>>>>>> 092af50023d94c1b7a99c7814d65ce8c867d4024
	    }
	}
	return null;
    }
<<<<<<< HEAD

    public void insert(Node t, Integer i) {
	Node t = r;
	Node newLeaf = new Node(i);
        if (t == null)
            t = newLeaf;
        Node current = t;
        Node piggy = null;
        while (current != null){
            piggy = current;
            int c = current.getData().compareTo(i);
            if (c < 0){
                cur = cur.getLeft();
            } else if (c > 0){
                cur = cur.getRight();
            }
        }
        if (i > piggy.getData())
            piggy.setRight(newLeaf);
        else if (i < piggy.getData())
            piggy.setLeft(newLeaf);

=======
    */

    //RECURSIVE VERSION
    public Node search(Node t, int i) {
	if (t == null || t.getData() == i) {
	    return null;
	} else if (i < t.getData()) {
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i) {
	Node n = search(root,i);
	if (n == null) {
	    return "NOT FOUND";
	} else {
	    return n.toString();
	}
    }

    public void insert(int i) {
	//Insert as a new leaf
>>>>>>> 092af50023d94c1b7a99c7814d65ce8c867d4024
	    //Create new node n
	    //Search for the value of n but use a piggyback pointer
	    //When lead pointer (T) gets to null, piggyback (T2) will be at the
         	//node before the insertion point
	//Insert new node to the left or right of T2 as appropriate
<<<<<<< HEAD
    }

    public String toString() {
	String s = "" + r.getData() + "\n";
	Node tmpLeft = r.getLeft();
	Node tmpRight = r.getRight();
	s = s + tmp.getData() + "\n";
	while (tmp != null) {
	    s = s + tmpLeft.getLeft().getData() + "   " + tmpLeft.getRight().getData() + "       " + tmpRight.getLeft().getData() + "   " + tmpRight.getRight().getData();
	    tmpLeft = 
	}
    }

    public static void main(String[] args) {
	BST s = new BST(new Node(17));
    }

=======

        Node newLeaf = new Node(i);
        Node cur = root;
        Node piggy = null;
        if (root == null)
            root = newLeaf;
        while (cur != null){
            piggy = cur;
	    if (cur.getData() == i) {
		return;
	    } else if (cur.getData() < i) {
            	cur = cur.getRight();
            } else if (cur.getData() > i) {
            	cur = cur.getLeft();
            } else {
            	return;
            }
        }
        if (i > piggy.getData()) {
            piggy.setRight(newLeaf);
	} else {
            piggy.setLeft(newLeaf);
	}
    }

    public void remove(int i) {
	/*
	  - Get a pointer (t) to the node to delete it and its parent (same
	  thing as search part of insert but you stop at node to deleter it)
	      a) t is a leaf --> point t2's left/right to null
	      b) t has one child --> point t2's left/right to t's only child
	      c) t has 2 children --> 
	           1. Find the largest node in the left subtree/largest node
		   in right
		       l = t.getLeft();
		       while (l.getRight() != null) {
		            l = l.getRight();
		   2. Copy the data from l into t
		       remove(t.getLeft(), l.getData());
	 */

	Node t = root;
	Node piggy = t;
	boolean goRight = true;
	while (t.getData() != i && t != null){
	    piggy = t;
	    if (t.getData() < i){
		t = t.getRight();
		goRight = true;
	    } else if (t.getData() > i) {
		t = t.getLeft();
		goRight = false;
	    }
	}
	if (t.getLeft() == null && t.getRight() == null){
	    if (goRight){
		piggy.setRight(null);
	    } else {
		piggy.setLeft(null);
	    }
	} else if (t.getLeft() != null || t.getRight() != null){
	    if (goRight){
		if (t.getRight() != null){
		    piggy.setRight(t.getRight());
		} else {
		    piggy.setRight(t.getLeft());
		}
	    } else {
		if (t.getRight() != null){
		    piggy.setLeft(t.getRight());
		} else {
		    piggy.setLeft(t.getLeft());
		}
	    }
	} else {
	    Node right = t.getRight();
	    Node cur = t;
	    while (right.getLeft() != null){
		cur = right;
		right = right.getLeft();
	    }
	    t = right;
	    cur.setLeft(null);
	}
    }

    public int nodeCount(Node t) {
	if (t == null) {
	    return 0;
	} else {
	    return t.getData() + nodeCount(t.getLeft()) + nodeCount(t.getRight());
	}
    }

    //max value
    //height
    //split dupes (parent and child have same value)
         //insert new node (that has the value of one less than the duplicated value) between them
    //longest leaf-to-leaf path

    public String traverse(Node t) {
	if (t == null) {
	    return " ";
	} else {
	    return traverse(t.getLeft()) + " " +
		t.getData() + " " +
		traverse(t.getRight());
	}
    }

    public static void main(String[] args) {
	Node n = new Node(17);
	BST b = new BST(n);
	System.out.println(b.traverse(n));
	System.out.println();

	b.insert(22);
	b.insert(15);

	System.out.println(b.traverse(n));
	System.out.println();

	b.insert(9);
	b.insert(27);

	System.out.println(b.traverse(n));
	System.out.println();

	b.remove(15);

	System.out.println(b.traverse(n));
    }
    
>>>>>>> 092af50023d94c1b7a99c7814d65ce8c867d4024
}
