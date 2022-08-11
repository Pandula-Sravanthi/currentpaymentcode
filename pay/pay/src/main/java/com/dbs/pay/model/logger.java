package com.dbs.pay.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="logger")
public class logger {
	
	@Id
	@GeneratedValue
	@Column(length = 11)
	private Long loggerid;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "custmeruser_id", referencedColumnName = "userid")
	private customeruser CUser;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee")
	private employee Emp;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "custmer_id", referencedColumnName = "customerid")
	private customer Customer;
	
	@Column(length = 100)
	private String screenname;
	@Column(length = 100)
	private String action;
	@Column(length = 30)
	private String ipaddress;
	
	public logger() {
	}
	
	public logger(customeruser cUser, employee emp, customer customer, String screenname, String action,
			String ipaddress) {
		super();
		CUser = cUser;
		Emp = emp;
		Customer = customer;
		this.screenname = screenname;
		this.action = action;
		this.ipaddress = ipaddress;
	}
	
	public Long getLoggerid() {
		return loggerid;
	}
	public void setLoggerid(Long loggerid) {
		this.loggerid = loggerid;
	}
	public customeruser getCUser() {
		return CUser;
	}
	public void setCUser(customeruser cUser) {
		CUser = cUser;
	}
	public employee getEmp() {
		return Emp;
	}
	public void setEmp(employee emp) {
		Emp = emp;
	}
	public customer getCustomer() {
		return Customer;
	}
	public void setCustomer(customer customer) {
		Customer = customer;
	}
	public String getScreenname() {
		return screenname;
	}
	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CUser, Customer, Emp, action, ipaddress, loggerid, screenname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		logger other = (logger) obj;
		return Objects.equals(CUser, other.CUser) && Objects.equals(Customer, other.Customer)
				&& Objects.equals(Emp, other.Emp) && Objects.equals(action, other.action)
				&& Objects.equals(ipaddress, other.ipaddress) && Objects.equals(loggerid, other.loggerid)
				&& Objects.equals(screenname, other.screenname);
	}
	@Override
	public String toString() {
		return "logger [loggerid=" + loggerid + ", CUser=" + CUser + ", Emp=" + Emp + ", Customer=" + Customer
				+ ", screenname=" + screenname + ", action=" + action + ", ipaddress=" + ipaddress + "]";
	}
	
}