package springpayroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springpayroll.modal.Employee;
import springpayroll.modal.User;

@Configuration
public class AppConfig {

	@Bean( name = "emp")
	@Autowired
	public Employee employeeBean()
	{
		return new Employee();
	}
	
	@Bean
	public User getUser()
	{
		return new User() {
			
		};
	}
	
}
