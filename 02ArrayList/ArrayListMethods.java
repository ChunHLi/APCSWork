import java.util.*;

public class ArrayListMethods{
  
  public static void collapseDuplicates(ArrayList<Integer> L){
	  L.add(null);
	  ArrayList<Integer> L2 = new ArrayList<Integer>();
	  int counter = 1;
    while (counter < L.size()){
	    if (L.get(counter - 1) == L.get(counter)){
		    counter += 1;
	    }
	    else{
		    L2.add(L.get(counter-1));
		    counter += 1;
	    }
	  }
	  L = L2;
	  System.out.println(L.toString());
  }
   
  public static void randomize(ArrayList<Integer> L){ 
	  int counter = 0;
	  int randomIndex = 0;
	  Random r = new Random();
	  int placeHolderElement = 0;
	  while (counter < L.size()){
	    randomIndex = r.nextInt(L.size());
	    placeHolderElement = L.get(randomIndex);
	    L.set(randomIndex, L.get(counter));
	    L.set(counter, placeHolderElement);
	    counter += 1;
	  }
	System.out.println(L.toString());
  }

  public static void main(String[]args){
	  ArrayList<Integer> A = new ArrayList<Integer>();
	  A.add(0);
	  A.add(0);
	  A.add(1);
	  A.add(2);
	  A.add(3);
	  A.add(3);
    randomize(A);
	  collapseDuplicates(A);
  }
}
