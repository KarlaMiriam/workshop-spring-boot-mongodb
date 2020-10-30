package com.karla.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karla.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User karla = new User("1", "karla", "karla@gmail.com");
		User diego = new User("2", "diego", "diego@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(karla, diego));
		return ResponseEntity.ok().body(list);
	}
}
