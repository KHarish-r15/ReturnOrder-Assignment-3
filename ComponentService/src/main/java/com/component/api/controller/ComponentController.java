package com.component.api.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.component.api.entity.ComponentType;
import com.component.api.entity.Components;
import com.component.api.entity.PackageDeliveryResponse;
import com.component.api.entity.ProcessRequest;
import com.component.api.entity.ProcessResponse;
import com.component.api.services.ComponentService;
import com.component.api.utils.DateOfDelivery;
import com.component.api.utils.ProcessingCharge;

@RestController
@RequestMapping("/api")
public class ComponentController {

	@Autowired
	ComponentService componentService;

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/addcomponent")
	public String createUser(@RequestBody Components components) throws Exception {
		componentService.saveComponent(components);
		return components.getId();

	}

	@GetMapping("/allcomponents")
	List<Components> getComponents() {
		return componentService.getComponent();
	}

	@PostMapping("/processdetails")
	public ProcessResponse processDetails(@RequestBody ProcessRequest request) {
		ProcessingCharge processingCharge = new ProcessingCharge();
		ProcessResponse processResponse = new ProcessResponse();
		DateOfDelivery dateOfDelivery = new DateOfDelivery();
		// client-side load balancing
		PackageDeliveryResponse response = restTemplate.postForObject("http://localhost:8989/api/pack", request,
				PackageDeliveryResponse.class);
		System.out.println(response.getPackageDeliveryCharge());

		processResponse.setRequestId(UUID.randomUUID().toString());
		processResponse.setProcessingCharge(
				processingCharge.calcProcessingCharges(request.getComponentDetail().getComponentType()));
		processResponse.setPackagingAndDeliveryCharge(response.getPackageDeliveryCharge());
		processResponse.setDateOfDelivery(dateOfDelivery.getDateOfDelivery(request.getComponentDetail().getComponentType()));

		return processResponse;

	}

}
