package com.dbs.pay.model;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banks")
public class bank {
	
	@Id
	@GeneratedValue
	@Column(length=11)
	private String bic;
	@Column(length=100)
	private String bankname;
	
	public bank() {
	}

	public bank(String bic, String bankname) {
		super();
		this.bic = bic;
		this.bankname = bankname;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankname, bic);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bank other = (bank) obj;
		return Objects.equals(bankname, other.bankname) && Objects.equals(bic, other.bic);
	}

	@Override
	public String toString() {
		return "bank [bic=" + bic + ", bankname=" + bankname + "]";
	}
	
	

}

