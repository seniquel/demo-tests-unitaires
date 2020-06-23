package fr.diginamic.maison;

public abstract class Piece {
	private double superficie;
	private int etage;
	
	/**
	 * @param superficie
	 * @param etage par convention l��tage 0 d�signe le RDC, 1 le 1er �tage, et ainsi de suite
	 */
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}
}
