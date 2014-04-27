public class Node {
    private int data;
    private Node left,right;

    public Node(int d, Node l, Node r){
	data = d; left = l; right = r;
    }

    public void setData(int d){ data = d;}
    public int getData(){ return data;}

    public void setLeft(Node l){ left = l;}
    public Node getLeft(){ return left;}

    public void setRight(Node r){ right = r;}
    public Node getRight(){ return right;}
}
