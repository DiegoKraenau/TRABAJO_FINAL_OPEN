package edu.rapisolver.rapisolverApp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="serviceCategory")
public class ServiceCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer categoryId;
	
	@Size(min=3, message = "La categoria del servicio debe tener minimo 3 caracteres")
	@Column(name="categoryName", nullable = false, length = 50)
	private String categoryName;
	
	@OneToMany(mappedBy = "serviceCategory",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Servicio> services;

	public List<Servicio> getServices() {
		return services;
	}

	public void setServices(List<Servicio> services) {
		this.services = services;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
