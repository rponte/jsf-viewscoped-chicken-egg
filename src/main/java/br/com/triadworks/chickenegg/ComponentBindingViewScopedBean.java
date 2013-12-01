package br.com.triadworks.chickenegg;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIForm;

@ManagedBean
@ViewScoped
public class ComponentBindingViewScopedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private UIForm form;
	
	public ComponentBindingViewScopedBean() {
		System.out.println("ComponentBindingViewScopedBean: default constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("ComponentBindingViewScopedBean: @PostConstruct");
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
	public UIForm getForm() {
		return form;
	}
	public void setForm(UIForm form) {
		this.form = form;
	}
	
}
