package com.User.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="processor",schema = "userlogin")
public class Processor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="processor_Id")
	private int processor_id;
	
	@Column(name="processor_name")
	private String p_name;
	
	@Column(name="type_id")
	private int type;
	
	@Column(name="price")
	private int price;

	public int getProcessor_id() {
		return processor_id;
	}

	public void setProcessor_id(int processor_id) {
		this.processor_id = processor_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Processor [processor_id=" + processor_id + ", p_name=" + p_name + ", type=" + type + ", price=" + price
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
