package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Plato")
public class Plato implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPlato;
	
	@Column(name="nombrePlato", nullable = false, length=30)
	private String nombrePlato;
	
	private int preciobasePlato;

	public Plato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public int getPreciobasePlato() {
		return preciobasePlato;
	}

	public void setPreciobasePlato(int preciobasePlato) {
		this.preciobasePlato = preciobasePlato;
	}
	
}
