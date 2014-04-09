public class ArrayStack{
    private String[] array;
    public String top;
    public int index;
    

    //My Stuff
    public ArrayStack(){
	array = new String[10];
	index = -1;
	top = null;
    }

    public void grow(){
	if(array.length - 1 == index){
	    String[] newArray = new String[array.length * 2];
	    for(int x = 0; x < array.length; x ++)
		newArray[x] = array[x];
	    array = newArray;
	}
    }

    public String toString(){
	String s = "";
	for(int x = index; x > -1; x --){
	    s += x + ", ";
	}
	return s;
    }

    public void push(String item){
	grow();
	index ++;
	array[index] = item;
	top = item;
    }

    public String pop(){
	String keeper = top;
	index --;
	top = array[index];
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
	for(int x = 0; x < array.length; x ++)
	    if(item.equals(array[x]))
		return x;
	return -1;
    }




}
