package edu.rapisolver.rapisolverApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/supplier")
public class SupplierController {
	
	@GetMapping("/sesion")
	public String IniciarSesion(Model model) {
		
		
		return "/supplier/sesion";
	}
	@GetMapping("/principal")
	public String IngresoExitoso(Model model) {
		
		
		return "/supplier/principal";
	}
	@GetMapping("/perfil")
	public String MostrarPerfil(Model model) {
		
		
		return "/supplier/perfil";
	}
	
}
