package com.inventario.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inventario.app.models.dao.IVentaDao;

@Controller
public class VentaController {
	
	@Autowired
	private IVentaDao ventaDao;
	
	@RequestMapping(value="/listar",method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo","listado");
		model.addAttribute("ventas",ventaDao.findAll());
		return "listar";
	}
}
