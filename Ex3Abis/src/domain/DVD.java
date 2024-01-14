package domain;

public class DVD extends Item{
	public static final double PRIX=19.99;

	public DVD(String name, int anneeDeParution){
		super(name,anneeDeParution,PRIX);
	}
	public String toString(){
		return "DVD : "+getName()+" ("+getAnneeDeParution()+") "+getPrix()+"€";
	}
	
}
