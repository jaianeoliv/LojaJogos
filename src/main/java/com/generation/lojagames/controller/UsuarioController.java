/*package com.generation.lojagames.controller;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojagames.model.Produto;
import com.generation.lojagames.model.Usuario;
import com.generation.lojagames.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>>getAll(){
		return ResponseEntity.ok().body(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Usuario>> getById(@PathVariable Long id){
		if(repository.existsById(id)) {
			return ResponseEntity.ok().body(repository.findById(id));
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok().body(repository.findAllByNomeContainingIgnoreCas(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto>post(@Valid @RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto>put(@Valid @RequestBody Produto produto){
		if(repository.existsById(produto.getId())) {
			return ResponseEntity.ok().body(repository.save(produto));
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Produto>delete(@PathVariable Long id){
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
}
	*/
	
	