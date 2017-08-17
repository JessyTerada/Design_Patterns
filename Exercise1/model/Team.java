package model;

import java.util.HashSet;
import java.util.Set;

public class Team{

    private Set<Employee> employees = new HashSet<Employee>();
    private String nameTeam;
    
	
	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}	
}
