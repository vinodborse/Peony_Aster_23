package com.ts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Batch;
import com.ts.repository.BatchRepository;

@Service
public class BatchService {

	@Autowired
	BatchRepository br;
	
	public Batch addBatch(Batch batch) {
		String name = "TS-" +  batch.getSubject();
		batch.setSubject(name);
		return br.save(batch);	
	}

	public List<String> getBatches() {
		List<Batch> batches = br.findAll();
		
		List<String> batchesName = new ArrayList<>();
		
		for(Batch b: batches) {
			batchesName.add(b.getSubject());
		}
		
		return batchesName;
	}

	public List<Batch> batches(String mentorName) {
		return br.findByMentor(mentorName);
	}

}

