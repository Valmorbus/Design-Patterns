package composite;

import java.util.ArrayList;

public class Employee {
	private String name;
	private int pay;
	private ArrayList<Employee> staff = new ArrayList<Employee>();
	
	public Employee(String name, int pay) {
		super();
		this.name = name;
		this.pay = pay;
		this.staff = staff;
	}
	
	public void addStaff(Employee e){
		this.staff.add(e);
	}
	
	public int calculatePay(){
		int totalPay = pay;
		for(Employee e : staff){
			totalPay += e.calculatePay();
		}
		return totalPay;
	}
	public void writeStaff(){
		System.out.println(name + " " + pay);
		for(Employee e : staff){
			e.writeStaff();
		}
	}

}
