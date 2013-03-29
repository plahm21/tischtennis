package de.fma.tischtennis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Set {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
}
