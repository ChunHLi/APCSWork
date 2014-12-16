import java.util.Arrays;

public class Sorts{
    public static void main(String[]args){
	int[] a = {15,0,9,3,6,12};
	int[] b = {10,6,2,8,4,0};
	int[] c = {5,0,2,3,1,4};

	System.out.println();

	System.out.println("pre-bubble:    " + Arrays.toString(a));
	bubble(a);
	System.out.println("post-bubble:   " + Arrays.toString(a));

	System.out.println();
	
	System.out.println("pre-insertion: " + Arrays.toString(b));
	insertion(b);
	System.out.println("post-insertion:" + Arrays.toString(b));

	System.out.println();
	
	System.out.println("pre-selection: " + Arrays.toString(c));
	selection(c);
	System.out.println("post-selection:" + Arrays.toString(c));
    }
	
    public static void bubble(int[] c){
	int counter = c.length;
	int counter2;
	int placeHolder;
	while (counter > 0){
	    counter2 = 1;
	    placeHolder = c[0];
	    while (counter2 < counter){
		if (placeHolder > c[counter2]){
		    c[counter2 - 1] = c[counter2];
		    c[counter2] = placeHolder;
		}
		else{
		    placeHolder = c[counter2];
		}
		counter2 += 1;	
	    }
	    //System.out.println(Arrays.toString(c));
	    counter -= 1;
	}
    }
    public static void insertion(int[] c){
	int counter = 1;
	int placeHolder;
	int counter2;
	while (counter < c.length){
	    placeHolder = c[counter];
	    counter2 = counter - 1;
	    while ((counter2 >= 0) && (placeHolder < c[counter2])){
		c[counter2 + 1] = c[counter2];
		counter2 -= 1;
	    }
	    c[counter2 + 1] = placeHolder;
	    counter += 1;
	}
    }
    
    public static void selection(int[] c){
	int counter = c.length - 1;
	int counter2;
	int placeHolder;
	int counter3;
	while (counter > 0){
	    counter3 = 0;
	    counter2 = 1;
	    while (counter2 <= counter){
		if(c[counter2] > c[counter3]){
		    counter3 = counter2;
		}
		placeHolder = c[counter3];
		c[counter3] = c[counter];
		c[counter] = placeHolder;
		counter2 += 1;
	    }
	    counter -= 1;
	}
    }
}
