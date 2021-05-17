package net.javaguides.springboot.model;

public class Employee {

	private String firtname;
	private String lastname;
	private String emali;
	private String address;
	private long moblienumber;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firtname, String lastname, String emali, String address, long moblienumber) {
		super();
		this.firtname = firtname;
		this.lastname = lastname;
		this.emali = emali;
		this.address = address;
		this.moblienumber = moblienumber;
	}
	public String getFirtname() {
		return firtname;
	}
	public void setFirtname(String firtname) {
		this.firtname = firtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmali() {
		return emali;
	}
	public void setEmali(String emali) {
		this.emali = emali;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMoblienumber() {
		return moblienumber;
	}
	public void setMoblienumber(long moblienumber) {
		this.moblienumber = moblienumber;
	}
	
	
	
}
