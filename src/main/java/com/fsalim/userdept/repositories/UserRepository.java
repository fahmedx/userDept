package com.fsalim.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsalim.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
