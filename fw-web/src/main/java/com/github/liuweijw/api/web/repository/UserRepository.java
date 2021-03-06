package com.github.liuweijw.api.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.github.liuweijw.api.web.domain.User;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u left join fetch u.roles r where u.username=:username")
	public Optional<User> findByUsername(@Param("username") String username);

}
