/**The controller class acts as a container for all the requests
 * It acts as a Presentation Layer*/

package com.cg.tds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tds.exceptions.IdNotFoundException;
import com.cg.tds.model.TDSMaster;
import com.cg.tds.service.TDSService;

@RestController
public class TDSController {

	@Autowired
	TDSService tdsService;

	// Get with a Hello Message to verify working of URLs

	@GetMapping("/")
	public String sayHi() {
		return "Welcome User";
	}

	// Method to Get the TDS Data based on the ID
	@GetMapping("/user/tds/{id}")
	public TDSMaster getById(@PathVariable int id) {
		TDSMaster tdsMaster = tdsService.getById(id);
		if (tdsMaster == null) {
			throw new IdNotFoundException("ID not found wrong ID : " + id);
		} else
			return tdsMaster;
	}
}
