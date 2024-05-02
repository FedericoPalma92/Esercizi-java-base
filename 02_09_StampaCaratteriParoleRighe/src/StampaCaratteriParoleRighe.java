import java.io.File;
import java.util.Scanner;

public class StampaCaratteriParoleRighe {

	public static void main(String[] args) {
		String fileName ="";
		File file = null;
		int numeroRighe = 0;
		int numeroParole = 0;
		int numeroCaratteri = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il nome del file: ");
		fileName = scan.nextLine();
		
		if (fileName.equals("")) {
			System.out.println("Nome del file non valido");
			return;
		}
		else {
			file = new File(fileName);
            if (!file.exists()) {
                System.out.println("Il file non esiste");
                return;
            }
            else {
            	try {
            		Scanner fileScan = new Scanner(file);
					while (fileScan.hasNextLine()) {
						String line = fileScan.nextLine();
						numeroRighe++;
						numeroCaratteri += line.length();
						String[] parole = line.split(" ");
						numeroParole += parole.length;
					}
				} catch (Exception e) {
					System.out.println("Errore nell'apertura del file");
					return;
				}
            	
            }
		}
		
		System.out.println("Numero righe: " + numeroRighe);
		System.out.println("Numero parole: " + numeroParole);
		System.out.println("Numero caratteri: " + numeroCaratteri);

	}

}
