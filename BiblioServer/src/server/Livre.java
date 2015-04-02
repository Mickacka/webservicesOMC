package server;


import java.util.*;

import remoteInterface.IClient;

public class Livre {
	static int nbLivre=1;
	
	double prix;
	int id;
	String titre;
	String auteur;
	LinkedList<IClient> fileAttente;
	ArrayList<Exemplaire> ex;
	ArrayList<String> commentaires;

	public Livre(){

	}
	public Livre(String titre, String aut){
		this.titre=titre;
		auteur=aut;
		commentaires=new ArrayList<String>();
		fileAttente=new LinkedList<IClient>();
		ex=new ArrayList<Exemplaire>();
		id=nbLivre++;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public LinkedList<IClient> getFileAttente() {
		return fileAttente;
	}

	public void setFileAttente(LinkedList<IClient> fileAttente) {
		this.fileAttente = fileAttente;
	}

	public ArrayList<Exemplaire> getEx() {
		return ex;
	}

	public void setEx(ArrayList<Exemplaire> ex) {
		this.ex = ex;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<String> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(ArrayList<String> commentaires) {
		this.commentaires = commentaires;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
