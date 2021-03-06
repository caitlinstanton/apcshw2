import java.io.*;
import java.util.*;

public class moreEfficient {
	
    public ArrayList<Integer> mergeSort(ArrayList<Integer> n) {
	if(n.size() <= 1) {
	    return n;
	}
	ArrayList<Integer> A = new ArrayList<Integer>();
	ArrayList<Integer> B = new ArrayList<Integer>();
	int middle = n.size()/2;
	for(int i = 0; i < n.size(); i++) {
	    if(i < middle) {
		A.add(n.get(i));
	    } else {
		B.add(n.get(i));
	    }
	}
        return merge(mergeSort(A), mergeSort(B));
    }
    
    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
	    ArrayList<Integer> mergedList = new ArrayList<Integer>();
	    int iA = 0;
	    int iB = 0;
	    while (iA < A.size() && iB < B.size()){
		if (A.get(iA) <= B.get(iB)){
		    mergedList.add(A.get(iA));
		    iA++;
		} else{
		    mergedList.add(B.get(iB));
		    iB++;
		}
	    }
	    while (iA < A.size()){
		mergedList.add(A.get(iA));
		iA++;
	    }
	    while (iB < B.size()){
		mergedList.add(B.get(iB));
		iB++;
	    }
	    return mergedList;
    }

    
    public static void main(String[] args) {
	ArrayList<Integer> A = new ArrayList<Integer>();
	Random rn = new Random();
	for (int i = 0; i < 10; i++) {
	    A.add(rn.nextInt(15));
	}
        moreEfficient m = new moreEfficient();
	System.out.println("Array: " + A);
	System.out.println("Sorted: " + m.mergeSort(A));
	
    }
	
}
