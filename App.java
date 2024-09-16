package springinventory.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ioc container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		Product p1=(Product)context.getBean("proBean");
		
		/*
		 * p.setId(11); p.setName("Gemini"); p.setPrice(1000.00f);
		 */
		
		Product p2=(Product)context.getBean("proBean");
		
		
		 // p2.setId(444); p2.setName("Assam chai"); p2.setPrice(500.00f);
		 
		Customer c1=(Customer) context.getBean("cust");

		Customer c2=(Customer) context.getBean("cust");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(c1);
		System.out.println(c2);

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();

		
		Order o1=(Order) context.getBean("order1");
		
		System.out.println(o1);

	}

}
