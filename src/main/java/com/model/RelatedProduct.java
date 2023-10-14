package com.model;

public class RelatedProduct {
	private int psno;
	private int rpsno;
	
	public RelatedProduct(int psno, int rpsno) {
		super();
		this.psno = psno;
		this.rpsno = rpsno;
	}

	public int getPsno() {
		return psno;
	}

	public void setPsno(int psno) {
		this.psno = psno;
	}

	public int getRpsno() {
		return rpsno;
	}

	public void setRpsno(int rpsno) {
		this.rpsno = rpsno;
	}
	

}
