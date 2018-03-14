package assignment_1;

import java.util.Arrays;

public class ArrayList {
	private static final int SIZE_FACTOR = 5;
	private int data[];
	private int index;
	private int size;
	
	public ArrayList() {
		this.data = new int[SIZE_FACTOR];
		this.size = SIZE_FACTOR;
	}
	
	public void add(int value) {
		System.out.println("Index:" + this.index + ", Size:" + this.size + ", DataSize:" + this.data.length);
		
		if(this.index == this.size-1){
			// we need to increase the size of data[]
//			System.out.println("\nCalling increaseSizeAndReallocate()");
			increaseSizeAndReallocate();
		}
		
		data[this.index] = value;
		this.index++;
	}
	
	public void add(int value, int location) throws Exception {		
		if(location > data.length) {
			throw new Exception("Invalid Location");
		}

		if(this.index == this.size-1) {
			// we need to increase the size of data[]
//			System.out.println("\nCalling increaseSizeAndReallocate()");
			increaseSizeAndReallocate();
		}
		
		for(int i=data.length-1; i>location; i--) {
			data[i] = data[i-1];
		}
		
		data[location] = value;
		this.index++;
	}
	
	private void increaseSizeAndReallocate() {
		this.size = this.size + SIZE_FACTOR;
		int newData[] = new int[this.size];
		
		for(int i=0; i<data.length; i++){
			newData[i] = data[i];
		}
		
		this.data=newData;
//		System.out.println("Size Incremented");
//		System.out.println("***Index:" + this.index + ", Size:" + this.size + ", DataSize:" + this.data.length + "\n");
	}
	
	public int get(int i) throws Exception {
		if(i > this.index-1) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		
		if(i < 0) {
			throw new Exception("Negative Value");
		}
		
		return this.data[i];
		
	}
	
	public int get(int value, int location) throws Exception {
		if(location > this.index-1) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		
		if(location < 0) {
			throw new Exception("Negative Value");
		}
		
		for(int i=location; i<this.index; i++) {
			if(value == data[i]) {
				return i;
			}
		}
		
		throw new Exception("Value Not Found");
	}
	
	public void remove(int i) throws Exception {
		if(i > this.index-1) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		
		if(i < 0){
			throw new Exception("Negative Value");
		}
		
		System.out.println("Object getting removed:" + this.data[i] + "\n");
		for(int x=i; x<this.data.length-1; x++) {
			data[x] = data[x+1];
		}
		
		this.index--;
	}

	public void removeValue(int value) throws Exception {
		for(int i=0; i<this.index; i++) {
			if(value == data[i]) {
				remove(i);
				return;
			}
		}
		
		throw new Exception("Value Not Found");
	}
	
	public void sort() {
		Arrays.sort(data, 0, this.index);
	}
	
	public void reverse() {
		int len = this.index;
		int temp;
		for(int i=0; i<len/2; i++) {
			temp = data[i];
			data[i] = data[len-i-1];
			data[len-i-1] = temp;
		}
	}
	
	public void clear() {
		data = null;
		System.out.println("\nArray cleared");
		
		this.index = 0;
		data = new int[SIZE_FACTOR];
		this.size = SIZE_FACTOR;
	}
	
	public static void main(String[] args) throws Exception {
		ArrayList mal = new ArrayList();
		mal.add(0);
		mal.add(1);
		mal.add(2);
		mal.add(3);
		
		mal.add(1, 4);
		
		mal.add(5);
		mal.add(6);
		mal.add(8);
		mal.add(7);
		mal.add(9);
		
		System.out.println("\nValue at index 5: " + mal.get(5));
		System.out.println("Value of 1 after index-2: " + mal.get(1, 2));
		
		mal.removeValue(1);
		mal.printAll();
		
		System.out.println("\nAfter Sorting:");
		mal.sort();
		mal.printAll();
		
		System.out.println("\nReversing:");
		mal.reverse();
		mal.printAll();
		
		mal.clear();
	}
	
	public void printAll() {
		System.out.println();
		
		if(this.index == 0) {
			System.out.println("No elements inside array!");
			return;
		}
		
		for(int i=0; i<this.index; i++) {
			System.out.println("Index: " + i + ", Value: " + data[i]);
		}
	}
}
