package edu.rapisolver.rapisolverApp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.rapisolver.rapisolverApp.entities.DetalleServiceSupplier;
import edu.rapisolver.rapisolverApp.entities.ServiceCategory;
import edu.rapisolver.rapisolverApp.entities.Servicio;
import edu.rapisolver.rapisolverApp.service.IDetalleServicieSupplierService;
import edu.rapisolver.rapisolverApp.service.IServiceCategoryService;
import edu.rapisolver.rapisolverApp.service.IServiceService;

@Controller
@RequestMapping("/service")
public class ServiceController {

	@Autowired
	private IServiceService servicioService;
	
	@Autowired
	private IServiceCategoryService servicioCategory;
	
	//@Autowired
	//private ISupplierService supplierService;
	
	@Autowired
	private IDetalleServicieSupplierService detalleService;
	
	@GetMapping("/nuevo")
	public String nuevoServicio(Model model) {
		
		Servicio servicio = new Servicio();
		model.addAttribute("servicio", servicio);
		try {
		model.addAttribute("categorias", servicioCategory.findAll());
		}catch(Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "/service/create";
	}
	
	@PostMapping("/guardar")
	public String guardarServicio(Model model, Servicio s) {
		
		try {
			model.addAttribute("registroServicios", servicioService.save(s));
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "redirec/service/list";
	}
	
	@GetMapping("/list")
	public String listarServicios(Model model) {
		
		try {
			model.addAttribute("listadoServicios", servicioService.findAll());
		} catch (Exception e) {
			model.addAttribute("error",e.getMessage());
		}
		
		return "/service/list";
	}
	
	@GetMapping("/searchByServiceName")
	public String buscarPorServicioNombre(Model model,@RequestParam("servicioNombre") String servicioNombre) {
		
		
		try {
			if(!servicioNombre.isEmpty()){
				List<Servicio> servicios = servicioService.findByserviceName(servicioNombre);
				if(!servicios.isEmpty())
					model.addAttribute("listadoServicios",servicios);
				else {
					model.addAttribute("info","No existen servicios con ese nombre");
					model.addAttribute("listadoServicios",servicioService.findAll());
				}
			}
			else {
				model.addAttribute("info","Ingrese un nommbre");
				model.addAttribute("listadoServicios",servicioService.findAll());
			}
		} catch (Exception e) {
			model.addAttribute("error",e.getMessage());
		}
		
		return "/service/list";
	}
	
	@GetMapping("/searchByServiceCategory")
	public String buscarPorServicioCategoria(Model model,@RequestParam("servicioCategoria") String servicioCategoria) {
		
		
		try {
			if(!servicioCategoria.isEmpty()){
				List<Servicio> servicios = servicioService.findByserviceCategory(servicioCategoria);
				if(!servicios.isEmpty())
					model.addAttribute("listadoServicios",servicios);
				else {
					model.addAttribute("info","No existen categorias con ese nombre");
					model.addAttribute("listadoServicios",servicioService.findAll());
				}
			}
			else {
				model.addAttribute("info","Ingrese un nommbre");
				model.addAttribute("listadoServicios",servicioService.findAll());
			}
		} catch (Exception e) {
			model.addAttribute("error",e.getMessage());
		}
		
		return "/service/list";
	}
	
	
	
	
	
	@GetMapping("/details/{id}")
	public String detallesServicoPorId(@PathVariable(value="id") Integer id,
			Model model) {
		try {
			Optional<Servicio> servicio = servicioService.findById(id);
			Optional<DetalleServiceSupplier> detalle=detalleService.findById(id);
			
			if(!servicio.isPresent()) {
				model.addAttribute("info", "Alumno no existe");
				return "redirect:/servicio/list";
			}
			else {
				model.addAttribute("servicio",servicio.get());
				model.addAttribute("detalle",detalle.get());
			}
		 
		} catch (Exception e) {
			model.addAttribute("error",e.getMessage());
		}
		return "/service/details";
	}
	
	
	
}
