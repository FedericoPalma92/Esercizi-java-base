import java.util.Random;

public class Scatola {
	private double Altezza;
	private double Larghezza;
	private double Profondita;
	private int NumeroIdentificativo;
	
	public Scatola(double Altezza, double Larghezza, double Profondita) {
		this.Altezza = Altezza;
		this.Larghezza = Larghezza;
		this.Profondita = Profondita;
		Random random = new Random();
		this.NumeroIdentificativo = random.nextInt();
	}
	
	//overload del costruttore per creare un cubo
	public Scatola(double Lato) {
		this(Lato, Lato, Lato);
	}
	
	//stampa a video le informazioni e il volume della scatola
	public void StampaInfo() {
		System.out.println("Altezza: " + Altezza + " Larghezza: " + Larghezza + " Profondita: " + Profondita);
		System.out.println("Volume: " + CalcolaVolume());
	}
	
	//calcola il volume della scatola
	public double CalcolaVolume() {
		return Altezza * Larghezza * Profondita;
	}
	
	
}
