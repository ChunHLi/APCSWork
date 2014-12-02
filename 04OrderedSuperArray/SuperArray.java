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
	
}    
	
