package model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="schedule")
public class Schedule{
    private int serial_no;
    private String team_1;
    private String team_2;
    private String city;
    private String venue;
    private String matchdate;
    private String timing;

    @Id
    @Column(name="serial_no", nullable=false)
    public int getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}

    @Column(name="team_1", nullable=false)
	public String getTeam_1() {
		return team_1;
	}
	public void setTeam_1(String team_1) {
		this.team_1 = team_1;
	}

    @Column(name="team_2", nullable=false)
	public String getTeam_2() {
		return team_2;
	}
	public void setTeam_2(String team_2) {
		this.team_2 = team_2;
	}

    @Column(name="city", nullable=false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

    @Column(name="venue", nullable=false)
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}

    @Column(name="matchdate", nullable=false)
	public String getMatchdate() {
		return matchdate;
	}
	public void setMatchdate(String matchdate) {
		this.matchdate = matchdate;
	}

    @Column(name="timing", nullable=false)
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}

}