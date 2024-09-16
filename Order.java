package springinventory.beans;

import java.util.List;

public class Order {
	
	private int id;
	private Customer customer;
	private List<Product> products;
	public Order() {
		super();
	}
	public Order(int id, Customer customer, List<Product> products) {
		super();
		this.id = id;
		this.customer = customer;
		this.products = products;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", products=" + products + "]";
	}
	
	

}
