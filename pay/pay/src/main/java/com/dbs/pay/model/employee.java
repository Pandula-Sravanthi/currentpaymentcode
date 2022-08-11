package com.dbs.pay.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class employee {
	
	@Id
	@GeneratedValue
	private Long employeeid;
	@Column(length=100)
	private String employeename;
	@Column(length=100)
	private String employeepassword;
	
	
	public employee() {
	}
	public employee(Long employeeid, String employeename, String employeepassword) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeepassword = employeepassword;
	}
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeepassword() {
		return employeepassword;
	}
	public void setEmployeepassword(String employeepassword) {
		this.employeepassword = employeepassword;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeid, employeename, employeepassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return Objects.equals(employeeid, other.employeeid) && Objects.equals(employeename, other.employeename)
				&& Objects.equals(employeepassword, other.employeepassword);
	}
	@Override
	public String toString() {
		return "employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeepassword="
				+ employeepassword + "]";
	}
	
	

}
