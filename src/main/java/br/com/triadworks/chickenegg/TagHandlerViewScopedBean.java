package br.com.triadworks.chickenegg;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TagHandlerViewScopedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String pageName = "/includes/result.xhtml";
	
	public TagHandlerViewScopedBean() {
		System.out.println("TagHandlerViewScopedBean: default constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("TagHandlerViewScopedBean: @PostConstruct");
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
	public String getPageName() {
		return pageName;
	}
}