package de.fma.tischtennis.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToMany
	private List<TeamMatch> teamMatchs;
	
	public Match() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<TeamMatch> getTeamMatchs() {
		return teamMatchs;
	}

	public void setTeamMatchs(List<TeamMatch> teamMatchs) {
		this.teamMatchs = teamMatchs;
	}
	
	
}
