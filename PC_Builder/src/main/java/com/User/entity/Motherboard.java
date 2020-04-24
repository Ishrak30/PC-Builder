package com.User.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="motherboard",schema = "userlogin")
public class Motherboard {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mb_id")
	private int mb_id;
	
	@Column(name="mb_name")
	private String mb_name;
	
	@Column(name="type")
	private int mb_type;
	

	@Column(name="price")
	private int price;


	public int getMb_id() {
		return mb_id;
	}


	public void setMb_id(int mb_id) {
		this.mb_id = mb_id;
	}


	public String getMb_name() {
		return mb_name;
	}


	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}


	public int getMb_type() {
		return mb_type;
	}


	public void setMb_type(int mb_type) {
		this.mb_type = mb_type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Motherboard [mb_id=" + mb_id + ", mb_name=" + mb_name + ", mb_type=" + mb_type + ", price=" + price
				+ "]";
	}

	
	
	
}
