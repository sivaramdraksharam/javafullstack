package springpayroll.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import springpayroll.modal.Employee;
import springpayroll.modal.User;


@ComponentScan( basePackages = {"springpayroll.modal.Employee,springpayroll.modal.User"} )
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		//register bean configuration java class file
		context.register(AppConfig.class);
		//referesh the context means application
		context.refresh();
		//create Employee bean
		Employee emp=(Employee) context.getBean("emp",Employee.class);
		//create User bean
		User user=(User) context.getBean(User.class);
		
		
	}

}
