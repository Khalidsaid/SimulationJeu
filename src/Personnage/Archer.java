package Personnage;

import Comportement.ComportementDeArcher;


public class Archer extends Personnage {

	public Archer(String sonNom) {
		super(sonNom, new ComportementDeArcher());
	}

	@Override
	public void Afficher() {
		System.out.print("je suis " + super.getNom() + " arché de MontGennevieve ");
	}

	@Override
	public String SeDeplacer() {
		// TODO Auto-generated method stub
		return "je suis plus fort que l'elf, Legolas ";
	}

}
