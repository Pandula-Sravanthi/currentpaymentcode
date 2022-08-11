package com.dbs.pay.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transfertype")
public class transfertypes {
	
	@Id
	@GeneratedValue
	@Column(length = 30)
	private String transfercode;
	
	@Column(length = 100)
	private String transferdescription;
    
	public String gettransfercode() {
		return transfercode;
	}
	

	public transfertypes() {
	}


	public transfertypes(String transferdescription) {
		super();
		this.transferdescription = transferdescription;
	}

	public void settransfercode(String transfercode) {
		this.transfercode = transfercode;
	}

	public String gettransferdescription() {
		return transferdescription;
	}

	public void settransferdescription(String transferdescription) {
		this.transferdescription = transferdescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(transfercode, transferdescription);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		transfertypes other = (transfertypes) obj;
		return Objects.equals(transfercode, other.transfercode)
				&& Objects.equals(transferdescription, other.transferdescription);
	}

	@Override
	public String toString() {
		return "transfertypes [transfercode=" + transfercode + ", transferdescription="
				+ transferdescription + "]";
	}
	
	

}
