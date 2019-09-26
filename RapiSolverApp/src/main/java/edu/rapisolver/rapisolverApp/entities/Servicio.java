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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="servicio")
public class Servicio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer serviceId;
	
	@Size(min=3, message = "El nombre del servicio debe tener minimo 3 caracteres")
	@Column(name="serviceName", nullable = false, length = 50)
	private String serviceName;
	
	@Size(min=3, message = "La descripcion debe tener minimo 10 caracteres")
	@Column(name="serviceDescription", nullable = false, length = 400)
	private String serviceDescription;
	
	@Column(name="serviceCost", nullable = false)
	private double serviceCost;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private ServiceCategory serviceCategory;
	
	@OneToMany(mappedBy = "servicioDetail", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DetalleServiceSupplier> listaDetails;

	public List<DetalleServiceSupplier> getListaDetails() {
		return listaDetails;
	}

	public void setListaDetails(List<DetalleServiceSupplier> listaDetails) {
		this.listaDetails = listaDetails;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}

	public ServiceCategory getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(ServiceCategory serviceCategory) {
		this.serviceCategory = serviceCategory;
	}





	
}