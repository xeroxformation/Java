package src;
//-----------------------------------------------------------------------------------------------
// Titre : Des collections pour gérer personne
// Version : 1.0
// Copyright :  Copyright (c)
// Auteur :      F.L
// Société :
// Projet : Java 2 , la synthèse. Client_Version1
// Nom du source : Personne.java
// Autre source : PersonneTest.java
// Description :test de la classe Personne
//-----------------------------------------------------------------------------------------------
public class Personne {
	private String nom;
	private String prenom;
	public Personne(String nom , String prenom ) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
		}
	public String getNom() {
	return nom;
	}
	
	public String getPrenom(){
	return prenom;
	}
	public void setPrenom(String prenom) {
	this.prenom = prenom;
	}
}
