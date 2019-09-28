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
@Table(name="qualification")
public class Qualification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer qualificationId;
	
	@Size(min=0, message = "La cantidad minima de estrellas es 0")
	@Size(max = 5, message = "La cantidad maxima de estrellas es 5")
	@Column(name="star", nullable = false, length = 2)
	private Integer star;

	@Column(name="description", nullable = false, length = 500)
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "idSupplier")
	private Supplier supplier;
	
	@ManyToOne
	@JoinColumn(name = "idCustomer")
	private Customer customer;
	
	
	
	
	
	

}
