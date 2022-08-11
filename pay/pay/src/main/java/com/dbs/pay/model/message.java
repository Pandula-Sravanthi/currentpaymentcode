package com.dbs.pay.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message_code")
public class message {
	
	@Id
	@GeneratedValue
	@Column(length = 5)
	private String messagecode;
	@Column(length = 200)
	private String instruction;

	public message() {
	}

	public message(String messagecode, String instruction) {
		super();
		this.messagecode = messagecode;
		this.instruction = instruction;
	}

	public String getMessagecode() {
		return messagecode;
	}

	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	@Override
	public int hashCode() {
		return Objects.hash(instruction, messagecode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		message other = (message) obj;
		return Objects.equals(instruction, other.instruction) && Objects.equals(messagecode, other.messagecode);
	}

	@Override
	public String toString() {
		return "message [messagecode=" + messagecode + ", instruction=" + instruction + "]";
	}
	
	

}
