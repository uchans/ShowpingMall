package com.company.domain;

import java.util.Date;

public class OrderInfoVO {
	
	/*
	 * create table tbl_order (     orderId     varchar2(50) not null,     userId   
	 *   varchar2(50) not null,     orderRec    varchar2(50) not null,    
	 * userAddr1   varchar2(20) not null,     
	 * userAddr2   varchar2(50) not null,    
	 * userAddr3   varchar2(50) not null,     
	 * orderPhon   varchar2(30) not null,    
	 * amount      number       not null,     
	 * orderDate   Date         default
	 * sysdate,        primary key(orderId) );
	 */
	

	private String orderId;
	private String orderRec;
	private String userId;
	private String userAddr1;
	private String userAddr2;
	private String userAddr3;
	private String orderPhon;
	private int amount;
	private Date orderDate;
	private String delivery;
	
	
	
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderRec() {
		return orderRec;
	}
	public void setOrderRec(String orderRec) {
		this.orderRec = orderRec;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserAddr1() {
		return userAddr1;
	}
	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public String getUserAddr3() {
		return userAddr3;
	}
	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}
	public String getOrderPhon() {
		return orderPhon;
	}
	public void setOrderPhon(String orderPhon) {
		this.orderPhon = orderPhon;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
	
}
