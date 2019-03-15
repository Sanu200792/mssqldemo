package com.mssql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mssql.demo.model.user;

@Repository
public interface UserRepository extends JpaRepository<user, Integer> {

	@Query("SELECT u.last_name FROM user u WHERE u.id=(:id)")
	public String find(@Param("id") int id);
}
