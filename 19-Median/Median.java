public class Median{
    private MaxHeap max;
    private MinHeap min;

    public Median(){
	max = new MaxHeap();
	min = new MinHeap();
    }

    public void insert(int n){
	if(min.getMin() > n)
	    max.insert(n);
	else
	    min.insert(n);
	if(min.getLR() - max.getLR() > 1){
	    max.insert(min.getMin());
	    min.removeMin();
	}
	else if(max.getLR() - min.getLR() > 1){
	    min.insert(max.getMax());
	    max.removeMax();
	}
    }


    public void deleteMed(){
	if(max.getLR() - min.getLR() == 1)
	    max.removeMax();
	else if(min.getLR() -max.getLR() == 1)
	    min.removeMin();
	else{
	    max.removeMax();
	    min.removeMin();
	}
    }

    public int getMed(){
	if(max.getLR() - min.getLR() == 0)
	    return (max.getMax() + min.getMin())/2;
	if(max.getLR() - min.getLR() == 1)
	    return max.getMax();
	return min.getMin();
    }
}