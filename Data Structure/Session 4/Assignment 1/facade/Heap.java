package facade;

import java.util.ArrayList;
import java.util.List;

public class Heap<T> {
	private List<T> heapTree = new ArrayList<T>();
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int compare(T item1, T item2) {
		try {
			if( item1 instanceof Comparable ) {
				return ((Comparable)item1).compareTo(item2);
			} else {
				return item1.toString().compareTo(item2.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public void swapItems(int position1, int position2) {
		try {
			T item = heapTree.get(position1);
			heapTree.set(position1, heapTree.get(position2));
			heapTree.set(position2, item);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void heapify(int position) {
		try {
			if( (position != 0) && ( compare( heapTree.get(position), heapTree.get((position-1)/2)) > 0) ) {
				swapItems(position, (position-1)/2);
				heapify( (position-1)/2 );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addItem(T item) {
		try {
			heapTree.add(item);
			heapify(heapTree.size() - 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void checkParent(int parentIndex, int childIndex) {
		try {
			if(compare(heapTree.get(parentIndex), heapTree.get(childIndex)) < 0 ) {
				swapItems(parentIndex, childIndex);
				reHeapify(childIndex);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void reHeapify(int nodeIndex) {
		try {
			if(nodeIndex < heapTree.size()) {
				int left = 2*nodeIndex + 1;
				int right = 2*nodeIndex + 2;
				
				if( left<heapTree.size() && right<heapTree.size() && compare(heapTree.get(left), heapTree.get(right))<0 ) {
					checkParent(nodeIndex, right);
				} else if(left < heapTree.size()) {
					checkParent(nodeIndex, left);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public T removeMax() {
		T element = heapTree.get(0);
		try {
			
			heapTree.set(0, heapTree.get(heapTree.size()-1));
			heapTree.remove(heapTree.size() - 1);
			reHeapify(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}
	
	public boolean isEmpty() {
		try {
			return heapTree.size() == 0;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
