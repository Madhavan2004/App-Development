package com.crudoperation.FurnitureCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudoperation.FurnitureCRUD.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
