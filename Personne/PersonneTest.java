package Test;
//-----------------------------------------------------------------------------------------------
// Titre : Des collections pour gérer personne
// Version : 1.0
// Copyright :  Copyright (c)
// Auteur :      F.L
// Société :
// Projet : Java 2 , la synthèse. Client_Version1
// Nom du source : PersonneTest.java
// Autre source : Personne.java
// Description :test de la classe Personne
//-----------------------------------------------------------------------------------------------
import src.*;
import junit.framework.TestCase;

import org.junit.AfterClass;
import org.junit.Test;


public class PersonneTest extends TestCase{
private Personne personne;
public static void main(String[] args) {
	
}
public PersonneTest( String name){
	super(name);
}
protected void setUp() throws Exception{
	super.setUp();
	personne = new Personne("nom","prenom");

}

@Test
	public void testPersonne() {
		assertNotNull("l'objet est créé",personne);
	}
	

	@Test
	public void testGetNom() {
		assertEquals("le nom est il coorrect","nom",personne.getNom());
	}

	@Test
	public void testSetNom() {
		personne.setNom("nom2");
		assertEquals("le nom est il coorrect","nom2",personne.getNom());
	}
	

	
	@AfterClass
	protected void tearDown() throws Exception{
	super.tearDown();
	personne = null;

}
}
