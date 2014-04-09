import java.util.*;
import java.lang.*;
import java.io.*;
public class Calc{

    private MyStack stack; 

    public Calc(){stack = new MyStack();}

    public double doCalc(String s){
	String[] input = s.split(" ");
	for(String x : input){
	    try{
		stack.push(Double.parseDouble(x));
	    }catch(NumberFormatException e){
		stack.push(doOperation(x));	
	    }
	}
	return stack.pop();
    }

    public double doOperation(String s){
	double v2 = stack.pop();
	double v1 = stack.pop();
	if(s.equals("+"))
	    return v1 + v2;
	if(s.equals("-"))
	    return v1 - v2;
	if(s.equals("*"))
	    return v1 * v2;
	if(s.equals("/"))
	    return v1 / v2;
	if(s.equals("%"))
	    return v1 % v2;
	if(s.equals("^"))
	    return Math.pow(v1, v2);
	System.out.println("Unknown operator");
	return 0.0;
    }


}

