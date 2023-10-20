package lulu02_MS1_crud.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lulu02_MS1_crud.crud.entity.Product;
import lulu02_MS1_crud.crud.repo.CrudRepository;



@RequestMapping("/pps")
@RestController



public class crudController {
	
	


	

	
		
		
		@Autowired
		CrudRepository crudRepository;
		
		@GetMapping("/getDetail")
		public List<Product> getJPQL() {

			return crudRepository.findAll(); // select * from <TableName>;

		}
		
		@PostMapping("/addDetail")
		public Product createuser(@RequestBody Product prod) {
			return crudRepository.save(prod);
		}


//		

		
		
		
		@DeleteMapping("/deleteDetail/{id}")
		public void deletProduct(@PathVariable("id") Integer id  ) {

			crudRepository.deleteById(id); // select * from <TableName>;

		}
		
		@PutMapping("/details/{id}")

		public ResponseEntity<Object> updateCrud(@RequestBody Product product, @PathVariable long id) {
	Optional<Product> crudOptional = crudRepository.findById((int) id);
		if (crudOptional.isEmpty())
		return ResponseEntity.notFound().build();
		product.setId(id);
		crudRepository.save(product);
		return ResponseEntity.noContent().build();
		}

	 
		



}
