package com.User.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="storage",schema = "userlogin")
public class StorageDisk {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="storage_Id")
	private int storage_id;
	
	@Column(name="storage_name")
	private String storage_name;
	
	@Column(name="storage_type")
	private int storage_type;
	

	@Column(name="price")
	private int price;


	public int getStorage_id() {
		return storage_id;
	}


	public void setStorage_id(int storage_id) {
		this.storage_id = storage_id;
	}


	public String getStorage_name() {
		return storage_name;
	}


	public void setStorage_name(String storage_name) {
		this.storage_name = storage_name;
	}


	public int getStorage_type() {
		return storage_type;
	}


	public void setStorage_type(int storage_type) {
		this.storage_type = storage_type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "StorageDisk [storage_id=" + storage_id + ", storage_name=" + storage_name + ", storage_type="
				+ storage_type + ", price=" + price + "]";
	}
	
	
}
