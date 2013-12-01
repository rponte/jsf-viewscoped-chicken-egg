package br.com.triadworks.chickenegg;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SimpleViewScopedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public SimpleViewScopedBean() {
		System.out.println("SimpleViewScopedBean: default constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("SimpleViewScopedBean: @PostConstruct");
	}
	
	public void show() {
		System.out.println("Name: " + this.name);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
