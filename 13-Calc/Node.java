public class Node{
    private double data;
    private Node next;

    public Node(double s){
	data = s;
	next = null;
    }

    public void setData(double s){
	data = s;
    }

    public double getData(){
	return data;
    }

    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return ""+data;
    }



}
//end class
