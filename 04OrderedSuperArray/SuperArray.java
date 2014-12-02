public class SuperArray{
    Object[] superArray;
    int numElements;
    
    public static void main(String[]args){
	SuperArray A = new SuperArray();
	System.out.println("\n");
	A.add(1);
	A.add(2);
	A.add(3);
	A.add(4);
	A.add(5);
	System.out.println(A.toString());
	System.out.println(A.size());
	System.out.println("\n");
	A.remove(0);
	System.out.println(A.toString());
	System.out.println(A.size());
	System.out.println("\n");
	A.add(6);
	System.out.println(A.toString());
	System.out.println(A.size());
	System.out.println("\n");
	A.add(0,"Banana");
	System.out.println(A.toString());
	System.out.println(A.size());
	System.out.println("\n");
	System.out.println(A.get(0));
	System.out.println(A.set(0, "Cherry"));
	System.out.println(A.set(0, "Cherry"));
    }

    public SuperArray(){
	superArray = new Object[0];
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

    public void add(Object e){
	Object[] newSuperArray = new Object[superArray.length + 1];
	int counter = 0;
	while (counter < superArray.length){
	    newSuperArray[counter] = superArray[counter];
	    counter += 1;
	}
	newSuperArray[counter] = e;
	numElements += 1;
	superArray = newSuperArray;
    }


    public void add(int index,Object e){
	int counter = 0;
	if (index >= superArray.length){
	    resize(index);
	}
	Object[] newSuperArray = new Object[superArray.length + 1];
	    
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
	Object[] newSuperArray = new Object[newCapacity];
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

    public Object get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	return superArray[index];
    }
    
    public Object set(int index, Object e){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	Object object = superArray[index];
	superArray[index] = e;
	return object;
    }
    
    public Object remove(int index){
      	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	Object[] newSuperArray = new Object[numElements - 1];
	int counter = 0;
	Object object = superArray[index];
	while ((counter < index) && (counter < newSuperArray.length)){
	    newSuperArray[counter] = superArray[counter];
	    counter += 1;
	}
	while (counter < newSuperArray.length){
	    newSuperArray[counter] = superArray[counter + 1];
	    counter += 1;
	}
	numElements -= 1;
	resize(numElements);
	superArray = newSuperArray;
	return object;
    }	
	
}    
	
