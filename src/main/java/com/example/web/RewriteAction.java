package com.example.web;

import java.io.Serializable;

import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;

import jakarta.annotation.PostConstruct;
import jakarta.faces.lifecycle.ClientWindowScoped;
import jakarta.inject.Named;

@Named
@ClientWindowScoped
@URLMapping(id = "rewrite-ample", pattern = "/rewrite/#{rewriteAction.name}", viewId = "/rewrite/index.xhtml")
public class RewriteAction implements Serializable {

	private String name;

	@PostConstruct
	@URLAction(mappingId = "rewrite-ample")
	public void init() {
		System.out.println("Chegou aqui..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
