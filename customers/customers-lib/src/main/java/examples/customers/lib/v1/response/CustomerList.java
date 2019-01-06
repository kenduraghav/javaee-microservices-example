package examples.customers.lib.v1.response;

import java.util.List;

import examples.customers.lib.v1.Customer;

public class CustomerList {

	private List<Customer>  customerlist;

	public List<Customer> getCustomerlist() {
		return customerlist;
	}

	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
	}
}
