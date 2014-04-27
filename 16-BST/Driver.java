public class Driver{
    public static void main(String[]args){
	BST a = new BST();
	a.insert(2); a.insert(4); a.insert(1); a.insert(5); a.insert(7);
	System.out.println(a.getRoot().getData());
    }
}
