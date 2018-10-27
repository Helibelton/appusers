package com.desarrollo.crudMysql.service;

import java.util.List;
import java.util.Optional;

import com.desarrollo.crudMysql.model.AppUser;

public interface UserService {

	List<AppUser> listar();

	AppUser guardar(AppUser user);

	Optional<AppUser> detalle(int id);

	void borrar(int id);

}
