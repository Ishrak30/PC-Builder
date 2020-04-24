package com.extraclass;

public class buildresult {

	String CPU_model;
	String GPUmodel;
	String MOBO_model;
	String RAM_model;
	String PSUmodel;
	String HDD_model;
	
	
	public buildresult() {
		super();
	}
	public String getCPU_model() {
		return CPU_model;
	}
	public void setPocessormodel(String pocessormodel) {
		CPU_model = pocessormodel;
	}
	public String getGPUmodel() {
		return GPUmodel;
	}
	public void setGPUmodel(String gPUmodel) {
		GPUmodel = gPUmodel;
	}
	public String getMOBO_model() {
		return MOBO_model;
	}
	public void setMobomodel(String mobomodel) {
		MOBO_model = mobomodel;
	}
	public String getRAM_model() {
		return RAM_model;
	}
	public void setRammodel(String rammodel) {
		RAM_model = rammodel;
	}
	public String getPSUmodel() {
		return PSUmodel;
	}
	public void setPSUmodel(String pSUmodel) {
		PSUmodel = pSUmodel;
	}
	public String getHDD_model() {
		return HDD_model;
	}
	public void setStoragemodel(String storagemodel) {
		HDD_model = storagemodel;
	}
	
}
