package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.entity.GraphicsCard;
import com.User.entity.Motherboard;
import com.User.entity.PowerSupply;
import com.User.entity.Processor;
import com.User.entity.Ram;
import com.User.entity.StorageDisk;
import com.dao.BuilderCompoenentsRestDao;

@Service
public class BiolderCompListRestServiceimpl implements BuilderCompListRestService {

	@Autowired
	private BuilderCompoenentsRestDao buildercomprest;
	
	@Override
	@Transactional
	public List<GraphicsCard> getgpulist() {
		
		return buildercomprest.getgpu();
	}

	@Override
	@Transactional
	public List<Motherboard> getmobolist() {
		
		return buildercomprest.getmobo();
	}

	@Override
	@Transactional
	public List<PowerSupply> getpsulist() {
		
		return buildercomprest.getpsu();
	}

	@Override
	@Transactional
	public List<Processor> getcpulist() {
		
		return buildercomprest.getcpu();
	}

	@Override
	@Transactional
	public List<Ram> getramlist() {
		
		return buildercomprest.getram();
	}

	@Override
	@Transactional
	public List<StorageDisk> gethddlist() {
	
		return buildercomprest.gethdd();
	}

}
