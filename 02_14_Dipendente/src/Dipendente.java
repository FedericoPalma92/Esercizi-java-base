
public class Dipendente {
	private String nome;
	private double stipendio;
	
	public Dipendente() {
		
	}
	
	public Dipendente(String nome, double stipendio) {
		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	public void StampaDati() {
		System.out.println("Nome: " + nome);
		System.out.println("Stipendio: " + stipendio);
	}
	
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public static double aumentoPecentuale(double stipendio, double percentuale) {
		return stipendio + (stipendio * percentuale / 100);
	}
}
