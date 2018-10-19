package com.java.dto;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Employee extends Person{

	 int employeeId;
	 String companyName;
	
	public Employee(String name, int employeeId, String companyName) {
		super(name);
		this.employeeId= employeeId;
		this.companyName= companyName;
	}
}
