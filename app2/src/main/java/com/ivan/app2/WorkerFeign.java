package com.ivan.app2;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.ivan.app2.model.Usuario;

@FeignClient(name = "servidorzinho", url="localhost:8081", path="/usuarios")
public interface WorkerFeign {
	

	@GetMapping
	public ResponseEntity<List<Usuario>> getAll();

}
