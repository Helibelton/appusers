package com.desarrollo.crudMysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollo.crudMysql.dao.UserRepository;
import com.desarrollo.crudMysql.model.AppUser;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<AppUser> listar() {
		return (List<AppUser>) this.userRepository.findAll();
	}

	@Override
	public AppUser guardar(AppUser user) {
		return this.userRepository.save(user);
	}

	@Override
	public Optional<AppUser> detalle(int id) {
		return this.userRepository.findById(id);
	}

	@Override
	public void borrar(int id) {
		this.userRepository.deleteById(id);
	}

}
