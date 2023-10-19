package com.mini.Lulu02_MS1_Sports.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mini.Lulu02_MS1_Sports.Entity.EntitySports;
import com.mini.Lulu02_MS1_Sports.Repo.RepoSports;

@RestController
public class ControllerSports {
	@Autowired

	RepoSports sportsrepository;

	

	@GetMapping("/getDetail")

	public List<EntitySports> getDetail() {

 

		return sportsrepository.findAll(); // select * from <TableName>;

 

	}

	@PostMapping("/addDetail")

	public EntitySports createuser(@RequestBody EntitySports prod) {

		return sportsrepository.save(prod);

	}


	@PutMapping("/sports/{id}")
	public ResponseEntity<Object> updateShipping(@RequestBody EntitySports sports, @PathVariable long id) {
Optional<EntitySports> shippingOptional = sportsrepository.findById((int) id);
	if (shippingOptional.isEmpty())
	return ResponseEntity.notFound().build();
	sports.setId(id);
	sportsrepository.save(sports);
	return ResponseEntity.noContent().build();

	}
	@DeleteMapping("/delDetail/{id}")

	public void delProduct(@PathVariable("id")Integer id) {
		sportsrepository.deleteById(id);

}

 

}
