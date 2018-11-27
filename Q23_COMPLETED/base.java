class base{
	public static void main(String[] args){

		employee[] emp = new employee[4];

		employee e1 = new employee("Satyam", "Indore", "1234567890", "satyamtest@gmail.com");
		e1.assginDepartmentNShift("IT Department", "Night Shift");
		e1.addProjectsCompleted(5);
		e1.addProjectsCompleted();
		emp[0] = e1;

		employee e2 = new employee("Mohit", "Indore", "12345689", "mohittest@gmail.com");
		e2.assginDepartmentNShift("Technical Department", "Night Shift");
		e2.addProjectsCompleted(4);
		e2.addProjectsCompleted();
		emp[1] = e2;

		employee e3 = new employee("Rajeev", "Indore", "1212121212", "rajeevtest@gmail.com");
		e3.assginDepartmentNShift("Testing Department", "Day Shift");
		e3.addProjectsCompleted(1);
		e3.addProjectsCompleted();
		emp[2] = e3;

		employee e4 = new employee("Ratan", "Mumbai", "121167890", "ratantest@gmail.com");
		e4.assginDepartmentNShift("IT Department", "Night Shift");
		e4.addProjectsCompleted(9);
		e4.addProjectsCompleted();
		emp[3] = e4;

		for(int i = 0; i< emp.length; i++){
			emp[i].displayPersonal();
			emp[i].displayEmployee();
			System.out.println();
		}
	
	}
}



class personal{
	String name; String address; String mobile; String email;
	personal(String name, String address, String mobile, String email){
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	void displayPersonal(){
		System.out.println("Personal information: ");
		System.out.println("	Name: "+ name);
		System.out.println("	Address: "+ address);
		System.out.println("	Mobile: "+ mobile);
		System.out.println("	Email: "+ email);
	}
}

class employee extends personal{
	static int eid = 1;
	int id; String department; String shift; int projects_completed;
	employee(String name, String address, String mobile, String email){
		super(name,address,mobile,email);
		this.id = eid;
		incEid();
	}
	void assginDepartmentNShift(String department, String shift){
		this.department = department;
		this.shift = shift;
	}	
	void addProjectsCompleted(int i){
		projects_completed += i;
	}
	void addProjectsCompleted(){
		projects_completed++;
	}
	static void incEid(){
		eid++;
	}
	void displayEmployee(){
		System.out.println("Employee information: ");
		System.out.println("	Employee Id: "+ id);
		System.out.println("	Department: "+ department);
		System.out.println("	Shift: "+ shift);
		System.out.println("	Projects Completed: "+ projects_completed);
	}
}