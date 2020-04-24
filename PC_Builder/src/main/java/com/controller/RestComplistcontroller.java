package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.entity.GraphicsCard;
import com.User.entity.Motherboard;
import com.User.entity.PowerSupply;
import com.User.entity.Processor;
import com.User.entity.Ram;
import com.User.entity.StorageDisk;
import com.service.BuilderCompListRestService;

@RestController
@RequestMapping("/complist")
public class RestComplistcontroller {

	@Autowired
	private BuilderCompListRestService buildercomplist;
	
	@GetMapping("/getcpu")
	public List<Processor> getcpu(){
		
		return buildercomplist.getcpulist(); 
	}
	
	@GetMapping("/getgpu")
	public List<GraphicsCard> getgpu(){
		
		return buildercomplist.getgpulist();
	}
	
	
	@GetMapping("/getmobo")
	public List<Motherboard> getmobo(){
		
		return buildercomplist.getmobolist();
	}
	
	@GetMapping("/getram")
	public List<Ram> getram(){
		
		return buildercomplist.getramlist();
	}
	
	@GetMapping("/getpsu")
	public List<PowerSupply> getpsu(){
		
		return buildercomplist.getpsulist();
	}
	
	@GetMapping("/gethdd")
	public List<StorageDisk> gethdd(){
		
		return buildercomplist.gethddlist();
	}
	
	
}
