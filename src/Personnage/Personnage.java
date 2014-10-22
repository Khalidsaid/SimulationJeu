package Personnage;
import Comportement.ComportementDeCombat;
import Comportement.ComportementEmettreSon;


public abstract class Personnage {

	private String nom;
	public ComportementDeCombat comportementCombat = null;
	public ComportementEmettreSon comportementSon = null;

	public Personnage (String sonNom) {
		this.nom = sonNom;
		comportementCombat = null;
		comportementSon = null;
	}

//	public Personnage (String sonNom, ComportementDeCombat style) {
//		this.nom = sonNom;
//		comportementCombat = style;
//	}

	public Personnage (String sonNom, Object o) {
		this.nom = sonNom;
		if(o != null) {
			if(o.getClass().toString().equals("ComportementDeCombat")) {
				comportementCombat = (ComportementDeCombat)o;
			}
			else if(o.getClass().toString().equals("ComportementEmettreSon")) {
				comportementSon = (ComportementEmettreSon)o;
			}
		}
	}

//	public Personnage (String sonNom, ComportementEmettreSon blabla) {
//		this.nom = sonNom;
//		comportementSon = blabla;
//	}

	public Personnage (String sonNom, ComportementDeCombat style, ComportementEmettreSon blabla) {
		this.nom = sonNom;
		comportementCombat = style;
		comportementSon = blabla;
	}

	public void Afficher() {
		System.out.println("Je suis " + this.nom );
	}
	
	public void Combattre() {
		if(this.comportementCombat != null) {
			System.out.println(comportementCombat.combattre());
		}
	}
	
	public void EmettreUnSon() {
		if(this.comportementSon != null) {
			System.out.println("<<"+comportementSon.Parler()+">>");
		}
	}
	
	public String SeDeplacer() {
		return "je marche";
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ComportementDeCombat getComportementCombat() {
		return comportementCombat;
	}

	public void setComportementCombat(ComportementDeCombat comportementCombat) {
		this.comportementCombat = comportementCombat;
	}

	public ComportementEmettreSon getComportementSon() {
		return comportementSon;
	}

	public void setComportementSon(ComportementEmettreSon comportementSon) {
		this.comportementSon = comportementSon;
	}
	
}
