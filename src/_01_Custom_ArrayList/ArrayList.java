package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] list;
	public ArrayList() {
		list = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > list.length) throw new IndexOutOfBoundsException();
			return list[loc]; 
		
	}
	
	public void add(T val) {
		T[] list1 = (T[]) new Object[list.length+1];
		for (int i = 0; i < list.length;i++) {
			list1[i] = list[i];
		}
		list1[list1.length-1] = val;
		list = list1;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > list.length) throw new IndexOutOfBoundsException();
		T[] list2 = (T[]) new Object[list.length+1];
		int counter = 0;
		for (int i = 0; i < list2.length; i++) {
			if (i == loc) {
				list2[i] = val;
			}
			else {
			list2[i] = list[counter++];
			}
		}
		list = list2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > list.length) throw new IndexOutOfBoundsException();
		for (int i = 0; i < list.length; i++) {
			if (i == loc) {
				list[i] = val;
			}
		}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > list.length) throw new IndexOutOfBoundsException();
		T[] list2 = (T[]) new Object[list.length-1];
		int counter = 0;
		for (int i = 0; i < list2.length; i++) {
			if (i == loc) {
				list2[i] = list[counter++];
			}
			else if (i > loc) {
			list2[i] = list[counter++];
			}
		}
		list = list2;
	}
	
	
	public boolean contains(T val) {
		
		return false;
	}
}