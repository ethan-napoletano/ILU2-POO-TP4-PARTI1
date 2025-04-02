package produit;

public enum Unite {
    GRAMME ("g"), 
    KILOGRAMME ("kg"), 
    LITRE ("l"), 
    CENTILITRE ("cl"), 
    MILILITRE ("ml"), 
    PIECE ("p");
    
    private String nom;
	
	private Unite(String nom) {
		this.nom=nom;
	}
		
	@Override
	public String toString() {
	        return nom;
	   }
}

