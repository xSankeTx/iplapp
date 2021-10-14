package model;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player {
	private String player_name;
	private String player_team_name;
    private int player_number;
	private int player_salary_in_cr;
	private int number_of_ads;
	private int number_of_matches;
	
    public Player(){

    }

    public Player(String player_name,String player_team_name,int player_number,int player_salary_in_cr,int number_of_ads,int number_of_matches){
        this.player_name=player_name;
        this.player_team_name=player_team_name;
        this.player_number=player_number;
        this.player_salary_in_cr=player_salary_in_cr;
        this.number_of_ads=number_of_ads;
        this.number_of_matches=number_of_matches;
    }

    @Column(name="player_name", nullable=false)
	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

    @Column(name="player_team_name", nullable=false)
	public String getPlayer_team_name() {
		return player_team_name;
	}

	public void setPlayer_team_name(String player_team_name) {
		this.player_team_name = player_team_name;
	}

    @Id
    @Column(name="player_number", nullable=false)
    public int getPlayer_number() {
		return player_number;
	}

	public void setPlayer_number(int player_number) {
		this.player_number = player_number;
	}

    @Column(name="player_salary_in_cr", nullable=false)
	public int getPlayer_salary_in_cr() {
		return player_salary_in_cr;
	}

	public void setPlayer_salary_in_cr(int player_salary_in_cr) {
		this.player_salary_in_cr = player_salary_in_cr;
	}

    @Column(name="number_of_ads", nullable=false)
	public int getNumber_of_ads() {
		return number_of_ads;
	}

	public void setNumber_of_ads(int number_of_ads) {
		this.number_of_ads = number_of_ads;
	}

    @Column(name="number_of_matches", nullable=false)
	public int getNumber_of_matches() {
		return number_of_matches;
	}

	public void setNumber_of_matches(int number_of_matches) {
		this.number_of_matches = number_of_matches;
	}
	
	
}