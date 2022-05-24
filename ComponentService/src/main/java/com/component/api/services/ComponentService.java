package com.component.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.component.api.entity.Components;
import com.component.api.repository.ComponentRepository;

@Service
public class ComponentService {
	
	@Autowired
	ComponentRepository componentRepository;

	public Components saveComponent(Components components) {
		componentRepository.save(components);
		return components;
		
	}
	
	public List<Components> getComponent() {
		List<Components> all = componentRepository.findAll();
		//all.
		return all;
	}
	
	
	
//	public Components getComponentsById(String id) {
//		System.out.println(componentRepository.findById(id).get());
//		return componentRepository.findById(id).get();
//	}

}
