package com.jrb.assignment2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblcodes")
public class TransCd {
//	private String transcd, transtype, transdesc;
	@Id
	@Column(name = "TransCd")
	private String transcd;
	
	@Column(name = "TransType")
	private String transtype;
	
	@Column(name = "TransDesc")
	private String transdesc;

	public TransCd() {
		transcd = "";
		transtype = "";
		transdesc = "";
	}

	public String getTranscd() {
		return transcd;
	}

	public void setTranscd(String transcd) {
		this.transcd = transcd;
	}

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	public String getTransdesc() {
		return transdesc;
	}

	public void setTransdesc(String transdesc) {
		this.transdesc = transdesc;
	}


}
