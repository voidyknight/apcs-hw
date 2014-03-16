import java.util.*;
public class QuickSort{
    private Random rand = new Random(1);

    public QuickSort(){};

    public int[] sort(int[]array){
	if(array.length < 2) return array;

	int index = rand.nextInt(array.length);
	int pivot = array[index];
	index = partition(array, index);

 	int[] lower = sort(Arrays.copyOfRange(array, 0, index));
	int[] upper = sort(Arrays.copyOfRange(array, index + 1, array.length));

	array = merge(lower, pivot, upper);
	return array;
    }
    
    public int partition(int[] array, int index){
	//the basics
	ArrayList<Integer> source = new ArrayList<Integer>();
	for(int c : array)
	    source.add(new Integer(c));
	int wall = 0; int wall2 = 1; Integer pivot = source.get(index);


	//the switch
	source.set(index, source.get(source.size() - 1));
	source.set(source.size() - 1, pivot);

	//the loop
	Integer store = new Integer(0);
	for(int x = 0; x < source.size() - 1; x ++){
	    if(source.get(x).compareTo(pivot) < 0){
	        swap(source, wall, x);
		wall ++;
		wall2 ++;
	    }
	    else if(source.get(x).compareTo(pivot) == 0){
		swap(source, wall2, x);
		wall2 ++;
	    }
	    //	      System.out.println(Arrays.toString(source.toArray()));
	}

	//the switch 2.0
	swap(source, wall, source.size() - 1);
        for(int x = 0; x < source.size(); x ++)
	    array[x] = source.get(x).intValue();
	return wall;
    }

 public int[] merge(int[] lower, int pivot, int[] upper){
	int[] array = new int[lower.length + upper.length + 1];	int count = 0;
	for (int low : lower){
	    array[count] = low;
	    count ++;
	}
	array[count] = pivot; count ++;
	for (int high : upper){
	    array[count] = high;
	    count ++;
	}
	return array;
    }

    public void swap(ArrayList<Integer> a, int b, int c){
	Integer x = a.get(b);
	a.set(b, a.get(c));
	a.set(c, x);
    }
    

}
