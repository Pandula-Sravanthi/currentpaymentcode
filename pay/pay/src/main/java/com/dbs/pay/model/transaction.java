package com.dbs.pay.model;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transaction")

public class transaction {
	
	@Id
	@GeneratedValue
	@Column(length = 11)
	private Double transactionid;
	private Double currencyamount;
	private Double transferfees;
	private Double inramount;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "custmer_id", referencedColumnName = "customerid")
	private customer cust ;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "currency_code", referencedColumnName = "currencycode")
	private currency curr;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sender_bic", referencedColumnName = "bic")
	private bank senderbank;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receiver_bic", referencedColumnName = "bic")
	private bank receiverbank;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reciever_custmer_id", referencedColumnName = "customerid")
	private customer recievercustomerid;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reciever_ accountholdername", referencedColumnName = "accountholdername")
	private customer receivercustomername;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transfer_code", referencedColumnName = "transfercode")
	private transfertypes transfertype;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "message__code", referencedColumnName = "messagecode")
	private message mes;
	
	private Date transferdate= new Date();
	
	public transaction() {
	}

	public transaction(Double currencyamount, Double transferfees, Double inramount, customer cust, currency curr,
			bank senderbank, bank receiverbank, customer recievercustomerid, customer receivercustomername,
			transfertypes transfertype, message mes, Date transferdate) {
		super();
		this.currencyamount = currencyamount;
		this.transferfees = transferfees;
		this.inramount = inramount;
		this.cust = cust;
		this.curr = curr;
		this.senderbank = senderbank;
		this.receiverbank = receiverbank;
		this.recievercustomerid = recievercustomerid;
		this.receivercustomername = receivercustomername;
		this.transfertype = transfertype;
		this.mes = mes;
		this.transferdate = transferdate;
	}

	public Double getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(Double transactionid) {
		this.transactionid = transactionid;
	}

	public Double getCurrencyamount() {
		return currencyamount;
	}

	public void setCurrencyamount(Double currencyamount) {
		this.currencyamount = currencyamount;
	}

	public Double getTransferfees() {
		return transferfees;
	}

	public void setTransferfees(Double transferfees) {
		this.transferfees = transferfees;
	}

	public Double getInramount() {
		return inramount;
	}

	public void setInramount(Double inramount) {
		this.inramount = inramount;
	}

	public customer getCust() {
		return cust;
	}

	public void setCust(customer cust) {
		this.cust = cust;
	}

	public currency getCurr() {
		return curr;
	}

	public void setCurr(currency curr) {
		this.curr = curr;
	}

	public bank getSenderbank() {
		return senderbank;
	}

	public void setSenderbank(bank senderbank) {
		this.senderbank = senderbank;
	}

	public bank getReceiverbank() {
		return receiverbank;
	}

	public void setReceiverbank(bank receiverbank) {
		this.receiverbank = receiverbank;
	}

	public customer getRecievercustomerid() {
		return recievercustomerid;
	}

	public void setRecievercustomerid(customer recievercustomerid) {
		this.recievercustomerid = recievercustomerid;
	}

	public customer getReceivercustomername() {
		return receivercustomername;
	}

	public void setReceivercustomername(customer receivercustomername) {
		this.receivercustomername = receivercustomername;
	}

	public transfertypes getTransfertype() {
		return transfertype;
	}

	public void setTransfertype(transfertypes transfertype) {
		this.transfertype = transfertype;
	}

	public message getMes() {
		return mes;
	}

	public void setMes(message mes) {
		this.mes = mes;
	}

	public Date getTransferdate() {
		return transferdate;
	}

	public void setTransferdate(Date transferdate) {
		this.transferdate = transferdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curr, currencyamount, cust, inramount, mes, receiverbank, receivercustomername,
				recievercustomerid, senderbank, transactionid, transferdate, transferfees, transfertype);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		transaction other = (transaction) obj;
		return Objects.equals(curr, other.curr) && Objects.equals(currencyamount, other.currencyamount)
				&& Objects.equals(cust, other.cust) && Objects.equals(inramount, other.inramount)
				&& Objects.equals(mes, other.mes) && Objects.equals(receiverbank, other.receiverbank)
				&& Objects.equals(receivercustomername, other.receivercustomername)
				&& Objects.equals(recievercustomerid, other.recievercustomerid)
				&& Objects.equals(senderbank, other.senderbank) && Objects.equals(transactionid, other.transactionid)
				&& Objects.equals(transferdate, other.transferdate) && Objects.equals(transferfees, other.transferfees)
				&& Objects.equals(transfertype, other.transfertype);
	}

	@Override
	public String toString() {
		return "transaction [transactionid=" + transactionid + ", currencyamount=" + currencyamount + ", transferfees="
				+ transferfees + ", inramount=" + inramount + ", cust=" + cust + ", curr=" + curr + ", senderbank="
				+ senderbank + ", receiverbank=" + receiverbank + ", recievercustomerid=" + recievercustomerid
				+ ", receivercustomername=" + receivercustomername + ", transfertype=" + transfertype + ", mes=" + mes
				+ ", transferdate=" + transferdate + "]";
	}
}