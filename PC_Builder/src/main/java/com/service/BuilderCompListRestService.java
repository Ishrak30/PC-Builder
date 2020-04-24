package com.service;

import java.util.List;


import com.User.entity.GraphicsCard;
import com.User.entity.Motherboard;
import com.User.entity.PowerSupply;
import com.User.entity.Processor;
import com.User.entity.Ram;
import com.User.entity.StorageDisk;


public interface BuilderCompListRestService {

	public List<GraphicsCard> getgpulist();
	public List<Motherboard> getmobolist();
	public List<PowerSupply> getpsulist();
	public List<Processor> getcpulist();
	public List<Ram> getramlist();
	public List<StorageDisk> gethddlist();
	
}
