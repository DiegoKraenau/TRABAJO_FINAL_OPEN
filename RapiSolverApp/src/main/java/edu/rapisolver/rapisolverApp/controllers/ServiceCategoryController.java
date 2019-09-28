package edu.rapisolver.rapisolverApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.rapisolver.rapisolverApp.entities.ServiceCategory;
import edu.rapisolver.rapisolverApp.service.IServiceCategoryService;

@Controller
@RequestMapping("/category")
public class ServiceCategoryController {

	@Autowired
	private IServiceCategoryService serviceCategory;
	
	@GetMapping("/create")
	public String registrarServicio(Model model) {
		
		//ServiceCategory category = new ServiceCategory();
		//model.addAttribute("category",category);
		return "/category/create";
	}
	
	@PostMapping("/create")
	public String registrarCategoria(Model model, ServiceCategory sc) {
		
		try {
			model.addAttribute("registrarCategorias", serviceCategory.save(sc));
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "/category/list";
	}
	
	@GetMapping("/list")
	public String listarCategoria(Model model) {
		
		try {
			model.addAttribute("listadoCategorias", serviceCategory.findAll());
		} catch (Exception e) {
			model.addAttribute("error",e.getMessage());
		}
		
		return "/category/list";
	}
}
