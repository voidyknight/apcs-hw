public class MyStack{
    private Node top;
    private int length;
    

//My Stuff
      public MyStack(){
	top = null;
	length = 0;
    }

    public int size(){
	return length;
    }

    public int length(){
	return length;
    }

    public String toString(){
	String s = "";
	for(Node tmp = top; tmp != null; tmp = tmp.getNext())
	    s += tmp + ", ";
	return s;
    }

    public void push(double item){
	Node thing = new Node(item);
	thing.setNext(top);
	top = thing;
	length ++;
    }

    public double pop(){
	double keeper = top.getData();
	top = top.getNext();
	length --;
	return keeper;
    }

    public double peek(){
	double s = pop();
	push(s);
	return s;
    }

    public boolean isEmpty(){
	return top == null;
    }

    public int search(double item){
	Node dummy = top;
	int place = 0;
	while(dummy.getData() != item){
	    if(dummy.getNext() == null)
		return -1;
	    place ++;
	    dummy = dummy.getNext();
	}
	return place;
    }




}
