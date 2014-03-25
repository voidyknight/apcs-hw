public class MyLinkedList{
    private Node head, dummy, tail;
    //the head is the first node
    private int length;

    public Node getDummy(){
	return dummy;
    }   

    public Node getHead(){
	return head;
    }

    public Node getTail(){
	return tail;
    }

    public int length(){
	return length;
    }




    //Constructors
    public MyLinkedList(){
	head = null;
	dummy = new Node("dummy"); dummy.setNext(head);
	length = 0;
    }

    public MyLinkedList(Node n){
	head = n;
	tail = head;
	dummy = new Node("dummy"); dummy.setNext(head);
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




    //Functions
    
    //add(n) adds new Node to beginning of List
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(head);  //Do first: set new next
	head = tmp;        //Do second: change the head
	length ++;
	if(length == 1)
	    tail = head;
	dummy.setNext(head);
    }

    public void add(int i, String s){
	if(i == 0){
	    add(s);
	    dummy.setNext(head);
	    return;
	}
	if(i == length - 1){
	    addEnd(s);
	    return;
	}
	if(i >= length){
	    System.out.println("Error: out of bounds");
	    return;
	}
	
	Node place = head;
	while(i > 1){
	    place = place.getNext();
	    i --;
	}
	Node tmp = place.getNext();
	place.setNext(new Node(s));
	place.getNext().setNext(tmp);
	 
	length ++;
    }

    public void addEnd(String s){
	tail.setNext(new Node(s));
	tail = tail.getNext();
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
	dummy.setNext(head);
	return thing;
    }

    public String remove(int i){
	if(i >= length){
	    System.out.print("Out of bounds; ");
	    return null;
	}
	String thing = get(i);
	if(i == 0){
	    dummy.setNext(head.getNext());
	    head = dummy.getNext();
	    return thing;
	}
	Node tmp = head;
	int x = i;
	while(i > 0){
	    tmp = tmp.getNext();
	    dummy = dummy.getNext();
	    i --;
	}
	dummy.setNext(tmp.getNext());
	if(tmp == tail)
	    tail = dummy;
	length --;
	if(x != 0){
	    dummy = new Node("dummy");
	    dummy.setNext(head);
	}
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
