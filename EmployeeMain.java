package prepCall;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		
		
		List<Employee> emplist =new ArrayList<>();
		
		emplist.add(new Employee("yogesh", 24, 20000));
		emplist.add(new Employee("Dipak", 26, 25000));
		emplist.add(new Employee("Vaibhav", 30, 15000));
		
		emplist.stream().filter(emp->emp.getAge()>25).forEach(System.out::print);
		
		
		
		
	}
	
	

}
