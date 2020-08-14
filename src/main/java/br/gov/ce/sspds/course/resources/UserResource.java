package br.gov.ce.sspds.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ce.sspds.course.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L,"murilo","murilo@gmail.com","999","12345");
		return ResponseEntity.ok().body(u);
	}
}
