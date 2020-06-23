package fr.diginamic.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dev.utils.StringUtils;

public class StringUtilsTest {
	
	@Test
	public void testChatEtChats() {
		int res = StringUtils.levenshteinDistance("chat", "chats");
		//La distance de levenshtein entre chat et chats doit être de 1
		assertEquals(1,res);
	}
	
	@Test
	public void testMachinsEtMachine() {
		int res = StringUtils.levenshteinDistance("machins", "machine");
		//La distance entre machins et machine doit être de 1
		assertEquals(1, res);
	}
	
	@Test
	public void testAvironEtAvion() {
		int res = StringUtils.levenshteinDistance("aviron", "avion");
		//La distance entre aviron et avion doit être de 1
		assertEquals(1, res);		
	}
	
	@Test
	public void testDistanceEtInstance() {
		int res = StringUtils.levenshteinDistance("distance", "instance");
		//La distance entre distance et instance doit être de 2, car il faut remplacer deux lettres
		assertEquals(2, res);
	}
	
	@Test
	public void testChienEtChine() {
		int res = StringUtils.levenshteinDistance("Chien", "Chine");
		//La distance entre Chien et Chine doit être de 2, car il faut enlever une lettre (n ou e) puis la remettre à un endroit différent
		assertEquals(2, res);		
	}
	
	@Test
	public void testMajuscules() {
		int res = StringUtils.levenshteinDistance("MAJUSCULE", "majuscule");
		//la distance entre MAJUSCULE et majuscule doit être de 9, car la distance doit sensible à la casse et le mot est composé de 9 lettres
		assertEquals(9,res);
	}
	
	@Test
	public void testNull() {
		int res = StringUtils.levenshteinDistance(null, "a");
		//la distance entre une string vide et une string de 1 caractères devrait être de 1, parce que l'ajout d'un caractère correspond à 1 opération
		assertEquals(1,res);
	}
	public void testNullEtNull() {
		int res = StringUtils.levenshteinDistance(null, null);
		assertEquals(0,res);
	}
}
