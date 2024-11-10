package com.example.Firstrestapp.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Employee {
 
	@Id
	public int id;
	public String name;
	@Column(name="address")
	public String laptopmodel;
	@Column(name="salary")
	public  double price;


	
}



























