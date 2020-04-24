package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.User.entity.SaveBuild;
import com.extraclass.buildresult;
import com.service.BuilderService;

@Controller
@SessionAttributes({"Emailid","pcpart","PC-type"})

public class Buildercontroller {

	@Autowired(required = false)
	private BuilderService builderservice;

	

	
	@RequestMapping("/PC-type")
	String homebutton(Model model,HttpServletRequest request){
		
		return "pc-type";
	}
	
	//save build
	
	@PostMapping("/savebuild")
	String savebuild(HttpServletRequest request,Model model){
		buildresult build = (buildresult) model.getAttribute("pcpart");	
		String email = (String) model.getAttribute("Emailid");
		
		builderservice.savebuild(email, build);
		
		return "redirect:/PC-type";
	}
	
	
	
	@RequestMapping("/gamingbuildamountinput")
	public String GamingBuildBudget(Model model,HttpServletRequest request) {
		String type = "Gamingpc";
		model.addAttribute("PC-type",type);
		return "amountinput";
		
	}
	
	//vioce input
	
	@RequestMapping("/Voiceinput")
	public String VoiceBuild(HttpServletRequest request,Model model){
		String voiceinput = request.getParameter("voiceinput");
		String PCtype = null;
		
		if(voiceinput.isEmpty()||!voiceinput.matches(".*\\d.*")|| Double.parseDouble(voiceinput.replaceAll("[^0-9]",""))<41000)
			return "pc-type";
		
		//determining pc type from voice input
		if(voiceinput.contains("gaming")||voiceinput.contains("GAMING"))
			PCtype = "Gamingpc";
		else if(voiceinput.contains("work")||voiceinput.contains("workstation"))
			PCtype = "Workpc";
		else if(voiceinput.contains("general")||voiceinput.contains("generaluse"))
			PCtype = "Generalpc";
		else
			PCtype = "Generalpc";
		
		//determining budget from voice input
		double budget = Double.parseDouble(voiceinput.replaceAll("[^0-9]",""));
	
	buildresult build = new buildresult();
		
		if(PCtype.equals("Gamingpc")) {
		build = builderservice.BuildGamingPC(budget);
		}
		else if(PCtype.equals("Generalpc")) {
		build = builderservice.BuildGeneralPC(budget);
		}
		else if(PCtype.equals("Workpc")) {
		build = builderservice.BuildWorkPC(budget);
		}
		model.addAttribute("pcpart",build);
		
		String budgetintext = String.valueOf(budget);
		
		
		
		model.addAttribute("budgetentered",budgetintext);
		return "result";
	
	}
	
	//gaming pc build
	
	@RequestMapping("/build")
	public String GamingBuildBudget(HttpServletRequest request,Model model) {
		
		String stringbudget = request.getParameter("amount");
		if(stringbudget.isEmpty()||!stringbudget.matches(".*\\d.*")||Double.parseDouble(stringbudget)<41000)
			return "pc-type";
		double budget = Double.parseDouble(stringbudget);
		String PCtype =(String) model.getAttribute("PC-type");
		
		buildresult build = new buildresult();
		
		if(PCtype.equals("Gamingpc")) {
		build = builderservice.BuildGamingPC(budget);
		}
		else if(PCtype.equals("Generalpc")) {
		build = builderservice.BuildGeneralPC(budget);
		}
		else if(PCtype.equals("Workpc")) {
		build = builderservice.BuildWorkPC(budget);
		}
		model.addAttribute("pcpart",build);
	
		model.addAttribute("budgetentered",stringbudget);
		
		
		return "result";
		
	}
	

	//generalpc build
	
	@RequestMapping("/generalpcamountinput")
	public String generalpcbuildbudget(Model model,HttpServletRequest request) {
		String type = "Generalpc";
			model.addAttribute("PC-type",type);
				return "amountinput";
	}
	
	//workpc build
	
	@RequestMapping("/workpcamountinput")
	public String workpcbudget(Model model,HttpServletRequest request) {
		String type = "Workpc";
		model.addAttribute("PC-type",type);
		return "amountinput";
	}
	
	@RequestMapping("/SavedBuilds")
	public String savedbuilds(Model model) {
		String email = (String)model.getAttribute("Emailid");
		List<SaveBuild>	savedbuilds=builderservice.showsavedbuilds(email);
		model.addAttribute("SavedBuilds",savedbuilds);
		return "Savedbuilds";
	}
	
	
	
	
}
