public class SuperArray{
    Object[] superArray;
    int numElements;
    
    public static void main(String[]args){
	SuperArray A = new SuperArray();
	System.out.println(A.toString());
	System.out.println(A.size());
        A.add(5);
	System.out.println(A.toString());
	System.out.println(A.size());
	A.add(20, "dragon");
	System.out.println(A.toString());
	System.out.println(A.size());
	A.resize(15);
	System.out.println(A.toString());
	System.out.println(A.size());
	A.remove(10);
	System.out.println(A.toString());
	System.out.println(A.size());
	A.resize(3);
	System.out.println(A.toString());
	System.out.println(A.size());
	A.set(1,"banana");
	System.out.println(A.toString());
	System.out.println(A.size());
	A.set(5,"Error");
	A.get(5);
	A.clear();
	System.out.println(A.toString());
	System.out.println(A.size());
    }

    public SuperArray(){
	this(10);
    }

    public SuperArray(int n){
	superArray = new Object[n];
	numElements = n;
    }

    public String toString(){
	int counter = 0;
	String superArrayString = "[";
	while (counter < superArray.length){
	    superArrayString += " ";
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
	numElements = newSuperArray.length;
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
	numElements = newSuperArray.length;
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
	numElements = newSuperArray.length;
	superArray = newSuperArray;
    }

    public void clear(){
	resize(0);
    }

    public Object get(int index){
	if (index < 0 || index >= size()){
	    System.out.println("Error");
	    return null;
	}
	return superArray[index];
    }
    
    public Object set(int index, Object e){
	if (index < 0 || index >= size()){
	    System.out.println("Error");
	    return null;
	}
	Object object = superArray[index];
	superArray[index] = e;
	return object;
    }
    
    public Object remove(int index){
      	if (index < 0 || index >= size()){
	    System.out.println("Error");
	    return null;
	}
	Object[] newSuperArray = new Object[superArray.length - 1];
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
	numElements = newSuperArray.length;
	superArray = newSuperArray;
	return object;
    }	
	
}    
	
