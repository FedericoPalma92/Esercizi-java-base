import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String specie, razza, età;
		
		System.out.println("Inserisci la specie dell'animale: ");
		specie = input.nextLine();
		System.out.println("Inserisci la razza dell'animale: ");
		razza = input.nextLine();
		System.out.println("Inserisci l'età dell'animale: ");
		età = input.nextLine();
		
		Animale animale = new Animale(specie, razza, età);
		
		animale.StampaDettagli();
		

	}

}
