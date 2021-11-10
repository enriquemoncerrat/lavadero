package com.example.lavadero.lavadero.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lavadero.lavadero.model.Usuario;

@RestController
public class UsuarioController {

	
	@GetMapping("/user")
	public ResponseEntity<?> getUsuarios(){
		Usuario us1 =  new Usuario();
		us1.setNombre("Enrique");
		us1.setApellido("Moncerrat");
		us1.setMail("enriquemoncerrat@gmail.com");
		us1.setPassword("1234");
		return new ResponseEntity<Usuario>(us1,HttpStatus.OK);
		
		
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> createUsuario(@RequestBody Usuario us){
		Usuario us1 =  new Usuario();
		us1.setNombre("Enrique");
		us1.setApellido("Moncerrat");
		us1.setMail("enriquemoncerrat@gmail.com");
		us1.setPassword("1234");
		
		return new ResponseEntity<Usuario>(us1,HttpStatus.OK);
	}
}
