public class Driver{

    public static void main(String[]args){

	Heap a = new Heap();
	a.insert(3);
	a.insert(2);
	a.insert(7);
	a.insert(4);
	a.insert(6);
	a.insert(10);
	a.removeMax();
	a.insert(5);
	a.insert(23);
	a.insert(66);
	a.insert(49);
	a.insert(8);
	for(int x : a.arr)
	    System.out.println(x);

    }

}