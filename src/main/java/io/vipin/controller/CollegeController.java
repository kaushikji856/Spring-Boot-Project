/**
 * 
 */
package io.vipin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.vipin.model.College;
import io.vipin.service.CollegeServiceImpl;

/**
 * @author VI852115
 *
 */
@RestController
@Api(value = "College API Resource", description = "Shows the all college details...")
public class CollegeController {

	
	@Autowired
	CollegeServiceImpl collegeService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/welcome")
	@ApiOperation(value ="Shows the hello world page")
	public String welcomePage() {
		return "Hi this is welcome alert!!!!";
	}
	
	@RequestMapping("/getcollege")
	@ApiOperation(value ="Return all colleges.")
	public List<College> getCollege() {
		return collegeService.getAllCollege();	
	}
	
	@RequestMapping("/getcollege/{id}")
	@ApiOperation(value ="Return only one specific college.")
	public College getCollegeById(@PathVariable String id) {
		
		 /*ResponseEntity<List<String>> comsDataResponse = restTemplate.exchange("http://localhost:8585/rest/coms/gettransaction/" + id, HttpMethod.GET,
	                null, new ParameterizedTypeReference<List<String>>() {
	                });*/
//		 ResponseEntity<List> comsDataResponse = restTemplate.getForEntity("http://localhost:8585/rest/coms/gettransaction/" + id,  List.class);
//		 List<Map<String, String>> list = comsDataResponse.getBody();
//		 for (Map<String, String> map1 : list) {
//			System.out.println("The Map is-->>>>"+map1);
//		}
		return collegeService.getCollegeById(id);
	}
	
	@RequestMapping("/addcollege/{id}/{collegename}" )
	public String addCollege(@PathVariable int id, @PathVariable String collegename) {
		boolean flag = (boolean) collegeService.addCollege(new College(id, collegename));
		if(flag)
			return "College added successfully";
		else
			return "error occured";
	}
	
}
