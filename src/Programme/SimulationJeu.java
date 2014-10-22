package Programme;

import java.util.ArrayList;
import java.util.List;

import Comportement.ComportementDeArcher;
import Comportement.ComportementDeChevalier;
import Comportement.ComportementDeCombat;
import Comportement.EmettreSonAuSecour;
import Comportement.EmettreSonCrier;
import Comportement.EmettreSonEtendard;
import Observater.ObservateurAbstrait;
import Observater.SujetObserveAbstrait;
import Personnage.Archer;
import Personnage.Chevalier;
import Personnage.Fantassin;
import Personnage.Personnage;
import Personnage.Princesse;

public class SimulationJeu  {

	private List<Personnage> lesPersonnes = null;
	
	public  void AfficheTout() {
		
		String str=null;
		for (int i=0;i<lesPersonnes.size();i++)
		{
		str = lesPersonnes.get(i).toString();
		System.out.println(str);
		}

	}
	
	public static void main(String[] args) {
		
		Archer Said = new Archer("Said");
		Said.setComportementSon(new EmettreSonCrier());
		Said.setComportementCombat(new ComportementDeArcher());
		Archer Andy = new Archer("Andy");
		Andy.setComportementSon(new EmettreSonAuSecour());
		Chevalier Johanny = new Chevalier("Johanny");
		Johanny.setComportementSon(new EmettreSonEtendard());
		Johanny.setComportementCombat(new ComportementDeChevalier());
		
		
		List<Personnage> lesPersonnes = new ArrayList<Personnage>();
		lesPersonnes.add(Said);
		lesPersonnes.add(Andy);
		lesPersonnes.add(Johanny);
		
		String str=null;
		for (int i=0;i<lesPersonnes.size();i++)
		{
		 lesPersonnes.get(i).Afficher(); 
		 lesPersonnes.get(i).EmettreUnSon();
		 lesPersonnes.get(i).Combattre();
		//str = lesPersonnes.get(i).getNom();
		//System.out.println("Personnage : "+str);
		}
		
	
		System.out.println("-----------------------------------------------");
		
		/*for(Personnage p : lesPersonnes) {
		
			p.EmettreUnSon();
		}
		*/
	}
}
