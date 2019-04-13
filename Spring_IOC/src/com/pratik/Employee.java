package com.pratik;

public class Employee {
	private int eId;
	private String eName;
	private int eSalary;
	private String eDept;
	
	public Employee() {};
	
	public Employee(int eId, String eName, int eSalary, String eDept) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDept = eDept;
	}


	public int geteId() {
		return eId;
	}
	
	
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eDept=" + eDept + "]";
	}
	
	
}
