package com.User.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="graphics_card",schema = "userlogin")
public class GraphicsCard {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gpu_id")
	private int gpu_id;
	
	@Column(name="gpu_name")
	private String gpu_name;
	
	@Column(name="gpu_type")
	private int gpu_type;
	

	@Column(name="price")
	private int price;


	public int getGpu_id() {
		return gpu_id;
	}


	public void setGpu_id(int gpu_id) {
		this.gpu_id = gpu_id;
	}


	public String getGpu_name() {
		return gpu_name;
	}


	public void setGpu_name(String gpu_name) {
		this.gpu_name = gpu_name;
	}


	public int getGpu_type() {
		return gpu_type;
	}


	public void setGpu_type(int gpu_type) {
		this.gpu_type = gpu_type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "GraphicsCard [gpu_id=" + gpu_id + ", gpu_name=" + gpu_name + ", gpu_type=" + gpu_type + ", price="
				+ price + "]";
	}
	
	

}
