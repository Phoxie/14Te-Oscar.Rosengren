
public abstract class Fordon {
	
	public int pris; //pris i kr
	public int vikt; //vikt i kg
	public String färg; //färg
	
	public Fordon(int p, int v, String f) {
		pris = p;
		vikt = v;
		färg = f;
	}
	public int nedsattPris( int rabatt){
		
		return (int)(pris*(1.0-rabatt/100.0));
	}
}
