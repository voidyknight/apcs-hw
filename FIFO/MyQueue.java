public class MyQueue{
    private Node front = null; 
    private Node back = null;
    private int length = 0;

    public MyQueue(){}

    public void enqueue(String s){
	Node tmp = new Node(s);
	if(front == null){
	    front = tmp;
	    back = tmp; 
	    return;
	}
	back.setNext(tmp);
	back = tmp;
    }

    public String dequeue(){
	String tmp = ""+front;
	if(front == null)
	    return null;
	front = front.getNext();
	if(front == null)
	    back = null;
	return tmp;
    }

    public boolean isEmpty(){
	return front == null;
    }

    public int length(){return length;} 
    public int size(){return length;}

    public String toString(){
	if(isEmpty())
	    return "Ceci n'est pas une string";
	String s = "";
	for(Node a = front; a != null; a = a.getNext()){
	    if(a.getNext() != null)
		s+= a + ", ";
	    else
		s+= a;
	}
	return s;
    }

}