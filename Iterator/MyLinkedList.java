import java.util.*;
import java.io.*;
public class MyLinkedList<E> implements Iterable<E>{
    private Node<E> head, dummy, tail;
    //the head is the first node
    private int length;

    public Node<E> getDummy(){
	return dummy;
    }   

    public Node<E> getHead(){
	return head;
    }

    public Node<E> getTail(){
	return tail;
    }

    public int length(){
	return length;
    }




    //Constructors
    public MyLinkedList<E>(){
	head = null;
	dummy = new Node<E>("dummy"); dummy.setNext(head);
	length = 0;
    }

    public MyLinkedList<E>(Node<E> n){
	head = n;
	tail = head;
	dummy = new Node<E>("dummy"); dummy.setNext(head);
	length = 1;
    }

    public String toString(){
	Node<E> temp = head;
	String s = "" + temp;
	while(temp != null && temp.getNext() != null){
	    temp = temp.getNext();
	    s += ", " + temp;
	}
	return s;
    }




    //Functions
    
    //add(n) adds new Node to beginning of List
    public void add(E s){
	Node<E> tmp = new Node<E>(s);
	tmp.setNext(head);  //Do first: set new next
	head = tmp;        //Do second: change the head
	length ++;
	if(length == 1)
	    tail = head;
	dummy.setNext(head);
    }

    public void add(int i, E s){
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
	
	Node<E> place = head;
	while(i > 1){
	    place = place.getNext();
	    i --;
	}
	Node<E> tmp = place.getNext();
	place.setNext(new Node<E>(s));
	place.getNext().setNext(tmp);
	 
	length ++;
    }

    public void addEnd(E s){
	tail.setNext(new Node<E>(s));
	tail = tail.getNext();
	length ++;
    }


    public E get(int i){
	if(i >= length){
	    System.out.print("Out of bounds; ");
	    return null;
	}	
	Node<E> tmp = head;
	while(i > 0){
	    tmp = tmp.getNext();
	    i --;
	}
	return ""+tmp;
    }

    public E set(int i, E s){
	if(i >= length){
	    System.out.print("Out of bounds; ");
	    return null;
	}
	E thing = get(i);
	Node<E> newNode = new Node<E>(s);
	Node<E> tmp = head;
	while(i > 2)
	    tmp = tmp.getNext();
	newNode.setNext(tmp.getNext().getNext());
	tmp.setNext(newNode);
	dummy.setNext(head);
	return thing;
    }

    public E remove(int i){
	if(i >= length){
	    System.out.print("Out of bounds; ");
	    return null;
	}
	E thing = get(i);
	if(i == 0){
	    dummy.setNext(head.getNext());
	    head = dummy.getNext();
	    return thing;
	}
	Node<E> tmp = head;
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
	    dummy = new Node<E>("dummy");
	    dummy.setNext(head);
	}
	return thing;
    }

    public int find(E s){
	Node<E> temp = head;
	int count = 0;
	while(!temp.getData().equals(s) && temp.getNext() != null){
	    temp = temp.getNext();
	    count ++;
	}
	return count;
    }



}
//end class
