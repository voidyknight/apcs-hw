import java.util.Arrays;
public class Driver{

    public static void main(String[]args){
	QuickSort a = new QuickSort();
	int[] b = {1,12,23,123,1,2,2,42,42,42,45,16,7};
	b = a.sort(b);
	System.out.println(Arrays.toString(b));
    }

}
