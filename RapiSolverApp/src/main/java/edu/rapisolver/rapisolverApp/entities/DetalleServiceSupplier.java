package edu.rapisolver.rapisolverApp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detailServiceSupplier")
public class DetalleServiceSupplier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer detailId;
	
	@ManyToOne
	@JoinColumn(name="servicio_id")
	private Servicio servicioDetail;
	
	@ManyToOne
	@JoinColumn(name="supplier_id")
	private Supplier supplierDetail;

	public Servicio getServicioDetail() {
		return servicioDetail;
	}

	public void setServicioDetail(Servicio servicioDetail) {
		this.servicioDetail = servicioDetail;
	}

	public Supplier getSupplierDetail() {
		return supplierDetail;
	}

	public void setSupplierDetail(Supplier supplierDetail) {
		this.supplierDetail = supplierDetail;
	}

	public Integer getDetailId() {
		return detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

}
