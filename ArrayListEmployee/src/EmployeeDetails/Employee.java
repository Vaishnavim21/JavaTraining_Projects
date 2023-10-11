package EmployeeDetails;

public class Employee {
	private int empid;
	private String name;
	private EmployeeAddress address;
	
	public Employee(int empid,String name, EmployeeAddress address) {
		this.empid=empid;
		this.name=name;
		this.address=address;}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EmployeeAddress getAddress() {
		return address;
	}
	
	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}
	
}
