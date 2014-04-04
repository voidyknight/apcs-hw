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

    public void push(String item){
	Node thing = new Node(item);
	thing.setNext(top);
	top = thing;
	length ++;
    }

    public String pop(){
	String keeper = top.getData();
	top = top.getNext();
	length --;
	return keeper;
    }

    public String peek(){
	String s = pop();
	push(s);
	return s;
    }

    public boolean isEmpty(){
	return top == null;
    }

    public int search(String item){
	Node dummy = top;
	int place = 0;
	while(!(dummy.getData().equals(item))){
	    if(dummy.getNext() == null)
		return -1;
	    place ++;
	    dummy = dummy.getNext();
	}
	return place;
    }




}