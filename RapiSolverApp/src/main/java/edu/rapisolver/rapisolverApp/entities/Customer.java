package edu.rapisolver.rapisolverApp.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCustomer;
	
	@Size(min=3, message = "Los nombres deben tener minimo 3 caracteres")
	@Column(name="name", nullable = false, length = 50)
	private String name;
	
	@Size(min=3, message = "Los apellidos deben tener minimo 3 caracteres")
	@Column(name="lastname", nullable = false, length = 50)
	private String lastname;
	
	@Size(min=10, message = "Los correos deben tener minimo 10 caracteres")
	@Column(name="email", nullable = false, length = 50)
	private String email;
	
	@Size(min=7, message = "Los telefonos deben tener minimo 7 digitos")
	@Column(name="phone", nullable = false, length = 11)
	private String phone;
	
	@Size(min=18, message = "La edad minima debe ser 18 años")
	@Column(name="age", nullable = false, length = 80)
	private Integer age;
	
	@Size(min=3, message = "Las contraseñas deben tener minimo 3 caracteres")
	@Column(name="password", nullable = false, length = 20)
	private String password;

	@Column(name="gender", nullable = false, length = 20)
	private String gender;

	@ManyToOne
	@JoinColumn(name = "location_id")
	private Location location;
	
	public Integer getIdCustomer() {
		return idCustomer;
	}


	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}
	

}
