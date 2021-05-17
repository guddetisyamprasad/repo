package net.javaguides.springboot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="emp_trnx")
public class Employee {
	
	 @Id
	 @Column(name="number")
	 private int number;
	 @Column(name="name")
	 private String name;
	 @Column(name="dept")
	 private String dept;
	 @Column(name="desg")
	 private String desg;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	 
	 
	 
	 

}
