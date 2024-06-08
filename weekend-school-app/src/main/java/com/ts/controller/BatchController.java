package com.ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Batch;
import com.ts.service.BatchService;

@RestController
public class BatchController {

	@Autowired
	BatchService bs;
	
	@PostMapping("/add-batch")
	public Batch addBatch(@RequestBody Batch batch) {
		return bs.addBatch(batch);
	}

	@GetMapping("/all-batches")
	public List<String> getBatches() {
		return bs.getBatches();
	}
	
	@GetMapping("/get-batches")
	public List<Batch> batches(@RequestParam("mentor") String mentorName) {
		return bs.batches(mentorName);
	}
	
}


/*
 	@Component  (object creation)
 	
 	@Controller
 	@Service
 	@Repository
 
 */



