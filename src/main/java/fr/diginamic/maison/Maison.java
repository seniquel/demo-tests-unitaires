package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
	//on utilise les arraylist maintenant parce que ça commence à bien faire quand même
	private ArrayList<Piece> pieces = new ArrayList<Piece>();
	
	public void ajouterPiece(Piece p) throws PieceNullException, SuperficieNegativeException, EtageNegatifException {		
		if(p==null) {
			throw new PieceNullException("La pièce ne doit pas être null");
		}
		if(p.getSuperficie()<=0) {
			throw new SuperficieNegativeException("La superficie ne peut pas être négative ou nulle");
		}
		if(p.getEtage()<0) {
			throw new EtageNegatifException("L'étage ne peut pas être négatif");
		}
		pieces.add(p);
	}
	
	public double superficieTotale() {
		double res = 0;
		for(int i=0 ; i<pieces.size() ; i++) {
			res += pieces.get(i).getSuperficie();
		}
		return res;
	}
	public double superficieEtage(int etage) {
		double res = 0;
		for(int i=0 ; i<pieces.size() ; i++) {
			if(pieces.get(i).getEtage() == etage) {
				res += pieces.get(i).getSuperficie();
			}
		}
		return res;		
	}
	
	public double superficiePieces(Class<?> cls) {
		double res = 0;
		for (int i=0; i<pieces.size() ; i++) {
			//test si la classe de la pi�ce � l'index i du tableau est la m�me que celle entr�e en param�tre
			if (pieces.get(i).getClass() == cls) {
				res += pieces.get(i).getSuperficie();
			}
		}
		return res;
	}
	
	public int nombrePieces(Class<?> cls) {
		int res = 0;
		for (int i=0; i<pieces.size() ; i++) {
			//test si la classe de la pi�ce � l'index i du tableau est la m�me que celle entr�e en param�tre
			if (pieces.get(i).getClass() == cls) {
				res++;
			}
		}
		return res;
	}
	
	

}
