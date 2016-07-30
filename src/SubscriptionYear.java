/**
 * This is a class called SubscriptionYear that contains getters
 * and setters to retrieve required information. 
 * 
 */

public class SubscriptionYear {
	// Instances are private to the user. 
	private int year;
	private double subscriptions;
	SubscriptionYear next;
	
	
	/**
	 *  Constructor method 
	 *  This method stores the year and it's statistical data.
	 *  @param year						Integer of the input year
	 *  @param subscriptions 			value (double) of the subscriptions
	 */
	public SubscriptionYear(int year,double subscriptions) {
	    setYear(year);
	    setSubscription(subscriptions);
	    this.next = null;
	}
	
	/**
	 * This method sets the year
	 * @param Year 						Integer of the input year 
	 */
	public void setYear(int Year) {
	    this.year= Year;
	}
	
	/**
	 * This method sets the subscriptions 
	 * @param value 					The value of the subscription
	 */
	public void setSubscription(double value) {
	    this.subscriptions = value;
	}
	
	/**
	 * This method gets the year
	 * @return the year
	 */
	public int getYear() {
	    return year;
	}   
	
	/**
	 * This method gets the subscriptions 
	 * @return subscriptions 
	 */
	public double getSubscription() {
	    return subscriptions;
	}
	
	/**
	 * This method prints the value required 
	 * @return string and subscriptions 
	 */
	public String toString() {
	    return "Number of Subscriptions: "+ subscriptions;
	}
	
	/**
	 * A method that returns a string containing information about every country in the list.
	 * @param		next 				sets the next node  
	 */
	public void setNode(SubscriptionYear next) {
		this.next = next;
	}
	
	/**
	 * A method that returns the next object. 
	 * @return		subscriptionYear 		Next  
	 */
	public SubscriptionYear getNext() {
		return this.next;
		
	}
}