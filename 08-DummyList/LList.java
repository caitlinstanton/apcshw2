public class LList {
    
    private Node start,end;
    private int len;
    
    public LList() {
	start = new Node("");
	end = null;
	start.setNext(end);
	len = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
        start.setNext(tmp);
	tmp.setNext(end);
	end = tmp;
	len++;
    }

    public Node get(int n) {
	Node tmp = start;
	int counter = -1;
	while(counter < n && tmp != null) {
	    tmp = tmp.getNext();
	    counter++;
	}
	return tmp;
    }

    public void add(int n, String s) {
	Node added = new Node(s);
	Node before = get(n - 1);
	System.out.println(before);
	Node after = get(n);
	System.out.println(after);
	added.setNext(after);
	before.setNext(added);	
    }

    /*
    public void remove(int n) {
	Node before = get(n - 1);
	Node after = get(n + 1);
	before.setNext(after);
	len--;
    }
    INCORRECT BECAUSE GET IS MEANT TO RETURN DATA, NOT A NODE
    */

    public String remove(int n) {
	if (n >= len || n < 0) {
	    throw new IndexOutOfBoundsException();
	}
	Node tmp = start;
	for (int i = 0; i < n-1; i++) {
	    tmp = tmp.getNext();
	}
	String s = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	return s;
    }
    
    public int getLength() {
	return len;
    }
    
    public String toString(){
	String s = "empty --> ";
	Node tmp;
	for (tmp = start.getNext(); tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    
}