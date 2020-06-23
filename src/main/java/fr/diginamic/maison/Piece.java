package fr.diginamic.maison;

public abstract class Piece {
	private double superficie;
	private int etage;
	
	/**
	 * @param superficie
	 * @param etage par convention l’étage 0 désigne le RDC, 1 le 1er étage, et ainsi de suite
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
