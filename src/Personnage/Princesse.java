package Personnage;

public class Princesse extends Personnage {

	public Princesse(String sonNom) {
		super(sonNom, null);
	}

	@Override
	public void Afficher() {
		System.out.println("je suis la princesse " + super.getNom() + " prosterne toi devant ma beauté");
	}

	@Override
	public String SeDeplacer() {
		// TODO Auto-generated method stub
		return "quelle est belle ma demarche !";
	}

}
