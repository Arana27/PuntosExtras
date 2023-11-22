package com.panvdev.apirest_prueba.controladores;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panvdev.apirest_prueba.modelos.Autos;
import com.panvdev.apirest_prueba.servicios.AutosServicioImpl;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class AutosControlador {
	
	@Autowired
	AutosServicioImpl AutosServicio;
	
	
	@GetMapping("/Autos")
	public List<Autos> obtenerAutos(){
		return AutosServicio.obtenerTodo();
	}
	
	
	@PostMapping("/guardar")
	public ResponseEntity<Autos> guardarAutos(@RequestBody Autos Autos){
		Autos nuevo_Autos = AutosServicio.guardar(Autos);
		return new ResponseEntity<>(nuevo_Autos, HttpStatus.CREATED);
	}
	
	@GetMapping("/Autos/{id}")
	public ResponseEntity<Autos> obtenerAutosId(@PathVariable long ID){
		Autos AutosPorId = AutosServicio.obtenerPorId(ID);
		return ResponseEntity.ok(AutosPorId);
	}
	
	@PutMapping("/Autos/{id}")
	public ResponseEntity<Autos> actualizarAutos(@PathVariable long ID, @RequestBody Autos Autos){
		Autos AutosPorId = AutosServicio.obtenerPorId(ID);
		AutosPorId.setMarca(Autos.getMarca());
		AutosPorId.setModelo(Autos.getModelo());
		AutosPorId.setColor(Autos.getColor());
		
		Autos Autos_actualizado = AutosServicio.guardar(AutosPorId);
		return new ResponseEntity<>(Autos_actualizado, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/Autos/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarAutos(@PathVariable long ID){
		this.AutosServicio.eliminar(ID);
		
		HashMap<String, Boolean> estadoAutosEliminado = new HashMap<>();
		estadoAutosEliminado.put("eliminado", true);
		return ResponseEntity.ok(estadoAutosEliminado);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
