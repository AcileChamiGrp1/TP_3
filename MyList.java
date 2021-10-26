
public class MyList {

		public Cell valeur ;
		public Cell suivant ;
		public MyList(Cell val, Cell suiv){
			this. valeur = val ;
			this.suivant = suiv ;
		}
	
	
	private Cell tete ;
	// la tete de la liste
	
	public void add (String element) {
		
		// Creation du nouveau maillon de la liste
		// Ce maillon sera la nouvelle tête de la leste
		// L'élément suivant ce maillon est donc l'ancienne tete de liste.
		
		this.tete = new Cell(element) ;
	}
	
	public int size() {
		Cell courant = this.tete ;
		int nombre = 0 ;
		while(courant != null) {
			courant = courant.suivant ; 
			nombre = nombre + 1;
		}
		
		return nombre ;
	}
	
	public String toString() {
		
		Cell courant = this.tete ;
		String s = " ";
		while(courant != null) {
			courant = courant.suivant ; 
			s += courant ;
			
		}
		
		return s ;
				
		
		// mettre des virgules entre les éléments de la liste chainée
		
	}
	
      /* public void ajouterEnFin(String data, int valeur) {
		
		
			while(temp->nxt != NULL)
			{
				temp = temp->nxt;
			}
			
			return liste;
		}
		
		*/
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

