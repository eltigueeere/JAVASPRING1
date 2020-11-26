package com.example.jegm.control;

import java.util.Map;

import org.apache.catalina.valves.rewrite.Substitution.RewriteRuleBackReferenceElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.jegm.models.dao.IProductosDeTiendaDao;
import com.example.jegm.models.entity.ProductosDeTienda;

@Controller
public class Problema5Controller {

	@GetMapping("/form")
	public String form(Model model) {
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(Model model, 
			@RequestParam String nombre,
			@RequestParam String edad,
			@RequestParam String apellido_m,
			@RequestParam String apellido_p
			) {
		model.addAttribute("nombre", nombre);
		model.addAttribute("edad", edad);
		model.addAttribute("apellido_m", apellido_m);
		model.addAttribute("apellido_p", apellido_p);
		return "datosenviados";
	}
	
	@GetMapping("/numerosJS")
	public String numeros(Model model) {
		return "numerosJS";
	}
	
	
	@Autowired
	private IProductosDeTiendaDao productosDao;
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("productos", productosDao.findAll());
		System.out.println(model.addAttribute("productos", productosDao.findAll()));
		return "listar";
	}
	
	
	@GetMapping("/guardarNuevo")
	
	public String crear(Map<String, Object> model) {
		
		ProductosDeTienda productosdetienda = new ProductosDeTienda();
		model.put("productosdetienda", productosdetienda);
		
		return "guardarNuevo";		
	}
	
	
	@RequestMapping(value = "/guardarNuevo", method = RequestMethod.POST )
	public String guardar(ProductosDeTienda productosdetienda) {
		
		productosDao.save(productosdetienda);
		return "redirect:listar";
	}
	
}




