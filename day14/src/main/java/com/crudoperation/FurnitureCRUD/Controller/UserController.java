package com.crudoperation.FurnitureCRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudoperation.FurnitureCRUD.Entity.UserEntity;
import com.crudoperation.FurnitureCRUD.Repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository repository;
	
	@PostMapping("/adduser")
	public UserEntity addUser(@RequestBody UserEntity entity) {
		
		return repository.save(entity);
		
	}
	@GetMapping("/users")
public List<UserEntity> UserList() {
		
		return repository.findAll();
		
	}
	@PutMapping("/updateuser")
	public UserEntity update(@RequestBody UserEntity entity) {
		return repository.saveAndFlush(entity);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		repository.deleteById(id);
		return "user is deleted";
	}
	
}
