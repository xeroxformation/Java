package src;

//-----------------------------------------------------------------------------------------------
// Titre : Des collections pour gérer des clients
// Version : 1.0
// Copyright :  Copyright (c)
// Auteur :      F.L.
// Société :
// Projet : Java 2 , la synthèse. Client_Version1
// Nom du source : TestClient.java
// Autre source : Client.java
// Description :
//-----------------------------------------------------------------------------------------------
public class TestClient {

  public static void main ( String arg[] ) {

    Client c1, c2, c3;
    c1 = new Client ( "Dupont" , new String ( "Java SA" ) );
    c2 = new Client ( "Durand" , new String ( "Java SA" ) );
    c3 = new Client ( "Martin", new String ( "JDK SARL") )  ;

    System.out.println("c1 : " + c1 ); // Appel de toString de Client
    System.out.println("c2 : " + c2 );
    System.out.println ("c3 : " + c3 ) ;

    System.out.println("c1.estCollegueDe( c2 ) : " + c1.estCollegueDe(c2));
  }
}