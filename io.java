import java.io.*;
import java.util.*;

public class io {

    public static void main(String[] args){
	PrintWriter out=null;
	try {

	    out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
	} catch (Exception e){};

	out.print ("HELLO");
	out.println (" World!");
	out.print("no");
	out.print(" shit");
	out.println(" hey");
	out.close ();

	Scanner sc = null;
	try{
	    sc = new Scanner(new File("test.out"));
	}catch(Exception e){};

	while (sc.hasNext()){
	    System.out.println(sc.next());
	}
	sc.close();

    }
	

}
