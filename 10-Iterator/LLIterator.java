import java.util.*;
import java.io.*;

public class LLIterator<E> implements Iterator<E>{
    private Node current;

    public LLIterator<E>(Node<E> n){
	current = n;
    }

    public boolean hasNext(){
	return false;
    }

    public E next(){
	return null;
    }

    public void remove(){};







}
//end class