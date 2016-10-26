
public class Bil extends Fordon {
	public String regNr;	//registreringsnummer
	public int hp;			// motorstyrka i hästkrafter
	public 	double förbrukning;	//bränsleförbrukningen i liter per mil

	public Bil(int p, int v, String f, String r, int h, double a) {
		super(p, v, f);
		regNr = r;
		hp = h;
		förbrukning = a;
	}
	
	public int bränsleBehov(int sträcka) {
		
		return (int)(förbrukning*sträcka/10.0);
	}
	
}
