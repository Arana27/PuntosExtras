package com.panvdev.apirest_prueba.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;

	private String Marca;
	private String Modelo;
	private String Color;

	public Autos() {

	}

	public long getID() {
		return ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
