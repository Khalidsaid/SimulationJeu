package Personnage;

import Comportement.ComportementDeChevalier;

public class Chevalier extends Personnage {
	
	public Chevalier(String sonNom) {
		super(sonNom, new ComportementDeChevalier());
	}

	@Override
	public void Afficher() {
		System.out.print("je me prenomme " + super.getNom() + " chevalier nommé par le roi fou et heritier du chateau fort ");
	}

	@Override
	public String SeDeplacer() {
		// TODO Auto-generated method stub
		return "je galope, je galope ";
	}

}
