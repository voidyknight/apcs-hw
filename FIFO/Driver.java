public class Driver{

    public static void main(String[]args){
	MyQueue a = new MyQueue();
	System.out.println(a);   
	a.enqueue("French");
	a.enqueue("German");
	System.out.println(a);   
	System.out.println(a.dequeue());
	System.out.println(a);   
 }


}