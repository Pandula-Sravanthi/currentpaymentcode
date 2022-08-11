package com.dbs.pay.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class customer {
	
	@Id
	@GeneratedValue
	@Column(length=14)
    private String customerid;
	@Column(length=50)
    private String accountholdername;
	@Column(length=100)
    private String customeraddress;
	@Column(length=100)
    private String customercity;
	@Column(length=20)
    private String customertype;
    private boolean overdraftflag;
    private String clearbalance;
    
    
public customer() {
	}
public customer(String accountholdername, String customeraddress, String customercity, String customertype,
			boolean overdraftflag, String clearbalance) {
		super();
		this.accountholdername = accountholdername;
		this.customeraddress = customeraddress;
		this.customercity = customercity;
		this.customertype = customertype;
		this.overdraftflag = overdraftflag;
		this.clearbalance = clearbalance;
	}
public String getCustomerid() {
	return customerid;
}
public void setCustomerid(String customerid) {
	this.customerid = customerid;
}
public String getAccountholdername() {
	return accountholdername;
}
public void setAccountholdername(String accountholdername) {
	this.accountholdername = accountholdername;
}
public String getCustomeraddress() {
	return customeraddress;
}
public void setCustomeraddress(String customeraddress) {
	this.customeraddress = customeraddress;
}
public String getCustomercity() {
	return customercity;
}
public void setCustomercity(String customercity) {
	this.customercity = customercity;
}
public String getCustomertype() {
	return customertype;
}
public void setCustomertype(String customertype) {
	this.customertype = customertype;
}
public boolean getoverdraftflag() {
	return overdraftflag;
}
public void setoverdraftflag(boolean overdraftflag) {
	this.overdraftflag = overdraftflag;
}
public String getClearbalance() {
	return clearbalance;
}
public void setClearbalance(String clearbalance) {
	this.clearbalance = clearbalance;
}
@Override
public int hashCode() {
	return Objects.hash(accountholdername, clearbalance, customeraddress, customercity, customerid, customertype,
			overdraftflag);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	customer other = (customer) obj;
	return Objects.equals(accountholdername, other.accountholdername)
			&& Objects.equals(clearbalance, other.clearbalance)
			&& Objects.equals(customeraddress, other.customeraddress)
			&& Objects.equals(customercity, other.customercity) && Objects.equals(customerid, other.customerid)
			&& Objects.equals(customertype, other.customertype) && Objects.equals(overdraftflag, other.overdraftflag);
}
@Override
public String toString() {
	return "customer [customerid=" + customerid + ", accountholdername=" + accountholdername + ", customeraddress="
			+ customeraddress + ", customercity=" + customercity + ", customertype=" + customertype + ", overdraftflag="
			+ overdraftflag + ", clearbalance=" + clearbalance + "]";
}
 
}
