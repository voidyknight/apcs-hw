import java.util.*;
public class SpeedTest{

    public static void main(String[]args){
	TreeMap tree = new TreeMap();
	HashMap hash = new HashMap();
	double treePut, treeGet;
	double hashPut, hashGet;

	treePut = System.currentTimeMillis();
	for(int x = 0; x < 100; x ++)
	    tree.put(x, Math.random() * 10000);
	treePut = System.currentTimeMillis() - treePut;
	treeGet = System.currentTimeMillis();
	for(Object x = tree.firstKey(); x != null; x = tree.ceilingKey(x))
	    tree.get(x);
	treeGet = System.currentTimeMillis() - treeGet;

	hashPut = System.currentTimeMillis();
	for(int x = 0; x < 100; x ++)
	    hash.put(x, Math.random() * 10000);
	hashPut = System.currentTimeMillis() - treePut;
	hashGet = System.currentTimeMillis();
	for(int x = 0; x < hash.size(); x ++)
	    hash.get(x);
	hashGet = System.currentTimeMillis() - treeGet;

	System.out.println("Tree:\nput = "+ treePut +
			   "\n get = " + treeGet + "\nHash:\n put = "
			   + hashPut + "\n get = " + hashGet );

    }





}