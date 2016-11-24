package project.persistence.entities;

public class ErrorMessage{
	
	private String errorMessage;
	
	  //--------------------Object creation-------------------------------
	
	public ErrorMessage(){
		
	}
	
	public ErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
	
	 
	//---------------------------Name--------------------------------------
	
	public String getErrorMessage(){
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
	
	//--------------------------------------------------------
	
}