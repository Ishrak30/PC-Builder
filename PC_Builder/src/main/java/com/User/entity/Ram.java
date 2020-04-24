package com.User.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ram",schema = "userlogin")
public class Ram {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ram_Id")
	private int ram_id;
	
	@Column(name="ram_name")
	private String r_name;
	
	@Column(name="type")
	private int type;
	

	@Column(name="price")
	private int price;


	public int getRam_id() {
		return ram_id;
	}


	public void setRam_id(int ram_id) {
		this.ram_id = ram_id;
	}


	public String getR_name() {
		return r_name;
	}


	public void setR_name(String r_name) {
		this.r_name = r_name;
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
		return "Ram [ram_id=" + ram_id + ", r_name=" + r_name + ", type=" + type + ", price=" + price + "]";
	}
	
	
	
}
