public class SuperArray{
    String[] superArray;
    int numElements;

    public SuperArray(){
	superArray = new String[0];
    }

    public String toString(){
	int counter = 0;
	String superArrayString = "[";
	while (counter < superArray.length){
	    superArrayString += " ";
	    while (counter < superArray.length && superArray[counter] == null){
		counter += 1;
	    }
	    if (counter >= superArray.length){
		break;
	    }
	    superArrayString += superArray[counter];
	    counter += 1;    
	}
	return superArrayString + " ]";
    }

    public void add(String e){
	String[] newSuperArray = new String[superArray.length + 1];
	int counter = 0;
	while (counter < superArray.length){
	    newSuperArray[counter] = superArray[counter];
	    counter += 1;
	}
	newSuperArray[counter] = e;
	numElements += 1;
	superArray = newSuperArray;
    }


    public void add(int index,String e){
	int counter = 0;
	if (index >= superArray.length){
	    resize(index);
	}
	String[] newSuperArray = new String[superArray.length + 1];
	    
	while ((counter < index) && (counter < superArray.length)){
	    newSuperArray[counter] = superArray[counter];
	    counter += 1;
	}
	newSuperArray[index] = e;
	while (counter < superArray.length){
	    newSuperArray[counter + 1] = superArray[counter];
	    counter += 1;
	}
	numElements += 1;
	superArray = newSuperArray;
    }
    
    public int size(){
	return numElements;
    }
    
    public void resize(int newCapacity){
	int counter = 0;
	String[] newSuperArray = new String[newCapacity];
	while ((counter < newCapacity) && (counter < superArray.length)){
	    newSuperArray[counter] = superArray[counter];
	    counter += 1;
	}
	numElements = newCapacity;
	superArray = newSuperArray;
    }

    public void clear(){
	resize(0);
    }

    public String get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	return superArray[index];
    }
    
    public String set(int index, String e){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String object = superArray[index];
	superArray[index] = e;
	return object;
    }
    
    public String remove(int index){
      	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String[] newSuperArray = new String[superArray.length];
	int counter = 0;
	String object = superArray[index];
	while ((counter < index) && (counter < newSuperArray.length)){
	    newSuperArray[counter] = superArray[counter];
	    counter += 1;
	}
	while (counter < newSuperArray.length){
	    newSuperArray[counter] = superArray[counter + 1];
	    counter += 1;
	}
	superArray = newSuperArray;
	return object;
    }	
    public int find(String target){
	int counter = 0;
	while (counter < superArray.length){
	    if (superArray[counter] = target){
		break;
	    }
	    counter += 1;
	}
	if (counter = superArray.length){
	    System.out.println("Not Found");
	}
	return counter;
    }	
    public void selectionSort(){
	int counter = superArray.length;
	int counter2 = 0;
	int counter3;
	String temp = superArray[0];
	while (counter > 0){
	    while (counter2 < counter){
		if (temp.compareTo(superArray[counter2]) < 0){
		    temp = superArray[counter2];
		    counter3 = counter2;
		}
		counter2 += 1;
	    }
	    superArray[counter3] = superArray[counter - 1];
	    superArray[counter - 1] = temp;
	    counter -= 1;
	    counter2 = 0;
	    counter3 = 0;
	    String temp = superArray[0];
	}
    }
    public void InsertionSort{
	OrderedSuperArray c = new OrderedSuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
    }
}    
	
