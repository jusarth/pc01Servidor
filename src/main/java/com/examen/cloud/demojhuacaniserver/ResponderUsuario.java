package com.examen.cloud.demojhuacaniserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/usuario/server/{userid}")
public class ResponderUsuario {
	
	
	@GetMapping
	public String usuario(@PathVariable("userid") String userid) {
		String respuesta="Nombre de usuario: ";
		if(userid.equals("1"))
			respuesta += "Juan";
		else if(userid.equals("2"))
			respuesta += "Carlos";
		else
			respuesta += "desconocido";
		return respuesta;
	}
}
