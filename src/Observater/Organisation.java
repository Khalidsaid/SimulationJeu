package Observater;


public class Organisation extends SujetObserveAbstrait {
	
	public eMode etatFonctionnement;
	
	public Organisation() {
		super();
		this.etatFonctionnement = eMode.NON_DEFINI;
	}
	
	public eMode getEMode() {
		return this.etatFonctionnement;
	}
	
	public void setEMode(eMode etat) {
		this.etatFonctionnement = etat;
		this.Update();
	}
	
	public Organisation(Organisation unParent) {
		
				
	}

}
