package de.fma.tischtennis.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int number;
	@ManyToOne
	@JoinColumn(name = "fk_team_category")
	private Category category;
	@ManyToOne
	@JoinColumn(name = "fk_team_club")
	private Club club;
	@OneToMany
	private List<ValidFromTo> fromTos;
	@ManyToMany
	private List<Season> seasons;
	@OneToMany
	private List<TeamMatch> teamMatches;
	
	public Team() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	public List<Season> getSeasons() {
		return seasons;
	}
	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	public List<ValidFromTo> getFromTos() {
		return fromTos;
	}
	public void setFromTos(List<ValidFromTo> fromTos) {
		this.fromTos = fromTos;
	}

	public List<TeamMatch> getTeamMatches() {
		return teamMatches;
	}

	public void setTeamMatches(List<TeamMatch> teamMatches) {
		this.teamMatches = teamMatches;
	}
}
