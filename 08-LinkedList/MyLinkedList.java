public class MyLinkedList{
    private Node head;
    //the head is the first node
    private int length;

   
    //Constructors
    public MyLinkedList(){
	head = null;
	length = 0;
    }

    public MyLinkedList(Node n){
	head = n;
	length = 1;
    }

    public String toString(){
	Node temp = head;
	String s = "" + temp;
	while(temp != null && temp.getNext() != null){
	    temp = temp.getNext();
	    s += ", " + temp;
	}
	return s;
    }

    public int length(){
	return length;
    }



    //Functions
    
    //add(n) adds new Node to beginning of List
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(head);  //Do first: set new next
	head = tmp;        //Do second: change the head
	length ++;
    }

    public void add(int i, String s){
	if(i == 0)
	    add(s);
	else if(i >= length)
	    System.out.println("Error: out of bounds");
	else{
	    Node place = head;
	    while(i > 1){
		place = place.getNext();
		i --;
	    }
	    Node tmp = place.getNext();
	    place.setNext(new Node(s));
	    place.getNext().setNext(tmp);
	}
	length ++;
    }


    public String get(int i){
	if(i >= length){
	    System.out.print("Out of bounds; ");
	    return null;
	}	
	Node tmp = head;
	while(i > 0){
	    tmp = tmp.getNext();
	    i --;
	}
	return ""+tmp;
    }

    public String set(int i, String s){
	if(i >= length){
	    System.out.print("Out of bounds; ");
	    return null;
	}
	String thing = get(i);
	Node newNode = new Node(s);
	Node tmp = head;
	while(i > 2)
	    tmp = tmp.getNext();
	newNode.setNext(tmp.getNext().getNext());
	tmp.setNext(newNode);
	return thing;
    }

    public String remove(int i){
	if(i >= length){
	    System.out.print("Out of bounds; ");
	    return null;
	}
	String thing = get(i);
	Node tmp = head;
	while(i > 2)
	    tmp = tmp.getNext();
	tmp.setNext(tmp.getNext().getNext());
	length --;
	return thing;
    }

    public int find(String s){
	Node temp = head;
	int count = 0;
	while(!temp.getData().equals(s) && temp.getNext() != null){
	    temp = temp.getNext();
	    count ++;
	}
	return count;
    }


}
//end class
