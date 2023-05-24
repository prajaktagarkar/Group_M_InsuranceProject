package com.insurance.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Task165GeneratePDF;

@RestController
public interface Task165GeneratePDFRepository extends CrudRepository<Task165GeneratePDF, Integer>{
	public List<Task165GeneratePDF> findAll(Sort ascending);

}
