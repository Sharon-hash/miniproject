package com.mini.Lulu02_MS1_Sports.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="s")
public class EntitySports {
	@Id
	int id;
	int cost;
	String name;
	public int getId() {
		return id;
	}
	public void setId(long id2) {
		this.id = (int) id2;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EntitySports [id=" + id + ", cost=" + cost + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntitySports other = (EntitySports) obj;
		return cost == other.cost && id == other.id && Objects.equals(name, other.name);
	}
}
