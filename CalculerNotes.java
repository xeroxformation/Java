public class CalculerNotes {
	public static int noteExamen, noteControlContinu;
	
	
	public static String calculer(int noteExamen, int noteControlContinu) {
		
		// définition des variables
		int noteTotale;
		String gradeFinal;
		
		// calcul de la note totale
		noteTotale = noteExamen + noteControlContinu;
		//test de la note totale
	
		// recherche du grade final
		if( noteTotale >= 70 )
		{
			gradeFinal = "a";
		}
		else if( noteTotale >= 50 && noteTotale < 70 )
		{
			gradeFinal = "B";
		}
		else if( noteTotale >= 30 && noteTotale < 50 )
		{
			gradeFinal = "C";
		}
		else if( noteTotale >= 0 && noteTotale < 30 )
		{
			gradeFinal = "D";
		}
		else {
			gradeFinal="FM";
			
		}
		
		return gradeFinal; // on retourne le grade
		
}
	public void test(){
	
	}
}




