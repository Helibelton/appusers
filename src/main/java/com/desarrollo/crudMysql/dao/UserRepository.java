package com.desarrollo.crudMysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.desarrollo.crudMysql.model.AppUser;

public interface UserRepository extends CrudRepository<AppUser, Integer> {

}
