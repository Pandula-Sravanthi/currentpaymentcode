package com.dbs.pay.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currency")
public class currency {
	
	
	private Double conversionrate;
	@Column(length=3)
	@Id
	@GeneratedValue
	private String currencycode;
	@Column(length=100)
	private String currencyname;
	
	public currency() {
	}
	public currency(Double conversionrate, String currencycode, String currencyname) {
		super();
		this.conversionrate = conversionrate;
		this.currencycode = currencycode;
		this.currencyname = currencyname;
	}
	public Double getConversionrate() {
		return conversionrate;
	}
	public void setConversionrate(Double conversionrate) {
		this.conversionrate = conversionrate;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getCurrencyname() {
		return currencyname;
	}
	public void setCurrencyname(String currencyname) {
		this.currencyname = currencyname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conversionrate, currencycode, currencyname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		currency other = (currency) obj;
		return Objects.equals(conversionrate, other.conversionrate) && Objects.equals(currencycode, other.currencycode)
				&& Objects.equals(currencyname, other.currencyname);
	}
	@Override
	public String toString() {
		return "currency [conversionrate=" + conversionrate + ", currencycode=" + currencycode + ", currencyname="
				+ currencyname + "]";
	}
	
	

}
