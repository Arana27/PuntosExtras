package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import com.panvdev.apirest_prueba.modelos.Autos;

public interface IAutoSServicio{

	public List<Autos> obtenerTodo();
	
	public Autos guardar(Autos Autos);
	
	public Autos obtenerPorId(long ID);
	
	public void eliminar(long ID);
}
