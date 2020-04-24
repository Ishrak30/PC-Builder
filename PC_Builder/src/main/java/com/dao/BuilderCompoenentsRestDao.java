package com.dao;

import java.util.List;

import com.User.entity.GraphicsCard;
import com.User.entity.Motherboard;
import com.User.entity.PowerSupply;
import com.User.entity.Processor;
import com.User.entity.Ram;
import com.User.entity.StorageDisk;

public interface BuilderCompoenentsRestDao {

	public List<GraphicsCard> getgpu();
	public List<Motherboard> getmobo();
	public List<PowerSupply> getpsu();
	public List<Processor> getcpu();
	public List<Ram> getram();
	public List<StorageDisk> gethdd();
}
