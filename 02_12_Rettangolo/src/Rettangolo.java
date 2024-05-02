
public class Rettangolo {
	public double base;
	public double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double CalcolaArea() {
        return base * altezza;
    }
	
	public double CalcolaPerimetro() {
		return (2 * base) + (2 * altezza);
	}
	
	public void StampaDettagli() {
		System.out.println("Base: " + base);
		System.out.println("Altezza: " + altezza);
		System.out.println("Area: " + CalcolaArea());
		System.out.println("Perimetro: " + CalcolaPerimetro());
	}
	
}
