package br.senai.sp.gestaoAuditorio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.sp.gestaoAuditorio.model.Administrador;
import br.senai.sp.gestaoAuditorio.repository.AdministradorRepository;

public class AdministradorController {

	@Autowired
	AdministradorRepository repository;

	@RequestMapping("formAdministrador")
	public String formAdministrador() {

		return "Admistrador/Form";
	}

	@RequestMapping("salvarAdministrador")
	public String salvarAdministrador(Model model, Administrador administrador) {

		repository.save(administrador);

		return "Administrador/Form";

	}

}
