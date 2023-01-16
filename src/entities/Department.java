package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	
	private List<Employee> employees = new ArrayList<>();
	private Address address;
	
	public Department() {
	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	public double payroll() {
		double total = 0;
		for(Employee emp : employees) {
			total = total + emp.getSalary();
		}
		return total;
	}
	@Override
	public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("FOLHA DE PAGAMENTO: \n");
			sb.append("Departamento de vendas = R$ ");
			sb.append(String.format("%.2f%n", payroll()));
			sb.append("Pagamento realizado no dia ");
			sb.append(getPayDay()+"\n");
			sb.append("Funcionários: \n");
			for(Employee emp : employees) {
					sb.append(emp+"\n");
			}
			sb.append(address);
			return sb.toString();
			
	}
}
