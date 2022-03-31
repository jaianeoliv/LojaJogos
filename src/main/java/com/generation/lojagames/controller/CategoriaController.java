package com.generation.lojagames.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojagames.model.Categoria;
import com.generation.lojagames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	private ResponseEntity<List<Categoria>> getAll(){
			return ResponseEntity.ok(repository.findAll());
			//return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Optional<Categoria>> getById(@PathVariable Long id){
		if(repository.existsById(id)) {
			return ResponseEntity.ok().body(repository.findById(id));
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@GetMapping("/tipo/{tipo}")
	public ResponseEntity<List<Categoria>> getById(@PathVariable String tipo){
		return ResponseEntity.ok().body(repository.findAllByTipoContainingIgnoreCase(tipo));
	}
	
	
	@PutMapping
	ResponseEntity<Categoria>put(@Valid @RequestBody Categoria categoria){
		if(repository.existsById(categoria.getId())) {
			return ResponseEntity.ok().body(repository.save(categoria));
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Categoria>delete(@PathVariable Long id){
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	

}
