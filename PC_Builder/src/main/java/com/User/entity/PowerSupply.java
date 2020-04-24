package com.User.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="power_supply",schema = "userlogin")
public class PowerSupply {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="psu_id")
	private int psu_id;
	
	@Column(name="psu_name")
	private String psu_name;
	
	@Column(name="psu_type")
	private int psu_type;
	

	@Column(name="price")
	private int price;


	public int getPsu_id() {
		return psu_id;
	}


	public void setPsu_id(int psu_id) {
		this.psu_id = psu_id;
	}


	public String getPsu_name() {
		return psu_name;
	}


	public void setPsu_name(String psu_name) {
		this.psu_name = psu_name;
	}


	public int getPsu_type() {
		return psu_type;
	}


	public void setPsu_type(int psu_type) {
		this.psu_type = psu_type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "PowerSupply [psu_id=" + psu_id + ", psu_name=" + psu_name + ", psu_type=" + psu_type + ", price="
				+ price + "]";
	}

	
	

}
