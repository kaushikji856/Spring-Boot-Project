/**
 * 
 */
package io.vipin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import io.vipin.dto.AddressBookDto;
import io.vipin.model.AddressBook;
import io.vipin.service.AddressBookService;

/**
 * @author VI852115
 *
 */
@Controller
public class AddressBookController {
	
	@Autowired
	AddressBookService addressBookservice;

	@RequestMapping(value ="/getAllAddress", method = RequestMethod.GET)
	public @ResponseBody String getAllAddress(@RequestParam("user_id") String userId) {
		List<AddressBook> addressBooksList =  addressBookservice.getAllAddress(new Long(userId));
		List<AddressBookDto> list = new ArrayList<>();
		for(int i = 0; i < addressBooksList.size(); i++) {
			AddressBookDto addressBookDto = new AddressBookDto();
			addressBookDto.setAddressId(addressBooksList.get(i).getAddressId());
			addressBookDto.setAddress(addressBooksList.get(i).getAddress());
			addressBookDto.setUsreId(addressBooksList.get(i).getUsreid());
			addressBookDto.setEmailId(addressBooksList.get(i).getEmailId());
			addressBookDto.setFirstName(addressBooksList.get(i).getFirstName());
			addressBookDto.setLastName(addressBooksList.get(i).getLastName());
			addressBookDto.setPhoneNo(addressBooksList.get(i).getPhoneNo());
			list.add(addressBookDto);
		}
		Gson gson = new Gson();
		return gson.toJson(list);
		
		
	}
}
