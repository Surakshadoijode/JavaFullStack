package streamapi;
import java.util.*;
import java.util.stream.Collectors;

class Employee{
	int emp_id;
	int emp_salary;
	String emp_name;
	Employee(int emp_id, String emp_name, int emp_salary){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
	}
}

public class FilterCollect4 {

	public static void main(String[] args) {
		List<Employee> em=new ArrayList<Employee>();
		em.add(new Employee(2, "Raavi", 70000));
		em.add(new Employee(10,"Sanvi",15000));
		em.add(new Employee(3,"Ravi",45000));
		List<Employee> em1=em.stream().filter(x-> x.emp_salary>20000).collect(Collectors.toList());
		for(Employee employee:em1) {
			System.out.println(employee.emp_name);
		}

	}

}
