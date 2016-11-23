package project.persistence.entities;

import javax.persistence.*;

public class IsLogged{

    private	boolean logged;
    

    public IsLogged(){
    	
    }
    
    public IsLogged(boolean logged){
    	this.logged = logged;
    	
    }
    
    public boolean getLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}
}