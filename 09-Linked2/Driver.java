public class Driver{


    public static void main(String[]args){
	
	
	MyLinkedList L = new MyLinkedList();
	L.add("Sully");
	System.out.println(L);
	L.add("Mike");
	L.add("Randall");
	L.add(1, "Bob");
	System.out.println(L);
	System.out.println(L.get(10));
	System.out.println(L.set(1, "notBob"));
	System.out.println(L);
	System.out.println(L.remove(1));
	System.out.println(L);

    }


}
