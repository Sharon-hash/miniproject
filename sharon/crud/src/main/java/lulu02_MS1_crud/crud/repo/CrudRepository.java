package lulu02_MS1_crud.crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import lulu02_MS1_crud.crud.entity.Product;




public interface CrudRepository extends JpaRepository<Product, Integer>  {
	
	
	@Query("SELECT s FROM Product s ")
	List<Product> findAllMyQuery();



@Query(value ="SELECT * FROM product",nativeQuery = true)  ///Native Query 
List<Product> findAllNativeQuey();

}
