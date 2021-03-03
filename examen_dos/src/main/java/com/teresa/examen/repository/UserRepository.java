package com.teresa.examen.repository;

import org.springframework.data.repository.CrudRepository;
import com.teresa.examen.models.User;

public interface UserRepository extends CrudRepository <User, Long>{
	User findByEmail(String email);
}
