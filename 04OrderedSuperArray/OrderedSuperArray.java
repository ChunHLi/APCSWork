public class OrderedSuperArray extends SuperArray{
    public void mySort(){
	int counter = 1;
	String placeHolder = superArray[0];
	int index = 0;
	String[] copy = superArray.clone();
        clear();
	System.out.println(copy.toString());
	System.out.println(superArray.toString());
	while (copy.length != 0){
	    while (counter < copy.length){
		if (placeHolder.compareTo(copy[counter]) > 0){
		    index = counter;
		}
		counter += 1;
	    }
	    counter = 0;
	    placeHolder = copy[0];
	    add(remove(index));
	}
        superArray = copy;
    }        
    public void add(String e){
	int counter = 0;
	if (superArray.length == 0){
	    super.add(e);
	}
	else{
	    while (e.compareTo(superArray[counter]) > 0){
		counter += 1;
		if (counter == superArray.length){
		    break;
		}
	    }
	    super.add(counter,e);
	}
    }
    public String set(int index, String e){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String string = superArray[index];
	superArray[index] = e;
	mySort();
	return string;
    }
}
    
