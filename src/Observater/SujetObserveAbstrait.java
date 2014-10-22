package Observater;

import java.util.ArrayList;
import java.util.List;

public abstract class SujetObserveAbstrait {
	
	public List<ObservateurAbstrait> lesObservateurs;

	protected SujetObserveAbstrait() {
		lesObservateurs = new ArrayList<ObservateurAbstrait>();
	}
	
	public void Attach(ObservateurAbstrait unObservateur) {
		lesObservateurs.add(unObservateur);
	}
	
	public void DeAttach(ObservateurAbstrait unObservateur) {
		lesObservateurs.remove(unObservateur);
	}
	
	public void Update() {
		for(ObservateurAbstrait observateur : lesObservateurs) {
			observateur.update();
		}
	}
	
}
