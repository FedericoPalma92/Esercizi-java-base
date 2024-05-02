import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Inserisci la base del rettangolo:");
		double base=scan.nextDouble();
		System.out.println("Inserisci l'altezza del rettangolo:");
		double altezza=scan.nextDouble();
		
		Rettangolo rettangolo=new Rettangolo(base, altezza);
		rettangolo.StampaDettagli();

	}

}
