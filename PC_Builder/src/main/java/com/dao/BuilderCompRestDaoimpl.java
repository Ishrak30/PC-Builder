package com.dao;

import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.User.entity.GraphicsCard;
import com.User.entity.Motherboard;
import com.User.entity.PowerSupply;
import com.User.entity.Processor;
import com.User.entity.Ram;
import com.User.entity.StorageDisk;

@Repository
public class BuilderCompRestDaoimpl implements BuilderCompoenentsRestDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<GraphicsCard> getgpu() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<GraphicsCard> gpuquery = currentSession.createQuery("from GraphicsCard", GraphicsCard.class);

		List<GraphicsCard> gpus = gpuquery.getResultList();

		gpus.sort(Comparator.comparing(GraphicsCard::getPrice));

		return gpus;
	}

	@Override
	public List<Motherboard> getmobo() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Motherboard> motherboardquery = currentSession.createQuery("from Motherboard", Motherboard.class);

		List<Motherboard> motherboards = motherboardquery.getResultList();

		motherboards.sort(Comparator.comparing(Motherboard::getPrice));

		return motherboards;
	}

	@Override
	public List<PowerSupply> getpsu() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<PowerSupply> psuquery = currentSession.createQuery("from PowerSupply", PowerSupply.class);

		List<PowerSupply> psus = psuquery.getResultList();

		psus.sort(Comparator.comparing(PowerSupply::getPrice));

		return psus;
	}

	@Override
	public List<Processor> getcpu() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Processor> processorquery = currentSession.createQuery("from Processor", Processor.class);

		List<Processor> processors = processorquery.getResultList();

		processors.sort(Comparator.comparing(Processor::getPrice));

		return processors;
	}

	@Override
	public List<Ram> getram() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Ram> Ramquery = currentSession.createQuery("from Ram", Ram.class);

		List<Ram> rams = Ramquery.getResultList();

		rams.sort(Comparator.comparing(Ram::getPrice));

		return rams;
	}

	@Override
	public List<StorageDisk> gethdd() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<StorageDisk> storagequery = currentSession.createQuery("from StorageDisk", StorageDisk.class);

		List<StorageDisk> HDDs = storagequery.getResultList();

		HDDs.sort(Comparator.comparing(StorageDisk::getPrice));

		return HDDs;
	}

}
