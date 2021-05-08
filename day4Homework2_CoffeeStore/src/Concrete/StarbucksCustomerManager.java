package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	public void Save(Customer customer) throws Exception{
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			super.Save(customer);
		}
		else {
			System.out.println("not a valid person");
			
		}
	}
	
	

}
