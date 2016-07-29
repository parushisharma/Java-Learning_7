/**
 * This class creates new SubscriptionYear objects and saves them
 * in an array. It also takes a starting and ending year that it 
 * pulls out the average subscriptions of. 
 * 
 */


public class Country  {

	// Instance variable fields that are private to the user. 
	private String name;
	private  SubscriptionYear subscriptions;
	int minYear;
	int maxYear;
	
	/**
	 *  Method that takes in the year, and a single subscription
	 *  It creates a new SubscriptionYear object and that object 
	 *  is saved in the subscriptions array
	 *  @param 	year 					Integer of the Year input. 
	 *  @param  countryData 			The passed data values specific to the country
	 */
		public void addSubscriptionYear(int year, double countryData) {
			
			if (this.minYear > year) {
				this.minYear = year;
			} 
			
			if (this.maxYear < year) {
				this.maxYear = year;
			}
			// check if the new node's year is within the valid range
						if(year > maxYear || year < minYear) {
							throw new IllegalArgumentException("New node's year is not within the valid range of years");
							
						}
			SubscriptionYear newNode = new SubscriptionYear(year,countryData);
			if(this.isEmpty()) {
				newNode.setNode(subscriptions);
				subscriptions = newNode;
			}
			else {
				SubscriptionYear current = subscriptions;
				while(current.getNext() != null) {
					current = current.getNext();
					current.setNode(newNode);
				}
			}
			
	}
	/**
	 * Method acts as a constructor that will be used to create a temporary Country 
	 * object that has the information about the name of the Country given. 
	 */
	public Country(String countryNameToFind) { 
		this.name = countryNameToFind;
		this.subscriptions = null;
		this.maxYear = 0;
		this.minYear = 9999;
		
	}

	/**
	 * Method that takes in the starting year and the ending year
	 * returns the total number of subscriptions between the two years
	 * @param 	syear						The integer value of the starting year
	 * @param 	eyear						The integer value of the ending year
	 * @return	subscription 				The running sum of the subscriptions 
	 */
	
	public double getNumSubscriptionsForPeriod(int syear, int eyear) {
		double subscription = 0;
		
		if(syear > eyear || eyear > maxYear || syear < minYear) {
			return -1;
		} 
		
		
	    for (int i = 0; i < subscriptions.length ; i++ ) {
	    	if (subscriptions[i].getYear() >= syear && subscriptions[i].getYear() <= eyear) {
	    		subscription = subscriptions[i].getSubscription() + subscription;
	    	} 
	    }
		return subscription;
	}
	
	/**
	 *  Method which returns a representation of the country 
	 *  @return 			The string and the subscriptions 
	 */
	// 
	//overrides the toString method and prints out the countries.
	public String toString()
	{
	    String result="";
	    result += "\n"+this.name;
	    SubscriptionYear current = subscriptions;
	    while(current!=null)
	    {
	        result+="\t"+current.getSubscription();
	        current = current.getNext();        
	    }
	    return result;
	}
	/**
	 * This method returns countryName
	 * @return 				The name of the country 
	 */
	 public String getName() {
	    return this.name;
	}
	 
	/**
	 * This method checks to see if the array is null
	 * @return 			If the array is empty or not. 
	 */  
	public boolean isEmpty() {
	    return (subscriptions == null);
	}
	
}