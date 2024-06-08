package com.ts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Batch;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Long>{
		
	List<Batch> findByMentor(String mentorName);
}
