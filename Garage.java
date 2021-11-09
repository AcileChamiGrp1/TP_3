package Exercice_1;

import java.util.ArrayList;
import java.util.Objects;

public class Garage {

		private ArrayList<Car> liste = new ArrayList<Car>();
		private static int id ; //le static permet de ne pas repartir de 0 pour id à chaque fois que j'ajoute un objet
		private int n ;
		
		public Garage() {
			
			n++;
			this.id = n;
			
		}
		
		public void add(Car c) {
			
			liste.add(Objects.requireNonNull(c)); //Pour éviter d'avoir de valeur nulle,  la méthode add() ne va ajouter que des objets de valeur non nulle
			
		}
	    
		public int getId() {
			
			return this.id;
			
		}


		public static void main(String[] args) {
			Garage g1 = new Garage();
			Garage g2 = new Garage();
			Garage g3 = new Garage();
			System.out.println(g1.id + " " + g2.id + " " + g3.id);
		}
		
		
		
		
	}
