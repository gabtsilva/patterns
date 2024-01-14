package domain;

public class Livre extends Item{
	public static final double PRIX=14.99;

	public Livre(String name, int anneeDeParution){
		super(name,anneeDeParution,PRIX);
	}
	public String toString(){
		return "Livre : "+getName()+" ("+getAnneeDeParution()+") "+getPrix()+"€";
	}
	
}