import java.util.Scanner;

public class Animale {
	private String specie;
	private String razza;
	private String età;
	
	public Animale(String Specie, String Razza, String Età) {
		specie = Specie;
		razza = Razza;
		età = Età;
	}

	
	public void StampaDettagli() {
		System.out.println("Specie: " + specie);
		System.out.println("Razza: " + razza);
		System.out.println("Età: " + età);
	}

}
