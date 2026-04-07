import java.util.*;
class ArrayListVSLinkedList{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		int size = 100000;

		for (int i=1; i<=size ; i++ ) {
			al.add(i);
			ll.add(i);
		}

		long start=System.nanoTime();
		al.addFirst(-1);
		long end=System.nanoTime();
		System.out.println("Arraylist, add new element at first, time taken: "+(end-start));

		start=System.nanoTime();
		ll.addFirst(-1);
		end=System.nanoTime();
		System.out.println("LinkedList, add new element at first, time taken: "+(end-start));
	}
}