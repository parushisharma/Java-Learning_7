/**
 * This class creates new SubscriptionYear objects and saves them
 * in an linked List. It also takes a starting and ending year that it 
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
	 *  is saved in the subscriptions linked List.
	 *  @param 	year 					Integer of the Year input. 
	 *  @param  countryData 			The passed data values specific to the country
	 */
		public void addSubscriptionYear(int year, double countryData) {
			
			if (year < this.minYear) {
				this.minYear = year;
			} 
			
			if (year > this.maxYear) {
				this.maxYear = year;
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
					
				}
				current.setNode(newNode);
			}
			
	}
	/**
	 * Method acts as a constructor that will be used to create a temporary Country 
	 * object that has the information about the name of the Country given.
	 * @param	countryNameToFind 		The name of the country given in test case  
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
		// check if the new node's year is within the valid range
		if(eyear > maxYear || syear < minYear) {
			throw new IllegalArgumentException("New node's year is not within the valid range of years"); 	
		}
		/*
		if(syear > eyear || eyear > maxYear || syear < minYear) {
			return -1;
		} 
		*/
		SubscriptionYear current = subscriptions;
		while(current.getNext() != null) {
			current = current.getNext();
			if(current.getYear() >= syear && current.getYear() <= eyear) {
				subscription = current.getSubscription() + subscription;
			}
			
		}
		
		return subscription;
	}
	
	/**
	 *  Method which returns a representation of the country 
	 *  overrides the toString method and prints out the countries.
	 *  @return 			The string and the subscriptions 
	 */
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
	
	/**
	 * overrides the equals method and returns country name if found
	 * @return 			If the country name is found or not. 
	 * @param	obj		The given object in the test case 
	 */  
	public boolean equals(Object tmpCountry)
	{
		if(this == tmpCountry){
			return true;
		}
		else if (!(tmpCountry instanceof Country)) {
			return false;
			
		} else {
		Country c = (Country) tmpCountry;
		if( this.getName().equals(c.getName()) ) {
			return true;
		}
		}
		return false;
	}
	
}