/**
 * This class creates methods and nodes that will be used by CountryList.
 */
public class Node<E> {
	private E data;
	private Node<E> next;

	
	/**
	 * Constructor that takes in the object of type E 
	 * @param 	data					The name of the country 
	 */
	public Node (E data) {
		this.data = data;
		this.next = null; 
	}
	
	/**
	 * Constructor that takes in two parameters, an object of type 
	 * Country and an object of type CountryNode.
	 * @param 	initialData				Name of the Country object 
	 * @param 	initialLink 						A node of type CountryNode
	 */
	public Node (E initialData, Node<E> initialLink) {
		this.data = initialData;
		this.next = initialLink; 
	}
	
	/**
	 * Getter method for CountryNode 
	 * @return 	next 		The next country Node 
	 */
	public Node<E> getNext() {
		return next;
	}
	
	/**
	 * Setter method for next 
	 * @param 	next 		The next country Node 
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	/**
	 * Getter method for data 
	 * @return	 	data 		Of the next country Node 
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