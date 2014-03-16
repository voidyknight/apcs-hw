import java.util.*;
public class QuickSort{
    private Random rand = new Random();

    public QuickSort(){};

    public int[] sort(int[]array){
	if(array.length < 2) return array;

	int index = rand.nextInt(array.length);
	int pivot = array[index];
	index = partition(array, index);

	int[] lower = sort(Arrays.copyOfRange(array, 0, index));
	int[] upper = sort(Arrays.copyOfRange(array, index + 1, array.length));

	return merge(lower, pivot, upper);
    }
    
    public int partition(int[] array, int index){
	//the basics
	ArrayList<Integer> source = new ArrayList<Integer>();
	int wall = 0; Integer pivot = source.get(index);
	for(int c : array)
	    source.add(new Integer(c));

	//the switch
	source.set(index, source.get(source.size() - 1));
	source.set(source.size() - 1, pivot);

	//the loop
	for(int x = 0; x < source.size() - 1; x ++){
	    if(source.get(x).compareTo(pivot) < 0)
		wall++;
	}

	       

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


}