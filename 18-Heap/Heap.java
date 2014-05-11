public class Heap{
    public int[] arr;
    private int lowRight;
    
    public Heap(){arr = new int[11]; arr[0] = Integer.MAX_VALUE; lowRight = 0;}
    public Heap(int n){
	arr = new int[11]; 
	arr[1] = n ;
	lowRight = 1; 
	arr[0] = Integer.MAX_VALUE;
    }
    
    public int getMax(){
	return arr[1];
    }    


    public void insert(int n){
	if(lowRight == arr.length - 1)
	    System.out.println("Heap full");
	else{
	    int place = ++lowRight;
	    arr[lowRight] = n;
	    int parent;
	    while(arr[place] > arr[place/2]){
		parent = arr[place/2];
		arr[place/2] = n;
		arr[place] = parent;
		place /= 2;
	    }
	}
    }

    public void removeMax(){
	arr[1] = arr[lowRight];
	arr[lowRight--] = 0;
	int place = 1;
	int child;
	while(place*2+1 < arr.length && 
	      (arr[place] < arr[place*2] || arr[place] < arr[place*2+1])){
	    if(arr[place*2] > arr[place*2+1]){
		child = arr[place*2];
		arr[place*2] = arr[place];
		arr[place] = child;
		place *= 2;
	    }else{
		child = arr[place*2+1];
		arr[place*2+1] = arr[place];
		arr[place] = child;
		place = place*2+1;
	    }
	}
    }
    


}
