package Personnage;

import Comportement.ComportementDeFantassin;

public class Fantassin extends Personnage {
	
	public Fantassin(String sonNom) {
		super(sonNom, new ComportementDeFantassin());
	}

	@Override
	public void Afficher() {
		System.out.println("jay siu " + super.getNom() + " sol-da deux la gare-de roi ya-le");
	}

	@Override
	public String SeDeplacer() {
		// TODO Auto-generated method stub
		return "on est des tubes, on est pas des pots \nMais on a tout ce qu'il nous faut..";
	}

}
