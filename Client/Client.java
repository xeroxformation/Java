package src;

//-----------------------------------------------------------------------------------------------
// Titre : Des collections pour g�rer des clients
// Version : 1.0
// Copyright :  Copyright (c)
// Auteur :      F.L
// Soci�t� :
// Projet : Java 2 , la synth�se. Client_Version1
// Nom du source : Client.java
// Autre source : TestClient.java
// Description :
//-----------------------------------------------------------------------------------------------

public class Client {

	private String nom;
	private String societe;

	public Client ( String nom , String societe ) {
          this.nom = nom ;
          this.societe = societe ;
	}
        public String getNom() {
          return nom ;
        }
        public String getSociete() {
          return societe ;
        }
        public String toString() {
          return "Client : " + nom + " de la societe " + societe ;
        }
        public boolean estCollegueDe ( Client unClient ) {
          // Impl�mentation incorrecte
          return societe == unClient.societe ;
        }
} // class Client
