public class Driver{
    public static void main(String[]args){
	OrderedSuperArray A = new OrderedSuperArray();
	A.add("banana");
	A.add("orange");
	A.add("apple");
	A.add("durian");
	System.out.println(A.toString());
	A.mySort();
    }
}
