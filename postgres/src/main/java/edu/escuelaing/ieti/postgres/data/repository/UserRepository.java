package edu.escuelaing.ieti.postgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.escuelaing.ieti.postgres.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
