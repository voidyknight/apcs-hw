public class MechanicsDriver{

    public static void main(String[]args){
	//create two nodes
	Node n1;
	n1 = new Node("Sully");
	Node n2;
	n2 = new Node("Mike");
	System.out.println(n1);
	//link node n1 to node n2
	n1.setNext(n2);
	System.out.println(n1.getNext());
	//create a loop
	n1.getNext().setNext(n1);
	System.out.println(n1.getNext().getNext());
	//link node n2 to a new node n3
	n1.getNext().setNext(new Node("Randall"));
	System.out.println(n1.getNext().getNext());
	//remove Mike
	n1.setNext(n1.getNext().getNext());
	System.out.println(n1.getNext());

    }


}
//end class