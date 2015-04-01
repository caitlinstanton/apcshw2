public class Node{
    
    private int x;
    private int y;
    private Node next;
    
    public Node(){
	x = 0;
	y = 0;
	next = null;
    }

    public Node(int xcor, int ycor){
        x = xcor;
	y = ycor;
	next = null;
    }

    public void setData(int xcor, int ycor){
        x = xcor;
	y = ycor;
    }

    public String getData(){
	String retval = "[" + x + ", " + y + "]";
	return retval;
    }

    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return "[" + x + ", " + y + "]";
    }
}
