package fr.diginamic.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.EtageNegatifException;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.PieceNullException;
import fr.diginamic.maison.SuperficieNegativeException;

public class MaisonTestUnitaire {
	
	
	Maison maison;
	
	@Before
	public void setUp() {
		maison = new Maison();
	}
	
	@Test
	public void AjoutChambre10Et0() {
		try {
			maison.ajouterPiece(new Chambre(10,0));
		} catch (PieceNullException | SuperficieNegativeException | EtageNegatifException e) {
			e.printStackTrace();
		}
		//on vérifie que la pièce est bien ajoutée
		assertEquals(1,maison.nombrePieces(Chambre.class));
		
	}
	
	@Test (expected = PieceNullException.class)
	public void TestPieceNull() throws PieceNullException, SuperficieNegativeException, EtageNegatifException {
		maison.ajouterPiece(null);
	}
	
	@Test (expected = EtageNegatifException.class)
	public void TestEtageNegatif() throws PieceNullException, SuperficieNegativeException, EtageNegatifException {
		Chambre EtageNegatif = new Chambre(12,-1);
		maison.ajouterPiece(EtageNegatif);
	}
	
	@Test(expected = SuperficieNegativeException.class)
	public void TestSuperficieNegative() throws PieceNullException, SuperficieNegativeException, EtageNegatifException {
		Chambre SuperficieNegative = new Chambre(-8,0);
		maison.ajouterPiece(SuperficieNegative);
	}
}
