package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	public void Save(Customer customer) throws Exception {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}

	
	
	
}
