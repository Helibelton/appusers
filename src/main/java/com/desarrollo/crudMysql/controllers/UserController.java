package com.desarrollo.crudMysql.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.desarrollo.crudMysql.model.AppUser;
import com.desarrollo.crudMysql.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public ModelAndView Listado() {
		ModelAndView view = new ModelAndView("index");
		view.addObject("lists", this.userService.listar());
		return view;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView Guardar(@RequestParam("id") String id, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("phone") String phone) {
		ModelAndView view = new ModelAndView("redirect:/");
		AppUser user;
		if(!id.isEmpty()) {
			Optional<AppUser> objUser = this.userService.detalle(Integer.parseInt(id));
			user = new AppUser();
			user.setId(objUser.get().getId());
			user.setFirstname(objUser.get().getFirstname());
			user.setLastname(objUser.get().getLastname());
			user.setPhone(objUser.get().getPhone());
		} else {
			user = new AppUser();			
		}		
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setPhone(phone);
		this.userService.guardar(user);
		return view;
	}
	
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public ModelAndView Detalle(@PathVariable("id") int id) {
		ModelAndView view = new ModelAndView("view");
		Optional<AppUser> objUser = this.userService.detalle(id);
		AppUser user = new AppUser();
		user.setId(objUser.get().getId());
		user.setFirstname(objUser.get().getFirstname());
		user.setLastname(objUser.get().getLastname());
		user.setPhone(objUser.get().getPhone());
		view.addObject("lists", user);
		return view;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView Borrar(@PathVariable("id") int id) {
		ModelAndView view = new ModelAndView("redirect:/");
		this.userService.borrar(id);
		return view;
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView Modificar(@PathVariable("id") int id) {
		ModelAndView view = new ModelAndView("edit");
		Optional<AppUser> objUser = this.userService.detalle(id);
		AppUser user = new AppUser();
		user.setId(objUser.get().getId());
		user.setFirstname(objUser.get().getFirstname());
		user.setLastname(objUser.get().getLastname());
		user.setPhone(objUser.get().getPhone());
		view.addObject("lists", user);
		return view;
	}

}
