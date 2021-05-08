import java.time.LocalDate;

import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer person = new Customer();
		person.setId(1);
		person.setFirstName("Rumeysa");
		person.setLastName("Tan");
		person.setDateOfBirth(LocalDate.of(1996,01,23));
		person.setNationalityId("19648362234");
		
		baseCustomerManager.Save(person);
		
		
	}

}
