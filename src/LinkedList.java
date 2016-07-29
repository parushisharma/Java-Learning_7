/**
 * This class holds linked list of CountryNode objects, that can store as many objects
 * as the user wants to add to it. 
 */
import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>{
	// Instances that are private to the user 
	private Node<E> node; 
	
	/**
	 * Constructor that sets up the node. 
	 * 
	 */
	public LinkedList () {
		this.node = null;
	}
	
	
	/**
	 * A method that gets the country based on the index. 
	 * @param 		index 			The index of that you want 
	 * @return		Country			the name of the country at the index
	 */
	public E getIndex(int index) {
		Node<E> current = this.node;
		if(index < 0 || index > size()) {
			return null;
		}
		if (index == 0) {
			return current.getData();
		}
		
		for (int i = 1; i < index ; i++) {
			if (current.getNext() == null ) {
				return null;
			}
			current = current.getNext();
		}
		return current.getData();
	}
	
	/**
	 * A method that adds a country object to the end of the list. 
	 * @param 	country			The country object you want to add.
	 */
	public void add(E data) {
		if( this.node == null) {
		Node<E> first = new Node<E>(data);
		this.node = first;
		
		} else {
		Node<E> add = new Node<E>(data);
		Node<E> current = this.node;
			while ( current.getNext() != null) {
				current = current.getNext();
				
			} 
			current.setNext(add);
					
		}
	}
	
	/**
	 * A method that returns the size of the list
	 * @return		size 			The size of the list 
	 */
	public int size() {
		int size = 0;
		Node<E> CurrNode = this.node;
			while(CurrNode != null) {
				CurrNode = CurrNode.getNext();
				size++;
			}
		return size;
	}
	
	/**
	 * A method that checks if the name of the country can be found in the list.
	 * @param 	tmpCountry			the name of the country/object that you want to find.
	 * @return	Country 			the name of the country or null if the country is not found
	 */
	public E contains(E tmpCountry) {
		Node<E> curr = this.node;
		while (curr != null && !curr.getData().equals(0)) {
			
			if (curr.getData().equals(tmpCountry)) {
				return curr.getData();	
			} 
			
			curr = curr.getNext();
		}
		/*
		if(curr != null) {
				return curr.getData();
			}
			*/
		return null;
	}
	
	/**
	 * A method that returns a string containing information about every country in the list.
	 * @return		string 				The result 
	 */
	public String toString(){
		String result = "";
		
		Node<E> current = this.node;
		while(current != null) {
			result += current.getData() + "\n";
			current = current.getNext();
		}
		return result;
	}


	public Iterator<E> iterator() {
		return new Iterator<E>(){
	        private int current = 1;

	        public boolean hasNext() {
	            if(current <= size()){
	                return true;
	            }
	            return false;
	        }
	        
	        
	        public E next() {
	            E data = getIndex(current);
	            current++;
	            return data;
	        }
	        

		}; 
	}
}