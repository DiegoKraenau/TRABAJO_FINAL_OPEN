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
	
	@GetMapping("/nuevo")
	public String nuevaCategoria(Model model) {
		
		ServiceCategory category = new ServiceCategory();
		model.addAttribute("category",category);
		model.addAttribute("title", "nueva Categoria");
		return "/category/create";
	}
	
	@PostMapping("/guardar")
	public String guardarCategoria(Model model, ServiceCategory category) {
		
		try {
			model.addAttribute("registrarCategorias", serviceCategory.save(category));
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "redirect:/category/list";
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
