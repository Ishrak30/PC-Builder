package com.User.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="save_build",schema = "userlogin")
public class SaveBuild {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="serial_no")
	private int serial_no;
	
	
	@Column(name="email")
	private String Email;
	
	@Column(name="processor")
	private String CPU;
	
	@Column(name="motherboard")
	private String MOBO;
	
	@Column(name="graphics_card")
	private String GPU;
	
	@Column(name="ram")
	private String RAM;
	
	@Column(name="storage")
	private String HDD;
	
	@Column(name="psu")
	private String PSU;

	public int getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String processor) {
		this.CPU = processor;
	}

	public String getMOBO() {
		return MOBO;
	}

	public void setMOBO(String motherboard) {
		this.MOBO = motherboard;
	}

	public String getGPU() {
		return GPU;
	}

	public void setGPU(String graphics_card) {
		this.GPU = graphics_card;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String ram) {
		this.RAM = ram;
	}

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String storage) {
		this.HDD = storage;
	}

	public String getPSU() {
		return PSU;
	}

	public void setPSU(String psu) {
		this.PSU = psu;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	@Override
	public String toString() {
		return "SaveBuild [serial_no=" + serial_no + ", email=" + Email + ", processor=" + CPU + ", motherboard="
				+ MOBO + ", graphics_card=" + GPU + ", ram=" + RAM + ", storage=" + HDD + ", psu="
				+ PSU + "]";
	}

	
	
	
	
	
	
	
	
	

}
