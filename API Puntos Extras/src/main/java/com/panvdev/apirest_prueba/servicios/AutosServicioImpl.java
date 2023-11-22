package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panvdev.apirest_prueba.modelos.Autos;
import com.panvdev.apirest_prueba.repositorios.AutosRepositorio;

@Service
public class AutosServicioImpl implements IAutoSServicio{
	
	@Autowired
	AutosRepositorio AutosRepositorio
	;

	@Override
	public List<Autos> obtenerTodo() {
		return AutosRepositorio.findAll();
	}

	@Override
	public Autos guardar(Autos Autos) {
		return AutosRepositorio.save(Autos);
	}

	@Override
	public Autos obtenerPorId(long id) {
		return AutosRepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(long id) {
		AutosRepositorio.deleteById(id);
		
	}

}
