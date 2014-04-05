public class ArrayDriver{

    public static void main(String[]args){
	ArrayStack stack = new ArrayStack();
        for(int x = 0; x < 21; x ++){
	    stack.push("" + x);
	}
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack.peek());
	System.out.println(stack);
    }


}
