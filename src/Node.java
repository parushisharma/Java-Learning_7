/**
 * This class creates methods and nodes that will be used by CountryList.
 */
public class Node<E> {
	private E data;
	private Node<E> next;

	
	/**
	 * A constructor that takes in a generic object as a parameter.  
	 * @param 	data					The data of the object 
	 */
	public Node (E data) {
		this.data = data;
		this.next = null; 
	}
	
	/**
	 * A constructor that takes in two parameters, a generic object and an object 
	 * of parametrized Node type.
	 * @param 	nameOfCountry				Name of the Country object 
	 * @param 	node 						A node of type CountryNode
	 */
	public Node (E initialData, Node<E> initialLink) {
		this.data = initialData;
		this.next = initialLink; 
	}
	
	/**
	 * Getter method for 	The Linked List 
	 * @return 	next 		The next Node 
	 */
	public Node<E> getNext() {
		return next;
	}
	
	/**
	 * Setter method for next 
	 * @param 	next 		The next Node 
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	/**
	 * Getter method for 	Linked List  
	 * @return 	next 		The next Node 
	 */
	public E getData() {
		return data;
	}
	
	/**
	 * A method that returns a string containing information about every country in the list.
	 * @return		string 				The result 
	 */
	public String toString(){
		String result = "";
		
		Node<E> current = this.next;
		while(current != null) {
			result += current.getData() + "\n";
			current = current.getNext();
		}
		return result;
	} 

	

}
