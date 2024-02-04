package com.internship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internship.entities.Students;


@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {

}
