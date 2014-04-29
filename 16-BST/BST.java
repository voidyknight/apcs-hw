public class BST{
   private Node root;

    public BST() {
        root = null;
    }

    public Node getRoot(){ return root;}

    public void insert(int x){
	if(root == null){
	    root = new Node(x, null, null);
	    return;
	}
	Node tmp = root;
	Node trail = new Node(0, tmp,tmp);
	while(tmp != null){
	    trail = tmp;
	    if (x < tmp.getData())
		tmp = tmp.getLeft();
	    else
		tmp = tmp.getRight();
	}
	    if(x < trail.getData())
		trail.setLeft(new Node(x, null, null));
	    else
		trail.setRight(new Node(x, null, null));
    }

	public Node search(int x){
	    Node tmp = root;
	    while(tmp != null  && tmp.getData() != x){
		if(x > tmp.getData())
		    tmp = tmp.getRight();
		else
		    tmp = tmp.getLeft();
	    }
	    return tmp;
	}

	public Node search2(int x){
	    return search2(root, x);
	}

	public Node search2(Node c, int x){
	    if(c == null)
		return null;
	    if(c.getData() < x)
		return search2(c.getRight(), x);
	    if(c.getData() > x)
		return search2(c.getLeft(), x);
	    return c;
	}

    public void delete(int x){
	Node tmp = root;
	Node trail = new Node(Integer.MIN_VALUE, tmp,tmp);
	while(tmp.getData() != x){
	    trail = tmp;
	    if (x < tmp.getData())
		tmp = tmp.getLeft();
	    else
		tmp = tmp.getRight();
	    if (tmp == null)
		return;
	}
	if(tmp.getLeft() == null){
	    if(trail.getLeft() != null && trail.getLeft().getData() == tmp.getData())
		trail.setLeft(tmp.getRight());
	    else
		trail.setRight(tmp.getRight());
	}
	else if(tmp.getRight() == null){
	    if(trail.getLeft() != null && trail.getLeft().getData() == tmp.getData())
		trail.setLeft(tmp.getLeft());
	    else
		trail.setRight(tmp.getLeft());
	}
	else{
	    Node n = tmp.getRight();
	    while(n.getLeft() != null)
		n = n.getLeft();
	    tmp.setData(n.getData());
	    delete(n.getData());
	}
    }
    

	


}

