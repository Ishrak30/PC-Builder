package com.dao;

import com.User.entity.GraphicsCard;
import com.User.entity.Motherboard;
import com.User.entity.PowerSupply;
import com.User.entity.Processor;
import com.User.entity.Ram;
import com.User.entity.SaveBuild;
import com.User.entity.StorageDisk;
import com.extraclass.buildresult;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BuilderDaoimpl implements BuilderDao {

	@Autowired
	private SessionFactory sessionFactory;

	// build gaming PC

	@Override
	public buildresult BuildGamingPC(double budget) {
		buildresult br = new buildresult();

		double Procbudget = 0.3 * budget;
		double Gpubudget = 0.3 * budget;
		double Rambudget = 0.1 * budget;
		double Mobobudget = 0.2 * budget;
		double PSUbudget = 0.05 * budget;
		double HDDbudget = 0.05 * budget;

		Session currentSession = sessionFactory.getCurrentSession();

		// setquery for ram
		Query<Ram> Ramquery = currentSession.createQuery("from Ram", Ram.class);

		List<Ram> rams = Ramquery.getResultList();

		rams.sort(Comparator.comparing(Ram::getPrice));

		for (Ram RAM : rams) {
			if (RAM.getPrice() <= Rambudget)
				br.setRammodel(RAM.getR_name());

		}
		// setquery for processor
		Query<Processor> processorquery = currentSession.createQuery("from Processor", Processor.class);

		List<Processor> processors = processorquery.getResultList();

		processors.sort(Comparator.comparing(Processor::getPrice));

		for (Processor PROC : processors) {
			if (PROC.getPrice() <= Procbudget)
				br.setPocessormodel(PROC.getP_name());

		}
		// setquery for mobo
		Query<Motherboard> motherboardquery = currentSession.createQuery("from Motherboard", Motherboard.class);

		List<Motherboard> motherboards = motherboardquery.getResultList();

		motherboards.sort(Comparator.comparing(Motherboard::getPrice));

		for (Motherboard MOBO : motherboards) {
			if (MOBO.getPrice() <= Mobobudget)
				br.setMobomodel(MOBO.getMb_name());

		}
//setquery for gpu
		Query<GraphicsCard> gpuquery = currentSession.createQuery("from GraphicsCard", GraphicsCard.class);

		List<GraphicsCard> gpus = gpuquery.getResultList();

		gpus.sort(Comparator.comparing(GraphicsCard::getPrice));

		for (GraphicsCard GPU : gpus) {
			if (GPU.getPrice() <= Gpubudget)
				br.setGPUmodel(GPU.getGpu_name());

		}
//setquery for hdd
		Query<StorageDisk> storagequery = currentSession.createQuery("from StorageDisk", StorageDisk.class);

		List<StorageDisk> HDDs = storagequery.getResultList();

		HDDs.sort(Comparator.comparing(StorageDisk::getPrice));

		for (StorageDisk HDD : HDDs) {
			if (HDD.getPrice() <= HDDbudget)
				br.setStoragemodel(HDD.getStorage_name());

		}
//set query  for psu
		Query<PowerSupply> psuquery = currentSession.createQuery("from PowerSupply", PowerSupply.class);

		List<PowerSupply> psus = psuquery.getResultList();

		psus.sort(Comparator.comparing(PowerSupply::getPrice));

		for (PowerSupply PSU : psus) {
			if (PSU.getPrice() <= PSUbudget)
				br.setPSUmodel(PSU.getPsu_name());

		}

		return br;
	}

	// build work PC

	@Override
	public buildresult BuildWorkPC(double budget) {
		buildresult br = new buildresult();

		double Procbudget = 0.3 * budget;
		double Gpubudget = 0.3 * budget;
		double Rambudget = 0.1 * budget;
		double Mobobudget = 0.2 * budget;
		double PSUbudget = 0.05 * budget;
		double HDDbudget = 0.05 * budget;

		Session currentSession = sessionFactory.getCurrentSession();

		// setquery for ram
		Query<Ram> Ramquery = currentSession.createQuery("from Ram", Ram.class);

		List<Ram> rams = Ramquery.getResultList();

		rams.sort(Comparator.comparing(Ram::getPrice));

		for (Ram RAM : rams) {
			if (RAM.getPrice() <= Rambudget && RAM.getType() == 12000101)
				br.setRammodel(RAM.getR_name());

		}
		// setquery for processor
		Query<Processor> processorquery = currentSession.createQuery("from Processor", Processor.class);

		List<Processor> processors = processorquery.getResultList();

		processors.sort(Comparator.comparing(Processor::getPrice));

		for (Processor PROC : processors) {
			if (PROC.getPrice() <= Procbudget && PROC.getType() == 12000101)
				br.setPocessormodel(PROC.getP_name());

		}
		// setquery for mobo
		Query<Motherboard> motherboardquery = currentSession.createQuery("from Motherboard", Motherboard.class);

		List<Motherboard> motherboards = motherboardquery.getResultList();

		motherboards.sort(Comparator.comparing(Motherboard::getPrice));

		for (Motherboard MOBO : motherboards) {
			if (MOBO.getPrice() <= Mobobudget && MOBO.getMb_type() == 12000101)
				br.setMobomodel(MOBO.getMb_name());

		}
//setquery for gpu
		Query<GraphicsCard> gpuquery = currentSession.createQuery("from GraphicsCard", GraphicsCard.class);

		List<GraphicsCard> gpus = gpuquery.getResultList();

		gpus.sort(Comparator.comparing(GraphicsCard::getPrice));

		for (GraphicsCard GPU : gpus) {
			if (GPU.getPrice() <= Gpubudget && GPU.getGpu_type() == 12000101)
				br.setGPUmodel(GPU.getGpu_name());

		}
//setquery for hdd
		Query<StorageDisk> storagequery = currentSession.createQuery("from StorageDisk", StorageDisk.class);

		List<StorageDisk> HDDs = storagequery.getResultList();

		HDDs.sort(Comparator.comparing(StorageDisk::getPrice));

		for (StorageDisk HDD : HDDs) {
			if (HDD.getPrice() <= HDDbudget && HDD.getStorage_type() == 12000101)
				br.setStoragemodel(HDD.getStorage_name());

		}
//set query  for psu
		Query<PowerSupply> psuquery = currentSession.createQuery("from PowerSupply", PowerSupply.class);

		List<PowerSupply> psus = psuquery.getResultList();

		psus.sort(Comparator.comparing(PowerSupply::getPrice));

		for (PowerSupply PSU : psus) {
			if (PSU.getPrice() <= PSUbudget && PSU.getPsu_type() == 12000101)
				br.setPSUmodel(PSU.getPsu_name());

		}

		return br;
	}

	@Override
	public buildresult BuildGeneralPC(double budget) {
		buildresult br = new buildresult();

		double Procbudget = 0.3 * budget;
		double Gpubudget = 0.3 * budget;
		double Rambudget = 0.1 * budget;
		double Mobobudget = 0.2 * budget;
		double PSUbudget = 0.05 * budget;
		double HDDbudget = 0.05 * budget;

		Session currentSession = sessionFactory.getCurrentSession();

		// setquery for ram
		Query<Ram> Ramquery = currentSession.createQuery("from Ram", Ram.class);

		List<Ram> rams = Ramquery.getResultList();

		rams.sort(Comparator.comparing(Ram::getPrice));

		for (Ram RAM : rams) {
			if (RAM.getPrice() <= Rambudget)
				br.setRammodel(RAM.getR_name());

		}
		// setquery for processor
		Query<Processor> processorquery = currentSession.createQuery("from Processor", Processor.class);

		List<Processor> processors = processorquery.getResultList();

		processors.sort(Comparator.comparing(Processor::getPrice));

		for (Processor PROC : processors) {
			if (PROC.getPrice() <= Procbudget)
				br.setPocessormodel(PROC.getP_name());

		}
		// setquery for mobo
		Query<Motherboard> motherboardquery = currentSession.createQuery("from Motherboard", Motherboard.class);

		List<Motherboard> motherboards = motherboardquery.getResultList();

		motherboards.sort(Comparator.comparing(Motherboard::getPrice));

		for (Motherboard MOBO : motherboards) {
			if (MOBO.getPrice() <= Mobobudget)
				br.setMobomodel(MOBO.getMb_name());

		}
//setquery for gpu
		Query<GraphicsCard> gpuquery = currentSession.createQuery("from GraphicsCard", GraphicsCard.class);

		List<GraphicsCard> gpus = gpuquery.getResultList();

		gpus.sort(Comparator.comparing(GraphicsCard::getPrice));

		for (GraphicsCard GPU : gpus) {
			if (GPU.getPrice() <= Gpubudget)
				br.setGPUmodel(GPU.getGpu_name());

		}
//setquery for hdd
		Query<StorageDisk> storagequery = currentSession.createQuery("from StorageDisk", StorageDisk.class);

		List<StorageDisk> HDDs = storagequery.getResultList();

		HDDs.sort(Comparator.comparing(StorageDisk::getPrice));

		for (StorageDisk HDD : HDDs) {
			if (HDD.getPrice() <= HDDbudget)
				br.setStoragemodel(HDD.getStorage_name());

		}
//set query  for psu
		Query<PowerSupply> psuquery = currentSession.createQuery("from PowerSupply", PowerSupply.class);

		List<PowerSupply> psus = psuquery.getResultList();

		psus.sort(Comparator.comparing(PowerSupply::getPrice));

		for (PowerSupply PSU : psus) {
			if (PSU.getPrice() <= PSUbudget)
				br.setPSUmodel(PSU.getPsu_name());

		}

		return br;
	}

	@Override
	public void savebuild(String useremail, buildresult build) {
		SaveBuild thebuild = new SaveBuild();
		Session currentSession = sessionFactory.getCurrentSession();

		thebuild.setEmail(useremail);
		thebuild.setGPU(build.getGPUmodel());
		thebuild.setMOBO(build.getMOBO_model());
		thebuild.setCPU(build.getCPU_model());
		thebuild.setPSU(build.getPSUmodel());
		thebuild.setRAM(build.getRAM_model());
		thebuild.setHDD(build.getHDD_model());

		currentSession.save(thebuild);
	}

	@Override
	public List<SaveBuild> savedbuilds(String email) {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<SaveBuild> savedbuildsquery = currentSession.createQuery("from SaveBuild", SaveBuild.class);
		List<SaveBuild> savedbuilds = savedbuildsquery.getResultList();
		List<SaveBuild> userssavedbuilds = new ArrayList<SaveBuild>();
		for (SaveBuild sb : savedbuilds) {
			if (sb.getEmail().equals(email)) {
				userssavedbuilds.add(sb);
			}
		}

		return userssavedbuilds;
	}
}
