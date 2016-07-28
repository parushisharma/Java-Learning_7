/**
 * This class creates methods and nodes that will be used by CountryList.
 */
public class Node<E> {
	private E data;
	private Node<E> next;

	
	/**
	 * Constructor that takes in the object of type Country 
	 * @param 	country					The name of the country 
	 */
	public Node (E data) {
		this.data = data;
		this.next = null; 
	}
	
	/**
	 * Constructor that takes in two parameters, an object of type 
	 * Country and an object of type CountryNode.
	 * @param 	nameOfCountry				Name of the Country object 
	 * @param 	node 						A node of type CountryNode
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

	public E getData() {
		return data;
	}
	
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
