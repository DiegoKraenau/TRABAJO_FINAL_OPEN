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


@Entity
@Table(name="location")
public class Location implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer locationId;
	

	@Column(name="country", nullable = false, length = 50)
	private String country;
	

	@Column(name="city", nullable = false, length = 50)
	private String city;
	

	@Column(name="state", nullable = false, length = 50)
	private String state;
	

	@Column(name="addres", nullable = false, length = 90)
	private String addres;
	
	
	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Supplier> suppliers;


	public Integer getLocationId() {
		return locationId;
	}


	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getAddres() {
		return addres;
	}


	public void setAddres(String addres) {
		this.addres = addres;
	}


	public List<Supplier> getSuppliers() {
		return suppliers;
	}


	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	

}