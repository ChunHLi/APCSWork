public class OrderedSuperArray extends SuperArray{
    public void mySort(){
	int counter = 1;
	String placeHolder = superArray[0];
	int index = 0;
	String[] newSortedSuperArray = new String[0];
	while (superArray.length != 0){
	    while (counter < superArray.length){
		if (placeHolder.compareTo(superArray[counter]) > 0){
		    index = counter;
		}
		counter += 1;
	    }
	    counter = 0;
	    placeHolder = superArray[0];
	    newSortedSuperArray.add(superArray.remove(index));
	}
        superArray = newSortedSuperArray;
    }        
    public void add(String e){
	String[] newSuperArray = new String[0];
	int counter = 0;
	while (e.compareTo(superArray[0]) > 0){
	    newSuperArray.super.add(superArray.remove(0));
	}
	newSuperArray.super.add(e);
	while (counter < superArray.length){
	    newSuperArray.super.add(superArray.remove(0));
	    counter += 1;
	}
	superArray.resize(newSuperArray.length);
	superArray = newSuperArray;
    }
    
    public void set(int index, String e){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String object = superArray[index];
	superArray[index] = e;
	superArray.mySort();
	return object;
    }
    public void InsertionSort(){
        OrderedSuperArray c = new OrderedSuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
    }
    public int find(String target){
	int counter = 0;
	while (counter < superArray.length){
	    if (superArray[counter] == target){
		break;
	    }
	    counter += 1;
	}
	if (counter == superArray.length){
	    throw new IndexOutOfBoundsException("Couldn't find target");
	}
	else{
	    return counter;
	}
    }
    public void InsertionSort(){
        OrderedSuperArray c = new OrderedSuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
    }
    public int find(String target){
	int counter = 0;
	while (counter < superArray.length){
	    if (superArray[counter] == target){
		break;
	    }
	    counter += 1;
	}
	if (counter == superArray.length){
	    throw new IndexOutOfBoundsException("Couldn't find target");
	}
	else{
	    return counter;
	}
    }
    
}
    
