
public class Main {

	public static void main(String[] args) {
		Dipendente d1 = new Dipendente("Mario Rossi", 1500);
		d1.StampaDati();
		double nuovoStipendio = d1.aumentoPecentuale(1500, 10);
		d1.setStipendio(nuovoStipendio);
		d1.StampaDati();

	}

}
