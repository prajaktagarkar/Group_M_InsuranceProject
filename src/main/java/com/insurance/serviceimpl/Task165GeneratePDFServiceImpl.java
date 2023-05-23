package com.insurance.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.insurance.model.Task165GeneratePDF;
import com.insurance.repository.Task165GeneratePDFRepository;
import com.insurance.service.Task165GeneratePDFService;

@Service
@Transactional
public class Task165GeneratePDFServiceImpl implements Task165GeneratePDFService {
@Autowired
	private Task165GeneratePDFRepository pdfRepository;
	@Override
	public List<Task165GeneratePDF> listAll() {
		return pdfRepository.findAll(Sort.by("id").ascending());
	
	}

}
