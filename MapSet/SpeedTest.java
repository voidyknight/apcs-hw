public class SpeedTest{

    public static void main(String[]args){
	TreeMap tree = new TreeMap();
	HashMap map = new HashMap();
	double treePut, treeGet;
	double hasPut, hasGet;

	treePut = System.currentTimeMillis();
	for(int x = 0; x < args[0]; x ++)
	    tree.put(x, Math.random() * 10000);
	treePut = System.currentTimeMillis() - treePut;
	treeGet = System.currentTimeMillis();
	for(int x = 0; x <= tree.lastKey(); x ++)
	    tree.get(x);
	treeGet = System.currentTimeMillis() - treeGet;

	HashPut = System.currentTimeMillis();
	for(int x = 0; x < args[0]; x ++)
	    hash.put(x, Math.random() * 10000);
	hashPut = System.currentTimeMillis() - treePut;
	hashGet = System.currentTimeMillis();
	for(int x = 0; x < map.size(); x ++)
	    hash.get(x);
	hashGet = System.currentTimeMillis() - treeGet;

	System.out.println("Tree:\nput = "+ treePut +
			   "\n get = " + treeGet + "\nHash:\n put = "
			   + hashPut + "\n get = " + hashGet );

    }





}