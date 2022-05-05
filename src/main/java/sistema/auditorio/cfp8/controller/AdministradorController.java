package sistema.auditorio.cfp8.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class AdministradorController {
	
	@RequestMapping("formAdministrador")
	public String formAdministrador() {
		
		return "Admistrador/Form";
	}
	
	@RequestMapping("salvarAdministrador")
	public String salvarAdministrador() {
		
		return "Administrador/Form";
		
	}

}
