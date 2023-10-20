package lulu02_MS1_crud.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table	(name="product")
public class Product {
	
	@Id		//primary key-unique in row 
	int id;
	String name;
	float cost;
	String descrip;
	public Product(int id, String name, float cost, String descrip) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.descrip = descrip;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(long id2) {
		this.id = (int) id2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	

}
