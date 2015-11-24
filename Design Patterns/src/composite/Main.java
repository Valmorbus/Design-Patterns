package composite;

public class Main {

	public static void main(String[] args) {
		Employee chef = new Employee("AvdelningsChef", 50000);
		Employee lead = new Employee("lead programmer", 40000);
		Employee project = new Employee ("project manager", 25000);
		chef.addStaff(project);
		chef.addStaff(lead);
		
		project.addStaff(new Employee("P1", 15000));
		project.addStaff(new Employee("P2", 16000));
		project.addStaff(new Employee("P3", 12000));
		project.addStaff(new Employee("P4", 19000));
		project.addStaff(new Employee("P5", 22000));
		project.addStaff(new Employee("P6", 18000));
		project.addStaff(new Employee("P7", 22000));
		project.addStaff(new Employee("P8", 21000));
		project.addStaff(new Employee("P9", 14000));
		
		System.out.println(chef.calculatePay()+"$");
		chef.writeStaff();
		
	}

}
